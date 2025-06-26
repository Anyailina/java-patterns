package factory.transport;

import factory.transport.impl.Transport;
import factory.TransportType;

/**
 * Реализация интерфейса Transport, представляющая самолёт.
 */
public final class Plane implements Transport {

    @Override
    public String deliver() {
        return TransportType.PLANE.deliver();
    }

}
