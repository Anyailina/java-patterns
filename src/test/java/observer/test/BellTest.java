package observer.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import observer.Bell;
import observer.BellListener;
import org.junit.jupiter.api.Test;

/**
 * Проверяет корректность работы механизма оповещения слушателей.
 */
class BellTest {

    /**
     * Проверяет, что звонок уведомляет всех зарегистрированных слушателей.
     * Тест добавляет двух слушателей и проверяет, что каждый был уведомлен ровно один раз.
     */
    @Test
    void shouldNotifyAllRegisteredListeners() {
        List<BellListener> listeners = new ArrayList<>();
        TestListener listener1 = new TestListener();
        TestListener listener2 = new TestListener();
        listeners.add(listener1);
        listeners.add(listener2);

        Bell bell = new Bell(listeners);
        bell.ring();

        assertEquals(1, listener1.getCallCount());
        assertEquals(1, listener2.getCallCount());
    }

    /**
     * Проверяет возможность добавления нового слушателя после создания звонка.
     * Тест добавляет слушателя через метод addListener и проверяет его уведомление.
     */
    @Test
    void shouldAddNewListener() {
        List<BellListener> listeners = new ArrayList<>();
        Bell bell = new Bell(listeners);
        TestListener pupil = new TestListener();
        bell.addListener(pupil);
        bell.ring();

        assertEquals(1, pupil.getCallCount());
    }

    /**
     * Проверяет корректность удаления слушателя.
     * Тест добавляет слушателя, затем удаляет его и проверяет, что уведомлений не было.
     */
    @Test
    void shouldStopNotifying() {
        List<BellListener> listeners = new ArrayList<>();
        TestListener pupil = new TestListener();
        listeners.add(pupil);

        Bell bell = new Bell(listeners);
        bell.removeListener(pupil);
        bell.ring();

        assertEquals(0, pupil.getCallCount());
    }

    /**
     * Проверяет звонок со списком слушателей.
     * Тест создает звонок с двумя слушателями и проверяет их уведомление.
     */
    @Test
    void shouldInitializeWithGivenListeners() {

        TestListener listener1 = new TestListener();
        TestListener listener2 = new TestListener();
        List<BellListener> listeners = List.of(listener1, listener2);

        Bell bell = new Bell(listeners);
        bell.ring();

        assertEquals(1, listener1.getCallCount());
        assertEquals(1, listener2.getCallCount());
    }

}
