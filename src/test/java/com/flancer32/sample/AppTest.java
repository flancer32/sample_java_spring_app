package com.flancer32.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.flancer32.sample.App;

public class AppTest {
	@Test
	public void main() {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(
				App.class);
		String actual = context.getBean(App.class).mockMessageService()
				.getMessage();
		Assert.assertEquals(actual, "Hello World!");
	}
}
