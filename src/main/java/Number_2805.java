import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputCount = bufferedReader.readLine().split(" ");
        int treeCount = Integer.parseInt(inputCount[0]);
        int treeHeight = Integer.parseInt(inputCount[1]);

        String[] rawTrees = bufferedReader.readLine().split(" ");
        int maxHeight = 0;
        int[] trees = new int[treeCount];
        for(int i = 0; i < treeCount; ++i) {
            trees[i] = Integer.parseInt(rawTrees[i]);
            if(maxHeight < trees[i]) {
                maxHeight = trees[i];
            }
        }

        int left = 0;
        int right = maxHeight;
        int result = 0;

        while(left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for(int tree : trees) {
                if(tree > mid) {
                    sum += (tree-mid);
                }
            }

            if(sum >= treeHeight) {
                result = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
