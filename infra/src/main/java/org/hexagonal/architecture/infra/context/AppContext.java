package org.hexagonal.architecture.infra.context;

import org.hexagonal.architecture.port.PersistencePort;
import org.hexagonal.architecture.usecase.TemplateUseCaseImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("checkstyle:MissingJavadocType")
@Configuration
public class AppContext {

    @Bean
    public TemplateUseCaseImp templateUseCase(PersistencePort persistencePort) {
        return new TemplateUseCaseImp(persistencePort);
    }

}
