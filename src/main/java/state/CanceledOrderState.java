package state;

public final class CanceledOrderState implements IOrderState {

    @Override
    public void pay(final Order order) {
        System.out.println("Заказ отменен");
    }

    @Override
    public void cancel(final Order order) {
        System.out.println("Заказ отменен");
    }

    @Override
    public void deliver(final Order order) {
        System.out.println("Заказ отменен");
    }

}
