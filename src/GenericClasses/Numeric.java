package GenericClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numeric <N extends Number & Comparable<N>>{
    private final List<N> num;

    public Numeric(List<N> num) {
        this.num = new ArrayList<>(num);
    }
    public List<N> sorted() {
        Collections.sort(num);
        return num;
    }
    public N calcMax() {
        return Collections.max(num);
    }
}
