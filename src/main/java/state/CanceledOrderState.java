package state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CanceledOrderState implements IOrderState {

    private static final Logger LOG =
        LogManager.getLogger(CanceledOrderState.class);

    @Override
    public void pay(final Order order) {
        LOG.info("Заказ отменен");
    }

    @Override
    public void cancel(final Order order) {
        LOG.info("Заказ отменен");
    }

    @Override
    public void deliver(final Order order) {
        LOG.info("Заказ отменен");
    }

}
