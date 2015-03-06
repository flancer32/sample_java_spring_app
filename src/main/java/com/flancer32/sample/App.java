/**
 * 
 */
package com.flancer32.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.flancer32.sample.interfaces.MessageService;

@Configuration
@ComponentScan
public class App {
	final static Logger log = LoggerFactory.getLogger(App.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("Start");
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(
				App.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
		log.info("Stop");
	}

	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}
}
