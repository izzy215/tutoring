package com.tutoring.firstweek.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tutoring.firstweek.domain.Vaiv;
import com.tutoring.firstweek.service.VaivServiceImpl;

@Controller
public class Vaivcontroller {

	private VaivServiceImpl Vaiv;
	
	@Autowired
	public Vaivcontroller(VaivServiceImpl Vaiv) {
		this.Vaiv = Vaiv;
	}
	
	
	@RequestMapping(value="/vaiv",method=RequestMethod.GET)
	public String vaiv() {
		
		return "vaiv";
		}
	
	@RequestMapping(value="/vaiv2",method=RequestMethod.POST)
	@ResponseBody
	public List<Vaiv> vaiv2(
			@RequestParam(value="from_date",required=false)String from_date,
			@RequestParam(value="to_date",required=false)String to_date,
			@RequestParam(value="name",required=false)String name,
			@RequestParam(value="party",required=false)String party,
			ModelAndView mv) {
		
		System.out.println("from_date :"+from_date);
		System.out.println("to_date :"+to_date);
		System.out.println("name :"+name);
		System.out.println("party :"+party);
		
		 Map<String,Object> map= new HashMap<String,Object>();
		 map.put("from_date", from_date);
		 map.put("to_date", to_date);
		 map.put("name", name);
		 map.put("party", party);
		 
		 List<com.tutoring.firstweek.domain.Vaiv> vaiv= Vaiv.getList(map);
		 
		 for(int i = 0; i<vaiv.size(); i++) {
			 System.out.println("결과는"+vaiv.get(i));
			 
		 }
		 
		 
		 map.put("vaiv", vaiv);
		 
		return vaiv;
		 
		
		}
}
