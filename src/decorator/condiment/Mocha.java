package decorator.condiment;

import decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {

  /**
   * Mocha 인스턴스에는 Beverage 레퍼런스가 들어있음
   * 인스턴스 변수를 감싸고자 하는 객체로 설정하는 생성자 (데코레이터의 생성자에 감싸고자 하는 음료 객체를 전달하는 방식 사용)
   */
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  /**
   * 음료 가격에 모카를 추가한 가격을 계산하는 함수
   * 우선 장식하고 있는 객체에 가격을 구하는 작업을 위임하여 음료값을 구함
   * @return 음료 가격에 모카를 추가한 값 반환
   */
  @Override
  public double cost() {
    return beverage.cost() + .20;
  }

  /**
   * 아이템에 대한 설명 (오버라이드)
   * @return 먼저 장식하고 있는 객체에 작업을 위임하는 다음 그 결과에 모카를 더한 값을 반환
   */
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 모카";
  }
}
