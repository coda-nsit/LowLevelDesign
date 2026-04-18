package JavaFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableFeature implements Comparable<ComparableFeature> {

    int id;
    String name;
    double salary;

    public ComparableFeature(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableFeature object) {

        // int idCompare = id - object.id;
        int idCompare = Integer.compare(this.id, object.id); // Java 8 feature

        // return (idCompare == 0) ? name.compareTo(object.name) : idCompare; tertiary operator shortcut
        if (idCompare == 0) {
            return name.compareTo(object.name);
        }
        return idCompare;
    }
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }

    public static void main(String[] args) {
        ComparableFeature employee1 = new ComparableFeature(2, "Tim", 5000);
        ComparableFeature employee2 = new ComparableFeature(2, "Jack", 5000);
        ComparableFeature employee3 = new ComparableFeature(1, "Alice", 10000);
        List<ComparableFeature> employees = new ArrayList<>();
        {
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);

        }

        System.out.println("Before sorting:");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("After sorting by id using Comparable:");
        System.out.println(employees);

    }
}

