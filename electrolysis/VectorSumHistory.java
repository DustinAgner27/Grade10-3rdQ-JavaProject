package electrolysis;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.*;

public class VectorSumHistory extends javax.swing.JFrame {
    
    public VectorSumHistory() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static String userEmail;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        backgroundPanel = new javax.swing.JPanel();
        scibookPanel = new javax.swing.JPanel();
        homeBTN = new javax.swing.JButton();
        calculatorBTN = new javax.swing.JButton();
        historyBTN = new javax.swing.JButton();
        calculationPanel = new javax.swing.JPanel();
        showBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        sdBTN = new javax.swing.JButton();
        mmTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyTA = new javax.swing.JTextArea();
        ddTF = new javax.swing.JTextField();
        yyTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(66, 65, 61));

        scibookPanel.setBackground(new java.awt.Color(66, 65, 61));
        scibookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4), " SCIENCEBOOK:VECTOR SUMMATION CALCULATOR ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Heavy", 0, 24), new java.awt.Color(179, 176, 171))); // NOI18N

        homeBTN.setBackground(new java.awt.Color(255, 206, 40));
        homeBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        homeBTN.setForeground(new java.awt.Color(66, 65, 61));
        homeBTN.setText("HOME");
        homeBTN.setBorder(null);
        homeBTN.setBorderPainted(false);
        homeBTN.setFocusPainted(false);
        homeBTN.setFocusable(false);
        homeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTNActionPerformed(evt);
            }
        });

        calculatorBTN.setBackground(new java.awt.Color(255, 206, 40));
        calculatorBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        calculatorBTN.setForeground(new java.awt.Color(66, 65, 61));
        calculatorBTN.setText("CALCULATOR");
        calculatorBTN.setBorder(null);
        calculatorBTN.setBorderPainted(false);
        calculatorBTN.setFocusPainted(false);
        calculatorBTN.setFocusable(false);
        calculatorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorBTNActionPerformed(evt);
            }
        });

        historyBTN.setBackground(new java.awt.Color(255, 206, 40));
        historyBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        historyBTN.setForeground(new java.awt.Color(66, 65, 61));
        historyBTN.setText("HISTORY");
        historyBTN.setBorder(null);
        historyBTN.setBorderPainted(false);
        historyBTN.setEnabled(false);
        historyBTN.setFocusPainted(false);
        historyBTN.setFocusable(false);

        javax.swing.GroupLayout scibookPanelLayout = new javax.swing.GroupLayout(scibookPanel);
        scibookPanel.setLayout(scibookPanelLayout);
        scibookPanelLayout.setHorizontalGroup(
            scibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scibookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calculatorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(historyBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        scibookPanelLayout.setVerticalGroup(
            scibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scibookPanelLayout.createSequentialGroup()
                .addGroup(scibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeBTN)
                    .addGroup(scibookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(historyBTN)
                        .addComponent(calculatorBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        calculationPanel.setBackground(new java.awt.Color(66, 65, 61));
        calculationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4), " HISTORY ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Heavy", 0, 18), new java.awt.Color(179, 176, 171))); // NOI18N

        showBTN.setBackground(new java.awt.Color(255, 206, 40));
        showBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        showBTN.setForeground(new java.awt.Color(66, 65, 61));
        showBTN.setText("SHOW");
        showBTN.setBorder(null);
        showBTN.setBorderPainted(false);
        showBTN.setFocusPainted(false);
        showBTN.setFocusable(false);
        showBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBTNActionPerformed(evt);
            }
        });

        clearBTN.setBackground(new java.awt.Color(255, 206, 40));
        clearBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(66, 65, 61));
        clearBTN.setText("CLEAR ALL");
        clearBTN.setBorder(null);
        clearBTN.setBorderPainted(false);
        clearBTN.setFocusPainted(false);
        clearBTN.setFocusable(false);
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        sdBTN.setBackground(new java.awt.Color(255, 206, 40));
        sdBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        sdBTN.setForeground(new java.awt.Color(66, 65, 61));
        sdBTN.setText("SEARCH DATE");
        sdBTN.setBorder(null);
        sdBTN.setBorderPainted(false);
        sdBTN.setFocusPainted(false);
        sdBTN.setFocusable(false);
        sdBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdBTNActionPerformed(evt);
            }
        });

        mmTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        mmTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        historyTA.setEditable(false);
        historyTA.setColumns(20);
        historyTA.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        historyTA.setRows(5);
        jScrollPane2.setViewportView(historyTA);

        ddTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        ddTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        yyTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        yyTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(179, 176, 171));
        jLabel2.setText("/");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(179, 176, 171));
        jLabel3.setText("/");

        javax.swing.GroupLayout calculationPanelLayout = new javax.swing.GroupLayout(calculationPanel);
        calculationPanel.setLayout(calculationPanelLayout);
        calculationPanelLayout.setHorizontalGroup(
            calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(calculationPanelLayout.createSequentialGroup()
                        .addComponent(sdBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(mmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(ddTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        calculationPanelLayout.setVerticalGroup(
            calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculationPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scibookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scibookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBTNActionPerformed
        historyTA.setText("");
        File file = new File("vectorCalculator.txt");
        try{
            if(!file.exists()) {
                file.createNewFile();
            }
            
            FileReader fR = new FileReader(file);
            BufferedReader reader = new BufferedReader(fR);
            String line;
            
            //SHOWING HISTORY
            historyTA.append("Date\t" + "Vector A\t" + "Vector B\t" + "Vector C\t" + "Angle A\t" + "Angle B\t" + "Angle C\t" + "Magnitude\t" + "Angle\t" + "Fx\t" + "Fy\t\n");
            while((line=reader.readLine())!=null) {
                StringTokenizer strTokenizer = new StringTokenizer(line, ",");
                if(line.contains(userEmail)) {
                    String email = (String) strTokenizer.nextElement();
                    historyTA.append(strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() +"\n");
                }
            }
                     
            //CLOSING
            fR.close();
            reader.close();
            
        } catch (IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_showBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        File file = new File("vectorCalculator.txt");
        File tempfile = new File("tempVectorCalculator.txt");
        if(JOptionPane.showConfirmDialog(this,"Are you sure to clear all data?","Warning!",JOptionPane.YES_NO_OPTION)==0){
            try{
                historyTA.setText("");
                if(!file.exists()) {
                    file.createNewFile();
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile, true));
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                
                while ((line=reader.readLine()) != null){
                if(line.contains(userEmail)) {
                    writer.write("");
		}
                else {
                    writer.write(line + "\r");
		}
            }
            
            //CLOSING
            writer.close();
            reader.close();
            file.delete();
            tempfile.renameTo(file);

            JOptionPane.showMessageDialog(this, "History Successfully Deleted.", "Notification", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_clearBTNActionPerformed

    private void sdBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdBTNActionPerformed
        historyTA.setText("");
        File file = new File("vectorCalculator.txt");
        try{
            if(!file.exists()) {
                file.createNewFile();
            }
            
            FileReader fR = new FileReader(file);
            BufferedReader reader = new BufferedReader(fR);
            String line;
            boolean recordExists = false;
            
            //EXCEPTION HANDLING
            if(mmTF.getText().equals("") || ddTF.getText().equals("") || yyTF.getText().equals("") || mmTF.getText().length()!=2 || ddTF.getText().length()!=2 || yyTF.getText().length()!=2) {
                throw new WrongDateException();
            }
            
            if(Integer.parseInt(ddTF.getText()) > 31 || Integer.parseInt(mmTF.getText()) > 12 || Integer.parseInt(mmTF.getText()) == 0 || Integer.parseInt(ddTF.getText()) == 0) {
                throw new DateNotExistException();
            }
            
            if((Integer.parseInt(mmTF.getText()) == 4 || Integer.parseInt(mmTF.getText()) == 6 || Integer.parseInt(mmTF.getText()) == 9 || Integer.parseInt(mmTF.getText()) == 11) && Integer.parseInt(ddTF.getText()) >= 31){
                throw new DateNotExistException();
            }
            else if (Integer.parseInt(mmTF.getText()) == 2){
                if (Integer.parseInt(yyTF.getText())%4 != 0 && Integer.parseInt(ddTF.getText()) >28){
                    throw new DateNotExistException();
                }
                else if (Integer.parseInt(yyTF.getText())%4 == 0 && Integer.parseInt(ddTF.getText()) >29){
                    throw new DateNotExistException();
                }
            }
            
            int day = Integer.parseInt(ddTF.getText());
            int month = Integer.parseInt(mmTF.getText());
            int year = Integer.parseInt(yyTF.getText());
            String date = String.format("%02d",month) + "/" + String.format("%02d",day) + "/" + String.format("%02d",year);
            
            //SEARCHING OF STUDENT RECORD
            historyTA.append("Date\t" + "Vector A\t" + "Vector B\t" + "Vector C\t" + "Angle A\t" + "Angle B\t" + "Angle C\t" + "Magnitude\t" + "Angle\t" + "Fx\t" + "Fy\t\n");
            while((line=reader.readLine())!=null) {
                StringTokenizer strTokenizer = new StringTokenizer(line, ",");
                if(line.contains(userEmail)) {
                    if(line.contains(date)) {
                        String email = (String) strTokenizer.nextElement();
                        historyTA.append(strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() + "\t" + strTokenizer.nextElement() +"\n");
                        recordExists = true;
                    }
                }
            }
            
            //ADDITIONAL EXCEPTION HANDLING
            if(!recordExists) {
                throw new RecordDoesNotExistException();
            }
                     
            //CLOSING
            fR.close();
            reader.close();
            
        } catch (IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please input numbers, NOT letters.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(WrongDateException ex) {
            JOptionPane.showMessageDialog(this, "Please fill in date with the correct format (mm/dd/yy).", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(DateNotExistException ex) {
            JOptionPane.showMessageDialog(this, "That date does not exist.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch (RecordDoesNotExistException ex) {
            JOptionPane.showMessageDialog(this, "There is no record of this date", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_sdBTNActionPerformed

    private void calculatorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorBTNActionPerformed
        new VectorSum().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_calculatorBTNActionPerformed

    private void homeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTNActionPerformed
        new Menu1stFrame().setVisible(true);
        Menu1stFrame.setName();
        this.setVisible(false);
    }//GEN-LAST:event_homeBTNActionPerformed

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
            java.util.logging.Logger.getLogger(VectorSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VectorSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VectorSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VectorSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel calculationPanel;
    private javax.swing.JButton calculatorBTN;
    private javax.swing.JButton clearBTN;
    private javax.swing.JTextField ddTF;
    private javax.swing.JButton historyBTN;
    private javax.swing.JTextArea historyTA;
    private javax.swing.JButton homeBTN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mmTF;
    private javax.swing.JPanel scibookPanel;
    private javax.swing.JButton sdBTN;
    private javax.swing.JButton showBTN;
    private javax.swing.JTextField yyTF;
    // End of variables declaration//GEN-END:variables
}

