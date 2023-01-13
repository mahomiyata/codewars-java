import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

    public static void main(String[] args) {
        int[] res = arrayDiff(new int [] {1,2}, new int[] {1});
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length == 0) {
            return a;
        }
        List<Integer> resultList = new ArrayList<>();
        for (int target : b) {
            for (int num : a) {
                if (target == num) {
                    continue;
                }
                resultList.add(num);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

}
