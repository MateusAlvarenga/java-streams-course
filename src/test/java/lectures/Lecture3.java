package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class Lecture3 {

  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    final Integer expectedMin = 1;
    final Integer min = numbers.stream()
        .min(Comparator.naturalOrder())
        .orElseThrow(RuntimeException::new);

    assertThat(min).isEqualTo(expectedMin);
  }

  @Test
  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    final Integer expectedMax = 100;
    final Integer max = numbers.stream()
        .max(Comparator.naturalOrder())
        .orElseThrow(RuntimeException::new);

    assertThat(max).isEqualTo(expectedMax);
  }
}
