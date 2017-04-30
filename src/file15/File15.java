package file15;
import java.io.*;
import java.util.*;
public class File15 extends javax.swing.JFrame {
    public File15() {
        super ("Самая молодая студентка");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("Добавить запись");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setText("Вывести результат");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Номер записи");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Фамилия");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Имя");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Отчество");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Год рождения");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Пол");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Оценки");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Посмотреть запись");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton4.setText(">");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton5.setText("Первая");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton6.setText("Последняя");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField7))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField6))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField5))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField4))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int len=76;
RandomAccessFile f;
long fpoint=0, max, num;
String s,space="                                                                            ";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // добавить запись
        s=jTextField2.getText()+" "+jTextField3.getText()+" "+jTextField4.getText()+" "+jTextField5.getText()+" "+jTextField6.getText()+" "+jTextField7.getText()+" "+jTextField8.getText()+" "+jTextField9.getText()+"\n";
        s=s+space.substring(0, 76-s.length());
        try {
            f = new RandomAccessFile("test.dat", "rw");
            fpoint = f.length();
            f.seek(fpoint);
           // f.writeBytes(s);
            f.write(s.getBytes("CP1251"));
        } catch (Exception ex) {
        }
        jTextField1.setText("ЗАПИСЬ ДОБАВЛЕНА");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // стрелка влево       
        if (jTextField1.getText().equals("")|jTextField1.getText().equals("ЗАПИСЬ ДОБАВЛЕНА")) {
            num=1;
            read();
        } else {
            num=Integer.parseInt(jTextField1.getText())-1;
            if (num>=1) read();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // стрелка вправо
        try {
            f = new RandomAccessFile("test.dat", "r");
            max=f.length()/76;
        } catch (Exception ex){
        }
        if (jTextField1.getText().equals("")|jTextField1.getText().equals("ЗАПИСЬ ДОБАВЛЕНА")) {
            num=max;
            read();
        } else {
            num=Integer.parseInt(jTextField1.getText())+1;
            if (num<=max) read();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // вывести результат
        try {
            f = new RandomAccessFile ("test.dat","r");
            long numer=f.length()/76;
            int nom, nom1, god, mingod=0;
            String pol;
            fpoint=0; num=0;
            byte [] data = new byte [len];
            for (int i=1;i<=numer;i++){
                f.seek(fpoint);
                f.read(data);
                String s = new String (data, "CP1251");
                nom=s.indexOf(' ', 0);
                nom1=s.indexOf(' ', nom+1);
                nom=s.indexOf(' ', nom1+1);
                nom1=s.indexOf(' ', nom+1);
                god = Integer.parseInt(s.substring(nom+1, nom+5));
                pol=s.substring(nom1+1, nom1+2);
                if (pol.equalsIgnoreCase("ж")&&god>mingod) {
                    mingod=god;
                    num=i;
                }
                fpoint+=76;
            }
            if (num==0) {
                jTextField1.setText("В ГРУППЕ НЕТ СТУДЕНТОК");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
            } else{
                read();
            }   
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        num=1; //посмотреть первую запись
        read();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try { //посмотреть последнюю запись
            f = new RandomAccessFile("test.dat", "r");
            num=f.length()/76;
        } catch (Exception ex){
        }
        read();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void read() {
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        byte [] data = new byte [len];
        try {
            f = new RandomAccessFile ("test.dat","rw");
            fpoint=(num-1)*76;
            f.seek(fpoint);
            f.read(data);
            String s = new String (data, "CP1251");
            String [] ss=s.split(" ");
            ss[7]=ss[7].substring(0, 1);
            jTextField1.setText(Long.toString(num));
            jTextField2.setText(ss[0]);
            jTextField3.setText(ss[1]);
            jTextField4.setText(ss[2]);
            jTextField5.setText(ss[3]);
            jTextField6.setText(ss[4]);
            jTextField7.setText(ss[5]);
            jTextField8.setText(ss[6]);
            jTextField9.setText(ss[7]);
        } catch (Exception ex) {
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(File15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(File15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(File15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(File15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new File15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}