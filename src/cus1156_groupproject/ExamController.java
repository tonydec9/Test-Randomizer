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
		
		this.theView.TakeExamListener(new TakeExamListener ());
		this.theView.QuestionListener(new QuestionListener ());
		this.theView.PrintExamListener(new PrintExamListener ());
		
	}
	
	 class QuestionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			String question1, answer1, answer2, answer3;
			
			try {
				question1 = theView.getQuestion1();
				answer1 = theView.getAnswer1();
				answer2 = theView.getAnswer2();
				answer3 = theView.getAnswer3();
			}
			 catch(NumberFormatException ex){

				 System.out.println(ex);
				 theView.displayErrorMessage("You need to fill-in a question and three answers");				
}	
		}
	 }
			
	class TakeExamListener implements ActionListener{
			
		@Override
		public void actionPerformed(ActionEvent f) {
				
				try {
						theModel.printExam();
				}
				catch (NumberFormatException exc) {
					System.out.println(exc);
					 theView.displayErrorMessage("Error");	
					
				}
			}
	}
		class PrintExamListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent g) {
					
					try {
							theModel.printExam();
					}
					catch (NumberFormatException exx) {
				
						System.out.println(exx);
						theView.displayErrorMessage("Error");	
						
					}
				}	
		
		
		
		
		}
			
				
}
