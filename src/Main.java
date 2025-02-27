//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      Circle c1=new Circle(4.6);
      Rectangle r1 =new Rectangle(8,9);
      Triangle t1 = new Triangle(18,30);

      //the result rounded to the nearest int

        System.out.println("The radius of the circle is =  "+c1.getRaduis());
        System.out.println("The area of the circle is = "+Math.round(c1.calculateArea())+ "\nthe circumference of the circle is = "+Math.round(c1.calculateCircumference()));

        System.out.println();

        System.out.println("The height of the rectangle is =  "+r1.getHeight()+"\n the width of the rectangle is = "+r1.getWidth());
        System.out.println("The area of the rectangle is = "+Math.round(r1.calculateArea())+ "\nthe circumference of the rectangle is = "+Math.round(r1.calculateCircumference()));

        System.out.println();


        System.out.println("The base of the triangle is =  "+t1.getBase() + "\nThe height of the triangle is ="+t1.getHeight());
        System.out.println("The area of the triangle is = "+Math.round(t1.calculateArea())+ "\nthe circumference of the triangle is = "+Math.round(t1.calculateCircumference()));



    }
}
