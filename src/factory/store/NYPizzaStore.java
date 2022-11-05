package factory.store;

import factory.pizza.NY.NYCheesePizza;
import factory.pizza.NY.NYClamPizza;
import factory.pizza.NY.NYGreekPizza;
import factory.pizza.NY.NYPepperoniPizza;
import factory.pizza.NY.NYVeggiePizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYCheesePizza();
    } else if (type.equals("greek")) {
      return new NYGreekPizza();
    } else if (type.equals("pepperoni")) {
      return new NYPepperoniPizza();
    } else if (type.equals("clam")) {
      return new NYClamPizza();
    } else if (type.equals("veggie")) {
      return new NYVeggiePizza();
    } else {
      return null;
    }
  }
}
