package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {
	/*
	 * P5: If two objects are equal according to the equals(Object)
	 * method, then calling the hashCode method on each of
	 * the two objects must produce the same integer result.
	 */
	
	//Object v Object
	@Test public void t0() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertTrue(o1.equals(o2) == (o1.hashCode() == o2.hashCode()));
	}
	
	//Object v C
	@Test public void t1() {
		Object o = new Object();
		C c = new C(5);
		assertTrue(o.equals(c) == (o.hashCode() == c.hashCode()));
	}
	
	//Object v D
	@Test public void t2() {
		Object o = new Object();
		D d = new D(5,6);
		assertTrue(o.equals(d) == (o.hashCode() == d.hashCode()));
	}
	
	//C v C
	@Test public void t3() {
		C c1 = new C(5);
		C c2 = new C(5);
		assertTrue(c1.equals(c2) == (c1.hashCode() == c2.hashCode()));
	}
	
	//C v D
	@Test public void t4() {
		C c = new C(5);
		D d = new D(5,6);
		assertTrue(c.equals(d) == (c.hashCode() == d.hashCode()));
	}
	
	//C v Object
	@Test public void t5() {
		C c = new C(5);
		Object o = new Object();
		assertTrue(c.equals(o) == (c.hashCode() == o.hashCode()));
	}
	
	//D v D
	@Test public void t6() {
		D d1 = new D(5,6);
		D d2 = new D(5,6);
		assertTrue(d1.equals(d2) == (d1.hashCode() == d2.hashCode()));
	}
	
	//D v C
	@Test public void t7() {
		D d = new D(5,6);
		C c = new C(5);
		assertTrue(d.equals(c) == (d.hashCode() == c.hashCode()));
	}
	
	//D v Object
	@Test public void t8() {
		D d = new D(5,6);
		Object o = new Object();
		assertTrue(d.equals(o) == (d.hashCode() == o.hashCode()));
	}
	
	
}