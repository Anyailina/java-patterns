import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.CanceledOrderState;
import state.DeliverOrderState;
import state.NewOrderState;
import state.Order;
import state.PaidOrderState;

public class OrderStateTest {

    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order(new NewOrderState());
    }

    @Test
    void newOrderCanBePaid() {
        order.pay();
        assertInstanceOf(PaidOrderState.class, order.getPlayerState());
    }

    @Test
    void newOrderCanBeCanceled() {
        order.cancel();
        assertInstanceOf(CanceledOrderState.class, order.getPlayerState());
    }

    @Test
    void newOrderCannotBeDelivered() {
        order.deliver();
        assertInstanceOf(NewOrderState.class, order.getPlayerState());
    }

    @Test
    void paidOrderCanBeCanceled() {
        order.pay();
        order.cancel();
        assertInstanceOf(CanceledOrderState.class, order.getPlayerState());
    }

    @Test
    void paidOrderCanBeDelivered() {
        order.pay();
        order.deliver();
        assertInstanceOf(DeliverOrderState.class, order.getPlayerState());
    }

    @Test
    void deliveredOrderCannotBeChanged() {
        order.pay();
        order.deliver();
        order.pay();
        order.cancel();
        order.deliver();
        assertInstanceOf(DeliverOrderState.class, order.getPlayerState());
    }

}
