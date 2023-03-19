package com.tutoring.firstweek.domain;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
public class Vaiv {
	public class viav {
		
		@Getter
		@Setter
		private String id;
		private String date;
		private String time;
		private String title;
		
		private String pid;
		private String pdate;
		
		private String name;
		private String party;
		private String press_id;
		private String rownum;

		private List<PressInfo> pressinfo;
		private List<SpeakerList> SpeakerList;
		
		/*
		 * public viav(PressInfo pressinfo,SpeakerList SpeakerList) { this.pressinfo =
		 * pressinfo; this.SpeakerList = SpeakerList; }
		 */
	}

}
