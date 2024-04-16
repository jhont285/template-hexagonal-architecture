package org.hexagonal.architecture.kernel;

import lombok.Builder;
import org.apache.commons.lang3.Validate;

import java.util.Objects;

public record Person(String firstName,
                     String lastName,
                     int age) {

    @Builder
    public Person {
        firstName = Objects.requireNonNull(firstName);
        lastName = Objects.requireNonNull(lastName);
        Validate.isTrue(age > 0, "age must be gather or equals that zero", age);
    }
}
