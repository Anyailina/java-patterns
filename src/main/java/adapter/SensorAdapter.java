package adapter;

/**
 * Адаптер для преобразования класса.
 * {@link FahrenheitSensor} к интерфейсу {@link DigitalSensor}.
 */
public final class SensorAdapter implements DigitalSensor {

    /**
     * Адаптируемый датчик температуры в градусах Фаренгейта.
     */
    private final FahrenheitSensor legacySensor;

    /**
     * Создает новый адаптер для указанного датчика Фаренгейта.
     *
     * @param sensor адаптируемый датчик температуры (не может быть null)
     */
    public SensorAdapter(final FahrenheitSensor sensor) {
        this.legacySensor = sensor;
    }

    /**
     * Возвращает температуру в градусах Цельсия, преобразованную из Фаренгейта.
     * @return температура в градусах Цельсия
     */
    @Override
    public double getTemperatureCelsius() {
        return legacySensor.getTemperatureInCelsius();
    }

}
