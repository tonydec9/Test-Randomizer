package cus1156_groupproject;

public class MVCMain {

	 public static void main(String[] args) {
	    ExamView theView = new ExamView();
		  
		ExamModel theModel = new ExamModel();
		
		ExamController ExamController = new ExamController(theView,theModel);
		  
		theView.setVisible(true);
		
		   
	 }
}
