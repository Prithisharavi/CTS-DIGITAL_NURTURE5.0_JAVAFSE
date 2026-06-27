package com.cognizant.mockito.exercise6;

import static org.mockito.Mockito.inOrder;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    void testInteractionOrder() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData();

        InOrder order = inOrder(mockApi);

        order.verify(mockApi).connect();
        order.verify(mockApi).fetchData();
        order.verify(mockApi).disconnect();

    }
}