package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {

    IntStream.rangeClosed(1,10).forEach(
        i -> System.out.println(i));

  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    people.stream()
        .skip(0)
        .limit(10)
        .forEach(System.out::println);
  }

  @Test
  public void intStreamIterate() throws Exception {
      IntStream.iterate(0, operand -> operand + 1)
          .filter(number -> number % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
  }
}
