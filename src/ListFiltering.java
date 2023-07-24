import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(Integer.class::isInstance).toList();
    }
}


class ExampleTests {

    @Test
    public void examples() {
        assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
