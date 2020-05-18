package services;

import java.util.List;

public class CalculationService {

    // Criado como static
    public static Integer max(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        Integer max = list.get(0); // pega o primeiro elemento da lista
        for (Integer item : list) {
            // usando a interface compareTo
            if (item.compareTo(max) > 0 ) {
                max = item;
            }
        }
        return max;
    }
}
