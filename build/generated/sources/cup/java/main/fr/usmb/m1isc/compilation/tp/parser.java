
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package fr.usmb.m1isc.compilation.tp;

import java_cup.runtime.Symbol;
import java.util.HashMap;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\035\000\002\002\004\000\002\002\004\000\002\003" +
    "\005\000\002\003\003\000\002\004\003\000\002\004\006" +
    "\000\002\004\006\000\002\004\010\000\002\004\003\000" +
    "\002\005\004\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\005\005\000\002\005\005\000\002\005\005" +
    "\000\002\005\005\000\002\005\005\000\002\005\005\000" +
    "\002\005\004\000\002\005\004\000\002\005\003\000\002" +
    "\005\003\000\002\005\003\000\002\005\003\000\002\005" +
    "\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\032\003\016\005\020\012\021\015\017\021" +
    "\023\022\012\023\006\024\013\027\004\036\007\040\014" +
    "\041\005\001\002\000\022\005\020\012\021\015\017\022" +
    "\012\023\006\036\007\040\014\041\005\001\002\000\046" +
    "\004\uffe6\005\uffe6\007\uffe6\010\uffe6\011\uffe6\013\uffe6\014" +
    "\uffe6\016\uffe6\017\uffe6\020\uffe6\025\uffe6\026\uffe6\030\uffe6" +
    "\031\uffe6\032\uffe6\033\uffe6\034\uffe6\035\uffe6\001\002\000" +
    "\022\005\020\012\021\015\017\022\012\023\006\036\007" +
    "\040\014\041\005\001\002\000\046\004\uffe8\005\uffe8\007" +
    "\uffe8\010\uffe8\011\uffe8\013\uffe8\014\uffe8\016\uffe8\017\uffe8" +
    "\020\uffe8\025\uffe8\026\uffe8\030\uffe8\031\uffe8\032\uffe8\033" +
    "\uffe8\034\uffe8\035\uffe8\001\002\000\004\020\073\001\002" +
    "\000\004\002\072\001\002\000\046\004\uffe9\005\uffe9\007" +
    "\uffe9\010\uffe9\011\uffe9\013\uffe9\014\uffe9\016\uffe9\017\uffe9" +
    "\020\uffe9\025\uffe9\026\uffe9\030\uffe9\031\uffe9\032\uffe9\033" +
    "\uffe9\034\uffe9\035\uffe9\001\002\000\022\005\020\012\021" +
    "\015\017\022\012\023\006\036\007\040\014\041\005\001" +
    "\002\000\046\004\uffe7\005\uffe7\007\uffe7\010\uffe7\011\uffe7" +
    "\013\uffe7\014\uffe7\016\uffe7\017\uffe7\020\uffe7\025\uffe7\026" +
    "\uffe7\030\uffe7\031\uffe7\032\uffe7\033\uffe7\034\uffe7\035\uffe7" +
    "\001\002\000\010\016\ufffe\017\063\020\ufffe\001\002\000" +
    "\012\016\ufff9\017\ufff9\020\ufff9\026\ufff9\001\002\000\032" +
    "\003\016\005\020\012\021\015\017\021\023\022\012\023" +
    "\006\024\013\027\004\036\007\040\014\041\005\001\002" +
    "\000\022\005\020\012\021\015\017\022\012\023\006\036" +
    "\007\040\014\041\005\001\002\000\022\005\020\012\021" +
    "\015\017\022\012\023\006\036\007\040\014\041\005\001" +
    "\002\000\042\004\033\005\037\007\040\010\035\011\032" +
    "\013\042\014\027\016\ufffd\017\ufffd\020\ufffd\026\ufffd\031" +
    "\034\032\036\033\030\034\041\035\031\001\002\000\004" +
    "\041\024\001\002\000\004\031\025\001\002\000\022\005" +
    "\020\012\021\015\017\022\012\023\006\036\007\040\014" +
    "\041\005\001\002\000\042\004\033\005\037\007\040\010" +
    "\035\011\032\013\042\014\027\016\ufffc\017\ufffc\020\ufffc" +
    "\026\ufffc\031\034\032\036\033\030\034\041\035\031\001" +
    "\002\000\022\005\020\012\021\015\017\022\012\023\006" +
    "\036\007\040\014\041\005\001\002\000\022\005\020\012" +
    "\021\015\017\022\012\023\006\036\007\040\014\041\005" +
    "\001\002\000\022\005\020\012\021\015\017\022\012\023" +
    "\006\036\007\040\014\041\005\001\002\000\022\005\020" +
    "\012\021\015\017\022\012\023\006\036\007\040\014\041" +
    "\005\001\002\000\022\005\020\012\021\015\017\022\012" +
    "\023\006\036\007\040\014\041\005\001\002\000\022\005" +
    "\020\012\021\015\017\022\012\023\006\036\007\040\014" +
    "\041\005\001\002\000\022\005\020\012\021\015\017\022" +
    "\012\023\006\036\007\040\014\041\005\001\002\000\022" +
    "\005\020\012\021\015\017\022\012\023\006\036\007\040" +
    "\014\041\005\001\002\000\022\005\020\012\021\015\017" +
    "\022\012\023\006\036\007\040\014\041\005\001\002\000" +
    "\022\005\020\012\021\015\017\022\012\023\006\036\007" +
    "\040\014\041\005\001\002\000\022\005\020\012\021\015" +
    "\017\022\012\023\006\036\007\040\014\041\005\001\002" +
    "\000\022\005\020\012\021\015\017\022\012\023\006\036" +
    "\007\040\014\041\005\001\002\000\046\004\033\005\037" +
    "\007\040\010\035\011\032\013\042\014\027\016\ufff6\017" +
    "\ufff6\020\ufff6\025\ufff6\026\ufff6\030\ufff6\031\034\032\036" +
    "\033\030\034\041\035\031\001\002\000\036\004\033\005" +
    "\037\007\040\010\035\011\032\013\ufff2\014\ufff2\016\ufff2" +
    "\017\ufff2\020\ufff2\025\ufff2\026\ufff2\030\ufff2\031\ufff2\001" +
    "\002\000\046\004\uffee\005\uffee\007\uffee\010\uffee\011\uffee" +
    "\013\uffee\014\uffee\016\uffee\017\uffee\020\uffee\025\uffee\026" +
    "\uffee\030\uffee\031\uffee\032\uffee\033\uffee\034\uffee\035\uffee" +
    "\001\002\000\046\004\uffef\005\uffef\007\040\010\035\011" +
    "\032\013\uffef\014\uffef\016\uffef\017\uffef\020\uffef\025\uffef" +
    "\026\uffef\030\uffef\031\uffef\032\uffef\033\uffef\034\uffef\035" +
    "\uffef\001\002\000\036\004\033\005\037\007\040\010\035" +
    "\011\032\013\ufff4\014\ufff4\016\ufff4\017\ufff4\020\ufff4\025" +
    "\ufff4\026\ufff4\030\ufff4\031\ufff4\001\002\000\046\004\uffed" +
    "\005\uffed\007\uffed\010\uffed\011\uffed\013\uffed\014\uffed\016" +
    "\uffed\017\uffed\020\uffed\025\uffed\026\uffed\030\uffed\031\uffed" +
    "\032\uffed\033\uffed\034\uffed\035\uffed\001\002\000\044\004" +
    "\033\005\037\007\040\010\035\011\032\013\ufff5\014\ufff5" +
    "\016\ufff5\017\ufff5\020\ufff5\025\ufff5\026\ufff5\030\ufff5\032" +
    "\036\033\030\034\041\035\031\001\002\000\046\004\ufff0" +
    "\005\ufff0\007\040\010\035\011\032\013\ufff0\014\ufff0\016" +
    "\ufff0\017\ufff0\020\ufff0\025\ufff0\026\ufff0\030\ufff0\031\ufff0" +
    "\032\ufff0\033\ufff0\034\ufff0\035\ufff0\001\002\000\046\004" +
    "\uffec\005\uffec\007\uffec\010\uffec\011\uffec\013\uffec\014\uffec" +
    "\016\uffec\017\uffec\020\uffec\025\uffec\026\uffec\030\uffec\031" +
    "\uffec\032\uffec\033\uffec\034\uffec\035\uffec\001\002\000\036" +
    "\004\033\005\037\007\040\010\035\011\032\013\ufff1\014" +
    "\ufff1\016\ufff1\017\ufff1\020\ufff1\025\ufff1\026\ufff1\030\ufff1" +
    "\031\ufff1\001\002\000\036\004\033\005\037\007\040\010" +
    "\035\011\032\013\ufff3\014\ufff3\016\ufff3\017\ufff3\020\ufff3" +
    "\025\ufff3\026\ufff3\030\ufff3\031\ufff3\001\002\000\046\004" +
    "\033\005\037\007\040\010\035\011\032\013\ufff7\014\027" +
    "\016\ufff7\017\ufff7\020\ufff7\025\ufff7\026\ufff7\030\ufff7\031" +
    "\034\032\036\033\030\034\041\035\031\001\002\000\046" +
    "\004\033\005\037\007\040\010\035\011\032\013\ufff8\014" +
    "\ufff8\016\ufff8\017\ufff8\020\ufff8\025\ufff8\026\ufff8\030\ufff8" +
    "\031\034\032\036\033\030\034\041\035\031\001\002\000" +
    "\046\004\uffeb\005\uffeb\007\040\010\035\011\032\013\uffeb" +
    "\014\uffeb\016\uffeb\017\uffeb\020\uffeb\025\uffeb\026\uffeb\030" +
    "\uffeb\031\uffeb\032\uffeb\033\uffeb\034\uffeb\035\uffeb\001\002" +
    "\000\004\016\062\001\002\000\046\004\uffe5\005\uffe5\007" +
    "\uffe5\010\uffe5\011\uffe5\013\uffe5\014\uffe5\016\uffe5\017\uffe5" +
    "\020\uffe5\025\uffe5\026\uffe5\030\uffe5\031\uffe5\032\uffe5\033" +
    "\uffe5\034\uffe5\035\uffe5\001\002\000\032\003\016\005\020" +
    "\012\021\015\017\021\023\022\012\023\006\024\013\027" +
    "\004\036\007\040\014\041\005\001\002\000\006\016\uffff" +
    "\020\uffff\001\002\000\034\004\033\005\037\007\040\010" +
    "\035\011\032\013\042\014\027\025\066\031\034\032\036" +
    "\033\030\034\041\035\031\001\002\000\032\003\016\005" +
    "\020\012\021\015\017\021\023\022\012\023\006\024\013" +
    "\027\004\036\007\040\014\041\005\001\002\000\004\026" +
    "\070\001\002\000\032\003\016\005\020\012\021\015\017" +
    "\021\023\022\012\023\006\024\013\027\004\036\007\040" +
    "\014\041\005\001\002\000\012\016\ufffa\017\ufffa\020\ufffa" +
    "\026\ufffa\001\002\000\004\002\000\001\002\000\004\002" +
    "\001\001\002\000\046\004\033\005\037\007\040\010\035" +
    "\011\032\013\042\014\027\016\uffea\017\uffea\020\uffea\025" +
    "\uffea\026\uffea\030\uffea\031\034\032\036\033\030\034\041" +
    "\035\031\001\002\000\034\004\033\005\037\007\040\010" +
    "\035\011\032\013\042\014\027\030\076\031\034\032\036" +
    "\033\030\034\041\035\031\001\002\000\032\003\016\005" +
    "\020\012\021\015\017\021\023\022\012\023\006\024\013" +
    "\027\004\036\007\040\014\041\005\001\002\000\012\016" +
    "\ufffb\017\ufffb\020\ufffb\026\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\012\002\010\003\007\004\014\005\021\001" +
    "\001\000\004\005\074\001\001\000\002\001\001\000\004" +
    "\005\073\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\064\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\003\060\004\014\005\021\001\001\000\004\005\057" +
    "\001\001\000\004\005\056\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\025\001\001" +
    "\000\002\001\001\000\004\005\055\001\001\000\004\005" +
    "\054\001\001\000\004\005\053\001\001\000\004\005\052" +
    "\001\001\000\004\005\051\001\001\000\004\005\050\001" +
    "\001\000\004\005\047\001\001\000\004\005\046\001\001" +
    "\000\004\005\045\001\001\000\004\005\044\001\001\000" +
    "\004\005\043\001\001\000\004\005\042\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\003" +
    "\063\004\014\005\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\004\066\005\021\001\001\000\002\001" +
    "\001\000\006\004\070\005\021\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\076\005\021\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    //    initialisation du parser

    }


    // pour le parser (redefinition de la methode reportant les erreurs d'analyse)
    public void report_error(String message, Object info) {
        String m = "";
        if (info instanceof java_cup.runtime.Symbol) {
            Symbol s = ((Symbol) info);     
            if (s != null && s.left >= 0 ) {
                /* Ajoute le numero de ligne  et de colonne*/
                m =  "Ligne " + (s.left+1) + ", Colonne " + (s.right+1) + " : ";
            }
        }
        m = m + message;
        System.err.println(m);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {

 
    // pour utilisation dans les actions (classe action)
    // HashMap pour la gestion des variables
    private HashMap<String,Integer> vars = new HashMap<>();
    // gestion des erreurs d'evaluation
    private boolean erreur = false;

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= sequence POINT 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sequence ::= expression SEMI sequence 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.SEMI, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sequence",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // sequence ::= expression 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sequence",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expression ::= expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expression ::= LET IDENT EGAL expr 
            {
              Object RESULT =null;
		int nomleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nomright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String nom = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.LET, new Arbre(nom), (Arbre)e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expression ::= WHILE expr DO expression 
            {
              Object RESULT =null;
		int condleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object cond = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.WHILE, (Arbre)cond, (Arbre)e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expression ::= IF expr THEN expression ELSE expression 
            {
              Object RESULT =null;
		int condleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object cond = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int a2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int a2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.IF, (Arbre)cond, new Arbre(Arbre.THEN, (Arbre)a1, (Arbre)a2)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expression ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= NOT expr 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre("!", (Arbre)e);; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr AND expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre("&&", (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr OR expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.OR, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr EGAL expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.EGAL, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr GT expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.GT, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr GTE expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.GTE, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr LT expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.LT, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr LTE expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.LTE, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr PLUS expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.PLUS, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= expr MOINS expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.MOINS, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr MUL expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.MUL, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= expr DIV expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.DIV, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= expr MOD expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.MOD, (Arbre)e1, (Arbre)e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= MOINS expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.MOINS + (Arbre)e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= OUTPUT expr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(Arbre.OUTPUT, (Arbre)e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr ::= INPUT 
            {
              Object RESULT =null;
		 RESULT = new Arbre(Arbre.INPUT); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr ::= NIL 
            {
              Object RESULT =null;
		 RESULT = new Arbre(Arbre.NULL); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expr ::= ENTIER 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(n.toString()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expr ::= IDENT 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Arbre(id.toString()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expr ::= PAR_G sequence PAR_D 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
