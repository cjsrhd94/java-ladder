package ladder.model.name;

import java.util.Objects;

public class Name {

    private static final int NAME_MAX_LENGTH = 5;
    private final String name;

    public Name(String name) {
        checkNameIsEmpty(name);
        checkNameLength(name);
        this.name = name;
    }

    private void checkNameIsEmpty(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름이 null 이거나 비어있습니다.");
        }
    }

    private void checkNameLength(String name) {
        if(name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("이름 길이는 " + NAME_MAX_LENGTH + "를 넘으면 안됩니다.");
        }
    }

    public String get() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}