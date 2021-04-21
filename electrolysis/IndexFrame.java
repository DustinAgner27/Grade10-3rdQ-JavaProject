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
public class IndexFrame extends javax.swing.JFrame {
    String eemail;
    /**
     * Creates new form StartingFrame
     */
    public IndexFrame() {
        initComponents();
        setLocationRelativeTo(null);
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
        nameCardBackgroundPanel = new javax.swing.JPanel();
        nameOfAppLabel = new javax.swing.JLabel();
        yourScienceHelperLabel = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        emailLabel1 = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        enterButton1 = new javax.swing.JButton();
        emailTF1 = new javax.swing.JTextField();
        passwordPF1 = new javax.swing.JPasswordField();
        namelLabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        loginPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        emailTF = new javax.swing.JTextField();
        passwordPF = new javax.swing.JPasswordField();
        checkAccountsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sciencebook");
        setBackground(new java.awt.Color(47, 87, 85));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        mainBackgroundPanel.setBackground(new java.awt.Color(38, 38, 38));
        mainBackgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 10));
        mainBackgroundPanel.setPreferredSize(new java.awt.Dimension(766, 450));

        nameCardBackgroundPanel.setBackground(new java.awt.Color(0, 255, 255));

        nameOfAppLabel.setBackground(new java.awt.Color(243, 243, 120));
        nameOfAppLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        nameOfAppLabel.setForeground(new java.awt.Color(38, 38, 38));
        nameOfAppLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameOfAppLabel.setText("SCIENCEBOOK");

        javax.swing.GroupLayout nameCardBackgroundPanelLayout = new javax.swing.GroupLayout(nameCardBackgroundPanel);
        nameCardBackgroundPanel.setLayout(nameCardBackgroundPanelLayout);
        nameCardBackgroundPanelLayout.setHorizontalGroup(
            nameCardBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameCardBackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameOfAppLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nameCardBackgroundPanelLayout.setVerticalGroup(
            nameCardBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameOfAppLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        yourScienceHelperLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 18)); // NOI18N
        yourScienceHelperLabel.setForeground(new java.awt.Color(0, 255, 255));
        yourScienceHelperLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourScienceHelperLabel.setText("YOUR SCIENCE HELPER");

        signUpPanel.setBackground(new java.awt.Color(38, 38, 38));
        signUpPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4), " SIGN UP ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Demi", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N

        emailLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        emailLabel1.setForeground(new java.awt.Color(0, 255, 255));
        emailLabel1.setText("Email:");

        passwordLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(0, 255, 255));
        passwordLabel1.setText("Password:");

        enterButton1.setBackground(new java.awt.Color(0, 255, 255));
        enterButton1.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 18)); // NOI18N
        enterButton1.setForeground(new java.awt.Color(38, 38, 38));
        enterButton1.setText("SIGN UP");
        enterButton1.setBorder(null);
        enterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButton1ActionPerformed(evt);
            }
        });

        emailTF1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        emailTF1.setForeground(new java.awt.Color(38, 38, 38));
        emailTF1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));

        passwordPF1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        passwordPF1.setForeground(new java.awt.Color(38, 38, 38));
        passwordPF1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));

        namelLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        namelLabel.setForeground(new java.awt.Color(0, 255, 255));
        namelLabel.setText("Name:");

        nameTF.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        nameTF.setForeground(new java.awt.Color(38, 38, 38));
        nameTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));

        ageLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 255, 255));
        ageLabel.setText("Age:");

        ageTF.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        ageTF.setForeground(new java.awt.Color(38, 38, 38));
        ageTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namelLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTF1)
                    .addComponent(passwordPF1)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(enterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelLabel)
                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTF, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel1)
                    .addComponent(emailTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(passwordLabel1))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        loginPanel.setBackground(new java.awt.Color(38, 38, 38));
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4), " LOG IN ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Demi", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N

        emailLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 255, 255));
        emailLabel.setText("Email:");

        passwordLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 255, 255));
        passwordLabel.setText("Password:");

        enterButton.setBackground(new java.awt.Color(0, 255, 255));
        enterButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 18)); // NOI18N
        enterButton.setForeground(new java.awt.Color(38, 38, 38));
        enterButton.setText("LOG IN");
        enterButton.setBorder(null);
        enterButton.setBorderPainted(false);
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        emailTF.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        emailTF.setForeground(new java.awt.Color(38, 38, 38));
        emailTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));

        passwordPF.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        passwordPF.setForeground(new java.awt.Color(38, 38, 38));
        passwordPF.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkAccountsButton.setBackground(new java.awt.Color(0, 255, 255));
        checkAccountsButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        checkAccountsButton.setForeground(new java.awt.Color(38, 38, 38));
        checkAccountsButton.setText("Check Existing Accounts");
        checkAccountsButton.setBorder(null);
        checkAccountsButton.setBorderPainted(false);
        checkAccountsButton.setFocusPainted(false);
        checkAccountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAccountsButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(0, 204, 204));
        exitButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(38, 38, 38));
        exitButton.setText("Exit");
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainBackgroundPanelLayout = new javax.swing.GroupLayout(mainBackgroundPanel);
        mainBackgroundPanel.setLayout(mainBackgroundPanelLayout);
        mainBackgroundPanelLayout.setHorizontalGroup(
            mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameCardBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yourScienceHelperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                            .addComponent(signUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(checkAccountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        mainBackgroundPanelLayout.setVerticalGroup(
            mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(nameCardBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yourScienceHelperLabel)
                .addGap(18, 18, 18)
                .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(checkAccountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButton1ActionPerformed
        File accounts = new File("accounts.txt");
        
        try{
            if(!accounts.exists()) {
                accounts.createNewFile();
            }
            FileWriter accountsFW = new FileWriter(accounts, true);
            FileReader accountsFR = new FileReader(accounts);
            BufferedReader reader = new BufferedReader(accountsFR);
            String line;

            //EXCEPTION HANDLING
            if(nameTF.getText().equals("") || ageTF.getText().equals("") || emailTF1.getText().equals("") || passwordPF1.getText().equals("")) {
                throw new BlankException();
            }
            int age = Integer.parseInt(ageTF.getText());
            if(!emailTF1.getText().contains("@")) {
                throw new WrongEmailFormatException();
            }
            while((line=reader.readLine())!=null) {
                if(line.contains(emailTF1.getText())) {
                    throw new AccountExistsException();
                }
            }

            //CREATING AN ACCOUNT
            accountsFW.write(emailTF1.getText() + "," + nameTF.getText() + "," + ageTF.getText() + "," + passwordPF1.getText() + "\r");
            accountsFW.flush();
            JOptionPane.showMessageDialog(this, "Account successfully created.", "Notification", JOptionPane.INFORMATION_MESSAGE);

            //CLOSING
            accountsFW.close();
            accountsFR.close();
            reader.close();

            //CLEARING THE FIELDS
            nameTF.setText("");
            ageTF.setText("");
            emailTF1.setText("");
            passwordPF1.setText("");

        } catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch(AccountExistsException ex) {
            JOptionPane.showMessageDialog(this, "The account already exists.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(BlankException ex) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(WrongEmailFormatException ex) {
            JOptionPane.showMessageDialog(this, "The entered email is invalid.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The input in the age field should be an integer.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_enterButton1ActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        File accounts = new File("accounts.txt");

        try{
            if(!accounts.exists()) {
                accounts.createNewFile();
            }

            FileReader accountsFR = new FileReader(accounts);
            BufferedReader reader = new BufferedReader(accountsFR);
            String line;

            //EXCEPTION HANDLING
            if(emailTF.getText().equals("") || passwordPF.getText().equals("")) {
                throw new BlankException();
            }
            if(!emailTF.getText().contains("@")) {
                throw new WrongEmailFormatException();
            }
            boolean accountChecker = true;
            while((line=reader.readLine())!=null) {
                StringTokenizer strTokenizer = new StringTokenizer(line, ",");
                String email = "" + strTokenizer.nextElement();
                if(emailTF.getText().equals(email)) {
                    accountChecker = false;
                    String name = "" + strTokenizer.nextElement();
                    String age = "" + strTokenizer.nextElement();
                    String password = "" + strTokenizer.nextElement();

                    //CHECKING IF ENTERED PASSWORD IS CORRECT
                    if(password.equals(passwordPF.getText())) {
                        //CLEARING THE FIELDS
                        emailTF.setText("");
                        passwordPF.setText("");
                        //GO TO MENU1st FRAME and CHANGE THE NAME
                        new Menu1stFrame().setVisible(true);
                        Menu1stFrame.yourScienceHelperLabel.setText("Hi, " + name + "!");
                        Menu1stFrame.userEmail = email;
                        Menu1stFrame.setName();
                        this.setVisible(false);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "The entered password is incorrect.\nPlease try again.", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
            if(accountChecker) {
                throw new AccountDoesNotExistException();
            }

            //CLOSING
            accountsFR.close();
            reader.close();

        } catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch(AccountDoesNotExistException ex) {
            JOptionPane.showMessageDialog(this, "The entered account does not exist.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(BlankException ex) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(WrongEmailFormatException ex) {
            JOptionPane.showMessageDialog(this, "The entered email is invalid.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_enterButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void checkAccountsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAccountsButtonActionPerformed
        new ExistingAccounts().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkAccountsButtonActionPerformed

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
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton checkAccountsButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField emailTF1;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton enterButton1;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainBackgroundPanel;
    private javax.swing.JPanel nameCardBackgroundPanel;
    private javax.swing.JLabel nameOfAppLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel namelLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JPasswordField passwordPF1;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JLabel yourScienceHelperLabel;
    // End of variables declaration//GEN-END:variables

}

    class AccountExistsException extends Exception{
        public AccountExistsException() {

        }
    }

    class WrongEmailFormatException extends Exception{
        public WrongEmailFormatException() {

        }
    }

    class BlankException extends Exception {
        public BlankException() {

        }
    }

    class AccountDoesNotExistException extends Exception {
        public AccountDoesNotExistException() {

        }
    }