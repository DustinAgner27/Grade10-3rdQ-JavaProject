package electrolysis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.*;
/**
 *
 * @author ASPIRE P2QG
 */
public class ExistingAccounts extends javax.swing.JFrame {
    public static String userEmail;
    /**
     * Creates new form StartingFrame
     */
    public ExistingAccounts() {
        initComponents();
        setLocationRelativeTo(null);
        showAllHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBackgroundPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTA = new javax.swing.JTextArea();
        nameCardBackgroundPanel2 = new javax.swing.JPanel();
        nameOfAppLabel2 = new javax.swing.JLabel();
        yourScienceHelperLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sciencebook");
        setBackground(new java.awt.Color(47, 87, 85));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        mainBackgroundPanel.setBackground(new java.awt.Color(38, 38, 38));
        mainBackgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 10));
        mainBackgroundPanel.setPreferredSize(new java.awt.Dimension(766, 450));

        exitButton.setBackground(new java.awt.Color(0, 204, 204));
        exitButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(38, 38, 38));
        exitButton.setText("Go Back");
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        historyTA.setEditable(false);
        historyTA.setBackground(new java.awt.Color(51, 51, 51));
        historyTA.setColumns(20);
        historyTA.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        historyTA.setForeground(new java.awt.Color(255, 255, 255));
        historyTA.setRows(5);
        historyTA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4), " EXISTING ACCOUNTS ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Demi", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N
        jScrollPane1.setViewportView(historyTA);

        nameCardBackgroundPanel2.setBackground(new java.awt.Color(0, 255, 255));

        nameOfAppLabel2.setBackground(new java.awt.Color(243, 243, 120));
        nameOfAppLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        nameOfAppLabel2.setForeground(new java.awt.Color(38, 38, 38));
        nameOfAppLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameOfAppLabel2.setText("SCIENCEBOOK");

        javax.swing.GroupLayout nameCardBackgroundPanel2Layout = new javax.swing.GroupLayout(nameCardBackgroundPanel2);
        nameCardBackgroundPanel2.setLayout(nameCardBackgroundPanel2Layout);
        nameCardBackgroundPanel2Layout.setHorizontalGroup(
            nameCardBackgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameCardBackgroundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameOfAppLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nameCardBackgroundPanel2Layout.setVerticalGroup(
            nameCardBackgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameOfAppLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        yourScienceHelperLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 18)); // NOI18N
        yourScienceHelperLabel.setForeground(new java.awt.Color(0, 255, 255));
        yourScienceHelperLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourScienceHelperLabel.setText("YOUR SCIENCE HELPER");

        javax.swing.GroupLayout mainBackgroundPanelLayout = new javax.swing.GroupLayout(mainBackgroundPanel);
        mainBackgroundPanel.setLayout(mainBackgroundPanelLayout);
        mainBackgroundPanelLayout.setHorizontalGroup(
            mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainBackgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameCardBackgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yourScienceHelperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainBackgroundPanelLayout.setVerticalGroup(
            mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameCardBackgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yourScienceHelperLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static void showAllHistory() {
        File accounts = new File("accounts.txt");

        try{
            if(!accounts.exists()) {
                accounts.createNewFile();
            }

            FileReader accountsFR = new FileReader(accounts);
            BufferedReader reader = new BufferedReader(accountsFR);
            String line;
            while((line=reader.readLine())!=null) {
                StringTokenizer strTokenizer = new StringTokenizer(line, ",");
                String email = "" + strTokenizer.nextElement();
                
                String name = "" + strTokenizer.nextElement();
                String age = "" + strTokenizer.nextElement();
                String password = "" + strTokenizer.nextElement();
                historyTA.append("   " + email + "     " + name + "   " + age + " y.o.\n");
                
            }
            //CLOSING
            accountsFR.close();
            reader.close();

        } catch(IOException e){
            //JOptionPane.showMessageDialog(this, "IOException");
        }
    }
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        new IndexFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    public static javax.swing.JTextArea historyTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainBackgroundPanel;
    private javax.swing.JPanel nameCardBackgroundPanel2;
    private javax.swing.JLabel nameOfAppLabel2;
    private javax.swing.JLabel yourScienceHelperLabel;
    // End of variables declaration//GEN-END:variables

}

