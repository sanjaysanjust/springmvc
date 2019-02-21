package com.sanjay.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerWithRequestParamAnnotation {

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		System.out.println("Inside admissionForm");

		ModelAndView andView = new ModelAndView("admissionForm");

		return andView;

	}

	@RequestMapping(value = "/submissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> formParam) {

		String stuName = formParam.get("studentName");
		String stuDob = formParam.get("studentDateOfBirth");
		System.out.println("Inside submissionForm");
		System.out.println("Name Of the Student " + stuName + " And The DOB is " + stuDob);

		ModelAndView andView = new ModelAndView("submitForm");
		andView.addObject("submitMessage", "Name Of the Student " + stuName + " And The DOB is " + stuDob);
		return andView;

	}

	@RequestMapping(value = "/submissionWithOutModelAttrForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormWithOutModelAttrForm(@RequestParam Map<String, String> formParam)
			throws ParseException {

		String stuName = formParam.get("studentName");
		String stuDob = formParam.get("studentDateOfBirth");
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(stuDob);
		System.out.println("Inside submissionWithOutModelAttrForm");
		System.out.println("Name Of the Student " + stuName + " And The DOB is " + stuDob);
		Student student = new Student();
		student.setStudentDOB(date1);
		student.setStudentName(stuName);
		ModelAndView andView = new ModelAndView("submissionModelAttributForm");
		andView.addObject("submitMessage", "Name Of the Student " + stuName + " And The DOB is " + stuDob);
		andView.addObject("student", student);
		return andView;

	}

	@RequestMapping(value = "/submissionWithModelAttrForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormWithModelAttrForm(@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult, Errors errors) {

		System.out.println(errors.getErrorCount());

		if (bindingResult.hasErrors()) {
			ModelAndView andView = new ModelAndView("admissionForm");
			andView.addObject("message", "Oops! Something wwnt wrong");
			return andView;
		}

		System.out.println("Inside submissionWithModelAttrForm");

		ModelAndView andView = new ModelAndView("submissionModelAttributForm");
		andView.addObject("submitMessage",
				"Name Of the Student " + student.getStudentName() + " And The DOB is " + student.getStudentDOB());

		return andView;

	}

	@ModelAttribute
	public void addCommonObjects(Model model) {
		System.out.println("Inside Annotated add Common Object");
		model.addAttribute("headerMessage", "ABC College Of Engineering");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside init Binder");
		// binder.setDisallowedFields(new String[] { "studentMobileNo" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));

		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

}
