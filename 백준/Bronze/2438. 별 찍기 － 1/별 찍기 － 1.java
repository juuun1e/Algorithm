import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = 1; i <= n; i++) {   // n번의 반복
      for (int j = 1; j <= i ; j++) { // n개씩 * 출력
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
