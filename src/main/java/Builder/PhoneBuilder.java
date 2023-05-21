package Builder;

public class PhoneBuilder {
    private int screenSize;
    private int ram;
    private int ppi;
    private String os;
    private String company;
    private String processor;

    public int getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getPpi() {
        return ppi;
    }

    public String getOs() {
        return os;
    }

    public String getCompany() {
        return company;
    }

    public String getProcessor() {
        return processor;
    }

    public PhoneBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setPpi(int ppi) {
        this.ppi = ppi;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    Phone buildPhone()
    {
        return new Phone(screenSize, ram, ppi, os, company, processor);
    }
}
