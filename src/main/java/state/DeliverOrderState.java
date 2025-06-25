package state;

public final class DeliverOrderState implements IOrderState {

    @Override
    public void pay(final Order order) {
        System.out.println("Заказ уже оплачен");
    }

    @Override
    public void cancel(final Order order) {
        System.out.println("Заказ уже отправлен");
    }

    @Override
    public void deliver(final Order order) {
        System.out.println("Заказ уже отправлен");
    }

}
