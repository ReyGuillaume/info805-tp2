package fr.usmb.m1isc.compilation.tp;

public class Arbre {
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
    public static final String MOD = "";
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

}