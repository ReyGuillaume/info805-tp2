package fr.usmb.m1isc.compilation.tp;

import java.util.HashSet;
import java.util.Set;

public class Arbre {

    public class BooleanWrapper {
        private boolean value;

        BooleanWrapper(boolean b) {
            this.value = b;
        }

        public void setValue(boolean b) {
            this.value = b;
        }

        public boolean getValue() {
            return this.value;
        }
    }

    public Arbre fg;
    public Arbre fd;
    public String value;

    public static final String LET = "LET";
    public static final String WHILE = "WHILE";
    public static final String IF = "IF";
    public static final String THEN = "THEN";
    public static final String NULL = "null";
    public static final String INPUT = "INPUT";
    public static final String OUTPUT = "OUTPUT";
    public static final String MOINS = "-";
    public static final String MOD = "%";
    public static final String DIV = "/";
    public static final String MUL = "*";
    public static final String PLUS = "+";
    public static final String LTE = "<=";
    public static final String LT = "<";
    public static final String GTE = ">=";
    public static final String GT = ">";
    public static final String EGAL = "=";
    public static final String OR = "||";
    public static final String AND = "&&";
    public static final String NOT = "!";
    public static final String SEMI = ";";

    Arbre(String val, Arbre fg, Arbre fd) {
        this.fd = fd;
        this.fg = fg;
        this.value = val;
    }

    Arbre(String value, Arbre fg) {
        this.value = value;
        this.fg = fg;
    }

    Arbre(String value) {
        this.value = value;
        this.fd = null;
        this.fg = null;
    }

    public String getValue() {
        return this.value;
    }

    public Arbre getFG() {
        return this.fg;
    }

    public Arbre getFD() {
        return this.fd;
    }

    public void afficher() {
        this.affichageStructure("", true);
    }

    public void affichageStructure(String prefix, boolean isLeft) {
        System.out.println(prefix + (isLeft ? "|-- " : "|-- ") + value);

        if (fg != null) {
            fg.affichageStructure(prefix + (isLeft ? "|   " : "    "), true);
        }
        if (fd != null) {
            fd.affichageStructure(prefix + (isLeft ? "|   " : "    "), false);
        }
    }

    public String toCodeAssembleur() {
        Set<String> s = new HashSet<String>();
        toDataSegment(s);
        String dataSegment = "DATA SEGMENT\n";
        for (String val : s) {
            dataSegment += "\t" + val + " DD\n";
        }
        dataSegment += "DATA ENDS\n";

        String codeSegment = "CODE SEGMENT\n";
        codeSegment += toCodeSegment();
        codeSegment += "CODE ENDS\n";
        return dataSegment + codeSegment;
    }

    public void toDataSegment(Set<String> s) {
        if (fg == null || fd == null) {
            return;
        }
        if (value == LET) {
            s.add(fg.value);
        } else {
            fg.toDataSegment(s);
            fd.toDataSegment(s);
        }
    }

    public String toCodeSegment() {
        return toCodeSegment(new BooleanWrapper(false), new BooleanWrapper(false));
    }

    public String toCodeSegment(BooleanWrapper eaxIsUsed, BooleanWrapper ebxNeedToSwap) {
        if (fg == null && fd == null) {
            if (isNumeric(value)) {
                String push = "";
                if (eaxIsUsed.getValue()) {
                    push = "\tpush eax\n";
                }
                eaxIsUsed.setValue(true);
                return push + "\tmov eax, " + value + "\n";
            } else {
                String push = "";
                if (eaxIsUsed.getValue()) {
                    push = "\tpush eax\n";
                }
                eaxIsUsed.setValue(true);
                return push + "\tmov eax, " + value + "\n";
            }
        }

        if (fg.getValue() == WHILE) {
            String codeCondition = "debut_while_1:" + fg.getFG().toCodeSegment(eaxIsUsed, ebxNeedToSwap);
            String codeExecution = "\tjz sortie_while_1\n" + fg.getFD().toCodeSegment(eaxIsUsed, ebxNeedToSwap)
                    + "\tjmp debut_while_1\n";
            String codeSortie = "sortie_while_1:\n" + fd.toCodeSegment(eaxIsUsed, ebxNeedToSwap);
            return codeCondition + codeExecution + codeSortie;
        }

        if (value == MOD) {
            return "MODULO";
        }

        if (value == LT) {
            String codeGauche = fg.toCodeSegment(eaxIsUsed, ebxNeedToSwap);
            String codeDroite = fd.toCodeSegment(eaxIsUsed, ebxNeedToSwap);
            String codeDeComparaison = "\tpop ebx\n" + "\tsub eax,ebx\n" + "\tjle faux_gt_1\n" + "\tmove eax,1\n"
                    + "\tjmp sortie_gt_1\n" + "faux_gt_1:\n\tmov eax,0\nsortie_gt_1";
            return codeGauche + codeDroite + codeDeComparaison;
        }

        if (value == SEMI) {
            String fgCode = fg.toCodeSegment(eaxIsUsed, ebxNeedToSwap);
            eaxIsUsed.setValue(false);
            String fdCode = fd.toCodeSegment(eaxIsUsed, ebxNeedToSwap);
            return fgCode + fdCode;
        }
        if (value == LET) {
            String executeCode = fd.toCodeSegment(eaxIsUsed, ebxNeedToSwap);
            if (ebxNeedToSwap.getValue()) {
                ebxNeedToSwap.setValue(false);
                return executeCode + "\tmov eax, ebx\n" + "\tmov " + fg.value + ", eax\n";
            } else {
                return executeCode + "\tmov " + fg.value + ", eax\n";
            }
        }
        if (value == MUL) {
            return fg.toCodeSegment(eaxIsUsed, ebxNeedToSwap) +
                    fd.toCodeSegment(eaxIsUsed, ebxNeedToSwap) + "\tpop ebx\n" +
                    "\tmul eax, ebx\n";
        }
        if (value == DIV) {
            String div = fg.toCodeSegment(eaxIsUsed, ebxNeedToSwap) + fd.toCodeSegment(eaxIsUsed, ebxNeedToSwap) +
                    "\tpop ebx\n" +
                    "\tdiv ebx, eax\n";
            ebxNeedToSwap.setValue(true);
            return div;
        }
        if (value == MOD) {
            return "\tmov eax, " + fd.toCodeSegment(eaxIsUsed, ebxNeedToSwap) + "\n"
            + "\tpush eax\n"
            + "\tmov eax, " + fg.toCodeSegment(eaxIsUsed, ebxNeedToSwap) + "\n"
            + "\tpop ebx\n"
            + "\tmov ecx,eax\n"
            + "\tdiv ecx,ebx\n"
            + "\tmul ecx,ebx\n"
            + "\tsub eax,ecx\n";
        }
        if (value == INPUT) {
            return "\tin eax\n";
        }
        if (value == OUTPUT) {
            return "\tmov eax, " + fg.value + "\n\tout eax";
        }
        return "";
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}