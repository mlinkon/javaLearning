public class StringMethods{
    public static void main(String[] args){
        String firstName = "Google";
        String middleName =  " Cloud Platform";
        String myName2  = "Google Cloud Platform";
        /*difference between == and .equals is == compares memory reference
        and .equals methods compares actual content with case sensitivity on*/

        if((firstName+ middleName)==myName2){
            System.out.println("myName2 is samme as firstName + middleName");
        }
        else {
            System.out.println("myName2 is different from firstName + middleName");
        }
        if ((firstName+ middleName).equals(myName2)){
            System.out.println("myName2 is equal to firstName + middleName");
        }
        else {
            System.out.println("myName2 is not equal to firstName + middleName");
        }
    }
}