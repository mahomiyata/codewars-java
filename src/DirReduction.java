import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {

    public static void main(String[] args) {
        String[] res = dirReduc(new String[]{"NORTH","WEST","NORTH"});
        Arrays.stream(res).forEach(System.out::println);
    }

    public static String[] dirReduc(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("-") || i+1 >= arr.length) {
                continue;
            }
            if (arr[i].equals("NORTH")) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j].equals("SOUTH")) {
                        arr[i] = "-";
                        arr[j] = "-";
                        break;
                    }
                }
            }
            if (arr[i].equals("SOUTH")) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j].equals("NORTH")) {
                        arr[i] = "-";
                        arr[j] = "-";
                        break;
                    }
                }
            }
            if (arr[i].equals("EAST")) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j].equals("WEST")) {
                        arr[i] = "-";
                        arr[j] = "-";
                        break;
                    }
                }
            }
            if (arr[i].equals("WEST")) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j].equals("EAST")) {
                        arr[i] = "-";
                        arr[j] = "-";
                        break;
                    }
                }
            }
        }

        List<String> temp = new ArrayList<>(Arrays.asList(arr));
        temp.removeAll(Arrays.asList("-"));

        return temp.toArray(new String[temp.size()]);
    }
}
