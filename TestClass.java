import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i ++){
            A[i] = scan.nextInt();
            sum += A[i];
        }
        int avg = sum / N;
        int mini = avg + 1;
        System.out.println(mini);
    }
}
