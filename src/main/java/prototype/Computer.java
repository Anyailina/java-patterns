package prototype;

public interface Computer {
    Computer clone();
    String getName();
    String getCPU();
    String getGPU();
    Integer getRAM();
    String getStorage();
}
