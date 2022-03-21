package catchme.base;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("unchecked")
public class CatchMe extends JFrame implements MouseListener {
    
    protected JPanel panels;
    protected JButton button;
    protected JButton randomButton;
    protected int firstRandomNumber;
    protected JButton secondRandomButton;
    protected int secondRandomNumber;
    protected ArrayList <JButton> buttonList;
    protected ArrayList <Integer> randomNumberList;

    public CatchMe(){

        setTitle("Catch Me If You Can");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(createPanels(), BorderLayout.CENTER);
        setBounds(100,100, 600, 300);
        
        buttonList.get(0).addMouseListener(this);  
        buttonList.get(1).addMouseListener(this);  
        buttonList.get(2).addMouseListener(this);  
        buttonList.get(3).addMouseListener(this);  
        buttonList.get(4).addMouseListener(this);  
        buttonList.get(5).addMouseListener(this);  
        buttonList.get(6).addMouseListener(this);  
        buttonList.get(7).addMouseListener(this);  
        buttonList.get(8).addMouseListener(this); 


        System.out.println( buttonList.get(3).getName());
        randomNumberList = new ArrayList();

        randomButton(buttonList);


        
        //JButton randomButton =  buttonList.get(randomNumber).setText(text);    
        
        //System.out.println( buttonList.get(3).getName());

        this.setVisible(true); 
    }

    public JPanel createPanels(){

        panels = new JPanel();
        panels.setLayout(new GridLayout(3,3));

        buttonList = new ArrayList();

        for (int i = 1; i < 10; i++) {
            button = new JButton("Button " + i);
            button.setName("Button " + i); 
            buttonList.add(button);
            panels.add(button);
           // buttons.add(button);
            
           //System.out.println(button.getName());
        }

       System.out.println(buttonList.size());

        
        return panels;
        

    }

    public JButton randomButton(ArrayList<JButton> buttonList) {
        
        firstRandomNumber = (int)(Math.random()*(9-1)) + 1;

        randomNumberList.add(firstRandomNumber);


        randomButton = buttonList.get(firstRandomNumber);
     int   indexOfButton  = buttonList.indexOf(randomButton);

         // a random number between 0-9
        
       // secondRandomNumber = (int)(Math.random()*(9-1)) + 1;

        randomButton.setText("Click Me");
        randomButton.setForeground(Color.red);

        
      //  System.out.println(firstRandomNumber);
       // System.out.println(indexOfButton);
       // System.out.println(randomNumberList);
         
        return randomButton;     
        
    }

      public JButton secondRandomButton(ArrayList<JButton> buttonList) {
      
        secondRandomNumber = (int)(Math.random()*(9-1)) + 1;
        
        randomNumberList.add(secondRandomNumber);

        int  lastValue = randomNumberList.get(randomNumberList.size() - 2);

        System.out.println(randomNumberList);
        System.out.println(lastValue);
        System.out.println(secondRandomNumber);

        if (lastValue == secondRandomNumber){

          int duplication = 0;

          do{
            secondRandomNumber = (int)(Math.random()*(9-1)) + 1;
            
            duplication++;

          }

        while  (lastValue == secondRandomNumber);

        System.out.println("duplication: " + duplication);

        randomNumberList.add(secondRandomNumber);

        randomButton = buttonList.get(secondRandomNumber);
        randomButton.setText("Click Me");
        randomButton.setForeground(Color.red);

            return randomButton;
        }

        else{

        randomButton = buttonList.get(secondRandomNumber);
        int   indexOfButton  = buttonList.indexOf(randomButton);
     

         // a random number between 0-9
        
       // secondRandomNumber = (int)(Math.random()*(9-1)) + 1;

        randomButton.setText("Click Me");
        randomButton.setForeground(Color.red);

        return randomButton;    
        } 

        /*  int counter = 0;

		do {
			 secondRandomNumber = (int)(Math.random()*(9-1)) + 1;
            randomButton = buttonList.get(secondRandomNumber);
            randomButton.setText("Click Me");
			counter++;
		} while (lastValue == secondRandomNumber);*/
        
    }


    public void mousePressed(MouseEvent e) {

          if (e.getSource() == randomButton){
        
        buttonList.get(0).setText("You win!");
        buttonList.get(1).setText("You win!"); 
        buttonList.get(2).setText("You win!"); 
        buttonList.get(3).setText("You win!"); 
        buttonList.get(4).setText("You win!"); 
        buttonList.get(5).setText("You win!"); 
        buttonList.get(6).setText("You win!"); 
        buttonList.get(7).setText("You win!"); 
        buttonList.get(8).setText("You win!"); 

        this.dispose();

       }
       
     }
 
     public void mouseReleased(MouseEvent e) {

        
     }
 
     public void mouseEntered(MouseEvent e) {

         
        if (e.getSource() == randomButton){
          
            randomButton.setForeground(Color.black);
            randomButton.setText(randomButton.getName());
            secondRandomButton(buttonList);
        
        }

      
     }

     public void mouseExited(MouseEvent e) {
 
     }
 
     public void mouseClicked(MouseEvent e) {

       
     }

  


}
