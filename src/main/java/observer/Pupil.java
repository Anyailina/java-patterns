package observer;

public final class Pupil implements BellListener {

    @Override
    public void bellRang() {
        System.out.println("Пора на перемену");
    }

}
