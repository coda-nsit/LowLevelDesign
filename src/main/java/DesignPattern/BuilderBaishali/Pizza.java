package BuilderBaishali;

public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean olive;
    private final boolean jalapeno;
    private final boolean corn;
    private final boolean pineapple;

    Pizza(String size, boolean cheese, boolean olive, boolean jalapeno, boolean corn, boolean pineapple) {
        this.size = size;
        this.cheese = cheese;
        this.olive = olive;
        this.jalapeno = jalapeno;
        this.corn = corn;
        this.pineapple = pineapple;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", cheese=" + cheese +  ", corn=" + corn +  ", pineapple=" + pineapple +
        ", olive=" + olive + ", jalapeno=" + jalapeno + "]";
    }
}
