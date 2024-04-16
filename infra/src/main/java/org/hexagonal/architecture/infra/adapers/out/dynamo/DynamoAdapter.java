package org.hexagonal.architecture.infra.adapers.out.dynamo;

import org.hexagonal.architecture.kernel.Person;
import org.hexagonal.architecture.port.PersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


@Service
public class DynamoAdapter implements PersistencePort {
    private static final List<String> RANDOM_NAMES =
            List.of("John", "Emily", "Michael", "Sarah", "Christopher", "Emma", "Daniel", "Olivia", "Matthew", "Sophia");
    private static final List<String> RANDOM_LASTNAMES =
            List.of("Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez");
    public static final Random RND = new Random();

    @Override
    public List<Person> getListPerson(int quantity) {
        return IntStream.range(0, quantity)
                .mapToObj(unused -> Person.builder()
                        .firstName(RANDOM_NAMES.get(RND.nextInt(RANDOM_NAMES.size())))
                        .lastName(RANDOM_LASTNAMES.get(RND.nextInt(RANDOM_LASTNAMES.size())))
                        .age(RND.nextInt(5, 50))
                        .build())
                .toList();
    }
}
