package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    // 1. Find people aged less or equal 18
    // 2. Then change implementation to find first 10 people
    List<Person> people = MockData.getPeople();
    List<Person> youngPeople = Lists.newArrayList();

    for(int i=0, limitChecker = 0, limit = 10; limitChecker != limit; i++, limitChecker++){
      youngPeople.add(people.get(i));
    }

    assertThat(youngPeople).isInstanceOf(List.class);
    assertThat(youngPeople).isNotEmpty();
    assertThat(youngPeople).hasSize(10);
  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();
    List<Person> filteredPeople = people.stream()
        .filter(person -> person.getAge() <= 18)
        .limit(10)
        .collect(Collectors.toList());

    assertThat(filteredPeople).isInstanceOf(List.class);
    assertThat(filteredPeople).isNotEmpty();
    assertThat(filteredPeople).hasSize(10);
  }
}
