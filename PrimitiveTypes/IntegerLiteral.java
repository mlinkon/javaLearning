public class IntegerLiteral{
    public static void main (String args[]){

        /*
        You can assign integer literals in base decimal, binary, octal, and hexadecimal.
        For octal literals, use the prefix 0 - zero;
        For binary lierals, use the prefix 0B or 0b; 
        For hexadecimal, use the prefix 0X or 0x.
        No prefix is required for the decimal values. 
        */

        int baseDecimal = 267;
        int octalValue = 0413;
        int hexaDecimalValue = 0x10B;
        int binaryValue = 0b100001011;

        System.out.println(baseDecimal);
        System.out.println(octalValue);
        System.out.println(hexaDecimalValue);
        System.out.println(binaryValue);

        /*
        Underscores can be used as part of literal values.
        Grouping individual digits or letters of literal values makes them more readable.
        Underscores have no effect on the values.

        Rules to remember: 
        * Can't start or end a literal value with an underscore
        * You can place an underscore right after the prefix 0, which is used to define the octal value.
        * You can't place an underscore right after the prefix 0b, 0B, 0x, & 0X, which are used to define
        * binary or hexadecimal literal values.
        * You can't place an underscore prior to an L suffix (L suffix is use to mark a literal value as Long).
        * You can't use an underscore in positions where a string of digits is expected.e.g. Interger.parseInt("10_11");
        */
        int longBaseDecimal = 100_267_760;
        int longOctalValue = 04_13;
        int longHexaDecimalValue = 0x10_BA_75;
        int longBinaryValue = 0b1_0000_10_11;

        System.out.println(longBaseDecimal);
        System.out.println(longOctalValue);
        System.out.println(longHexaDecimalValue);
        System.out.println(longBinaryValue);
    }
}