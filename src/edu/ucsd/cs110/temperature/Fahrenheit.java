package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature {

    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature temp = new Celsius( (this.getValue()-32)*(5f/9f) );
        return temp;

    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString() {
        return this.getValue() + " F";
    }
}