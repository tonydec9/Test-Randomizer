package cus1156_groupproject;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ExamController {

	private ExamView theView;
	private ExamModel theModel;	
	
	public ExamController (ExamView theView, ExamModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.LoginListener(new LoginListener());
		this.theView.TakeExamListener(new TakeExamListener ());
		this.theView.QuestionListener(new QuestionListener ());
		this.theView.PrintExamListener(new PrintExamListener ());
		this.theView.LogoutListener(new LogoutListener ());
		this.theView.RandomizeListener(new RandomizeListener ());
		
	}
//login button attempt	
	class LoginListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent h) {
				
			String username, password, userType;
					username = theView.getUsername();
					password = theView.getPassword();
					userType = theModel.verifyUser(username, password);
					
					theModel.createExam("Exam");
						
					theView.userType(userType);

			}
	}
	
	 class QuestionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			String question1, answer1, answer2, answer3;

				question1 = theView.getQuestion1();
				answer1 = theView.getAnswer1();
				answer2 = theView.getAnswer2();
				answer3 = theView.getAnswer3();
				theModel.addQuestion(question1, answer1, answer2, answer3);
		}
	 }
		
	class TakeExamListener implements ActionListener{
			
		@Override
		public void actionPerformed(ActionEvent f) {
						theModel.printExam();
		}
	}
		class PrintExamListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent g) {
							theModel.printExam();
			}
		}
	
	class LogoutListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent h) {
			theView.userType("revert");
		}
	}
	
	class RandomizeListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent i) {
			theModel.randomize();
		}
	}
}