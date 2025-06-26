import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;
import singleton.Singleton;

class SingletonTest {

    @Test
    void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertSame(instance1, instance2);
    }

}
