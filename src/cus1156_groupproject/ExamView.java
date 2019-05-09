package cus1156_groupproject;


import java.awt.event.ActionListener;
import javax.swing.*;

public class ExamView extends JFrame{
	

	
//login panel fields
	private JLabel userLabel = new JLabel("Username: ");
	private JTextField username = new JTextField(10);
	private JLabel passLabel = new JLabel("Password: ");
	private JTextField password = new JTextField(10);

	private JButton Login = new JButton("Login");

	
//professor panel fields
    private JTextField question1  = new JTextField(10);
    private JLabel questionLabel = new JLabel("Question:");
    private JTextField answer1  = new JTextField(10);
    private JLabel ans1Label = new JLabel("Answer 1: ");
    private JTextField answer2 = new JTextField(10);
    private JLabel ans2Label = new JLabel("Answer 2: ");
    private JTextField answer3 = new JTextField(10);
    private JLabel ans3Label = new JLabel("Answer 3: ");
 
    private JButton Question = new JButton("Add Question");
    private JButton Exam = new JButton("Print Exam");
    
    
    
 //student panel fields
    
    private JButton TakeExam =  new JButton("Take Exam");

   ExamView(){
	   
	   JPanel loginPanel = new JPanel();
	   
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(500, 500);
	   
	   loginPanel.add(username);
	   loginPanel.add(password);
	  
	   this.add(loginPanel);
	   
	   
	   
	   
	   JPanel professorPanel = new JPanel();
	   
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   professorPanel.add(question1);
	   professorPanel.add(answer1);
	   professorPanel.add(answer2);
	   professorPanel.add(answer3);
	   professorPanel.add(Question);
	   professorPanel.add(Exam);
	   
	   this.setSize(1000, 1000);
	   this.add(professorPanel);
	   
	   
	   JPanel studentPanel = new JPanel();
	   
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   studentPanel.add(TakeExam);
	   this.add(studentPanel);
		   
	   	
   }

   
  //getters
   
public String getQuestion1() {
	return  question1.toString();
}

public String getAnswer1() {
	return answer1.toString();
}

public String getAnswer2() {
	return answer2.toString();
}

public String getAnswer3() {
	return answer3.toString();
}

public String getUsername() {
	return username.toString();
}

public String getPassword() {
	return password.toString();
}


//button codes


void LoginListener(ActionListener listenerForLoginButton){
	Exam.addActionListener(listenerForLoginButton);
} 

void TakeExamListener(ActionListener listenerForTakeExamButton){
         
        TakeExam.addActionListener(listenerForTakeExamButton);

}

void QuestionListener(ActionListener listenerForQuestionButton){
    
    Question.addActionListener(listenerForQuestionButton);

}

void PrintExamListener(ActionListener listenerForPrintExamButton){
	Exam.addActionListener(listenerForPrintExamButton);
}

 


//error message
void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);


    
    
}  
}
