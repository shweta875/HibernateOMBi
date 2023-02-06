package com.velocity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ques_id;
	@Column
	private String question;
	@OneToMany(mappedBy="question")
	private List<Answer> answer;
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public int getQues_id() {
		return ques_id;
	}
	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	

}
