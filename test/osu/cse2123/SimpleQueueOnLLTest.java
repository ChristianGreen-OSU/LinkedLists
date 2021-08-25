package osu.cse2123;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleQueueOnLLTest {

	@Test
	void testAdd1Remove1() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		int test = testQ.remove();
		assertEquals(truth,test);
	}
	
	@Test
	void testAdd2Remove1() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		testQ.add(3);
		int test = testQ.remove();
		assertEquals(truth,test);
	}

	@Test
	void testAdd2Remove2() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		testQ.add(3);
		int test = testQ.remove();
		assertEquals(truth,test);
		test = testQ.remove();
		assertEquals(3,test);
	}
	
	@Test
	void testAdd1Front() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		int test = testQ.front();
		assertEquals(truth,test);
	}

	@Test
	void testAdd2Front() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		testQ.add(3);
		int test = testQ.front();
		assertEquals(truth,test);
	}
	
	@Test
	void testAdd3Front() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		testQ.add(3);
		testQ.add(4);
		int test = testQ.front();
		assertEquals(truth,test);
	}


	@Test
	void testSize0() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 0;
		assertEquals(truth,testQ.size());
	}

	@Test
	void testSize1() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 1;
		testQ.add(2);
		assertEquals(truth,testQ.size());
	}

	@Test
	void testSize2() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		testQ.add(2);
		assertEquals(truth,testQ.size());
	}
	
	@Test
	void testSize3() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 3;
		testQ.add(2);
		testQ.add(2);
		testQ.add(2);
		assertEquals(truth,testQ.size());
	}
	
	@Test
	void testSize3Remove1() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 2;
		testQ.add(2);
		testQ.add(2);
		testQ.add(2);
		testQ.remove();
		assertEquals(truth,testQ.size());
	}

	@Test
	void testSize3Remove2() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 1;
		testQ.add(2);
		testQ.add(2);
		testQ.add(2);
		testQ.remove();
		testQ.remove();
		assertEquals(truth,testQ.size());
	}

	@Test
	void testSize3Remove3() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		int truth = 0;
		testQ.add(2);
		testQ.add(2);
		testQ.add(2);
		testQ.remove();
		testQ.remove();
		testQ.remove();
		assertEquals(truth,testQ.size());
	}
	
	@Test
	void testSize0ToString() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		String truth = "< >";
		assertEquals(truth,testQ.toString());
	}

	@Test
	void testSize1ToString() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		String truth = "< 2 >";
		testQ.add(2);
		assertEquals(truth,testQ.toString());
	}

	@Test
	void testSize2ToString() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		String truth = "< 2 3 >";
		testQ.add(2);
		testQ.add(3);
		assertEquals(truth,testQ.toString());
	}

	@Test
	void testSize3ToString() {
		SimpleQueue<Integer> testQ = new SimpleQueueOnLL<>();
		String truth = "< 2 3 4 >";
		testQ.add(2);
		testQ.add(3);
		testQ.add(4);
		assertEquals(truth,testQ.toString());
	}


}
