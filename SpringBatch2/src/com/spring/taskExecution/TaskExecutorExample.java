package com.spring.taskExecution;

import org.springframework.core.task.TaskExecutor;

public class TaskExecutorExample {
	private TaskExecutor  taskExecutor;

	public TaskExecutorExample(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}
	
	private class MessagePrinterTask implements Runnable {
		
		private String message;
		

		public MessagePrinterTask(String message) {
			this.message = message;
		}


		@Override
		public void run() {
			System.out.println(message);

		}

	}

public void printMessages(){
	System.out.println("Inside printMessages");
	for(int i=0;i<=25;i++){
		taskExecutor.execute(new MessagePrinterTask("Message" +i));
		//taskExecutor.execute(new MessagePrinterTask("Message" +i));
	}
}
}
