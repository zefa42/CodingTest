import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number_2309 {
    private static final int DWARF_COUNT = 7;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] rawDwarfs = new int[DWARF_COUNT + 2];

        for(int i = 0; i < rawDwarfs.length; ++i) {
            rawDwarfs[i] = Integer.parseInt(bufferedReader.readLine());
        }

        List<Integer> dwarfs = new ArrayList<>();
        for(int dwarf : rawDwarfs) {
            dwarfs.add(dwarf);
        }
        int noDwarfSum = Arrays.stream(rawDwarfs).sum() - 100;

        for(int i = 0; i < rawDwarfs.length - 1; ++i) {
            for(int j = i + 1; j < rawDwarfs.length; ++j) {
                if(rawDwarfs[i] + rawDwarfs[j] == noDwarfSum) {
                    dwarfs.remove((Integer) rawDwarfs[i]);
                    dwarfs.remove((Integer) rawDwarfs[j]);
                    break;
                }
            }
            if(dwarfs.size() == DWARF_COUNT) {
                break;
            }
        }

        Collections.sort(dwarfs);
        for(Integer dwarf : dwarfs) {
            System.out.println(dwarf);
        }
    }
}
