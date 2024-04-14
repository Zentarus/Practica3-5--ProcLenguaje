/* alikeTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. alikeTokenManager.java */
package traductor;
import lib.symbolTable.*;
import lib.symbolTable.exceptions.*;
import lib.attributes.*;
import java.util.ArrayList;
import lib.errores.ErrorSemantico;

/** Token Manager. */
@SuppressWarnings ("unused")
public class alikeTokenManager implements alikeConstants {
        static void CommonTokenAction(Token t) {

                 String[] nombresTokens = {
                        "letra", "digito", "barra baja", "espacio", "fin de linea", "tabulador", "retorno", "comentario",
                        "boolean", "char", "character", "integer", "null", "array", "const integer", "const char", "const string",
                        "asignacion", "suma", "resta", "comparacion igualdad", "comparacion mayor estricto", "comparacion menor estricto",
                        "comparacion mayor o igual", "comparacion menor o igual", "comparacion diferencia", "multiplicacion", "modulo", "division", "negacion logica",
                        "operador logico", "operador logico", "token", "token", "token", "token", "token", "token", "constante aritmetica", "constante aritmetica",
                        "token", "token", "token", "token", "token", "token", "token", "token", "funcion reservada", "funcion reservada", "funcion reservada",
                        "funcion reservada", "funcion reservada", "funcion reservada", "token separador", "token separador", "token separador", "token separador",
                        "token separador", "token separador", "token separador", "token separador", "token separador", "identificador"
                };

                int linea = t.beginLine;
                int columna = t.beginColumn;
                String image = t.image;
                if (t.kind != 0){ // Si es distinto de fin de linea
                        System.out.println("(" + linea + "," + columna + "): " + nombresTokens[t.kind-1] + " \"" + image + "\"");
                }
        }

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x200000L) != 0L)
            return 0;
         if ((active0 & 0xffffffa000fe00L) != 0L)
         {
            jjmatchedKind = 65;
            return 19;
         }
         return -1;
      case 1:
         if ((active0 & 0xffaff9a000fe00L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 1;
            return 19;
         }
         if ((active0 & 0x500600000000L) != 0L)
            return 19;
         return -1;
      case 2:
         if ((active0 & 0xc68ff80000fe00L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 2;
            }
            return 19;
         }
         if ((active0 & 0x392001a0000000L) != 0L)
            return 19;
         return -1;
      case 3:
         if ((active0 & 0x968e480000b200L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 3;
            }
            return 19;
         }
         if ((active0 & 0x4001b000004c00L) != 0L)
            return 19;
         return -1;
      case 4:
         if ((active0 & 0xd60c0000003a00L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 4;
            return 19;
         }
         if ((active0 & 0x824800008000L) != 0L)
            return 19;
         return -1;
      case 5:
         if ((active0 & 0xd40c0000001a00L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 5;
            return 19;
         }
         if ((active0 & 0x2000000002000L) != 0L)
            return 19;
         return -1;
      case 6:
         if ((active0 & 0xd40c0000000800L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 6;
            return 19;
         }
         if ((active0 & 0x1200L) != 0L)
            return 19;
         return -1;
      case 7:
         if ((active0 & 0x4040000000800L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 7;
            return 19;
         }
         if ((active0 & 0xd0080000000000L) != 0L)
            return 19;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 63);
      case 41:
         return jjStopAtPos(0, 64);
      case 42:
         return jjStopAtPos(0, 28);
      case 43:
         return jjStopAtPos(0, 20);
      case 44:
         return jjStopAtPos(0, 57);
      case 45:
         return jjStartNfaWithStates_0(0, 21, 0);
      case 46:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L);
      case 47:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 58:
         jjmatchedKind = 59;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 59:
         return jjStopAtPos(0, 60);
      case 60:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 61:
         return jjStopAtPos(0, 22);
      case 62:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 91:
         return jjStopAtPos(0, 61);
      case 93:
         return jjStopAtPos(0, 62);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x100008000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800000000200L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x40000000000c00L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1001800000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0xa0000000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x20000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80100400001000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80004000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x400200000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x18040000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x2200000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x4000000002000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x12000000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 46:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      case 61:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x22a00000000000L);
      case 70:
      case 102:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(1, 34, 19);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 46, 19);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x40006000000c00L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x81000100001000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x80a0000200L);
      case 82:
      case 114:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 19);
         return jjMoveStringLiteralDfa2_0(active0, 0x50000008000L);
      case 83:
      case 115:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 44, 19);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x18080000004000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000c00L);
      case 68:
      case 100:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 19);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 19);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 48, 19);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 70:
      case 102:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 45, 19);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4004000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000004000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x48000000200L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0xa000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1800000000L);
      case 84:
      case 116:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(2, 31, 19);
         else if ((active0 & 0x8000000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 53, 19);
         return jjMoveStringLiteralDfa3_0(active0, 0x92000000001000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 50:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000000L);
      case 95:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0xc0000000000L);
      case 69:
      case 101:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 19);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 19);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800800002000L);
      case 76:
      case 108:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 19);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000200L);
      case 78:
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 19);
         break;
      case 80:
      case 112:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 19);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000000L);
      case 82:
      case 114:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000800L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 50:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000000L);
      case 95:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000000L);
      case 69:
      case 101:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 19);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 41, 19);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000200L);
      case 70:
      case 102:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 35, 19);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 19);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      case 89:
      case 121:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 71:
      case 103:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 19);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x50080000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 49, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 9, 19);
         return jjMoveStringLiteralDfa7_0(active0, 0x50000000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000000L);
      case 82:
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 19);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 52, 19);
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      case 78:
      case 110:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 43, 19);
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000000000L);
      case 82:
      case 114:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 55, 19);
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000000L);
      case 84:
      case 116:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 54, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 42, 19);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 50, 19);
         break;
      case 82:
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(8, 11, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 20;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     { jjCheckNAdd(3); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(0, 3); }
                  else if (curChar == 39)
                     { jjAddStates(4, 6); }
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar != 45)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAdd(1); }
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAdd(1); }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAdd(3); }
                  break;
               case 4:
                  if (curChar == 39)
                     { jjAddStates(4, 6); }
                  break;
               case 5:
                  if ((0xffffff7bffffc8ffL & l) != 0L)
                     { jjCheckNAdd(6); }
                  break;
               case 6:
                  if (curChar == 39 && kind > 17)
                     kind = 17;
                  break;
               case 7:
                  if (curChar == 34)
                     { jjCheckNAdd(6); }
                  break;
               case 8:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 39)
                     { jjCheckNAdd(6); }
                  break;
               case 10:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
               case 13:
                  if (curChar == 34)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 12:
                  if ((0xffffff7bffffc8ffL & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 14:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 39)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 16:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 34 && kind > 18)
                     kind = 18;
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 65)
                     kind = 65;
                  jjstateSet[jjnewStateCnt++] = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 19:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 65)
                     kind = 65;
                  { jjCheckNAdd(19); }
                  break;
               case 1:
                  if (kind > 8)
                     kind = 8;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 5:
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 12:
                  { jjAddStates(0, 3); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 3); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 20 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, "\72\75", "\53", "\55", "\75", "\76", "\74", 
"\76\75", "\74\75", "\57\75", "\52", null, "\57", null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, "\56", "\54", "\56\56", "\72", "\73", "\133", "\135", 
"\50", "\51", null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   12, 14, 16, 17, 5, 8, 10, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public alikeTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public alikeTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 20; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffffffe01L, 0x3L, 
};
static final long[] jjtoSkip = {
   0x1f0L, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x0L, 0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[20];
    static private final int[] jjstateSet = new int[2 * 20];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
