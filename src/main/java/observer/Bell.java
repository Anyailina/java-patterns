package observer;

import java.util.List;

/**
 * Класс, представляющий школьный звонок, который уведомляет
 * всех зарегистрированных слушателей о наступлении события.
 */
public final class Bell {

    /**
     * Список слушателей.
     */
    private final List<BellListener> listeners;

    /**
     * Создает новый экземпляр звонка с указанным списком слушателей.
     *
     * @param bellListeners начальный список слушателей звонка
     */
    public Bell(final List<BellListener> bellListeners) {
        this.listeners = bellListeners;
    }

    /**
     * Добавляет слушателя в список уведомлений.
     *
     * @param bellListener слушатель для добавления
     */
    public void addListener(final BellListener bellListener) {
        listeners.add(bellListener);
    }

    /**
     * Удаляет слушателя из списка уведомлений.
     *
     * @param bellListener слушатель для удаления
     */
    public void removeListener(final BellListener bellListener) {
        listeners.remove(bellListener);
    }

    /**
     * Активирует звонок, уведомляя всех зарегистрированных слушателей.
     * Вызывает метод bellRang() у каждого слушателя.
     */
    public void ring() {
        listeners.forEach(BellListener::bellRang);
    }

}
