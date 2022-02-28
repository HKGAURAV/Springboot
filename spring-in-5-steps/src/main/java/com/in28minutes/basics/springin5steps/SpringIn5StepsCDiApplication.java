package com.in28minutes.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.basics.springin5steps.cdi.SomeCdiBuisness;

@Configuration
@ComponentScan
public class SpringIn5StepsCDiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDiApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsCDiApplication.class)) {
			SomeCdiBuisness business = applicationContext.getBean(SomeCdiBuisness.class);

			LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
		}
	}
}