package com.stg.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interviewdto {

	private int round;
	private LocalDateTime dateTime;
	private String mode;
	private String duration;
	private int overallRating;
	private String status;
	private int interviewId;
	private int candidateId;
	
	

}
