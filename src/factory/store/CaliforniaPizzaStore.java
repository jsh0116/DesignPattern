package factory.store;

import factory.pizza.Pizza;
import factory.pizza.california.CaliforniaCheesePizza;
import factory.pizza.california.CaliforniaClamPizza;
import factory.pizza.california.CaliforniaGreekPizza;
import factory.pizza.california.CaliforniaPepperoniPizza;
import factory.pizza.chicago.ChicagoCheesePizza;
import factory.pizza.chicago.ChicagoClamPizza;
import factory.pizza.chicago.ChicagoGreekPizza;
import factory.pizza.chicago.ChicagoPepperoniPizza;
import factory.pizza.chicago.ChicagoVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new CaliforniaCheesePizza();
    } else if (type.equals("greek")) {
      return new CaliforniaGreekPizza();
    } else if (type.equals("pepperoni")) {
      return new CaliforniaPepperoniPizza();
    } else if (type.equals("clam")) {
      return new CaliforniaClamPizza();
    } else if (type.equals("veggie")) {
      return new CaliforniaCheesePizza();
    } else {
      return null;
    }
  }
}
