import java.util.Scanner;

public class L2takinginputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        float f;
        String c;
        String s;
        System.out.println("Enter Integer- ");
        a = in.nextInt();
        System.out.println("Enter float- ");
        f = in.nextFloat();
        System.out.println("Enter Character- ");
        c = in.next();
        System.out.println("Enter string- ");
        s = in.next(); /* this can take only one word as input in string */
        System.out.println("Enter Line- "); // This output may harras you don't worry, I am also afraid of it
        String line = in.nextLine();
        System.out.println(a + "  " + f + "  " + c + "  " + s + "  ");
        System.out.println(line);
    }
}
