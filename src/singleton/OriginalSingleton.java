package singleton;

public class OriginalSingleton {
  /**
   * singleton 클래스의 하나뿐인 인스턴스를 저장하는 변수
   */
  private static OriginalSingleton instance;

  /**
   * 생성자를 private 으로 선언했기 때문에 해당 클래스에서만 인스턴스 생성 가능
   */
  private OriginalSingleton() {}

  /**
   * 클래스의 인스턴스를 만들어서 반환
   * @return
   */
  public static OriginalSingleton getInstance() {
    if (instance == null) {
      instance = new OriginalSingleton();
    }
    return instance;
  }
}
