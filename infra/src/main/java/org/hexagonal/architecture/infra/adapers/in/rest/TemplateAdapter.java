package org.hexagonal.architecture.infra.adapers.in.rest;

import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.hexagonal.architecture.kernel.Person;
import org.hexagonal.architecture.usecase.TemplateUseCaseImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TemplateAdapter {
    private final TemplateUseCaseImp templateUseCaseImp;

    @GetMapping("/{quantity}")
    public List<Person> template(@Positive @PathVariable int quantity) {
        return templateUseCaseImp.execute(quantity);
    }
}
