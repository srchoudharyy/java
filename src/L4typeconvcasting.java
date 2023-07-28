import java.util.Scanner;

//type conversion- when one type of data----> assigned to another type of data variable, then>> Automatic type conversion takes place           condition -Destination must be greater than source type e.g(float>int)
//type casting(Narowing Conversion) OPOSITE OF TYPE CONVERSION - when we convert one type of data to another data
//automatic type promotion- while resolving expression value may exceds its data type range, hence this value got promoted by java

public class L4typeconvcasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Below code represents type conversion */
        System.out.println("Type Conversiong: Enter int value, to convert it in float - ");
        float a = in.nextFloat(); // if we give input of integer E.g 432-----> Converted to 432.0
        System.out.println("this is conversion - " + a);
        /* Below code represents type casting/narrow conversion */
        System.out.println("Type Casting: Enter the float value, to convert it in int - ");
        int b = (int) (in.nextFloat());
        System.out.println("this is casting - " + b);
        /* Below code represents automatic type promotion */
        System.out.println("Enter value of base & height of Triangle- ");
        byte base = in.nextByte();
        byte h = in.nextByte();
        int Area = (base * h) / 2; /*
                                    * Here b*h exceeds byte limit so java automatically upgrade limit of byte to
                                    * int
                                    */
        System.out.println("Area - " + Area);
    }
    // Below code just for practicing functions
    // static void function1(int a, int b){
    // int c = a+b;
    // System.out.println("sum- "+c);
    // }
    // public static void main (String[] args){
    // Scanner in = new Scanner(System.in);
    // System.out.println("Enter two numbers - ");
    // int a = in.nextInt();
    // int b = in.nextInt();
    // function1(a,b);
    // }

}