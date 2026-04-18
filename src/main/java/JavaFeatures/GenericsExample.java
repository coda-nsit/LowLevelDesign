package JavaFeatures;


class Box<T>{
    Box(T t){
        System.out.println(t);
    }
}
public class GenericsExample {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>(1);
        Box<String> stringBox = new Box<String>("Hello string Box");
    }
}
