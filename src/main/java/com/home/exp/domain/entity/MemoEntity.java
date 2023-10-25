package com.home.exp.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator (name = "gen_seq_memo", sequenceName = "seq_memo",
					initialValue = 1000, allocationSize = 10)
@Getter
@Entity
public class MemoEntity {

	@Id @GeneratedValue(generator = "gen_seq_memo", strategy = GenerationType.SEQUENCE)
	long no;
	@Column (columnDefinition = "clob not null")
	String content;
	@CreationTimestamp
	LocalDateTime createdDate;
}
