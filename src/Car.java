import java.awt.*;

public class Car {
    String make;
    String model;
    int year;
    Color color;
    double mpg;

    //has a relationship
    Radio radio = new Radio();

    //constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //getters
    public Color getColor() {
        return color;
    }

    public double getMpg() {
        return mpg;
    }

    //setters
    public void setColor(Color color) {
        this.color = color;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
}
