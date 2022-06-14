package ladder.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DirectionTest {

    @Test
    void init() {
        assertThat(Direction.of(true, false)).isEqualTo(Direction.of(true, false));
    }

    @Test
    public void init_invalid() {
        assertThatThrownBy(() -> Direction.of(true, true)).isInstanceOf(IllegalStateException.class);
    }

    @Test
    public void next_random_true() {
        Direction next = Direction.first(true).next();
        assertThat(next).isEqualTo(Direction.of(true, false));
    }
    @Test
    public void next_true() {
        Direction next = Direction.of(true, false).next(true);
        assertThat(next).isEqualTo(Direction.of(false, true));
    }

    @Test
    public void next_false() {
        Direction next = Direction.of(false, true).next(false);
        assertThat(next).isEqualTo(Direction.of(true, false));
    }

    @Test
    public void first() {
        Direction first = Direction.first(true);
        assertThat(first.isLeft()).isFalse();
    }

    @Test
    public void last() {
        Direction last = Direction.first(true).last();
        assertThat(last).isEqualTo(Direction.of(true, false));
    }

}