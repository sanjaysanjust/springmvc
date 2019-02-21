package com.sanjay.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	public void setAsText(String studentName) {
		System.out.println("Inside Set As Text");
		if (studentName.contains("Mr.") || studentName.contains("Mrs.")) {
			setValue(studentName);
		} else {
			studentName = "Mr." + studentName;
			setValue(studentName);
		}
	}

}
