package services;

import java.util.List;

public class CalculationService {

    //public static Integer max(List<Integer> list) {
    // Transformando em genérics
    // Para poder usar o compareTo, preciso extender a classe
    public static<T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        T max = list.get(0); // pega o primeiro elemento da lista
        for (T item : list) {
            // usando a interface compareTo
            if (item.compareTo(max) > 0 ) {
                max = item;
            }
        }
        return max;
    }
}
