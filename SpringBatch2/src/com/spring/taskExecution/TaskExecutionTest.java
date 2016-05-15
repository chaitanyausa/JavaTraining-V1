package com.spring.taskExecution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class TaskExecutionTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-taskschedular.xml");

		ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) context.getBean("taskExecutor");
		taskExecutor.execute(new MessagePrinterTask("Thread 1"));
		taskExecutor.execute(new MessagePrinterTask("Thread 2"));
		taskExecutor.execute(new MessagePrinterTask("Thread 3"));
		taskExecutor.execute(new MessagePrinterTask("Thread 4"));
		taskExecutor.execute(new MessagePrinterTask("Thread 5"));

		for (;;) {
			int count = taskExecutor.getActiveCount();
			int size =taskExecutor.getMaxPoolSize();
			System.out.println("Active Threads : " + count);
			System.out.println("pool size : " + size);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (count == 0) {
				taskExecutor.shutdown();
				break;
			}
		}

	}

}
