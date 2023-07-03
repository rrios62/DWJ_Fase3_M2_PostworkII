package org.bedu.java.backend.postworII.PostworkII.data;

import org.bedu.java.backend.postworII.PostworkII.data.SomeDataService;

public class SomeDataServiceStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { 1, 2, 3 };
    }

}
