
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] num = br.readLine().split(" ");
    int A = Integer.parseInt(num[0]);
    int B = Integer.parseInt(num[1]);
    int C = Integer.parseInt(num[2]);

    System.out.println( (A+B)%C );
    System.out.println( (A%C + B%C)%C );
    System.out.println( (A*B)%C );
    System.out.println( (A%C * B%C)%C );
  }
}
