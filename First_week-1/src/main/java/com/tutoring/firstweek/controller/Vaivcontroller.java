package com.tutoring.firstweek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tutoring.firstweek.service.VaivServiceImpl;

@Controller
public class Vaivcontroller {

	private VaivServiceImpl Vaiv;
	
	@Autowired
	public Vaivcontroller(VaivServiceImpl Vaiv) {
		this.Vaiv = Vaiv;
	}
	
	@RequestMapping(value="/vaiv",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView boardlist(
			@RequestParam(value="from_date",required=false)String fromdate,
			@RequestParam(value="to_date",required=false)String to_date,
			@RequestParam(value="from_date",required=false)String from_date,
			@RequestParam(value="party",required=false)String party,
			ModelAndView mv) {
		
		
		mv.setViewName("vaiv");
		return mv;}
}
