package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
	/*
	 * P1: For any non-null reference value x, x.equals(null) should return false.
	 */
	
	@Test public void t0() {
		assertFalse(new Object().equals(null));
	}
	
	@Test public void t1() {
		assertFalse(new C(5).equals(null));
	}
	
	@Test public void t2() {
		assertFalse(new D(5,6).equals(null));
	}
	
	/*
	 * P2: It is reflexive: for any non-null reference value x, x.equals(x)
	 * should return true.
	 */
	
	@Test public void r0() {
		Object o = new Object();
		assertTrue(o.equals(o));
	}
	
	@Test public void r1() {
		C c = new C(5);
		assertTrue(c.equals(c));
	}
	
	@Test public void r2() {
		D d = new D(5,6);
		assertTrue(d.equals(d));
	}
	
	/*
	 * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
	 * should return true if and only if y.equals(x) returns true.
	 */
	
	//Object v Object
	@Test public void s0() {
		Object x = new Object();
		Object y = new Object();
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//Object v C
	@Test public void s1() {
		Object x = new Object();
		C y = new C(5);
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//Object v D
	@Test public void s2() {
		Object x = new Object();
		D y = new D(5,6);
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//C v C
	@Test public void s3() {
		C x = new C(5);
		C y = new C(5);
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//C v Object
	@Test public void s4() {
		C x = new C(5);
		Object y = new Object();
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//C v D
	@Test public void s5() {
		C x = new C(5);
		D y = new D(5,6);
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//D v D
	@Test public void s6() {
		D x = new D(5,6);
		D y = new D(5,6);
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//D v Object
	@Test public void s7() {
		D x = new D(5,6);
		Object y = new Object();
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//D v C
	@Test public void s8() {
		D x = new D(5,6);
		C y = new C(5);
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//Object
	@Test public void s9() {
		Object x = new Object();
		Object y = x;
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//C
	@Test public void s10() {
		C x = new C(5);
		C y = x;
		assertTrue(x.equals(y) == y.equals(x));
	}
	
	//D
	@Test public void s11() {
		D x = new D(5,6);
		D y = x;
		assertTrue(x.equals(y) == y.equals(x));
	}
	

	/*
	 * P4: It is transitive: for any non-null reference values x, y, and z,
	 * if x.equals(y) returns true and y.equals(z) returns true, then
	 * x.equals(z) should return true.
	 */
	
	// you do not need to write tests for P4
	
}