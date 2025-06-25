package state;

/**
 * Реализация датчика температуры, измеряющего температуру в градусах Цельсия.
 */
public final class CelsiusSensor implements DigitalSensor {

    /**
     * Текущее значение температуры в градусах Цельсия.
     */
    private double temperature;

    /**
     * Создает новый датчик температуры с указанным значением.
     *
     * @param initialTemperature начальное значение
     */
    public CelsiusSensor(final double initialTemperature) {
        this.temperature = initialTemperature;
    }

    /**
     * Возвращает текущее значение температуры в градусах Цельсия.
     * @return текущее значение температуры в градусах Цельсия
     */
    @Override
    public double getTemperatureCelsius() {
        return temperature;
    }

    /**
     * Устанавливает новое значение температуры.
     *
     * @param newTemperature новое значение температуры в градусах Цельсия
     */
    public void setTemperature(final double newTemperature) {
        this.temperature = newTemperature;
    }

}
