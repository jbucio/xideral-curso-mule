package com.demo.transform;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.demo.pojo.Student;

public class CreateStudentFromVariblesTransform implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		Student student = new Student(eventContext.getMessage().getInvocationProperty("name").toString(), 
				Integer.valueOf(eventContext.getMessage().getInvocationProperty("age").toString()), 
				Integer.valueOf(eventContext.getMessage().getInvocationProperty("level").toString()), 
				eventContext.getMessage().getInvocationProperty("gender").toString(), 
				eventContext.getMessage().getInvocationProperty("status").toString());
		return student;
	}

}
