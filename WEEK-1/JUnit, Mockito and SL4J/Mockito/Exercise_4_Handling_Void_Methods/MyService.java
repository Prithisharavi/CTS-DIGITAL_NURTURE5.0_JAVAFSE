package com.cognizant.mockito.exercise4;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void notifyUser() {
        externalApi.sendNotification();
    }
}