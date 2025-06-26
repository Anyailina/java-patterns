package factory.transport;

import factory.transport.impl.Transport;
import factory.TransportType;

/**
 * Реализация интерфейса Transport, представляющая машину.
 */
public final class Car implements Transport {

    @Override
    public String deliver() {
        return TransportType.CAR.deliver();
    }

}
