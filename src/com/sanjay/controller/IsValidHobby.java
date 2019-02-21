package com.sanjay.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HolidayValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	String listOfValidHobies() default "Music|Cricket|Hockey";

	String message() default "Please provicde Valid Hobby";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
