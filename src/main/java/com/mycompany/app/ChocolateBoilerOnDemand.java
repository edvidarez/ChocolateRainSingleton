package com.mycompany.app;

/**
 * Created by Edmundo on 20/10/2016.
 */

public class ChocolateBoilerOnDemand
{
    private boolean empty;
    private boolean boiled;
    private static  ChocolateBoilerOnDemand instance = new ChocolateBoilerOnDemand();

    private ChocolateBoilerOnDemand () {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoilerOnDemand getInstance()
    {
        return instance;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;            // fill   the boiler with a milk/chocolate mixture
        }
    }
    public void drain() {
        if (!isEmpty() &&  isBoiled()) {            // drain the boiled milk and chocolate
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && ! isBoiled()) {            // bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
