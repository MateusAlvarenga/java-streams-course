package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.Test;

public class Lecture4 {

  @Test
  public void distinct() throws Exception {
    final Integer expectedSize = 9;

    final List<Integer> expectedDistinctList =
        IntStream.rangeClosed(1,9)
            .boxed()
            .collect(Collectors.toList());

    final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
    final List<Integer> distinctList =
        numbers.stream()
            .distinct()
            .collect(Collectors.toList());

    assertThat(distinctList).hasSize(expectedSize);
    assertThat(distinctList).isEqualTo(expectedDistinctList);
  }

  @Test
  public void distinctWithSet() throws Exception {
    final Integer expectedSize = 9;
    final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
    final Set<Integer> expectedDistinctList =
        IntStream.rangeClosed(1,9)
            .boxed()
            .collect(Collectors.toSet());

    final Set<Integer> distinctList =
        numbers.stream()
            .collect(Collectors.toSet());

    assertThat(distinctList).hasSize(expectedSize);
    assertThat(distinctList).isEqualTo(expectedDistinctList);

  }
}
