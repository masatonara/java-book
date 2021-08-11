public class Main5 {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello("湊");
    hello("朝香");
    hello("菅原");
    add(100, 20);
    add(200, 50);
    System.out.println("メソッドの呼び出しを終了します");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);

    
  }
}
