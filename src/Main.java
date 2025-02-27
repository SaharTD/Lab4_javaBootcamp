//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      Circle c1=new Circle(4.5);
      Rectangle r1 =new Rectangle(8,9);
      Triangle t1 = new Triangle(18,30);

        System.out.println("The radius of the circle is =  "+c1.getRaduis());
        System.out.println("The area of the circle is = "+c1.calculateArea()+ "\nthe circumference of the circle is = "+c1.calculateCircumference());

        System.out.println();

        System.out.println("The height of the rectangle is =  "+r1.getHeight()+"\nthe width of the rectangle is = "+r1.getWidth());
        System.out.println("The area of the rectangle is = "+r1.calculateArea()+ "\nthe circumference of the rectangle is = "+r1.calculateCircumference());

        System.out.println();


        System.out.println("The base of the triangle is =  "+t1.getBase() + "The height of the triangle is ="+t1.getHeight());
        System.out.println("The area of the triangle is = "+t1.calculateArea()+ "\nthe circumference of the triangle is = "+t1.calculateCircumference());



    }
}