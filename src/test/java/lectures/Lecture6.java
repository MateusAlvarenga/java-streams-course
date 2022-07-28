package lectures;


import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import org.junit.Test;

public class Lecture6 {

  final Predicate<Integer> numbersBiggerThan5AndSmallerThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    final Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    final Optional<Integer> any = Arrays.stream(numbers)
        .filter(numbersBiggerThan5AndSmallerThan10)
        .findAny();
    System.out.println(any.orElseThrow());

  }

  @Test
  public void findFirst() throws Exception {
    final Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    final Optional<Integer> any = Arrays.stream(numbers)
        .filter(numbersBiggerThan5AndSmallerThan10)
        .findFirst();
    System.out.println(any.orElseThrow());

  }
}

