public class IntializedLocalPrimitives{
    public static void main(String args[]){

        //numeral types
        byte smallerThanShort ; // range :  -128 to 127
        short smallerThanInt;   // range : -32,768 to 32,767
        int i ;                 // range : -2,147,483,648 to 2,147,483, 647
        long biggerThanInt ;    // range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
        //decimal types
        double USDtoINRExchRate; //Range : 15 significant decimal digits
        float valueOfPi;         //Range : 6-7 significant decimal digits) , Java implements IEEE 754 standard
        
        //others
        char singleCharacter; // single character e.g. 'a' , range : 0 to 65,536 (unsigned)
        boolean tOrF ; //either true or false  

        smallerThanShort = 127;
        smallerThanInt = 32767;
        i = 2147483;
        biggerThanInt = 2147483648L; // need to add L after the numeral to denote the long else compilation error as it considers numeral as int and not as long
        
        USDtoINRExchRate = 67.76;
        valueOfPi = 3.14159f; // need to add f after the value else compilation error: incompatible types: 
        //possibly loosy conserion from double to float 
        
        singleCharacter = 'A';
        tOrF = true;

        System.out.println("assigned value of byte : "+ smallerThanShort); 
        System.out.println("assigned value of short : "+ smallerThanInt);  
        System.out.println("assigned value of int : "+ i);                 
        System.out.println("assigned value of long : "+ biggerThanInt);    
        System.out.println("assigned value of char : "+ singleCharacter);  
        System.out.println("assigned value of boolean : "+ tOrF);  
        System.out.println("default value of double : "+ USDtoINRExchRate);         
        System.out.println("default value of float : "+ valueOfPi);          
        
    }
} 