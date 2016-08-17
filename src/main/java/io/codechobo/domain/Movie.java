package io.codechobo.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Getter
public class Movie {

	@GeneratedValue
	@Id
	private Long no;

	/**
	 * 제목
	 */
	private String title;

	private Integer runningTime;

	/**
	 * 개봉일
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date releaseDate;
}
