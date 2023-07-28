import java.util.Scanner;

/*Conditional- 1] If-else statements, 2] Multiple-if-else statements
 * Loops- 1] For-loop, 2] While-loop 3] Do-while-loop
 * Switch Statements */

/*Difference between two notations, x.equals(valueToCheck(e.g. y)) v/s x == value(e.g. y)
 * x.equals(valueToCheck(e.g. y)) this actually checks value of y with x, not there references & gives boolean output according to that
 * x == y, it basically checks reference values of x and y,   */

/*After that we will learn how to deal character with conditions via Examples :
 * i] User entered an character check wheather it's lowercase of uppercase
 * ii] Reverse an number, taken from user
 * iii] Program for calculator, ask user which operation he wants to perform on given two numbers*/

 
public class L5conditionalLoops {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /* If-else statement e.g */
    System.out.println("Enter two integers to compare them - ");
    int a = in.nextInt();
    int b = in.nextInt();
    if (a > b) {
      System.out.println("First num is Largest");
    } else {
      System.out.println("Second num is Largest");
    }
    /* Multiple-if-else statement e.g */
    System.out.println("Enter age of person - ");
    int num = in.nextInt();
    if (num < 10)
      System.out.println(num + "-It's child");
    else if (num < 18)
      System.out.println(num + "-It's teenager");
    else if (num < 60)
      System.out.println(num + "-It's adult");
    else if (num > 60)
      System.out.println(num + "-It's senior citizen");
    else
      System.out.println(
          a + "-Enter valid age");
    /* For Loop statement e.g */
    System.out.println(
        "Enter number upto which you want to get print starting from 1 : ");
    int n = in.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
    /* While Loop statement e.g */
    System.out.println(
        "Enter number upto which you want to get print starting from 1 : ");
    int i = 0, no = in.nextInt();
    while (i <= no) {
      System.out.println(i);
      i = i + 1;
    }
    /* Do-While Loop statement e.g */
    System.out.println(
        "I am going to print 'Jai Shree Ram' again and again, until you don't enter character 'x'");
    int exit = 1;
    do {
      System.out.println("Jai Shree Ram");
      exit = in.nextInt();
    } while (exit != 0);
    /* Switch statement e.g */
    System.out.println("Enter which fruit description you want : ");
    String fruit = in.next();
    switch (fruit) {
      case "mango":
        System.out.println("King of fruit");
        break;
      case "apple":
        System.out.println("Queen of fruit");
        break;
      case "grapes":
        System.out.println("Used to make alcohol");
        break;
      case "banana":
        System.out.println("Liked by monkey, thus by humans");
        break;
      default:
        System.out.println("Sorry it's out of our range");
    }
  }
}

// incomplete- Bookmark
