package decorator.beverage;

public class Decaf extends Beverage {

  public Decaf() {
    description = "๋์นดํ์ธ";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}
