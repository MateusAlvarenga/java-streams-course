package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lecture9 {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    final Integer sum = Arrays.stream(integers).reduce(0, Integer::sum);
    assertThat(sum).isEqualTo(1831);

  }


}

