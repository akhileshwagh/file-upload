package example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashcodeAndEqualMethod {

	public static void main(String[] args) {
		
		String s1 = new String("akhilesh");
		String s2 = new String("akhilesh");
		
		Set<String> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		System.out.println("emp size " + set.size());
		System.out.println("are e1 and e2  equal ??? =" + s1.equals(s2));
		System.out.println("e1 hashcode " + s1.hashCode());
		System.out.println("e2 hashcode " + s2.hashCode());
		
	
		Set<Emp> emp = new HashSet<>();
		Emp e1 = new Emp(1, "akhilesh");
		Emp e2 = new Emp(1, "akhilesh");
		emp.add(e1);
		emp.add(e2);
		System.out.println("emp size " + emp.size());
		System.out.println("are e1 and e2  equal ??? =" + e1.equals(e2));
		System.out.println("e1 hashcode " + e1.hashCode());
		System.out.println("e2 hashcode " + e2.hashCode());

	}

}

class Emp {

	private Integer id;
	private String name;

	public Emp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/*
	 * // @Override // // public int hashCode() { // return Objects.hash(id, name);
	 * // } // // @Override // public boolean equals(Object obj) { // if (this ==
	 * obj) // return true; // if (obj == null) // return false; // if (getClass()
	 * != obj.getClass()) // return false; // Emp other = (Emp) obj; // return
	 * Objects.equals(id, other.id) && Objects.equals(name, other.name); // }
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
