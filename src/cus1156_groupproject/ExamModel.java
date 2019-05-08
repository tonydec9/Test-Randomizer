package cus1156_groupproject;

import java.io.*;

class ExamModel {
	
	FileWriter fw;
	
	public void createExam(String name){
		try{
			fw = new FileWriter("Exam.txt");
		}
		catch (IOException e){
			System.out.println("Error");
		}
	}
	
	public void addQuestion(String question, String answer1, String answer2, String answer3){
		try{
			fw.write(question);
			fw.write(answer1);
			fw.write(answer2);
			fw.write(answer3);
		}
		catch(IOException e){
			System.out.println("error");
		}
		
	}

}
