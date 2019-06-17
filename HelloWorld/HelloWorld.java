public class HelloWorld{
    public static void main (String args[]){
        System.out.println("Hello World");
        main(Integer.parseInt(args[0])); //calling other main method having different signature as 
        //execution starts from the method having signature public static void main (String args[])
    }
    public static void main(int a){
        System.out.println("value of a is "+ a);

    }


}

/*
command to run the program 
@@compile : javac Helloworld.java
@@run     : java HelloWorld

*/