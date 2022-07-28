package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
    final Predicate<Car> carPredicate = car -> car.getColor().equals("Red");

    Stream<Car> carsFiltered =
        cars.stream()
            .filter(carPredicate);

    carsFiltered.forEach(System.out::println);
  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();
    List<PersonDTO> personDTOS  =
        people.stream()
            .map(PersonDTO::map)
            .collect(Collectors.toList());

    personDTOS.forEach(System.out::println);
  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    Double avarege = MockData.getCars().stream()
        .mapToDouble(Car::getPrice)
            .average().orElseThrow(RuntimeException::new);
    Double expectedAvarege = 52693.19979;

    assertThat(avarege).isEqualTo(expectedAvarege);
  }

  @Test
  public void test() throws Exception {

  }
}



