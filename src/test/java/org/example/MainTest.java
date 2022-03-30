package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {
	private static int i = 0;

	@Test
	@DisplayName("My nice flaky test")
	public void flakyTest() {
		if (i == 0) {
			i++;
			throw new AssertionError("Failure in purpose");
		}
		// nothing to do, test will success for its 2nd try
	}

	@Test
	@DisplayName("My beautiful test")
	public void successfulTest() {
		// nothing to do, test will success
	}

}
