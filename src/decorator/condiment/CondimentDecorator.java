package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * 첨가물을 나타내는 추강 클래스 (데코레이터 클래스)
 * Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Beverage 클래스를 확장
 */
public abstract class CondimentDecorator extends Beverage {
  /**
   * 각 데코레이터가 감싼 음료를 나타내는 Beverage 객체를 여기에서 지정합니다.
   * 음료를 지정할 때는 데코레이터에서 어떤 음료든 감쌀 수 있도록 Beverage 슈퍼클래스 유형을 사용합니다.
   */
  protected Beverage beverage;


  /**
   * 모든 첨가물 데코레이터에 getDescription() 메소드를 새로 구현하도록 함
   * @return description string
   */
  public abstract String getDescription();

  public Size getSize() {
    return beverage.getSize();
  }
}
