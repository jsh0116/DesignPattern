package singleton;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler instance;

  private ChocolateBoiler() {
    empty = true;
    boiled = true;
  }

  public static ChocolateBoiler getInstance() {
    if (instance == null) {
      instance = new ChocolateBoiler();
    }
    return instance;
  }

  public void fill() {
    if(isEmpty()) {
      empty = false;
      boiled = false;
      // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
    }
  }

  public void drain() {
    if (!isEmpty() && !isBoiled()) {
      empty = true;
    }
  }


  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
