import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import adapter.DigitalSensor;
import adapter.FahrenheitSensor;
import adapter.SensorAdapter;

class SensorAdapterTest {

    @Test
    void getTemperatureCelsiusShouldReturnCorrectValue() {
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor(77.0);
        SensorAdapter adapter = new SensorAdapter(fahrenheitSensor);

        double result = adapter.getTemperatureCelsius();

        assertEquals(25.0, result, 0.001);
    }

    @Test
    void adapterShouldImplementDigitalSensorInterface() {
        assertTrue(DigitalSensor.class.isAssignableFrom(SensorAdapter.class));
    }

}
