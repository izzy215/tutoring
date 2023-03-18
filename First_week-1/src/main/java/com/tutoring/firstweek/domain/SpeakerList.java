package com.tutoring.firstweek.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class SpeakerList {
	
	@Getter
	@Setter
	String id;
	String name;
	String party;
	String press_id;

}
