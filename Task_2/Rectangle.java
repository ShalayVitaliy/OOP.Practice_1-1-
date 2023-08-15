package Task_2;

public class Rectangle {

    private double heigth;
    private double weigth;

    public double getHeigth() {
        return heigth;
    }

    public double getWeigth() {
        return weigth;
    }

    public Rectangle() {
        this.heigth = this.weigth = 0;

    }

    public Rectangle(double heigth, double weigth) {
        this.heigth = heigth;
        this.weigth = weigth;
    }

    public double calculateArea() {
        return getHeigth() * getWeigth();
    }

    public double calculatePerimeter() {
        return (getHeigth() + getWeigth()) * 2;
    }

}