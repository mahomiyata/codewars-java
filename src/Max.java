public class Max {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int tempSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum = 0;
            tempSum += arr[i];
            for (int j = i+1; j < arr.length; j++) {
                tempSum += arr[j];
                maxSum = tempSum > maxSum ? tempSum : maxSum;
            }
        }
        return maxSum;
    }
}
