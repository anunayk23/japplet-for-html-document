/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anunay kant
 */import java.util.HashMap;
import java.applet.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JLabel;
import static javax.swing.UIManager.get;
public class nunuapplet extends Applet {
    public JLabel l1;
    public JLabel l2;
    public HashMap<String,URL> w;
    public ArrayList<String> l;
    
    
    public void valuegetter(){
   String a=getParameter("t1");
        l1=new JLabel(a);
        String b=getParameter("t2");
    l2=new JLabel(b);
    Object s=get("t3");
    Object t=get("t4");
    URL a1=(URL)s;
    URL a2=(URL)t;
    w=new HashMap<>();
    w.put(b, a2);
        w.put(a, a1);
        
        l=new ArrayList<>();
        l.add(a);
        l.add(b);
        
 
    
    
    }
    
    @Override
    public void init(){
    super.init();
    valuegetter();
    add(new JLabel("here are some alternatives"));
    add(l1);add(l2);
    l1.addMouseListener(new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
          
//To change body of generated methods, choose Tools | Templates.
AppletContext b=getAppletContext();
URL u=w.get(l1.getText());
b.showDocument(u);




        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
           //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    
    
    
    
    
    });
    
    
    l2.addMouseListener(new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
          
//To change body of generated methods, choose Tools | Templates.
AppletContext b=getAppletContext();
URL u=w.get(l2.getText());
b.showDocument(u);




        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
           //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    
    
    
    
    
    });
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
