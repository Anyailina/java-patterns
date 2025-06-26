package factory;

/**
 * Типы транспортных средств для доставки.
 */
public enum TransportType {

    /**
     * Доставка с использованием машины.
     */
    CAR("Доставка машиной"),

    /**
     * Доставка с использованием самолета.
     */
    PLANE("Доставка самолетом");

    /** Сообщение о способе доставки. */
    private final String deliveryMessage;

    /**
     * Конструктор типа транспорта.
     * @param message сообщение о доставке
     */
    TransportType(final String message) {
        this.deliveryMessage = message;
    }

    /**
     * Возвращает сообщение о доставке.
     * @return строка с описанием способа доставки
     */
    public String deliver() {
        return deliveryMessage;
    }

}
