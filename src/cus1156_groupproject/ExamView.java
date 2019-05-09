package cus1156_groupproject;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExamView extends JFrame{
	
//login panel fields
	public JLabel userLabel = new JLabel("Username: ");
	public JTextField username = new JTextField(10);
	public JLabel passLabel = new JLabel("Password: ");
	public JTextField password = new JTextField(10);
	public JButton Login = new JButton("Login");
	public JLabel invalid = new JLabel("Invalid Entry");
	
	JPanel panel;

//professor panel fields
    public JTextField question1  = new JTextField(10);
    public JLabel questionLabel = new JLabel("Question:");
    public JTextField answer1  = new JTextField(10);
    public JLabel ans1Label = new JLabel("Answer 1: ");
    public JTextField answer2 = new JTextField(10);
    public JLabel ans2Label = new JLabel("Answer 2: ");
    public JTextField answer3 = new JTextField(10);
    public JLabel ans3Label = new JLabel("Answer 3: ");
    public JButton Question = new JButton("Add Question");
    public JButton Exam = new JButton("Print Exam");
    
 
 //student panel fields
    
    public JLabel studentLabel = new JLabel("Exam will be printed in console and in Exam.txt file.");
    public JButton TakeExam =  new JButton("Take Exam");
    

   ExamView(){
	   
	   panel = new JPanel();
	   
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(800, 100);
	   
	   panel.add(userLabel);
	   panel.add(username);
	   panel.add(passLabel);
	   panel.add(password);
	   panel.add(Login);
	  
	   this.add(panel);


   }
   
public void userType(String userType){
		
	if(userType.equals(null)){
		panel.removeAll();
		panel.repaint();
		panel.add(invalid);
		panel.revalidate();
	}
	else if(userType.equals("professor")){
		panel.removeAll();
		panel.repaint();
		panel.add(questionLabel);
		panel.add(question1);
		panel.add(ans1Label);
		panel.add(answer1);
		panel.add(ans2Label);
		panel.add(answer2);
		panel.add(ans3Label);
		panel.add(answer3);

		panel.add(Question);
		panel.add(Exam);
		panel.revalidate();
	}
	
	else if(userType.equals("student")){
		panel.removeAll();
		panel.repaint();
		
		panel.add(studentLabel);
		panel.add(TakeExam);

		panel.revalidate();
	}
	
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
	Login.addActionListener(listenerForLoginButton);
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