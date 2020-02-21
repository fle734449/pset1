package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
	@Test public void t0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
	}
	
	@Test public void t1() {
		//n -> n2 -> null
		SLList l = new SLList();
		Node n = new Node();
		n.elem = true;
		Node n2 = new Node();
		n2.elem = false;
		n2.next = null;
		n.next = n2;
		l.header = n;
		assertTrue(l.repOk());
	}
	
	@Test public void t2() {
		//n -> n2 -> n
		SLList l = new SLList();
		Node n = new Node();
		n.elem = true;
		Node n2 = new Node();
		n2.elem = false;
		n2.next = n;
		n.next = n2;
		l.header = n;
		assertFalse(l.repOk());
	}
	
	@Test public void t3() {
		//n -> n2 -> n2
		SLList l = new SLList();
		Node n = new Node();
		n.elem = true;
		Node n2 = new Node();
		n2.elem = false;
		n2.next = n2;
		n.next = n2;
		l.header = n;
		assertFalse(l.repOk());
	}
	
	@Test public void t4() {
		//n -> null
		SLList l = new SLList();
		Node n = new Node();
		n.elem = true;
		n.next = null;
		l.header = n;
		assertTrue(l.repOk());
	}
	
	@Test public void t5() {
		//n -> n
		SLList l = new SLList();
		Node n = new Node();
		n.elem = true;
		n.next = n;
		l.header = n;
		assertFalse(l.repOk());
	}

}