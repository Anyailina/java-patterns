package factory.logistics;

import factory.logistics.impl.Logistics;
import factory.transport.Plane;
import factory.transport.impl.Transport;

public final class PlaneLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Plane();
    }

}
