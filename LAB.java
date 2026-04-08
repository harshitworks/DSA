public class LAB {
    static void main(String[] args) {
        int a=0;
        byte b =1;
        a= b ;
        System.out.println(a);
        float c = 574.5f;
        double d = 249873.4;
//        c = d ;  // raises an error as we are trying explicit conversion.
//        b = a ; / raises an error

        System.out.println(b);
        Pen obj = new Pen ("Winx");




    }
}

class Pen {
    String name;
    static String color ;
    public Pen(String name) {
        this.name= name;
        Pen.color="Black";
        System.out.println("the name of pen is "+this.name+"and the color "+this.color);
    }
}

abstract class  A {
    abstract void draw();
    abstract void fill();
}

interface B {
         default void draw () {
            System.out.println("Allows to define a function inside interface or a method with a body ");
        }
         static void draw2 () {
            System.out.println("Allows to define a function inside interface or a method with a body ");
        }
}