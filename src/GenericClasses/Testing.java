package GenericClasses;

//import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Long> longList = List.of(12L, 1L, 45L, 12L, 89L, 123L, 876L);
        Numeric<Long> numeric = new Numeric<>(longList);
        System.out.println(numeric.sorted());
        System.out.println(numeric.calcMax());
    }
}
