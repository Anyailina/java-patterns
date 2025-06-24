package prototype;



/**
 * Реализация интерфейса Computer, представляющая компьютер на Windows.
 */
public final class WindowsComputer implements Computer {
    /** Название компьютера. */
    private final String name;

    /** Модель процессора. */
    private final String cpu;

    /** Модель графического процессора. */
    private final String gpu;

    /** Объём оперативной памяти. */
    private final Integer ram;

    /** Тип и размер накопителя. */
    private final String storage;

    /**
     * @param aName     название компьютера
     * @param aCpu      модель процессора
     * @param aGpu      модель графического процессора
     * @param aRam      объем оперативной памяти в гигабайтах
     * @param aStorage  характеристика накопителя
     */

    public WindowsComputer(
        final String aName,
        final String aCpu,
        final String aGpu,
        final Integer aRam,
        final String aStorage
    ) {
        this.name = aName;
        this.cpu = aCpu;
        this.gpu = aGpu;
        this.ram = aRam;
        this.storage = aStorage;
    }

    @Override
    public Computer clone() {
        return new WindowsComputer(name, cpu, gpu, ram, storage);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCpu() {
        return cpu;
    }

    @Override
    public String getGpu() {
        return gpu;
    }

    @Override
    public Integer getRam() {
        return ram;
    }

    @Override
    public String getStorage() {
        return storage;
    }
}
