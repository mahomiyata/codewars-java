import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfDivided {

    public static void main(String[] args) {
        System.out.println(sumOfDivided(new int[] {-12, 15}));
    }

    public static String sumOfDivided(int[] l) {

        List<Integer> factors = new ArrayList<>();
        for (int num : l) {
            int target = num < 0 ? -num : num;
            for (int i = 2; i <= target; i++) {
                if (target % i == 0 && !factors.contains(i)) {
                    factors.add(i);
                }
                while (target % i == 0) {
                    target /= i;
                }
            }

        }

        Collections.sort(factors);
        String result = "";

        for (int fact : factors) {
            int sum = 0;
            for (int num : l) {
                if (num % fact == 0) {
                    sum += num;
                }
            }
            result += "(" + fact + " " + sum + ")";
        }
        return result;
    }
}
