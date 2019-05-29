public class UnintializedLocalPrimitives{
    public static void main(String args[]){
        byte smallerThanShort ; //numeral type without decimals, range -128 to 127
        short smallerThanInt; //numeral type without decimals, range 
        int i ; //numeral type without decimals
        long biggerThanInt ; //numeral type without decimals, range 
        
        char singleCharacter; // single character e.g. 'a'
        boolean tOrF ; //either true or false  
        System.out.println("default value of byte : "+ smallerThanShort); // results in compilation error : variable smallerThanShort might not have been initialized
        System.out.println("default value of short : "+ smallerThanInt);  // results in compilation error : variable smallerThanInt might not have been initialized
        System.out.println("default value of int : "+ i);                 // results in compilation error : variable i might not have been initialized
        System.out.println("default value of long : "+ biggerThanInt);    // results in compilation error : variable biggerThanInt might not have been initialized
        System.out.println("default value of char : "+ singleCharacter);  // results in compilation error : variable singleCharacter might not have been initialized
        System.out.println("default value of boolean : "+ tOrF);          // results in compilation error : variable  tOrF might not have been initialized
    }
}