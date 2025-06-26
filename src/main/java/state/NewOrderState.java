package state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class NewOrderState implements IOrderState {

    private static final Logger LOG =
        LogManager.getLogger(CanceledOrderState.class);

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
        LOG.info("Сначала оплатите заказ");
    }

}
