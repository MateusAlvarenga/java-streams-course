package lectures;


import beans.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Lecture8 {

  @Test
  public void simpleGrouping() throws Exception {

    final Map<String, List<Car>> cars = MockData.getCars()
        .stream()
        .collect(Collectors.groupingBy(Car::getModel));

    System.out.println(cars);

  }

  @Test
  public void groupingAndCounting() throws Exception {
    ArrayList<String> names = Lists
        .newArrayList(
            "John",
            "John",
            "Mariam",
            "Alex",
            "Mohammado",
            "Mohammado",
            "Vincent",
            "Alex",
            "Alex"
        );

    final Map<String, Long> namesCollected
        = names
        .stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    namesCollected.forEach((name,count) -> System.out.println(name+ "> "+ count ));

  }

}