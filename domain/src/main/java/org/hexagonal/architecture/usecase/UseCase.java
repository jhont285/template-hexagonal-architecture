package org.hexagonal.architecture.usecase;

public interface UseCase<T, R> {
    R execute(T command);
}
