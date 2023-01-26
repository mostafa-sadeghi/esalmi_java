// importing Java AWT class  
import java.awt.*;  
import java.awt.event.*;
  
  
// extending Frame class to our class AWTExample1  
public class AWTExample1 extends Frame implements ActionListener {    
  TextField t;
  Label l;
   // initializing using constructor  
   AWTExample1() {  
  
      // creating a button   
      Button b = new Button("Click Me!!");  
      l = new Label("sdasdadsad");
  
      // setting button position on screen  
      l.setBounds(50, 100, 250, 20);   
      b.setBounds(50,150,60,30);   
  
      add(l);  
      // adding button into frame    
      add(b);  
      b.addActionListener(this);


     // creating a TextField  
      t = new TextField();  
  
      // setting position of above components in the frame  
      t.setBounds(50, 50, 150, 20);    
  
      // adding components into frame    
      add(t);  




  
      // frame size 300 width and 300 height    
      setSize(300,300);  
  
      // setting the title of Frame  
      setTitle("This is our basic AWT example");   
          
      // no layout manager   
      setLayout(null);   
  
      // now frame will be visible, by default it is not visible    
      setVisible(true);  
}  

public void actionPerformed(ActionEvent e){
    try{
        String host = t.getText();    
        String ip = java.net.InetAddress.getByName(host).getHostAddress();
        System.out.println(host);
        System.out.println(ip);
        l.setText("IP of "+host+" is: "+ip);    

    }
    catch(Exception ex){
        System.out.println(ex);
    }
}
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
AWTExample1 f = new AWTExample1();    
  
}  
  
}    