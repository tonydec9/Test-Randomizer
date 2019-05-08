package cus1156_groupproject;

public class MVCExam {

	public static void main(String[] args) {

		ExamView theView = new ExamView();
	
		ExamModel theModel = new ExamModel();

		ExamController theController = new ExamController(theView,theModel);
	
		 theView.setVisible(true);

}
}