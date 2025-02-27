public class Circle extends Shape{

   private double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double calculateArea() {

        double area = Math.PI* Math.pow(raduis,2);
        return area;
    }

    @Override
    public double calculateCircumference() {
        double circumference =2*Math.PI*raduis;
        return circumference;
    }





}
