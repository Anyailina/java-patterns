package factory.logistics;

import factory.transport.Car;
import factory.logistics.impl.Logistics;
import factory.transport.impl.Transport;

public final class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Car();
    }

}
