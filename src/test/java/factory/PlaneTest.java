package factory;

import static org.assertj.core.api.Assertions.assertThat;
import factory.logistics.impl.Logistics;
import factory.logistics.PlaneLogistics;
import org.junit.jupiter.api.Test;

/**
 * Тест демонстрирует работу паттерна "Фабричный метод" в контексте авиа логистики.
 */
public class PlaneTest {

    /**
     * Проверяет, что PlaneLogistics корректно создает автомобильную доставку с ожидаемым сообщением.
     */
    @Test
    void shouldReturnCorrectCarDeliveryMessage() {

        Logistics logistics = new PlaneLogistics();
        assertThat(logistics.planDelivery()).isEqualTo(TransportType.PLANE.deliver());
    }

}
