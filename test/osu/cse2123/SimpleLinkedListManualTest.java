package osu.cse2123;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleLinkedListManualTest {

	@Test
	void testAddFront1RemoveFront1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		int test = testList.removeFront();
		assertEquals(truth,test);
	}
	
	@Test
	void testAddFront2RemoveFront1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 3;
		testList.addFront(2);
		testList.addFront(3);
		int test = testList.removeFront();
		assertEquals(truth,test);
	}

	@Test
	void testAddFront2RemoveFront2() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 3;
		testList.addFront(2);
		testList.addFront(3);
		int test = testList.removeFront();
		assertEquals(3,test);
		test = testList.removeFront();
		assertEquals(2,test);
	}
	
	@Test
	void testAddEnd1RemoveFront1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addEnd(2);
		int test = testList.removeFront();
		assertEquals(truth,test);
	}
	
	@Test
	void testAddEnd2RemoveFront1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addEnd(2);
		testList.addEnd(3);
		int test = testList.removeFront();
		assertEquals(truth,test);
	}

	@Test
	void testAddEnd2RemoveFront2() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 3;
		testList.addEnd(2);
		testList.addEnd(3);
		int test = testList.removeFront();
		assertEquals(2,test);
		test = testList.removeFront();
		assertEquals(3,test);
	}
	
	@Test
	void testAddFront1RemoveEnd1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		int test = testList.removeEnd();
		assertEquals(truth,test);
	}
	
	@Test
	void testAddFront2RemoveEnd1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		testList.addFront(3);
		int test = testList.removeEnd();
		assertEquals(truth,test);
	}

	@Test
	void testAddFront2RemoveEnd2() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 3;
		testList.addFront(2);
		testList.addFront(3);
		int test = testList.removeEnd();
		assertEquals(2,test);
		test = testList.removeEnd();
		assertEquals(3,test);
	}

	@Test
	void testAddEnd1RemoveEnd1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addEnd(2);
		int test = testList.removeEnd();
		assertEquals(truth,test);
	}
	
	@Test
	void testAddEnd2RemoveEnd1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 3;
		testList.addEnd(2);
		testList.addEnd(3);
		int test = testList.removeEnd();
		assertEquals(truth,test);
	}

	@Test
	void testAddEnd2RemoveEnd2() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 3;
		testList.addEnd(2);
		testList.addEnd(3);
		int test = testList.removeEnd();
		assertEquals(3,test);
		test = testList.removeEnd();
		assertEquals(2,test);
	}
	
	@Test
	void testAddFront1FrontEnd() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		int test = testList.front();
		assertEquals(truth,test);
		test = testList.end();
		assertEquals(truth,test);
	}

	@Test
	void testAdd2FrontEnd() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		testList.addFront(3);
		int test = testList.front();
		assertEquals(3,test);
		test = testList.end();
		assertEquals(2,test);
	}
	
	@Test
	void testAdd3FrontEnd() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		testList.addFront(3);
		testList.addFront(4);
		int test = testList.front();
		assertEquals(4,test);
		test = testList.end();
		assertEquals(2,test);
	}


	@Test
	void testSize0() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 0;
		assertEquals(truth,testList.size());
	}

	@Test
	void testSize1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 1;
		testList.addFront(2);
		assertEquals(truth,testList.size());
	}

	@Test
	void testSize2() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		testList.addFront(2);
		assertEquals(truth,testList.size());
	}
	
	@Test
	void testSize3() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 3;
		testList.addFront(2);
		testList.addFront(2);
		testList.addFront(2);
		assertEquals(truth,testList.size());
	}
	
	@Test
	void testSize3Remove1() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 2;
		testList.addFront(2);
		testList.addFront(2);
		testList.addFront(2);
		testList.removeFront();
		assertEquals(truth,testList.size());
	}

	@Test
	void testSize3Remove2() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 1;
		testList.addFront(2);
		testList.addFront(2);
		testList.addFront(2);
		testList.removeFront();
		testList.removeFront();
		assertEquals(truth,testList.size());
	}

	@Test
	void testSize3Remove3() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		int truth = 0;
		testList.addFront(2);
		testList.addFront(2);
		testList.addFront(2);
		testList.removeFront();
		testList.removeFront();
		testList.removeFront();
		assertEquals(truth,testList.size());
	}

	@Test
	void testSize1ToString() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		String truth = "< 2 >";
		testList.addFront(2);
		assertEquals(truth,testList.toString());
	}

	@Test
	void testSize2ToString() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		String truth = "< 3 2 >";
		testList.addFront(2);
		testList.addFront(3);
		assertEquals(truth,testList.toString());
	}

	@Test
	void testSize3ToString() {
		SimpleLinkedList<Integer> testList = new SimpleLinkedListManual<>();
		String truth = "< 4 3 2 >";
		testList.addFront(2);
		testList.addFront(3);
		testList.addFront(4);
		assertEquals(truth,testList.toString());
	}

}
