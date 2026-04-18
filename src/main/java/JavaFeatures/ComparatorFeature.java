package JavaFeatures;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFeature {

    int id;
    int age;
    String name;

    public ComparatorFeature(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        List<ComparatorFeature> employees = new ArrayList<>();

        employees.add(new ComparatorFeature(2, "Bob", 45));
        employees.add(new ComparatorFeature(1, "Jack", 29));
        employees.add(new ComparatorFeature(1, "Alice", 31));
        employees.add(new ComparatorFeature(3, "David", 27));
        employees.add(new ComparatorFeature(2, "Aaron", 33));

        System.out.println("Original List:");
        System.out.println(employees);

        // sorting based on name
        Collections.sort(employees, new NameComparator());
        System.out.println("Sorted List based on name:");
        System.out.println(employees);

        // sorting based on age
        Collections.sort(employees, new AgeComparator());
        System.out.println("Sorted List based on age:");
        System.out.println(employees);

        // sorting based on id then name
        Collections.sort(employees, new IDThenNameComparator());
        System.out.println("Sorted List based on ID AND then name:");
        System.out.println(employees);

    }
}

class NameComparator  implements Comparator<ComparatorFeature> {

    @Override
    public int compare(ComparatorFeature o1, ComparatorFeature o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeComparator implements Comparator<ComparatorFeature> {
    @Override
    public int compare(ComparatorFeature o1, ComparatorFeature o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

class IDThenNameComparator implements Comparator<ComparatorFeature> {
    @Override
    public int compare(ComparatorFeature o1, ComparatorFeature o2) {
       int idCompare = Integer.compare(o1.id, o2.id);
       return (idCompare == 0) ? o1.name.compareTo(o2.name) : idCompare;
    }
}




