import java.util.Arrays;

public class Snail {

    public static void main(String[] args) {
        int[][] array = {{}};
        int[] res = snail(array);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] snail(int[][] array) {

        if (array[0].length == 0) return new int[0];

        int[] result = new int[array.length * array.length];
        int[][] checker = new int[array.length][array.length];
        int row = 0;
        int column = 0;
        boolean isRowTern = true;
        boolean increasing = true;

        for (int i = 0; i < result.length; i++) {
            result[i] = array[column][row];
            checker[column][row] = 1;
            if (isRowTern && increasing) {
                if (row + 1 < array.length && !(checker[column][row+1] == 1)) {
                    row++;
                } else {
                    isRowTern = false;
                    column++;
                    continue;
                }
            }
            if (!isRowTern && increasing) {
                if (column + 1 < array.length && !(checker[column+1][row] == 1)) {
                    column++;
                } else {
                    isRowTern = true;
                    increasing = false;
                    row--;
                    continue;
                }
            }
            if (isRowTern && !increasing) {
                if (row - 1 >= 0 && !(checker[column][row-1] == 1)) {
                    row--;
                } else {
                    isRowTern = false;
                    column--;
                    continue;
                }
            }
            if (!isRowTern && !increasing) {
                if (column -1 >= 0 && !(checker[column-1][row] == 1)) {
                    column--;
                } else {
                    isRowTern = true;
                    increasing = true;
                    row++;
                }
            }

        }

        return  result;
    }
}
