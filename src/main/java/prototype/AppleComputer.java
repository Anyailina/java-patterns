package prototype;

/**
 * Реализация интерфейса Computer, представляющая компьютер на Windows.
 */

public class AppleComputer implements Computer {
    private final String name;
    private final String CPU;
    private final String GPU;
    private final Integer RAM;
    private final String storage;

    /**.
     *
     * @param name     название компьютера
     * @param CPU      модель процессора
     * @param GPU      модель графического процессора
     * @param RAM      объем оперативной памяти в гигабайтах
     * @param storage  характеристика накопителя
     */

    public AppleComputer(String name, String CPU, String GPU, Integer RAM, String storage) {
        this.name = name;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.storage = storage;
    }

    @Override
    public Computer clone() {
        return new AppleComputer(name,CPU,GPU,RAM,storage);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCPU() {
        return CPU;
    }

    @Override
    public String getGPU() {
        return GPU;
    }

    @Override
    public Integer getRAM() {
        return RAM;
    }

    @Override
    public String getStorage() {
        return storage;
    }
}
