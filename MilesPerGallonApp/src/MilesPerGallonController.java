
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MilesPerGallonController { 
	
   // formats the total value. The value needs to be rounded or it will throw an exception.
   private static final NumberFormat instance = 
      NumberFormat.getNumberInstance();
   
   // GUI controls defined in FXML and used by the controller's code
   @FXML 
   private TextField milesTextField; 

   @FXML
   private TextField gallonsTextField;

   @FXML
   private TextField totalTextField;

   @FXML 
   private Label milesLabel; 
   
   @FXML
   private Label gallonsLabel; 

   @FXML
   private Label totalLabel;
   

   // calculates MILES  and the amount of gas
   // if there is an error in the input field then the controller will notify the user to "Enter correct amount".
   // I had to use Stack overflow to figure out how to customize the buttons and joption pane.
   @FXML
   private void calculateButtonPressed(ActionEvent event) {
      boolean validation = true;
	try {
    	  if(validation == true) {
    	  
         BigDecimal amountMiles = new BigDecimal(milesTextField.getText());
         BigDecimal amountGallons = new BigDecimal(gallonsTextField.getText());      
         BigDecimal total = amountMiles.divide(amountGallons,2, RoundingMode.CEILING);

      	  milesTextField.setText(amountMiles + "");// Previously I had: milesTextField.setText(amountMiles + "Miles"); However, I wanted the text to be bold and I couldn't figure out to customize it, so I used labels instead.
    	  gallonsTextField.setText(amountGallons + ""); // The empty strings don't seem right, but they function correctly.
    	  totalTextField.setText(instance.format(total)+ "");
    	  }
      }
	
	//if any of the inputs are invalid then a pop up error message will show.
	// Once the user exits out of the error message all of the input fields will be cleared and the user must re-enter the data.
	// At first I wanted to validate the input similar to the tip calculator app, but I couldn't figure out how to throw the message independently.
	// However, I like this option better.
      catch (NumberFormatException ex) {
    	  
    	  JFrame frame= new JFrame();
    	  UIManager.put("OptionPane.background",new ColorUIResource(53,138,164));
    	  UIManager.put("Panel.background",new ColorUIResource(53,138,164));
    	  UIManager.put("Button.background",new ColorUIResource(Color.BLACK));

    	  JButton button = new JButton("Close");
    	  button.addActionListener(e-> frame.dispose());
    	  button.setBackground(new Color(53,138,164));
    	  button.setForeground(Color.WHITE);
  	     
    	  JButton[] buttons = { button };
    	 
    	  JOptionPane.showOptionDialog(frame, "Invalid input!", null, JOptionPane.ERROR_MESSAGE,0, null, buttons, buttons[0]);
      	  milesTextField.clear();
    	  gallonsTextField.clear();
    	  totalTextField.clear();
          validation = false;
      }
   }

	@FXML // clear the input fields when use presses the clear button
      private void clearButtonPressed(ActionEvent event) {
    	  milesTextField.clear();
    	  gallonsTextField.clear();
    	  totalTextField.clear();
    	  
      }
}