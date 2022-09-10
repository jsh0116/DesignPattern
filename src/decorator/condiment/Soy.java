package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * 두유
 */
public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    Size size = getSize();
    double cost = beverage.cost();

    switch (size) {
      case TALL: {
        cost += .10;
        break;
      }
      case GRANDE: {
        cost += .15;
        break;
      }
      case VENTI: {
        cost += .20;
        break;
      }
      default: {
        break;
      }
    }
    return cost;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 두유";
  }
}
