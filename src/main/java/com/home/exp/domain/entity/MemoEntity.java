package com.home.exp.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MemoEntity {

	@Id
	long no;
	String content;
	LocalDateTime createdDate;
}
