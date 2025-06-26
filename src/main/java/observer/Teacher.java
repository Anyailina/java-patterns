package observer;

public final class Teacher implements BellListener {

    @Override
    public void bellRang() {
        System.out.println("Заканчиваем урок");
    }

}
