/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenscreen;

import students.splashScreen;

/**
 *
 * @author User
 */
public class Screenscreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        splashScreen Splash=new splashScreen();
        Splash.setVisible(true);
        start Start =new start();
        try{
            for(int i =0; i<=100;i++){
                Thread.sleep(500);
                Splash.loadingnum.setText(Integer.toString(i)+"%");
                Splash.loadingbar.setValue(i);
                if(i==100){
                    Splash.setVisible(false);
                    Start.setVisible(true);
                    
                }
            }
            
        }catch(Exception e){
            
        }
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splashScreen().setVisible(true);
            }
        });
    }
    
}
