package org.hexagonal.architecture.infra.adapers.out.dynamo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class DynamoAdapterTest {
    @InjectMocks
    private DynamoAdapter dynamoAdapter;

    @Test
    void getListPerson() {
        int quantity = (int) (Math.random() * 10);
        var listPerson = dynamoAdapter.getListPerson(quantity);

        assertEquals(quantity, listPerson.size());
    }
}