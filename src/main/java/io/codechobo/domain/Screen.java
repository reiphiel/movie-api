package io.codechobo.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 스크린
 */
@Entity
@Getter
public class Screen {
	@GeneratedValue
	@Id
	private Long no;
}
