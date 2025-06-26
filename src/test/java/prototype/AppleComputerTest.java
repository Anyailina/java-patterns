package prototype;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

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
        assertThat(clone.getCpu()).isEqualTo(original.getCpu());
        assertThat(clone.getGpu()).isEqualTo(original.getGpu());
        assertThat(clone.getRam()).isEqualTo(original.getRam());
        assertThat(clone.getStorage()).isEqualTo(original.getStorage());
    }

}
