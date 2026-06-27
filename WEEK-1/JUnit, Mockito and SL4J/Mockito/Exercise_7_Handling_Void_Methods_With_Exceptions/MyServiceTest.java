package com.cognizant.mockito.exercise7;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    void testVoidMethodThrowsException() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        doThrow(new RuntimeException("Delete Failed"))
                .when(mockApi)
                .deleteData();

        MyService service = new MyService(mockApi);

        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> service.performDelete());

        verify(mockApi).deleteData();

        org.junit.jupiter.api.Assertions.assertEquals(
                "Delete Failed",
                exception.getMessage());
    }
}