package cus1156_groupproject;

import java.io.*;

public class ExamModel {
	
	static FileWriter fw;
	
	public String verifyLogin(String user, String pass){
		if(user.equals("professor") && pass.equals("teachersonly")){
			return "professor";
		}
		else if(user.equals("student") && pass.equals("12345")){
			return "student";
		}
		else{
			return "Invalid Login - Try Again";
		}
	}
	
	public static void createExam(String name){
		try
		{
			fw = new FileWriter("Exam.txt");
			fw.write(name);
		}
		catch (IOException e){
			System.out.println("Error");
		}
	}
	
	public static void addQuestion(String question, String answer1, String answer2, String answer3){
		try
		{
			fw.write(question);
			fw.write(answer1);
			fw.write(answer2);
			fw.write(answer3);
			fw.close();
		}
		catch(IOException e){
			System.out.println("error");
		}
		
	}
	
	public static void main(String[] args)
	{
		createExam("Exam 1");
		addQuestion("Yes?", "No", "Maybe", "Yes");
	}

}
