package com.tutoring.firstweek.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class PressInfo {

	@Getter
	@Setter
	String id;
	String pdate;
	String time;
	String title;
}

/*
 * 
 * select rownum, pdate, title from (SELECT result.pdate, result.title FROM (
 * SELECT press_info.id, press_info.pdate, press_info.title, speaker_list.name,
 * speaker_list.party FROM press_info LEFT OUTER JOIN speaker_list ON
 * press_info.id = speaker_list.press_id UNION SELECT press_info.id,
 * press_info.pdate, press_info.title, speaker_list.name, speaker_list.party
 * FROM press_info RIGHT OUTER JOIN speaker_list ON press_info.id =
 * speaker_list.press_id ) result where result.pdate BETWEEN
 * TO_DATE('2021-01-20', 'YYYY-MM-DD') AND TO_DATE('2021-01-20', 'YYYY-MM-DD')
 * and result.name = '신영대' and result.party = '더불어민주당' order by pdate) where
 * rownum<100;
 */
/*
 * select rownum, pdate, title from (SELECT result.pdate, result.title FROM (
 * SELECT press_info.id, press_info.pdate, press_info.title, speaker_list.name,
 * speaker_list.party FROM press_info LEFT OUTER JOIN speaker_list ON
 * press_info.id = speaker_list.press_id UNION SELECT press_info.id,
 * press_info.pdate, press_info.title, speaker_list.name, speaker_list.party
 * FROM press_info RIGHT OUTER JOIN speaker_list ON press_info.id =
 * speaker_list.press_id ) result <where> <if test='from_date!=null and
 * to_date!=null'> where result.pdate BETWEEN TO_DATE('2020-10-01',
 * 'YYYY-MM-DD') AND TO_DATE('2021-01-20', 'YYYY-MM-DD') </if> <if
 * test='name!=""'> result.name = ? </if> <if test='party!=""'> result.party = ?
 * </if> </where> order by pdate) where rownum<100
 * 
 * 
 * select rownum, pdate, title from (SELECT result.pdate, result.title FROM (
 * SELECT press_info.id, press_info.pdate, press_info.title, speaker_list.name,
 * speaker_list.party FROM press_info LEFT OUTER JOIN speaker_list ON
 * press_info.id = speaker_list.press_id UNION SELECT press_info.id,
 * press_info.pdate, press_info.title, speaker_list.name, speaker_list.party
 * FROM press_info RIGHT OUTER JOIN speaker_list ON press_info.id =
 * speaker_list.press_id ) result where result.pdate BETWEEN
 * TO_DATE('2020-10-01', 'YYYY-MM-DD') AND TO_DATE('2021-01-20', 'YYYY-MM-DD')
 * and result.name = '신영대' and result.party = '더불어민주당' order by pdate) where
 * rownum<100
 */