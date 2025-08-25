package example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {

	private String name;
	private int age;
	private double salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}

public class EmpByAge {
	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(

				new Employee("akhilesh", 25, 50000),
				new Employee("rohit", 30, 45000),
				new Employee("nikhil", 40, 35000),
				new Employee("rohit", 55, 25000)

		);
		
		//group the employee by age
		Stream<Employee> stream = emp.stream();
		Map<Integer, List<Employee>> map = stream.collect(
			    Collectors.groupingBy(
			        Employee::getAge,
			        TreeMap::new,
			        Collectors.toList()));
		
		map.forEach((key,value)->{
			System.out.println("Age "+ key);
			System.out.println("List of Employee "+ value);
		});

	}

}
