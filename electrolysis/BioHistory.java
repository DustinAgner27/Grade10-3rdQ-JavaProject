package electrolysis;

import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class BioHistory extends javax.swing.JFrame {
    public static String userEmail;
    public static File file = new File("Biology Sciencebook.txt");
    
    public BioHistory() {
        initComponents();
        setLocationRelativeTo(null);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        generateButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        funButton = new javax.swing.JButton();
        finalPanel = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        scrollfordisplay = new javax.swing.JScrollPane();
        displayHistory = new javax.swing.JTextArea();
        showButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sciencebook");
        setBackground(new java.awt.Color(47, 87, 85));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        backgroundPanel.setBackground(new java.awt.Color(163, 208, 108));
        backgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 129, 71), 10));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(701, 469));
        backgroundPanel.setRequestFocusEnabled(false);

        title1.setBackground(new java.awt.Color(153, 255, 153));
        title1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(245, 245, 245));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("SCIENCEBOOK:");

        title2.setBackground(new java.awt.Color(153, 255, 153));
        title2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        title2.setForeground(new java.awt.Color(110, 141, 72));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("SCIENCEBOOK:");

        buttonsPanel.setBackground(new java.awt.Color(163, 208, 108));
        buttonsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 129, 71), 5), " RNA TO PROTEIN TRANSLATOR ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Heavy", 0, 30), new java.awt.Color(245, 245, 245))); // NOI18N
        buttonsPanel.setForeground(new java.awt.Color(245, 245, 245));

        generateButton.setBackground(new java.awt.Color(205, 227, 170));
        generateButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        generateButton.setForeground(new java.awt.Color(74, 129, 71));
        generateButton.setText("GENERATOR");
        generateButton.setBorder(null);
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        historyButton.setBackground(new java.awt.Color(205, 227, 170));
        historyButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        historyButton.setForeground(new java.awt.Color(74, 129, 71));
        historyButton.setText("HISTORY");
        historyButton.setBorder(null);

        funButton.setBackground(new java.awt.Color(205, 227, 170));
        funButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        funButton.setForeground(new java.awt.Color(74, 129, 71));
        funButton.setText("FOR FUN!");
        funButton.setBorder(null);
        funButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(funButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(generateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(funButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        finalPanel.setBackground(new java.awt.Color(163, 208, 108));
        finalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 129, 71), 5));

        clearButton.setBackground(new java.awt.Color(205, 227, 170));
        clearButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(74, 129, 71));
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        displayHistory.setEditable(false);
        displayHistory.setBackground(new java.awt.Color(205, 227, 170));
        displayHistory.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 13)); // NOI18N
        displayHistory.setForeground(new java.awt.Color(74, 129, 71));
        displayHistory.setRows(5);
        displayHistory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayHistory.setMinimumSize(new java.awt.Dimension(455, 36));
        scrollfordisplay.setViewportView(displayHistory);

        showButton.setBackground(new java.awt.Color(205, 227, 170));
        showButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        showButton.setForeground(new java.awt.Color(74, 129, 71));
        showButton.setText("SHOW");
        showButton.setBorder(null);
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout finalPanelLayout = new javax.swing.GroupLayout(finalPanel);
        finalPanel.setLayout(finalPanelLayout);
        finalPanelLayout.setHorizontalGroup(
            finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalPanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollfordisplay)
                .addContainerGap())
        );
        finalPanelLayout.setVerticalGroup(
            finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollfordisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        backButton.setBackground(new java.awt.Color(205, 227, 170));
        backButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(74, 129, 71));
        backButton.setText("GO BACK");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(title1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(title2)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(finalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(title2)
                    .addContainerGap(560, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        new BioGenerator().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void funButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funButtonActionPerformed
        new BioFun().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_funButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        File file = new File("Biology Sciencebook.txt");
        File tempfile = new File("tempBiology Sciencebook.txt");
        if(JOptionPane.showConfirmDialog(this,"Are you sure to clear all data?","Warning!",JOptionPane.YES_NO_OPTION)==0){
            try{
                displayHistory.setText("");
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
    }//GEN-LAST:event_clearButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        displayHistory.setText("");
        String line = null;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            displayHistory.append("\n         Date\t\t" + "RNA Sequence\t\t\t" + "Protein Sequence\n");
            while((line=reader.readLine())!= null){
                String space = "";
                StringTokenizer st = new StringTokenizer(line, "\t");
                if(line.contains(userEmail)) {
                    String email = (String) st.nextElement();
                    displayHistory.append("\n     "+st.nextElement() + "\t");
                    String seq = (String) st.nextElement();
                    if (seq.length()<15) {
                        for(int i=seq.length();i<60;i++){
                            space = space.concat(" ");
                        }
                    }
                    else if (seq.length()<30) {
                        for(int i=seq.length();i<35;i++){
                            space = space.concat(" ");
                        }
                    }
                    displayHistory.append(seq + space + "\t" + st.nextElement());
		}
            }
            fr.close();
            reader.close();
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        catch (IOException e) {
            e.getMessage();
        }
    }//GEN-LAST:event_showButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Menu1stFrame().setVisible(true);
        Menu1stFrame.setName();
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
    private javax.swing.JButton backButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea displayHistory;
    private javax.swing.JPanel finalPanel;
    private javax.swing.JButton funButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JScrollPane scrollfordisplay;
    private javax.swing.JButton showButton;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables

}

    class RecordDoesNotExistException extends Exception{
        public RecordDoesNotExistException() {      
        }
    }