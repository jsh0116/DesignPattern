package factory.store;
import factory.pizza.Pizza;
import factory.pizza.chicago.ChicagoCheesePizza;
import factory.pizza.chicago.ChicagoClamPizza;
import factory.pizza.chicago.ChicagoGreekPizza;
import factory.pizza.chicago.ChicagoPepperoniPizza;
import factory.pizza.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new ChicagoCheesePizza();
    } else if (type.equals("greek")) {
      return new ChicagoGreekPizza();
    } else if (type.equals("pepperoni")) {
      return new ChicagoPepperoniPizza();
    } else if (type.equals("clam")) {
      return new ChicagoClamPizza();
    } else if (type.equals("veggie")) {
      return new ChicagoVeggiePizza();
    } else {
      return null;
    }
  }
}
