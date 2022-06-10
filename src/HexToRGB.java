import java.util.Arrays;

public class HexToRGB {

    public static void main(String[] args) {
        int[] rgb = hexStringToRGB("#FF9933");
        Arrays.stream(rgb).forEach(i -> System.out.println(i));
    }

    public static int[] hexStringToRGB(String hex) {
        int[] rgb = new int[3];
        int rgbIndex = 0;
        for (int i = 1; i < hex.length(); i+=2) {
            String hexNum = hex.substring(i, i+2);
            rgb[rgbIndex] = Integer.parseInt(hexNum, 16);
            rgbIndex++;
        }
        return rgb;
    }
}
