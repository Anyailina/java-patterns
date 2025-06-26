package factory.logistics.impl;

import factory.transport.impl.Transport;

/**
 * Абстрактный класс, определяющий логистический процесс доставки.
 */
public abstract class Logistics {

    /**
     * Фабричный метод для создания транспортного средства.
     * @return экземпляр транспортного средства
     */
    public abstract Transport createTransport();

    /**
     * Планирует и выполняет доставку.
     * @return сообщение о выполненной доставке
     */
    public String planDelivery() {
        Transport transport = createTransport();
        return transport.deliver();
    }

}
