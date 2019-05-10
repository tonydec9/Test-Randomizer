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
    public JButton Randomize = new JButton("Randomize Answers in Exam.txt");
    
 
 //student panel fields
    
    public JLabel studentLabel = new JLabel("Click 'Take Exam' to print Exam to Exam.txt");
    public JButton TakeExam =  new JButton("Take Exam");
    
    
    public JButton Logout = new JButton("Logout");
    

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
		
	/*if(userType.equals(null)){
		panel.removeAll();
		panel.repaint();
		panel.add(invalid);
		panel.revalidate();
	}
	*/
	if(userType.compareTo("professor") == 0){
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
		panel.add(Randomize);
		panel.add(Logout);
		panel.revalidate();
	}
	
	else if(userType.compareTo("student") == 0){
		panel.removeAll();
		panel.repaint();
		
		panel.add(studentLabel);
		panel.add(TakeExam);
		panel.add(Logout);

		panel.revalidate();
	}
	
	else if(userType.compareTo("revert") == 0){
		panel.removeAll();
		panel.repaint();
		
		panel.add(userLabel);
		panel.add(username);
		panel.add(passLabel);
		panel.add(password);
		panel.add(Login);
		
		panel.revalidate();
		
	}
	
	else{
		panel.add(invalid);
	}
	
}

   
  //getters 
public String getQuestion1() {
	return  question1.getText();
}

public String getAnswer1() {
	return answer1.getText();
}

public String getAnswer2() {
	return answer2.getText();
}

public String getAnswer3() {
	return answer3.getText();
}

public String getUsername() {
	return username.getText();
}

public String getPassword() {
	return password.getText();
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

void RandomizeListener(ActionListener listenerForRandomizeButton){
	Randomize.addActionListener(listenerForRandomizeButton);
}

void LogoutListener(ActionListener listenerForLogoutButton){
	Logout.addActionListener(listenerForLogoutButton);
}

//error message
void displayErrorMessage(String errorMessage){
	JOptionPane.showMessageDialog(this, errorMessage);
}
}