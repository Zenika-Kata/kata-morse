import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MorseDecoderTest {
    @Test
    void given_1_when_nothing_then_1_is_not_equal_to_1() {
        // Given
        var one = 1;

        // When
        // Then
        assertThat(one).isNotEqualTo(1);
    }
}
