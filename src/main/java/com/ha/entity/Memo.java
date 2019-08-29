package com.ha.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "memos")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Memo implements Serializable {
	private static final long serialVersionUID = -8785049940804156343L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "content")
	private String content;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date udt;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date cdt;
}
