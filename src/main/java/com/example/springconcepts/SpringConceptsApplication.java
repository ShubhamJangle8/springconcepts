package com.example.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springconcepts.component.DemoBean;
import com.example.springconcepts.component.EmployeeBean;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	
	public static void main(String[] args) {
		logger.debug("Welcome to spring concepts");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.info("DemoBean = " + demoBean.toString());
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(8);
		employeeBean.setEname("Spring Capgemini");
		employeeBean.showEmployeeDetails();
	}

}
		