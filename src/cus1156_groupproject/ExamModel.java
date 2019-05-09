package cus1156_groupproject;

import java.io.*;
import java.util.ArrayList;

public class ExamModel{
	
	private FileWriter fw;
	private PrintWriter pw;
	private Question q;
	private ArrayList<Question> questions;
	private questionCount;
	
	public String verifyUser(String user, String pass){
		if(user.equals("professor") && pass.equals("teachersonly")){
			return "professor";
		}
		else if(user.equals("student") && pass.equals("12345")){
			return "student";
		}
		else{
			return null;
		}
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
		q = new Question(question, answer1, answer2, answer3);
		questions.add(q);
	}
	
	public void randomize(){
		for(int i = 0; i < questions.size(); i++){
			Question.randomizeAnswers(questions.get(i));
		}
	}
	
	public void printExam(){
		questionCount = 1;
		for(int i = 1; i <= questions.size; i++){
			pw.print("Question "+questionCount+":\n");
			pw.println("A)"+questions.get(i-1).answer1);
			pw.println("B)"+questions.get(i-1).answer2);
			pw.println("C)"+questions.get(i-1).answer3+"\n\n");
		}
	}
}

class Question {
	
	public String question;
	public String answer1, answer2, answer3;
	public int placeholder1;
	public int placeholder2;
	public static int randomNum;
	public static String temp1, temp2, temp3;
	
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