package factory.pizza.NY;

import factory.pizza.CheesePizza;

public class NYCheesePizza extends CheesePizza {
  public NYCheesePizza() {
    name = "뉴욕 스타일 소스와 치즈 피자";
    dough = "씬 크러스트 도우";
    sauce = "마리나라 소스";

    toppings.add("잘게 썬 레지아노 치즈");
  }
}
