package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature temp = new Fahrenheit( this.getValue() * (9f/5f) + 32 );
        return temp;
    }

    public String toString()
    {
        return this.getValue() + " C";
    }
}