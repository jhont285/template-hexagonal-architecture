package org.hexagonal.architecture.usecase;

import lombok.RequiredArgsConstructor;
import org.hexagonal.architecture.kernel.Person;
import org.hexagonal.architecture.port.PersistencePort;

import java.util.List;

@RequiredArgsConstructor
public class TemplateUseCaseImp implements UseCase<Integer, List<Person>> {
    private final PersistencePort persistencePort;

    @Override
    public List<Person> execute(Integer command) {
        return persistencePort.getListPerson(command);
    }
}
