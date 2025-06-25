package state;

public final class PaidOrderState implements IOrderState {

    @Override
    public void pay(final Order order) {
        System.out.println("Заказ уже оплачен");
    }

    @Override
    public void cancel(final Order order) {
        order.setPlayerState(new CanceledOrderState());
    }

    @Override
    public void deliver(final Order order) {
        order.setPlayerState(new DeliverOrderState());
    }

}
