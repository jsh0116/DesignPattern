package factory.store;

import factory.pizza.Pizza;

public abstract class PizzaStore {

  /**
   * 피자를 주문하는 메소드
   * 팩토리로 피자객체를 만듬
   * @param type orderPizza 메소드 인자로 피자 종류를 전달합니다.
   * @return pizza object
   */
  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  abstract Pizza createPizza(String type);
}
