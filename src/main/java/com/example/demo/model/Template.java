package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="template")
@EntityListeners(AuditingEntityListener.class)
public class Template {
    
    @Id
    @GeneratedValue
    private int book_id;
	private String board;
	private String book_name;
	private int class_section;
	private int publication;
	private int class_details;

	public int book_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String board() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String book_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int class_section() {
		return class_section;
	}

	public void setClass_section(int class_section) {
		this.class_section = class_section;
	}

	public int publication() {
		return publication;
	}

	public void setPublication(int publication) {
		this.publication = publication;
	}

	public int class_details() {
		return class_details;
	}

	public void setClass_details(int class_details) {
		this.class_details = class_details;
	}
}
	