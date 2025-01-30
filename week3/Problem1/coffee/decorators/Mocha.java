package week3.Problem1.coffee.decorators;

import week3.Problem1.coffee.Coffee;

public class Mocha extends CoffeeDecorator {
    public Mocha(Coffee coffee){
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.print("Adding Mocha Syrup ");
    }
}
