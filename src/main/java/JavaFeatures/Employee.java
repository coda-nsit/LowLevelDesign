package JavaFeatures;

import java.util.Objects;

/**
 * Represents an employee with an id, name, and salary.
 *
 * <p>This class demonstrates how to override:
 * <ul>
 *   <li>{@link #toString()} for readable object output</li>
 *   <li>{@link #equals(Object)} for logical equality comparison</li>
 *   <li>{@link #hashCode()} for hash-based collections support</li>
 * </ul>
 *
 * <p>Two {@code Employee} objects are considered equal if their
 * {@code id}, {@code name}, and {@code salary} are the same.
 *
 * @author Baishali Nayak
 * @version 1.0
 */

public class Employee {
    Integer id;
    String name;
    Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    /**
     * Compares this employee with another object for equality.
     *
     * <p>Two employees are considered equal if:
     * <ul>
     *   <li>their {@code id} values are the same</li>
     *   <li>their {@code name} values are the same</li>
     *   <li>their {@code salary} values are the same</li>
     * </ul>
     *
     * @param object the object to compare with
     * @return {@code true} if the given object is equal to this employee;
     *         {@code false} otherwise
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;
        return id == employee.id && name.equals(employee.name) && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Jack", 5000.0);
        System.out.println(employee1);
        Employee employee2 = new Employee(1, "Jack", 5000.0);
        System.out.println(employee2);
        System.out.println(employee1.equals(employee2));

        Employee employee3 = new Employee(3, "Alice", 10000.0);
        System.out.println(employee3);
        System.out.println(employee1.equals(employee3));
    }
}
