package electrolysis;

import java.io.*;
import javax.swing.*;

public class VectorSum extends javax.swing.JFrame {
    
    public VectorSum() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static String userEmail;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        scibookPanel = new javax.swing.JPanel();
        homeBTN = new javax.swing.JButton();
        calculatorBTN = new javax.swing.JButton();
        historyBTN = new javax.swing.JButton();
        calculationPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        mmTF = new javax.swing.JTextField();
        ddTF = new javax.swing.JTextField();
        yyTF = new javax.swing.JTextField();
        vectorLabel = new javax.swing.JLabel();
        vATF = new javax.swing.JTextField();
        vBTF = new javax.swing.JTextField();
        vCTF = new javax.swing.JTextField();
        angleLabel = new javax.swing.JLabel();
        aATF = new javax.swing.JTextField();
        aBTF = new javax.swing.JTextField();
        aCTF = new javax.swing.JTextField();
        calculateBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        answersPanel = new javax.swing.JPanel();
        magnitudeLabel = new javax.swing.JLabel();
        angleAnswerLabel = new javax.swing.JLabel();
        fXLabel = new javax.swing.JLabel();
        fYLabel = new javax.swing.JLabel();
        mAnswerLabel = new javax.swing.JLabel();
        aAnswerLabel = new javax.swing.JLabel();
        fXAnswerLabel = new javax.swing.JLabel();
        fYAnswerLabel = new javax.swing.JLabel();

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
        calculatorBTN.setEnabled(false);
        calculatorBTN.setFocusPainted(false);
        calculatorBTN.setFocusable(false);

        historyBTN.setBackground(new java.awt.Color(255, 206, 40));
        historyBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        historyBTN.setForeground(new java.awt.Color(66, 65, 61));
        historyBTN.setText("HISTORY");
        historyBTN.setBorder(null);
        historyBTN.setBorderPainted(false);
        historyBTN.setFocusPainted(false);
        historyBTN.setFocusable(false);
        historyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBTNActionPerformed(evt);
            }
        });

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
        calculationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4), " CALCULATION ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Heavy", 0, 18), new java.awt.Color(179, 176, 171))); // NOI18N

        dateLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(179, 176, 171));
        dateLabel.setText("Date (mm/dd/yy) :");

        mmTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        mmTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ddTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        ddTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        yyTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        yyTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        vectorLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        vectorLabel.setForeground(new java.awt.Color(179, 176, 171));
        vectorLabel.setText("Vectors:");

        vATF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        vATF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        vBTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        vBTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        vCTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        vCTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        angleLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        angleLabel.setForeground(new java.awt.Color(179, 176, 171));
        angleLabel.setText("Angles (From +x Axis):");

        aATF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        aATF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aBTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        aBTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCTF.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        aCTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        calculateBTN.setBackground(new java.awt.Color(255, 206, 40));
        calculateBTN.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        calculateBTN.setForeground(new java.awt.Color(66, 65, 61));
        calculateBTN.setText("CALCULATE");
        calculateBTN.setBorder(null);
        calculateBTN.setBorderPainted(false);
        calculateBTN.setFocusPainted(false);
        calculateBTN.setFocusable(false);
        calculateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBTNActionPerformed(evt);
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

        javax.swing.GroupLayout calculationPanelLayout = new javax.swing.GroupLayout(calculationPanel);
        calculationPanel.setLayout(calculationPanelLayout);
        calculationPanelLayout.setHorizontalGroup(
            calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(calculationPanelLayout.createSequentialGroup()
                        .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(calculationPanelLayout.createSequentialGroup()
                                .addComponent(dateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ddTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(calculationPanelLayout.createSequentialGroup()
                                .addComponent(vectorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vATF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(vBTF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(calculationPanelLayout.createSequentialGroup()
                        .addComponent(angleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aATF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aBTF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        calculationPanelLayout.setVerticalGroup(
            calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(mmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vectorLabel)
                    .addComponent(vATF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vBTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angleLabel)
                    .addComponent(aATF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aBTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        answersPanel.setBackground(new java.awt.Color(66, 65, 61));
        answersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4), " ANSWERS  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Heavy", 0, 18), new java.awt.Color(179, 176, 171))); // NOI18N

        magnitudeLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        magnitudeLabel.setForeground(new java.awt.Color(179, 176, 171));
        magnitudeLabel.setText("Magnitude:");

        angleAnswerLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        angleAnswerLabel.setForeground(new java.awt.Color(179, 176, 171));
        angleAnswerLabel.setText("Angle:");

        fXLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        fXLabel.setForeground(new java.awt.Color(179, 176, 171));
        fXLabel.setText("Fx:");

        fYLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        fYLabel.setForeground(new java.awt.Color(179, 176, 171));
        fYLabel.setText("Fy:");

        mAnswerLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        mAnswerLabel.setForeground(new java.awt.Color(179, 176, 171));
        mAnswerLabel.setText("0");

        aAnswerLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        aAnswerLabel.setForeground(new java.awt.Color(179, 176, 171));
        aAnswerLabel.setText("0");

        fXAnswerLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        fXAnswerLabel.setForeground(new java.awt.Color(179, 176, 171));
        fXAnswerLabel.setText("0");

        fYAnswerLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        fYAnswerLabel.setForeground(new java.awt.Color(179, 176, 171));
        fYAnswerLabel.setText("0");

        javax.swing.GroupLayout answersPanelLayout = new javax.swing.GroupLayout(answersPanel);
        answersPanel.setLayout(answersPanelLayout);
        answersPanelLayout.setHorizontalGroup(
            answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanelLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(magnitudeLabel)
                    .addComponent(angleAnswerLabel)
                    .addComponent(fXLabel)
                    .addComponent(fYLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mAnswerLabel)
                    .addComponent(aAnswerLabel)
                    .addComponent(fXAnswerLabel)
                    .addComponent(fYAnswerLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        answersPanelLayout.setVerticalGroup(
            answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanelLayout.createSequentialGroup()
                .addGroup(answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(magnitudeLabel)
                    .addComponent(mAnswerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angleAnswerLabel)
                    .addComponent(aAnswerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fXLabel)
                    .addComponent(fXAnswerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fYLabel)
                    .addComponent(fYAnswerLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scibookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scibookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void calculateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBTNActionPerformed
        File file = new File("vectorCalculator.txt");

        try{
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
            if(vATF.getText().equals("") && vBTF.getText().equals("") && vCTF.getText().equals("") && aATF.getText().equals("") && aBTF.getText().equals("") && aCTF.getText().equals("")) {
                throw new BlankVectorsException();
            }
            else{
                if(vATF.getText().equals("") && !aATF.getText().equals("")) {
                    throw new BlankVectorsAndAnglesException();
                }
                else if(!vATF.getText().equals("") && aATF.getText().equals("")) {
                    throw new BlankVectorsAndAnglesException();
                }
                if(vBTF.getText().equals("") && !aBTF.getText().equals("")) {
                    throw new BlankVectorsAndAnglesException();
                }
                else if(!vBTF.getText().equals("") && aBTF.getText().equals("")) {
                    throw new BlankVectorsAndAnglesException();
                }
                if(vCTF.getText().equals("") && !aCTF.getText().equals("")) {
                    throw new BlankVectorsAndAnglesException();
                }
                else if(!vCTF.getText().equals("") && aCTF.getText().equals("")) {
                    throw new BlankVectorsAndAnglesException();
                }
            }
            
            //CALCULATIONS
            double v1 = 0,v2 = 0,v3 = 0,a1 = 0,a2 = 0,a3 = 0;
            if(vATF.getText().equals("")) {
                v1 = 0;
            }
            else{
                v1 = Double.parseDouble(vATF.getText());
            }
            if(vBTF.getText().equals("")) {
                v2 = 0;
            }
            else{
                v2 = Double.parseDouble(vBTF.getText());
            }
            if(vCTF.getText().equals("")) {
                v3 = 0;
            }
            else{
                v3 = Double.parseDouble(vCTF.getText());
            }
            if(aATF.getText().equals("")) {
                a1 = 0;
            }
            else{
                a1 = Double.parseDouble(aATF.getText());
            }
            if(aBTF.getText().equals("")) {
                a2 = 0;
            }
            else{
                a2 = Double.parseDouble(aBTF.getText());
            }
            if(aCTF.getText().equals("")) {
                a3 = 0;
            }
            else{
                a3 = Double.parseDouble(aCTF.getText());
            }
            
            int day = Integer.parseInt(ddTF.getText());
            int month = Integer.parseInt(mmTF.getText());
            int year = Integer.parseInt(yyTF.getText());
            
            double vectorX = (Math.cos(a1 * Math.PI / 180) * v1) + (Math.cos(a2 * Math.PI / 180) * v2) + (Math.cos(a3 * Math.PI / 180) * v3);
            double vectorY = (Math.sin(a1 * Math.PI / 180) * v1) + (Math.sin(a2 * Math.PI / 180) * v2) + (Math.sin(a3 * Math.PI / 180) * v3);
            double magnitude = Math.sqrt(Math.pow(vectorX,2) + Math.pow(vectorY,2));
            double angle = Math.toDegrees((Math.atan(vectorY/vectorX)));
            
            mAnswerLabel.setText(String.format("%.2f", magnitude) + " N");
            aAnswerLabel.setText(String.format("%.2f", angle) + "°");
            fXAnswerLabel.setText(String.format("%.2f", vectorX) + " N");
            fYAnswerLabel.setText(String.format("%.2f", vectorY) + " N");
            
            //FILE WRITING
            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter fW = new FileWriter(file, true);
            fW.write(userEmail + "," + String.format("%02d", month) + "/" + String.format("%02d", day) + "/" + String.format("%02d", year) + "," + String.format("%.2f", v1) + " N," + String.format("%.2f", v2) + " N," + String.format("%.2f", v3) + " N," + String.format("%.2f", a1) + "°," + String.format("%.2f", a2) + "°," + String.format("%.2f", a3) + "°," + String.format("%.2f", magnitude) + " N," + String.format("%.2f", angle) + "°," + String.format("%.2f", vectorX) + " N," + String.format("%.2f", vectorY) + " N" + "\r");
            fW.flush();
            
            //CLOSING
            fW.close();
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch(WrongDateException ex) {
            JOptionPane.showMessageDialog(this, "Please fill in date with the correct dates and format (mm/dd/yy).", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(DateNotExistException ex) {
            JOptionPane.showMessageDialog(this, "That date does not exist.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(BlankVectorsException ex) {
            JOptionPane.showMessageDialog(this, "Please fill in atleast one vector and angle.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(BlankVectorsAndAnglesException ex) {
            JOptionPane.showMessageDialog(this, "Please fill in the vectors and its corresponding angles.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please input only numbers.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_calculateBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        mmTF.setText("");
        ddTF.setText("");
        yyTF.setText("");
        vATF.setText("");
        vBTF.setText("");
        vCTF.setText("");
        aATF.setText("");
        aBTF.setText("");
        aCTF.setText("");
        mAnswerLabel.setText("");
        aAnswerLabel.setText("");
        fXAnswerLabel.setText("");
        fYAnswerLabel.setText("");
    }//GEN-LAST:event_clearBTNActionPerformed

    private void historyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBTNActionPerformed
        new VectorSumHistory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_historyBTNActionPerformed

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
    private javax.swing.JTextField aATF;
    private javax.swing.JLabel aAnswerLabel;
    private javax.swing.JTextField aBTF;
    private javax.swing.JTextField aCTF;
    private javax.swing.JLabel angleAnswerLabel;
    private javax.swing.JLabel angleLabel;
    private javax.swing.JPanel answersPanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton calculateBTN;
    private javax.swing.JPanel calculationPanel;
    private javax.swing.JButton calculatorBTN;
    private javax.swing.JButton clearBTN;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField ddTF;
    private javax.swing.JLabel fXAnswerLabel;
    private javax.swing.JLabel fXLabel;
    private javax.swing.JLabel fYAnswerLabel;
    private javax.swing.JLabel fYLabel;
    private javax.swing.JButton historyBTN;
    private javax.swing.JButton homeBTN;
    private javax.swing.JLabel mAnswerLabel;
    private javax.swing.JLabel magnitudeLabel;
    private javax.swing.JTextField mmTF;
    private javax.swing.JPanel scibookPanel;
    private javax.swing.JTextField vATF;
    private javax.swing.JTextField vBTF;
    private javax.swing.JTextField vCTF;
    private javax.swing.JLabel vectorLabel;
    private javax.swing.JTextField yyTF;
    // End of variables declaration//GEN-END:variables

}

    class BlankVectorsException extends Exception {
        public BlankVectorsException() {
        }
    }

    class BlankVectorsAndAnglesException extends Exception {
        public BlankVectorsAndAnglesException() {
        }
    }

    class DateNotExistException extends Exception {
        public DateNotExistException() {
        }
    }
    class WrongDateException extends Exception {
        public WrongDateException() {
        }
    }
