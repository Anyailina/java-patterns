import static org.assertj.core.api.Assertions.assertThat;
import factory.logistics.impl.Logistics;
import factory.logistics.RoadLogistics;
import factory.TransportType;
import org.junit.jupiter.api.Test;

/**
 * Тест демонстрирует работу паттерна "Фабричный метод" в контексте автомобильной логистики.
 */
public class CarTest {

    /**
     * Проверяет, что RoadLogistics корректно создает автомобильную доставку с ожидаемым сообщением.
     */
    @Test
    void shouldReturnCorrectCarDeliveryMessage() {

        Logistics logistics = new RoadLogistics();
        assertThat(logistics.planDelivery()).isEqualTo(TransportType.CAR.deliver());
    }

}
