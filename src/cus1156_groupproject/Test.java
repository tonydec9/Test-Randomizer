package cus1156_groupproject;

public class Test extends ExamController {
	
	public static void main(String[] args) {

		ExamView theView = new ExamView();
		ExamModel theModel = new ExamModel();
		
		ExamController theController = new ExamController(theView, the Model);
		
		theView.setVisible(true);
		
	}
}