package TestEntities;

import static org.junit.Assert.*;

import org.junit.Test;

import Entities.Person;

public class TestPerson {

	@Test
	public void testPerson() {
		Person p = new Person();
		p.setLastName("Chogriz");
		assertEquals(p.getLastName(), "Chogriz");
	}
		
}
