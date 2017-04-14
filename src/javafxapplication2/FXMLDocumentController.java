/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author mandi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button ,button2;
    @FXML
    private ImageView gambar, gambar2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void tampilkan(ActionEvent event) {
        //gambar.setVisible(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gambar.setVisible(true);
        gambar2.setVisible(false);
        Timer timer = new Timer();
          TimerTask task = new TimerTask() {
            
              @Override
              public void run() {
                  if(gambar.isVisible()){
                      gambar.setVisible(false);
                      gambar2.setVisible(true);
                  }else{
                      gambar.setVisible(true);
                      gambar2.setVisible(false);
                  }
              }
          };
        timer.schedule(task, 10000,1000);
    }    
    
}
