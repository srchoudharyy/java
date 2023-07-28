import java.util.Scanner;

/*OOPs- Object Oriented Programming revolves around the Object
 * Object is basically instance of Class. Image of Class
 * Classes contains (Properties)+(Functions)
 * E.g Tommy,Sheru,Bruno,etc these are objects of Dog Classes */
/*We learn
1] how to create class and initiate object.
        Here we use syntax
           class ______classname {
               //Properties;
               //Methods;
           }
        For Object initiazation syntax-  Class_name Object_name = new Class_name();
           Object doesn't created in heap memory until you use new keyword. ***new keyword specifies something to initiate in heap memory
2] how to access and modify object data/funcitons
        Here dot operator used, Dot operator uses to access subbranched stuffs*/
class Students {

  String name, course;
  int age, rollno;

  public void greetings() {
    System.out.println(name + "Welcome to the " + course + " Course");
  }
}

public class L6OOPs {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Students Bramha = new Students();
    Bramha.name = "Bramhadev";
    Bramha.age = 1;
    Bramha.course = "World Creater";
    Bramha.rollno = 1;
    Students Vishnu = new Students();
    Vishnu.name = "Vishnuji";
    Vishnu.age = -1;
    Vishnu.course = "World Manager";
    Vishnu.rollno = -1;
    Students Mahesh = new Students();
    Mahesh.name = "Mahadev";
    Mahesh.age = 0;
    Mahesh.course = "World Destructor";
    Mahesh.rollno = 0;
    Mahesh.greetings();
  }
}
