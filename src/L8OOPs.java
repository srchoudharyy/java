class Shape{

    public void area(){
        System.out.println("Area of shape");
    }
    public void areaa(){
        System.out.println("Area of Shape");
    }
}

class Traingle extends Shape{
    @Override

    public void area(){
        System.out.println("Area of Triangle");
    }
    public int areaa(int b, int h){
        return (b*h)/2;
    }
}

class Circle extends Traingle{
    @Override

    public void area(){
        System.out.println("Area of Circle");
    }
    public double areaa(int r){
        return ((3.14)*r*r);
    }
}


public class L8OOPs {
    public static void main(String[] args){
        Traingle t = new Traingle();
        Shape s = new Shape();
        Circle c = new Circle();
        c.area();
        int a = c.areaa(80,20);
        System.out.println(a);
    }
}
