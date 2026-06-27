package com.cognizant.mockito.exercise4;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    void testVoidMethod() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        doNothing().when(mockApi).sendNotification();

        MyService service = new MyService(mockApi);

        service.notifyUser();

        verify(mockApi).sendNotification();
    }
}
