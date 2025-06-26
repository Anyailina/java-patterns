package state;

/**
 * Интерфейс датчика температуры, предоставляющий показания в градусах Цельсия.
 */
public interface DigitalSensor {

    /**
     * Возвращает текущую температуру в градусах Цельсия.
     * @return температура в градусах Цельсия
     */
    double getTemperatureCelsius();

}
