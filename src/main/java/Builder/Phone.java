package Builder;

public class Phone {
    private int screenSize;
    private int ram;
    private int ppi;
    private String os;
    private String company;
    private String processor;

    public Phone(int screenSize, int ram, int ppi, String os, String company, String processor) {
        this.screenSize = screenSize;
        this.ram = ram;
        this.ppi = ppi;
        this.os = os;
        this.company = company;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", ram=" + ram +
                ", ppi=" + ppi +
                ", os='" + os + '\'' +
                ", company='" + company + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
