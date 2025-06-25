package state;

/**
 * Класс, представляющий заказ в системе с возможностью изменения состояний.
 */
public final class Order {

    /**
     * Текущее состояние заказа.
     */
    private IOrderState playerState;

    /**
     * Создает новый заказ с указанным начальным состоянием.
     *
     * @param state начальное состояние заказа
     */
    public Order(final IOrderState state) {
        this.playerState = state;
    }

    /**
     * Возвращает текущее состояние заказа.
     *
     * @return текущее состояние заказа
     */
    public IOrderState getPlayerState() {
        return playerState;
    }

    /**
     * Устанавливает новое состояние заказа.
     *
     * @param state новое состояние заказа (не может быть null)
     */
    public void setPlayerState(final IOrderState state) {
        this.playerState = state;
    }

    /**
     * Делегирует выполнение текущему состоянию через метод pay().
     */
    public void pay() {
        playerState.pay(this);
    }

    /**
     * Делегирует выполнение текущему состоянию через метод cancel().
     */
    public void cancel() {
        playerState.cancel(this);
    }

    /**
     * Делегирует выполнение текущему состоянию через метод deliver().
     */
    public void deliver() {
        playerState.deliver(this);
    }

}
