import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.nextLine());
    int y = Integer.parseInt(sc.nextLine());

    if (x > 0) {
      if (y > 0) {
        System.out.println(1);
      } else {
        System.out.println(4);
      }
    } else {
      if (y > 0) {
        System.out.println(2);
      } else {
        System.out.println(3);
      }
    }
  }
}