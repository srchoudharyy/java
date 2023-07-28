import java.util.Scanner;

/*We learned -how to create class, -how to instantiate object(new keyword), -how to access/modify properties of object using "dot" operator*/
/*Now we are going to learn -Constructor (e.g. Student stud1 = new Student();) Here "Student();" is an construtor
* Constructor- it's basically function with no return type not even "null/void"
*            - it's only called once, to INITIATE THE OBJECT
* There are 3 types of constructor- 1] Non Paramaterized Constructor- constructor with no argument
*                                   2] Paramaterized Constructor- constructor with parameters as arguments
*                                   3] Copy Constructor/Function(Method) Overloading- overloaded constructor works according the type of argument
* Some special terms we learn- 1] default working of invisible constructor
*                              2] 'this'- keyword 
*                              3] when variable passed, only value is passed<====> when object is passed, it's reference (i.e. object itself) is passed
*                              4] Wrapper classes
*                              5] final keyword
*                              6] garbage collector working (via e.g)
*   */


// e.g for non paramaterized constructor
class Student{
    String name;
    int age;
    Student(){
        System.out.println("Constructor Called");
    }
}
class Studentt{
    String name;
    int age;
    //Students(); -----> this is automatically considered by java & it's written here. invisibally.
}


// e.g for paramaterized constructor
class Studenttt{
    String name;
    int age;
    Studenttt(String n, int a){    // here we received arguments and via constructor we passed values to object of this class
        this.name=n;
        this.age=a;
    }
}


// e.g for copy constructor
class Studentttt {
    String name;
    int age, demonum = 5000;
    /*Depending on the parameters of object java will automatically choose constructor from the given below..*/
    Studentttt(){
        System.out.println("Constructor called without argument "+name);
    }
    Studentttt(String n, int a){  // here we passed arguments
        this.name=n;
        this.age=a;
        System.out.println("Constructor called with arguments "+name);
    }
    Studentttt(Studentttt studx){ // Here we passed object itself
        this.name = studx.name;
        this.age = studx.age;
        System.out.println("Constructor called with argument as Object itself "+name+demonum);    /* 100$ Note- Constructor fist instantiated object & then come to it's method code, to understand see that demonum here got printed, it's meant that constructor first instantiated object and it's properties then it's came to this methods.*/
        }
}


// e.g for calling an Constructor with another constructor
class Studenttttt {
    String name;
    int age;
    /* Simple constructor which is called to instantiate the object */
    Studenttttt(){
        this("Narayana", 50);
    }
    Studenttttt(String N, int A){
        this.name = N;
        this.age = A;
    }

}

public class L7OOPs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // below code for non paramaterized constructor
        Student Stud1 = new Student();
        Studentt Stud2 = new Studentt();
        System.out.println(Stud1+Stud1.name+Stud1.age);
        System.out.println(Stud2+Stud2.name+Stud2.age);

        //below code for paramaterized constructor
        System.out.println("Enter name and age of student- ");
        String name = in.next();
        int age = in.nextInt();
        Studenttt Stud3 = new Studenttt(name,age);
        System.out.println(Stud3+Stud3.name+Stud3.age);

        //below code for copy constructor
        Studentttt Stud4 = new Studentttt();
        Studentttt Stud5 = new Studentttt("Ramu", 40);
        Studentttt Stud6 = new Studentttt(Stud5);

        //below code for calling an constructor with another constructor
        Studenttttt Stud7 = new Studenttttt();
        System.out.println(Stud7.name +"  "+Stud7.age);

    }
}

//incomplete- bookmark
