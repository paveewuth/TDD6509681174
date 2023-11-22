package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size=s1.getSize();
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	public void testPushElmToTop() {
		Stack s1=new Stack();
		assertFalse(s1.isFull());
		s1.push(new Integer(1));
		int top=(Integer)s1.getTop();
		assertEquals(1, top);
	}
	public void testLastInFirstOut() {
		Stack s1=new Stack();
		assertTrue(s1.isEmpty());
		s1.push(1);
		s1.push(2);
		s1.push(3);
		assertEquals(3, s1.getTop());
		
		assertEquals(3, s1.getTop());
		assertEquals(3, s1.pop());
		assertEquals(2, s1.getTop());
		assertEquals(2, s1.pop());
		assertEquals(1, s1.getTop());
		assertEquals(1, s1.pop());
		
		assertTrue(s1.isEmpty());
	}
}
