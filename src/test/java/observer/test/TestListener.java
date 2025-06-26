package observer.test;

import observer.BellListener;

public class TestListener implements BellListener {

    private int callCount = 0;

    @Override
    public void bellRang() {
        callCount++;
    }

    public int getCallCount() {
        return callCount;
    }

}
