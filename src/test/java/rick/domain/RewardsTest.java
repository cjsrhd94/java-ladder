package rick.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class RewardsTest {

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("null, empty 리스트")
    void nullAndEmptyName(final List<String> names) {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> new Rewards(names));
    }

    @Test
    @DisplayName("reward Test")
    void reward() {
        List<String> names = Arrays.asList("rick", "morty", "beth");
        Rewards rewards = new Rewards(names);

        for (int i = 0; i < names.size(); i++) {
            assertThat(rewards.reward(i))
                .isEqualTo(new Reward(names.get(i)));
        }
    }


}