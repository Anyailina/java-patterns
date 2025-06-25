package state;

public final class NewOrderState implements IOrderState {

    @Override
    public void pay(final Order order) {
        order.setPlayerState(new PaidOrderState());
    }

    @Override
    public void cancel(final Order order) {
        order.setPlayerState(new CanceledOrderState());
    }

    @Override
    public void deliver(final Order order) {
        System.out.println("Сначала оплатите заказ");
    }

}
