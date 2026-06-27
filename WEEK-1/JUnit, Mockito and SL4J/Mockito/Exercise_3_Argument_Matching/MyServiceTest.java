package com.cognizant.mockito.exercise3;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData("Hello Mockito");
        
        verify(mockApi).sendData(eq("Hello Mockito"));
    }
}