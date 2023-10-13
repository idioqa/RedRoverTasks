import java.time.DayOfWeek;
import java.util.Collections;
import java.util.List;

public class Main {
  final static boolean MIN = true;
  final static boolean MAX = false;
  public static void main(String[] args) {
    List<Integer> ints = List.of(1, 3, 6, 456, -123, 0);
    List<Double> doubles = List.of(12.0, -14.2, 90990.3224);
    List<String> strings = List.of("Ivan", "was born", "a girl", "ordered", "to carry", "a swaddling cloth");
    List<DayOfWeek> days = List.of(
            DayOfWeek.MONDAY,
            DayOfWeek.WEDNESDAY,
            DayOfWeek.TUESDAY,
            DayOfWeek.THURSDAY,
            DayOfWeek.FRIDAY,
            DayOfWeek.SATURDAY,
            DayOfWeek.SUNDAY
    );

    List<Yokozuna> sumoists = List.of(
            new Yokozuna("Juo", 200),
            new Yokozuna("Heop", 300),
            new Yokozuna("Tyuoi", 250)
    );

    System.out.println(findMinOrMax(ints, MIN));
    System.out.println(findMinOrMax(ints, MAX));
    System.out.println(findMinOrMax(sumoists, MIN));
    System.out.println(findMinOrMax(sumoists, MAX));
    System.out.println(findMinOrMax(strings, MIN));
    System.out.println(findMinOrMax(strings, MAX));
    System.out.println(findMinOrMax(doubles, MIN));
    System.out.println(findMinOrMax(doubles, MAX));
    System.out.println(findMinOrMax(days, MIN));
    System.out.println(findMinOrMax(days, MAX));
  }

  public static <T extends Comparable<T>> T findMinOrMax(List<T> list, boolean min) {
    if (list.isEmpty()) {
      throw new IllegalArgumentException("List is empty");
    }

    if(min) return Collections.min(list);
    return Collections.max(list);
  }
}