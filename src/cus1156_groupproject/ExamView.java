package cus1156_groupproject;

import java.awt.event.ActionListener;
import javax.swing.*;

public class ExamView extends JFrame{
	

	
//login panel fields
	private JTextField username = new JTextField(10);
	private JTextField password = new JTextField(10);

	
//professor panel fields
    private JTextField question1  = new JTextField(10);
    private JTextField answer1  = new JTextField(10);
    private JTextField answer2 = new JTextField(10);
    private JTextField answer3 = new JTextField(10);
 
    private JButton Question = new JButton("Add Question");
    
    
    
 //student panel fields
    
    private JButton TakeExam =  new JButton("Take Exam");

   ExamView(){
	   
	   JPanel loginPanel = new JPanel();
	   
	   loginPanel.add(username);
	   loginPanel.add(password);
	  
	   this.add(loginPanel);
	   
	   
	   
	   
	   JPanel professorPanel = new JPanel();
	   
	   professorPanel.add(question1);
	   professorPanel.add(answer1);
	   professorPanel.add(answer2);
	   professorPanel.add(answer3);
	   
	   this.add(professorPanel);
	   
	   
	   
	   
	   JPanel studentPanel = new JPanel();
	   
	   studentPanel.add(TakeExam);
		   
	   	
   }

   
  //getters
   
public String getLogin() {
	return usertype.toString();
}
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
void TakeExamListener(ActionListener listenForTakeExamButton){
         
        TakeExam.addActionListener(listenForTakeExamButton);

}

void QuestionListener(ActionListener listenForQuestionButton){
    
    Question.addActionListener(listenForQuestionButton);

}
    


//error message
void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);


    
    
}  
}
