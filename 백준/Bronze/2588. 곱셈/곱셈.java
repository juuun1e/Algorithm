import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());

    String sb = String.valueOf(A * (B % 10)) +
        '\n' +
        A * ((B % 100) / 10) +
        '\n' +
        A * (B / 100) +
        '\n' +
        A * B;

    System.out.println(sb);

  }
}
