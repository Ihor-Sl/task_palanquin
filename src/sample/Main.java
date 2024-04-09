package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LocalDate> unsortedDates = new ArrayList<>(List.of(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        ));

        DateSorter dateSorter = new DateSorter();
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        System.out.println("Unsorted list: " + unsortedDates);
        System.out.println("Sorted list: " + sortedDates);
    }
}
