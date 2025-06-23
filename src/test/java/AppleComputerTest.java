import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import prototype.AppleComputer;
import prototype.Computer;

/**
 * Тестирование клонирования AppleComputer.
 * Проверяет, что клон имеет те же свойства, что и оригинал, но это другой объект.
 */

public class AppleComputerTest {
    @Test
    void shouldCreateCloneWithSameProperties() {

        AppleComputer original = new AppleComputer(
            "Lenovo IP S145 59ID",
            "Intel i7",
            "NVIDEA",
            4,
            "1TB SSD"
        );


        Computer clone = original.clone();

        assertThat(clone)
            .isInstanceOf(AppleComputer.class)
            .isNotSameAs(original);

        assertThat(clone.getName()).isEqualTo(original.getName());
        assertThat(clone.getCPU()).isEqualTo(original.getCPU());
        assertThat(clone.getGPU()).isEqualTo(original.getGPU());
        assertThat(clone.getRAM()).isEqualTo(original.getRAM());
        assertThat(clone.getStorage()).isEqualTo(original.getStorage());
    }
}
