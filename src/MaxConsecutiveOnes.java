public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        // 1が連続する数を数える
        // 0が来たら今までの最長の長さと比較して、入れ替える
        int max = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
            }
            if (num == 0) {
                max = max > current ? max : current;
                current = 0;
            }
        }
        max = max > current ? max : current;
        return max;
    }
}
