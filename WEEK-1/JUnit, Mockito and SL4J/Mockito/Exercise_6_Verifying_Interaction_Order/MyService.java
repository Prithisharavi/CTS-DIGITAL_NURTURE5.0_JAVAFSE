package com.cognizant.mockito.exercise6;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processData() {

        externalApi.connect();
        externalApi.fetchData();
        externalApi.disconnect();

    }
}