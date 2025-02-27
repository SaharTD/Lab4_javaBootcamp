public class Triangle extends Shape{

private double base;
private double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }




    ///   (base*height)/2
    @Override
    public double calculateArea() {
        double area = (base*height)/2;
        return area;
    }



///  h+h+h
    @Override
    public double calculateCircumference() {

        double circumference= base+base+base;
        return circumference;
    }

}
