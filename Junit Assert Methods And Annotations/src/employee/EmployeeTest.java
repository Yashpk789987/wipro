package employee;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	Employee e = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Bob");
		list.add("Alice");
		list.add("John");
	}



	@Test
	void testFindName() {

		assertEquals("Result", "NOT FOUND", e.findName(list, "Yash"));

	}

}