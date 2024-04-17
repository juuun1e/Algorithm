import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO A+B-3
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    int arr[] = new int[T]; // 예제 출력처럼 구현하기 위해 배열에 담자

    for (int i = 0; i < T; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      arr[i] = A + B; // i 길이 만큼 배열에 A+B값을 담아
    }
    for (int C : arr) {
      System.out.println(C); // 출력
    }

  }
}
