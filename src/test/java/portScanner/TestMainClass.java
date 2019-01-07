package portScanner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMainClass {
	
	@Test
	void test() {
		int expected = MainClass.add(1, 3);
		int actual = 4;
		assertTrue(actual == expected);
	}

}
