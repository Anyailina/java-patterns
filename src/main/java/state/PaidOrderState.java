package state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class PaidOrderState implements IOrderState {

    private static final Logger LOG =
        LogManager.getLogger(CanceledOrderState.class);

    @Override
    public void pay(final Order order) {
        LOG.info("Заказ уже оплачен");
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
