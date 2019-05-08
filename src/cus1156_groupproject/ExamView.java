package cus1156_groupproject;

import java.awt.event.ActionListener;
import javax.swing.*;

public class ExamView extends JFrame{
	

    private JTextField question1  = new JTextField(10);
    private JTextField answer1  = new JTextField(10);
    private JTextField answer2 = new JTextField(10);
    private JTextField answer3 = new JTextField(10);
 
    private JButton Question = new JButton("Add Question");

   ExamView(){
	   
	   JPanel examPanel = new JPanel();
	   
	   examPanel.add(question1);
	   examPanel.add(answer1);
	   examPanel.add(answer2);
	   examPanel.add(answer3);
	   
	   this.add(examPanel);
	   	
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

void addExamListener(ActionListener listenForQuestionButton){
         
        Question.addActionListener(listenForQuestionButton);

}
    
void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);


    
    
}  
}
