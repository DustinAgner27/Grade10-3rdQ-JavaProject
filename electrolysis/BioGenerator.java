package electrolysis;

import javax.swing.*;
import java.io.*;

public class BioGenerator extends javax.swing.JFrame {
    public static String userEmail;
    String[][][] wobbletable={
        {
            {"PHE","PHE","LEU","LEU"},
            {"SER","SER","SER","SER"},
            {"TYR","TYR","STOP","STOP"},
            {"CYS","CYS","STOP","TRP"}, 
        },
        {
            {"LEU","LEU","LEU","LEU"},
            {"PRO","PRO","PRO","PRO"},
            {"HIS","HIS","GLN","GLN"},
            {"ARG","ARG","ARG","ARG"}, 
        },
        {
            {"ILE","ILE","ILE","MET"},
            {"THR","THR","THR","THR"},
            {"ASN","ASN","LYS","LYS"},
            {"SER","SER","ARG","ARG"}, 
        },
        {
            {"VAL","VAL","VAL","VAL"},
            {"ALA","ALA","ALA","ALA"},
            {"ASP","ASP","GLU","GLU"},
            {"GLY","GLY","GLY","GLY"}, 
        }
    };
    public static File file = new File("Biology Sciencebook.txt");
    
    public BioGenerator() {
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
        generateButton2 = new javax.swing.JButton();
        historyButton2 = new javax.swing.JButton();
        funButton2 = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        datelabel = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        nameOfGameCard9 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        nameOfGameCard10 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        nameOfGameCard11 = new javax.swing.JLabel();
        rnaseq = new javax.swing.JTextField();
        generatorB = new javax.swing.JButton();
        finalPanel = new javax.swing.JPanel();
        nameOfGameCard17 = new javax.swing.JLabel();
        proteinseq = new javax.swing.JTextField();
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
        buttonsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 129, 71), 5), " RNA TO PROTEIN SYNTHESIS ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Heavy", 0, 30), new java.awt.Color(245, 245, 245))); // NOI18N
        buttonsPanel.setForeground(new java.awt.Color(245, 245, 245));

        generateButton2.setBackground(new java.awt.Color(205, 227, 170));
        generateButton2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        generateButton2.setForeground(new java.awt.Color(74, 129, 71));
        generateButton2.setText("GENERATOR");
        generateButton2.setBorder(null);

        historyButton2.setBackground(new java.awt.Color(205, 227, 170));
        historyButton2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        historyButton2.setForeground(new java.awt.Color(74, 129, 71));
        historyButton2.setText("HISTORY");
        historyButton2.setBorder(null);
        historyButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButton2ActionPerformed(evt);
            }
        });

        funButton2.setBackground(new java.awt.Color(205, 227, 170));
        funButton2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        funButton2.setForeground(new java.awt.Color(74, 129, 71));
        funButton2.setText("FOR FUN!");
        funButton2.setBorder(null);
        funButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generateButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(historyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(funButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(generateButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(funButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historyButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        inputPanel.setBackground(new java.awt.Color(163, 208, 108));
        inputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 129, 71), 5));

        datelabel.setBackground(new java.awt.Color(153, 255, 153));
        datelabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 26)); // NOI18N
        datelabel.setForeground(new java.awt.Color(255, 255, 255));
        datelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datelabel.setText("DATE (mm/dd/yy):");

        month.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 16)); // NOI18N
        month.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameOfGameCard9.setBackground(new java.awt.Color(153, 255, 153));
        nameOfGameCard9.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 25)); // NOI18N
        nameOfGameCard9.setForeground(new java.awt.Color(255, 255, 255));
        nameOfGameCard9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameOfGameCard9.setText("/");

        day.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 16)); // NOI18N
        day.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameOfGameCard10.setBackground(new java.awt.Color(153, 255, 153));
        nameOfGameCard10.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 25)); // NOI18N
        nameOfGameCard10.setForeground(new java.awt.Color(255, 255, 255));
        nameOfGameCard10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameOfGameCard10.setText("/");

        year.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 16)); // NOI18N
        year.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameOfGameCard11.setBackground(new java.awt.Color(153, 255, 153));
        nameOfGameCard11.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 26)); // NOI18N
        nameOfGameCard11.setForeground(new java.awt.Color(255, 255, 255));
        nameOfGameCard11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameOfGameCard11.setText("RNA Sequence:");

        rnaseq.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 16)); // NOI18N
        rnaseq.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        generatorB.setBackground(new java.awt.Color(205, 227, 170));
        generatorB.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        generatorB.setForeground(new java.awt.Color(74, 129, 71));
        generatorB.setText("GENERATE");
        generatorB.setBorder(null);
        generatorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatorBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(datelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameOfGameCard9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameOfGameCard10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(nameOfGameCard11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rnaseq, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generatorB, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameOfGameCard9)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameOfGameCard10)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rnaseq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameOfGameCard11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generatorB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        finalPanel.setBackground(new java.awt.Color(163, 208, 108));
        finalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 129, 71), 5));

        nameOfGameCard17.setBackground(new java.awt.Color(153, 255, 153));
        nameOfGameCard17.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 26)); // NOI18N
        nameOfGameCard17.setForeground(new java.awt.Color(255, 255, 255));
        nameOfGameCard17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameOfGameCard17.setText("PROTEIN Sequence:");

        proteinseq.setEditable(false);
        proteinseq.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 16)); // NOI18N
        proteinseq.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout finalPanelLayout = new javax.swing.GroupLayout(finalPanel);
        finalPanel.setLayout(finalPanelLayout);
        finalPanelLayout.setHorizontalGroup(
            finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalPanelLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(nameOfGameCard17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(proteinseq, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        finalPanelLayout.setVerticalGroup(
            finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameOfGameCard17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proteinseq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addContainerGap(325, Short.MAX_VALUE)))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundPanelLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(title2)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historyButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButton2ActionPerformed
        new BioHistory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_historyButton2ActionPerformed

    private void funButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funButton2ActionPerformed
        new BioFun().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_funButton2ActionPerformed

    private void generatorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatorBActionPerformed
        proteinseq.setText(" ");
        //FOR DATE!!!
        try{
            int mm=Integer.parseInt(month.getText());
            int dd=Integer.parseInt(day.getText());
            int yy=Integer.parseInt(year.getText());

            if(!file.exists()){
                file.createNewFile();
            }

            if(month.getText().equals("") || day.getText().equals("")  || year.getText().equals("") || rnaseq.getText().equals("")){
                throw new BlankException();
            }

            if(day.getText().length()!=2 || month.getText().length()!=2 || year.getText().length()!=2) {
                throw new WrongDateFormatException();
            }

            if(mm<0 || mm>13 ||yy<0 || yy>99){
                throw new WrongDateFormatException();
            }
            else if(mm>0&&mm<13){
                if(mm<8){
                    int mi=(mm+1)%2;
                    if(mi==0){
                        if(dd>31||dd<0){
                            throw new WrongDateFormatException();
                        }
                    }
                    else{
                        if(mm==2){
                            int leap=yy%4;
                            if(leap!=0){
                                if(dd>28||dd<0){
                                throw new WrongDateFormatException();
                                }
                            }
                            else{
                                if(dd>29||dd<0){
                                throw new WrongDateFormatException();
                                }
                            }
                            
                        }
                        if(dd>30||dd<0){
                            throw new WrongDateFormatException();
                        }
                    }
                }
                else if(mm>7){
                    int mii=mm%2;
                    if(mii==0){
                        if(dd>31||dd<0){
                            throw new WrongDateFormatException();
                        }
                    }
                    else{
                        if(dd>30||dd<0){
                            throw new WrongDateFormatException();
                        }
                    }
                }
            }

            //FOR RNA SEQUENCE!!!
            String rnaSequence=rnaseq.getText();
            int rnalength=rnaSequence.length();
            int divthree=rnalength%3;

            //MORE EXCEPTIONs!!!
            if(divthree!=0){
                proteinseq.setText(" ");
                throw new WrongCodonAmountException();
            }

            for(int y=0;y<rnalength;y++){
                if(rnaSequence.charAt(y)!='A'&&rnaSequence.charAt(y)!='U'&&rnaSequence.charAt(y)!='C'&&rnaSequence.charAt(y)!='G'){
                    proteinseq.setText(" ");
                    throw new WrongRNAFormatException();
                }
            }

            if(rnalength>30){
                throw new TooLongRNAFormatException();
            }

            int numcodons=rnalength/3;
            String[] codons= new String[10];
            for(int x=0;x<numcodons;x++){
                codons[x]=""+rnaSequence.charAt(x*3)+rnaSequence.charAt(x*3+1)+rnaSequence.charAt(x*3+2);
            }

            String[] proteinsequence=new String[10];
            String finalproteinsequence="";
            for(int y=0;y<numcodons;y++){
                char firstnb=codons[y].charAt(0);
                char secondnb=codons[y].charAt(1);
                char thirdnb=codons[y].charAt(2);
                int firstindex, secondindex, thirdindex;

                //FIRSTLETTERINCODON!!!
                if(firstnb == 'U') {
                    firstindex = 0;
                }
                else if(firstnb == 'C') {
                    firstindex = 1;
                }
                else if(firstnb == 'A') {
                    firstindex = 2;
                }
                else{
                    firstindex = 3;
                }

                //SECONDLETTERINCODON!!!
                if(secondnb == 'U') {
                    secondindex = 0;
                }
                else if(secondnb == 'C') {
                    secondindex = 1;
                }
                else if(secondnb == 'A') {
                    secondindex = 2;
                }
                else{
                    secondindex = 3;
                }

                //THIRDLETTERINCODON!!!
                if(thirdnb == 'U') {
                    thirdindex = 0;
                }
                else if(thirdnb == 'C') {
                    thirdindex = 1;
                }
                else if(thirdnb == 'A') {
                    thirdindex = 2;
                }
                else{
                    thirdindex = 3;
                }

                proteinsequence[y]=wobbletable[firstindex][secondindex][thirdindex];
                if(y==numcodons-1) {
                    finalproteinsequence = finalproteinsequence + proteinsequence[y];
                }
                else {
                    finalproteinsequence = finalproteinsequence + proteinsequence[y] + "-";
                }
            }
            proteinseq.setText(""+finalproteinsequence);

            FileWriter fw  = new FileWriter(file, true);
            fw.write(userEmail+"\t"+month.getText() + "/" + day.getText()+ "/" + year.getText() + "\t" + rnaseq.getText()+"\t" + proteinseq.getText()+"\r\n");

            fw.close();
            JOptionPane.showMessageDialog(this,"You have generated a PROTEIN Sequence");
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        catch (IOException e) {
            e.getMessage();
        }
        catch (WrongDateFormatException e) {
            JOptionPane.showMessageDialog(this,"Please fill in date with the correct format (mm/dd/yy) and refrain from using unecessary values","Notification", JOptionPane.INFORMATION_MESSAGE);
            proteinseq.setText(" ");
        }
        catch (BlankException e) {
            JOptionPane.showMessageDialog(this,"Refrain from leaving blanks.","Notification", JOptionPane.INFORMATION_MESSAGE);
            proteinseq.setText(" ");
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Enter integer quantities for the date","Notification", JOptionPane.INFORMATION_MESSAGE);
            proteinseq.setText(" ");
        }
        catch (WrongCodonAmountException e) {
            proteinseq.setText(" ");
            JOptionPane.showMessageDialog(this,"Do not forget to input complete codons","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (WrongRNAFormatException e) {
            proteinseq.setText(" ");
            JOptionPane.showMessageDialog(this,"Use A,U,C,G nitrogenous bases in capital letters","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (TooLongRNAFormatException e) {
            proteinseq.setText(" ");
            JOptionPane.showMessageDialog(this,"The maximum no. of codons is 10","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_generatorBActionPerformed

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
    private javax.swing.JLabel datelabel;
    private javax.swing.JTextField day;
    private javax.swing.JPanel finalPanel;
    private javax.swing.JButton funButton2;
    private javax.swing.JButton generateButton2;
    private javax.swing.JButton generatorB;
    private javax.swing.JButton historyButton2;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JTextField month;
    private javax.swing.JLabel nameOfGameCard10;
    private javax.swing.JLabel nameOfGameCard11;
    private javax.swing.JLabel nameOfGameCard17;
    private javax.swing.JLabel nameOfGameCard9;
    private javax.swing.JTextField proteinseq;
    private javax.swing.JTextField rnaseq;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables

}
    class WrongDateFormatException extends Exception {
        public WrongDateFormatException() {
        }
    }

    class WrongCodonAmountException extends Exception{
        public WrongCodonAmountException() {      
        }
    }

    class WrongRNAFormatException extends Exception{
        public WrongRNAFormatException() {      
        }
    }

    class TooLongRNAFormatException extends Exception{
        public TooLongRNAFormatException() {      
        }
    }