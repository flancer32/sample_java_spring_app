package com.flancer32.sample;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.flancer32.sample.App;

public class AppTest {
	@Test
	public void main() {
		App.main(null);
		assertTrue(true);
	}
}
