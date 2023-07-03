package org.bedu.java.backend.postworII.PostworkII.business;

import org.bedu.java.backend.postworII.PostworkII.data.SomeDataService;

public class SomeBusinessLogic {

    private SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public int calculateSumWithADataService() {
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for (int value : data) {
            sum += value;
        }

        return sum;
    }

    public int calculateSubstractionWithADataService(){
        int rest = 0;
        int[] data = someDataService.retrieveAllData();
        for (int value : data) {
            rest -= value;
        }

        return rest;
    }

}

