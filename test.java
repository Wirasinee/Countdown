
package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class test extends javax.swing.JFrame implements Runnable {
    

    Thread tr = new Thread(this);
     int segundos;
     int minutos;
    public test() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("countdown timer");
        setIconImage(new ImageIcon(getClass().getResource("/Package/icon.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JStrat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Jminutes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jsegundos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Thours = new javax.swing.JLabel();
        Tminutes = new javax.swing.JLabel();
        JPause = new javax.swing.JButton();
        JResume = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 204));
        getContentPane().setLayout(null);

        JStrat.setText("Strat");
        JStrat.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        JStrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JStratActionPerformed(evt);
            }
        });
        getContentPane().add(JStrat);
        JStrat.setBounds(50, 160, 73, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText(":");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 180, 30, 80);

        Jminutes.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Jminutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JminutesActionPerformed(evt);
            }
        });
        getContentPane().add(Jminutes);
        Jminutes.setBounds(100, 70, 50, 40);

        jLabel3.setText("เวลา");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 70, 40);

        jLabel4.setText("วินาที");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 80, 34, 14);

        Jsegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsegundosActionPerformed(evt);
            }
        });
        getContentPane().add(Jsegundos);
        Jsegundos.setBounds(210, 70, 60, 40);

        jLabel5.setText("นาที");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 80, 50, 14);

        Thours.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Thours.setText("00 ");
        getContentPane().add(Thours);
        Thours.setBounds(110, 180, 80, 80);

        Tminutes.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Tminutes.setText("00 ");
        getContentPane().add(Tminutes);
        Tminutes.setBounds(220, 180, 140, 80);

        JPause.setText("Pause");
        JPause.setEnabled(false);
        JPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPauseActionPerformed(evt);
            }
        });
        getContentPane().add(JPause);
        JPause.setBounds(150, 160, 80, 23);

        JResume.setText("Resume");
        JResume.setEnabled(false);
        JResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JResumeActionPerformed(evt);
            }
        });
        getContentPane().add(JResume);
        JResume.setBounds(250, 160, 90, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("หมายเหตุ : รับค่านาทีเเละวินาที");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 260, 220, 30);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void JStratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JStratActionPerformed
if(Jsegundos.getText()=="" && Integer.parseInt(Jminutes.getText())>0){
   Jsegundos.setText("0");
   segundos=0;
    }
    if(Jminutes.getText()==""&&Integer.parseInt(Jsegundos.getText())>0){
    Jminutes.setText("0");
    minutos=0;
    }    
   
        
    
    
    minutos=Integer.parseInt(Jminutes.getText());/// การดึงค่าแล้วเปลี่ยนเป็นint
    segundos=Integer.parseInt(Jsegundos.getText()); 
    
   
    
        
    
  
    
        int sum=0;
        int sum1=0;
        sum =segundos/60;
        sum1=segundos-60;
        if(segundos>60&&minutos==0){
          
            Thours.setText("0"+sum); 
            
            if(segundos<10) Tminutes.setText("0"+sum1);
            else Tminutes.setText(""+sum1);
            
            
            minutos= sum ;
            segundos= sum1;   
        }else if(segundos>60&&minutos!=0){
            sum=sum+minutos;
            
            if(minutos<10) Thours.setText("0"+sum); 
            else Thours.setText(""+sum);
            if(segundos<10) Tminutes.setText("0"+sum1);
            else Tminutes.setText(""+sum1);
            
            minutos= sum ;
            segundos= sum1;   
            
        } 
            
    
    
    
    if(minutos<10) Thours.setText("0"+minutos);
    else Thours.setText(""+minutos);
    if(segundos<10)Tminutes.setText("0"+segundos);
    else Tminutes.setText(""+segundos);
    
    tr.start();
    JPause.setEnabled(true);
    
    
    }//GEN-LAST:event_JStratActionPerformed

    private void JminutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JminutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JminutesActionPerformed

    private void JPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPauseActionPerformed
        
       tr.suspend();
       JResume.setEnabled(true);
       JPause.setEnabled(false);
        
       
    }//GEN-LAST:event_JPauseActionPerformed

    private void JResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JResumeActionPerformed
        tr.resume();
        JResume.setEnabled(false);
        JPause.setEnabled(true);
        
    }//GEN-LAST:event_JResumeActionPerformed

    private void JsegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsegundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JsegundosActionPerformed

    
    public static void main(String args[]) {
        
        
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }

        });
        
    } 



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JPause;
    private javax.swing.JButton JResume;
    private javax.swing.JButton JStrat;
    private javax.swing.JTextField Jminutes;
    private javax.swing.JTextField Jsegundos;
    private javax.swing.JLabel Thours;
    private javax.swing.JLabel Tminutes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    @Override
        public void run() {
           boolean a=true;
           
          
        while(true){
            
        if(segundos>0&&segundos<61){
                try {
                tr.sleep(1000);
            } catch (InterruptedException ex) {}
                segundos--;
                
                if(segundos<10){
                    Tminutes.setText("0"+segundos);
                }
                
                else {
                    Tminutes.setText(""+segundos);
                }
            
                a=false;  
        }
        
      if(segundos==0&&minutos!=0){
            if(minutos<10){                ///ปรินค่า m
                    Thours.setText("0"+minutos);
            }else{
              Thours.setText(""+minutos);
            }
             Tminutes.setText("00");   ///  segundos==0 Tminutes(วินาที)เป็น00
             
           segundos=60;  ///แก้เมือคืน
           
           
      }
               
        
        if(segundos==59){
             minutos--;
            if(minutos>=0){
              
              if(minutos<10){
                    Thours.setText("0"+minutos);
                }else{
              Thours.setText(""+minutos);
              }
             
            }
            
            else break;
          }
        
            
          
    }
      
        

}
}
