package Builder;

public class Main {
    public static void main(String[] args)
    {
        Phone phone = new PhoneBuilder()
                .setCompany("Apple")
                .setScreenSize(200)
                .setPpi(10000)
                .setOs("iOS")
                .setProcessor("A13 Bionic")
                .setRam(8)
                .buildPhone();

        System.out.println("Phone is: " + phone.toString());
    }
}
