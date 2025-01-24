package week3.Problem1.coffee.decorators;

import week3.Problem1.coffee.Coffee;

public class WhippedCream extends CoffeeDecorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.print("Adding WhippedCream ");
    }
}
