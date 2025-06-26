package state;

/**
 * Датчик температуры, работающий с градусами Фаренгейта
 * Цельсия.
 */
public final class FahrenheitSensor {

    /**
     * Константа для смещения в формуле перевода Фаренгейта в Цельсий.
     */
    private static final int FAHRENHEIT_OFFSET = 32;

    /**
     * Коэффициент перевода для преобразования Фаренгейта в Цельсий.
     */
    private static final double CELSIUS_SCALE_RATIO = 5.0 / 9.0;

    /**
     * Текущее значение температуры в градусах Фаренгейта.
     */
    private double temperatureInFahrenheit;

    /**
     * Создает новый датчик температуры с указанным значением в Фаренгейтах.
     *
     * @param temperature начальная температура в градусах Фаренгейта
     */
    public FahrenheitSensor(final double temperature) {
        this.temperatureInFahrenheit = temperature;
    }

    /**
     * Возвращает температуру в градусах Цельсия.
     *
     * @return температура в градусах Цельсия
     */
    public double getTemperatureInCelsius() {
        double temperature = (temperatureInFahrenheit - FAHRENHEIT_OFFSET)
            * CELSIUS_SCALE_RATIO;
        return temperature;
    }

}
