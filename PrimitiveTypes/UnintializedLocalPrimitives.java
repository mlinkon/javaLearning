public class UnintializedLocalPrimitives{
    public static void main(String args[]){

        //numeral types
        byte smallerThanShort ; //range :  -128 to 127
        short smallerThanInt;   //range : -32,768 to 32,767
        int i ;                 //range : -2,147,483,648 to 2,147,483, 647
        long biggerThanInt ;    //range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
        //decimal types
        double USDtoINRExchRate; //Range : 15 significant decimal digits
        float valueOfPi;         //Range : 6-7 significant decimal digits) , Java implements IEEE 754 standard

        //others
        char singleCharacter; // single character e.g. 'a' , range : 0 to 65,536 (unsigned)
        boolean tOrF ; //either true or false
        
        System.out.println("default value of byte : "+ smallerThanShort); // results in compilation error : variable smallerThanShort might not have been initialized
        System.out.println("default value of short : "+ smallerThanInt);  // results in compilation error : variable smallerThanInt might not have been initialized
        System.out.println("default value of int : "+ i);                 // results in compilation error : variable i might not have been initialized
        System.out.println("default value of long : "+ biggerThanInt);    // results in compilation error : variable biggerThanInt might not have been initialized
        System.out.println("default value of char : "+ singleCharacter);  // results in compilation error : variable singleCharacter might not have been initialized
        System.out.println("default value of boolean : "+ tOrF);          // results in compilation error : variable  tOrF might not have been initialized

        System.out.println("default value of double : "+ USDtoINRExchRate);          // results in compilation error : variable USDtoINRExchRate might not have been initialized
        System.out.println("default value of float : "+ valueOfPi);          // results in compilation error : variable valueOfPi might not have been initialized

    }
} 