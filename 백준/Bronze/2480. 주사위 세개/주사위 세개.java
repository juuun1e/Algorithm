import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    // 세 변수가 모두 다른 경우
    if (a!=b && b!=c && a!=c) {
      int max;
      // a > b 인 경우
      if(a > b){
        if(a > c){
          max = a;
        } else {
          max = c;
        }
      // a < b 인 경우
      } else {
        if (b > c){
          max = b;
        } else {
          max = c;
        }
      }
      System.out.println(max * 100);

    // 적어도 하나 이상의 변수가 같은 경우
      // 세 변수 모두 같은 경우
    } else {
      if (a == b && a == c) {
        System.out.println(10000 + a * 1000);

        // 두 개의 변수가 같은 경우
      } else {
        // a가 b(C)와 같은 경우
        if(a == b || a == c){
          System.out.println(1000 + a * 100);
        // b와 c 가 같은 경우
        } else {
          System.out.println(1000 + b * 100);
        }
      }
    }
  }
}
