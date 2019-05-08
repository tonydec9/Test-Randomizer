package cus1156_groupproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ExamController {

	private ExamView theView;
	private ExamModel themodel;
	
	public ExamController (ExamView theView, ExamModel themodel) {
		
		this.theView = theView;
		this.themodel = themodel;
		
		
		this.theView.TakeExamListener(new ExamListener ());
		this.theView.QuestionListener(new ExamListener ());
		
	}
	
	class ExamListener implements ActionListener{

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
}
