import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] arr = new int[length];
        
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i += 2) {
            if ( arr[i] != arr[i + 1]) {
                ans.add(arr[i]);
                i--;
            }
        }
        System.out.println(ans);
    }
}