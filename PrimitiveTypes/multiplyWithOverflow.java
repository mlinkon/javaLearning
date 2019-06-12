public class multiplyWithOverflow{
    public static void main(String[] args){
        int x = 1_000_000;
        int y = x*x;
        System.out.println(y);

        int z = -2147483648;
        int a = z-1;
        System.out.println(a);

        Integer OneMillion = new Integer(1_000_000);
        Integer Millions = new Integer (OneMillion * OneMillion);
        System.out.println(Millions);

        //We run into a situation called overflow.
        //When an integer overflows, it rolls over to the minimum value and begins counting up from there.
        //Floating point number overflow by returning Infinity. When they underflow, they return 0.0.
        //Underflow is the same issue except if we store a value smaller than the minimum value.

        float floatNum = 2.300000001356565f;
        float multiplyFloat = floatNum * floatNum;
        System.out.println((float)multiplyFloat);
        // output = 5.29 
        //Loss of precision as well 

    }
}