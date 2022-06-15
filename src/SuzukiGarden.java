import java.util.Arrays;
import java.util.stream.Collectors;

public class SuzukiGarden {

    public static void main(String[] args) {
        System.out.println(rakeGarden("slug spider rock gravel gravel gravel gravel gravel gravel gravel"));
    }

    public static String rakeGarden(String garden)
    {
        return Arrays.stream(garden.split(" ")).map(item -> item.equals("gravel") || item.equals("rock") ? item : "gravel").collect(Collectors.joining(" "));
    }
}
