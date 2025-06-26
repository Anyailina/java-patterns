package singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс, реализующий паттерн Singleton.
 */
public final class Singleton {

    private static final Logger LOG =
        LogManager.getLogger(Singleton.class);

    private static Singleton instance;

    /**
     * Приватный конструктор, чтобы предотвратить создание экземпляров извне класса.
     */
    private Singleton() {
    }

    /**
     * Статический метод для получения единственного экземпляра класса.
     *
     * @return единственный экземпляр класса Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Пример метода синглтона.
     */
    public void doSomething() {
        LOG.info("Вызван метод doSomething ");
    }

}
