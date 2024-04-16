package org.hexagonal.architecture.port;

import org.hexagonal.architecture.kernel.Person;

import java.util.List;

public interface PersistencePort {

    List<Person> getListPerson(int quantity);
}
