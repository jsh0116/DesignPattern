package decorator.beverage;

/**
 * Beverage는 추상 클래스
 * getDescription()과 cost()라는 2개의 메소드를 가진다.
 */
public abstract class Beverage {
  public enum Size { TALL, GRANDE, VENTI }
  Size size = Size.TALL;
  protected String description;

  public String getDescription() {
    return this.description;
  }
  
  public Size getSize() {
    return this.size;
  }
  public void setSize(Size size) {
    this.size = size;
  }
    

  public abstract double cost();
}
