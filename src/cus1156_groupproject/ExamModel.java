package cus1156_groupproject;

import java.io.*;
import java.util.ArrayList;

public class ExamModel{
	
	private FileWriter fw;
	private PrintWriter pw;
	private String userType;
	private Question questions;
	private questionCount;
	
	private void verifyUser(String user, String pass){
		if(user.equals("professor") && pass.equals("teachersonly")){
			userType = "professor";
		}
		else if(user.equals("student") && pass.equals("12345")){
			userType = "student";
		}
		else{
			userType = null;
		}
	}
	
	public String getLogin(){ 
		return userType;
	}
	
	public void createExam(String name){
		try
		{
			fw = new FileWriter("Exam.txt");
			pw = new PrintWriter(fw);
			pw.println(name);
		}
		catch (IOException e){
			System.out.println("Error");
		}
	}
	
	public void addQuestion(String question, String answer1, String answer2, String answer3){
		questions = new Question(question, answer1, answer2, answer3);
	}
	
	public void randomize(){
		Question.randomizeAnswers(questions);
	}
	
	public void publish(){
		questionCount = 1;
		for(Question i : questions){
			pw.print("Question "+questionCount+":\n");
			pw.print("A)"+questions.answer1);
			pw.print("B)"+questions.answer2);
			pw.println("C)"+questions.answer3);
		}
	}
}

class Question {
	
	ArrayList<Question> exam = new ArrayList<Question>();
	public String question;
	public String answer1, answer2, answer3;
	public int placeholder1;
	public int placeholder2;
	public int randomNum;
	public String temp1, temp2, temp3;
	
	Question(){
		question = "n/a";
		answer1 = null;
		answer2 = null;
		answer3 = null;
	}
	
	Question(String question, String answer1, String answer2, String answer3){
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
	}
	
	public void randomizeAnswers(Question q){
		for(int i = 1; i <= 3; i++){
			randomNum = (int) Math.ceil(Math.random() * 3);
			while(randomNum != i){
				temp1 = q.answer1;
				temp2 = q.answer2;
				temp3 = q.answer3;
				
				q.answer3 = temp1;
				q.answer2 = temp3;
				q.answer1 = temp2;
			}
		}
	}

}