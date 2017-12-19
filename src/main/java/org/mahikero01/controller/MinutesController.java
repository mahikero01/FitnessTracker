package org.mahikero01.controller;

import org.mahikero01.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercise: " + exercise.getMinutes());
		//return "forward:addMoreMinutes.html";
		return "redirect:addMoreMinutes.html";

	}

	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercising: " + exercise.getMinutes());
		return "addMinutes";

	}

}
