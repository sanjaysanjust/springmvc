package com.sanjay.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HolidayValidator implements ConstraintValidator<IsValidHobby, String> {

	String validHobbyList;

	@Override
	public void initialize(IsValidHobby validHobby) {
		validHobbyList = validHobby.listOfValidHobies();

	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if (studentHobby == null) {
			return false;
		}
		if (studentHobby.matches(validHobbyList)) {
			return true;
		} else {
			return false;
		}
	}

}
