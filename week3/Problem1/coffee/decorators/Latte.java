package week3.Problem1.coffee.decorators;

import week3.Problem1.coffee.Coffee;

public class Latte extends CoffeeDecorator {

    public Latte(Coffee coffee){
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.print("Adding Milk ");
    }
}
