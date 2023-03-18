package com.tutoring.firstweek.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class PressInfo {

	@Getter
	@Setter
	String id;
	String date;
	String time;
	String title;
}
