import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int[] materials = new int[N];

        String[] rawMaterials = bufferedReader.readLine().split(" ");
        for(int i = 0; i < N; ++i) {
            materials[i] = Integer.parseInt(rawMaterials[i]);
        }
        Arrays.sort(materials);

        int left = 0;
        int right = N - 1;
        int count = 0;

        while(left < right) {
            int sum = materials[left] + materials[right];
            if(sum == M) {
                count++;
                left++;
                right--;
            }
            else if(sum < M) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(count);
    }
}
