import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import prototype.Computer;
import prototype.WindowsComputer;

/**
 * Тестирование клонирования WindowsComputer.
 * Проверяет, что клон имеет те же свойства, что и оригинал, но это другой объект.
 */
public class WindowsComputerTest {
    @Test
    void shouldCreateCloneWithSameProperties() {

        WindowsComputer original = new WindowsComputer(
            "Macbook",
            "m1",
            "Apple  GPU",
            16,
            "1TB SSD"
        );

        Computer clone = original.clone();

        assertThat(clone)
            .isInstanceOf(WindowsComputer.class)
            .isNotSameAs(original);

        assertThat(clone.getName()).isEqualTo(original.getName());
        assertThat(clone.getCpu()).isEqualTo(original.getCpu());
        assertThat(clone.getGpu()).isEqualTo(original.getGpu());
        assertThat(clone.getRam()).isEqualTo(original.getRam());
        assertThat(clone.getStorage()).isEqualTo(original.getStorage());
    }

}
