public class StringType{
    public static void main (String args[]){
        String stringObject = new String ("String is object data type"); // proper way to assign values to String
        String a = " direct assignment"; // easy way to assign values to String datatype
        String b = new String ("created new String object with new String");

        String x1 = "Lenovo X1";
        String carbon = "carbon";

        String laptopName = x1 + carbon;

        System.out.println(a);
        System.out.println(b);

        System.out.println( x1 + ' ' + carbon);
        System.out.println(laptopName + " 7th Gen" );
        System.out.println(stringObject);



        String YOE = "3";

        //comparing the value of YOE with int in double quotes.
        if(YOE == "4"){
            System.out.println("4 years of Experince");

        }
        else if (YOE == "3"){  
            System.out.println("3 years of experience");

        }
        else {
            System.out.println("Buy Tesla");
        }

    }
}