package io.codechobo.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * 상영
 */
@Entity
@Getter
public class Showing {

	@GeneratedValue
	@Id
	private Long no;

	@ManyToOne
	private Movie movie;

	@ManyToOne
	private Screen screen;


	/**
	 * 상영시작 시간
	 */
	//TODO 종료시간은 지정? 혹은 러닝타임으로 산출?
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

}
