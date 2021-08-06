public class Main4 {
  public static void main(String[] args) {
    int[] scores = { 20, 30, 40, 50, 80 };
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int avg = sum / scores.length;
    System.out.println("合計点：" + sum);
    System.out.println("平均点：" + avg);

    int count = 0;
    for (int u = 0; u < scores.length; u++) {
      if (scores[u] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目の数は" + count);
  }
}
