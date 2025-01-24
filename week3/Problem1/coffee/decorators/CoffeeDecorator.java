package week3.Problem1.coffee.decorators;

import week3.Problem1.coffee.Coffee;

public class CoffeeDecorator extends Coffee {

    Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public void brewing(){
        coffee.brewing();
    }
}
