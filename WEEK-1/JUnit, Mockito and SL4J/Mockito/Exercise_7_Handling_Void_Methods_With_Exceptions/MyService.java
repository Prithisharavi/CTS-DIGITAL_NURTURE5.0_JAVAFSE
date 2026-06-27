package com.cognizant.mockito.exercise7;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void performDelete() {
        externalApi.deleteData();
    }
}