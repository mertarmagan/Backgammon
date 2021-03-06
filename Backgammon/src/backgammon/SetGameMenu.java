
package backgammon;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SetGameMenu extends javax.swing.JPanel {

    private JPanel mainPanel;
    private JFrame mainFrame;
    
    GamePanel gamePanel;
    private boolean selectR5;
    private boolean selectR3;
    private boolean selectR1;
    private int totalRound;

    public SetGameMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerIDLabel = new javax.swing.JLabel();
        playerIDTextField = new javax.swing.JTextField();
        round1Btn = new javax.swing.JButton();
        round3Btn = new javax.swing.JButton();
        round5Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        playerIDLabel1 = new javax.swing.JLabel();
        playerIDTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        colorPlayer1 = new javax.swing.JComboBox<>();
        colorPlayer2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(248, 255, 184));

        playerIDLabel.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        playerIDLabel.setText("Player1 ID:");

        playerIDTextField.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        playerIDTextField.setForeground(new java.awt.Color(103, 125, 250));
        playerIDTextField.setText("Player1");
        playerIDTextField.setToolTipText("");
        playerIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerIDTextFieldActionPerformed(evt);
            }
        });

        round1Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        round1Btn.setText("1");
        round1Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        round1Btn.setFocusPainted(false);
        round1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                round1BtnActionPerformed(evt);
            }
        });

        round3Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        round3Btn.setText("3");
        round3Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        round3Btn.setFocusPainted(false);
        round3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                round3BtnActionPerformed(evt);
            }
        });

        round5Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        round5Btn.setText("5");
        round5Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        round5Btn.setFocusPainted(false);
        round5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                round5BtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setText("Round Number:");

        playButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        playButton.setText("PLAY!");
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.setFocusPainted(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        playerIDLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        playerIDLabel1.setText("Player2 ID:");

        playerIDTextField1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        playerIDTextField1.setForeground(new java.awt.Color(103, 125, 250));
        playerIDTextField1.setText("Player2");
        playerIDTextField1.setToolTipText("");
        playerIDTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerIDTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel2.setText("Checker Color:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel3.setText("Checker Color:");

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        colorPlayer1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        colorPlayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WHITE", "BLUE" }));

        colorPlayer2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        colorPlayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "RED" }));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Lithos Pro Regular", 0, 50)); // NOI18N
        jLabel4.setText("GAME SETUP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(back)
                        .addGap(318, 318, 318)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(round1Btn)
                        .addGap(18, 18, 18)
                        .addComponent(round3Btn)
                        .addGap(18, 18, 18)
                        .addComponent(round5Btn)))
                .addContainerGap(383, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(playButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(playerIDLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(playerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(colorPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerIDLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(playerIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(colorPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(jLabel4))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerIDLabel)
                    .addComponent(playerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerIDLabel1)
                    .addComponent(playerIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(colorPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(round1Btn)
                    .addComponent(round3Btn)
                    .addComponent(round5Btn)
                    .addComponent(jLabel1))
                .addGap(53, 53, 53)
                .addComponent(playButton)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void playerIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerIDTextFieldActionPerformed
        
    }//GEN-LAST:event_playerIDTextFieldActionPerformed

    private void playerIDTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerIDTextField1ActionPerformed
        
    }//GEN-LAST:event_playerIDTextField1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        mainFrame.setContentPane(mainPanel);      
        mainFrame.invalidate();
        mainFrame.validate();
    }//GEN-LAST:event_backActionPerformed

    private void round1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_round1BtnActionPerformed
           
        selectR1 = true;
        selectR3 = false;
        selectR5 = false;
        
        round1Btn.setEnabled(false);
        round3Btn.setEnabled(true);
        round5Btn.setEnabled(true);
    }//GEN-LAST:event_round1BtnActionPerformed

    private void round3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_round3BtnActionPerformed

        selectR1 = false;
        selectR3 = true;
        selectR5 = false;
        
        round1Btn.setEnabled(true);
        round3Btn.setEnabled(false);
        round5Btn.setEnabled(true);
    }//GEN-LAST:event_round3BtnActionPerformed

    private void round5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_round5BtnActionPerformed

        selectR1 = false;
        selectR3 = false;
        selectR5 = true;
        
        round1Btn.setEnabled(true);
        round3Btn.setEnabled(true);
        round5Btn.setEnabled(false);
    }//GEN-LAST:event_round5BtnActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        totalRound = getRound();
        
        String playerID1 = playerIDTextField.getText();
        String playerID2 = playerIDTextField1.getText();    
        
        gamePanel = new GamePanel(this);
        
        gamePanel.setPlayerNames(playerID1, playerID2);
        
        //gamePanel.updateCurrentRound(round);
        
        
        gamePanel.setMainMenu(mainPanel);
        gamePanel.setMainFrame(mainFrame);
        
        mainFrame.setContentPane(gamePanel);
        mainFrame.setSize(new Dimension(1280,1000));
        mainFrame.invalidate();
        mainFrame.validate();
        
    }//GEN-LAST:event_playButtonActionPerformed
    
    public void setMainMenu(JPanel mainPanel){      
       this.mainPanel =  mainPanel;
    }
    
    public void setMainFrame(JFrame mainFrame){
        this.mainFrame = mainFrame;
    }
    
    public int getRound(){      
        if(selectR1)
            return 1;
        else if(selectR3)
            return 3;
        else if(selectR5)
            return 5;
        else
            return 0;
    }
    
    public int getTotalRound(){
        return totalRound;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> colorPlayer1;
    private javax.swing.JComboBox<String> colorPlayer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel playerIDLabel;
    private javax.swing.JLabel playerIDLabel1;
    private javax.swing.JTextField playerIDTextField;
    private javax.swing.JTextField playerIDTextField1;
    private javax.swing.JButton round1Btn;
    private javax.swing.JButton round3Btn;
    private javax.swing.JButton round5Btn;
    // End of variables declaration//GEN-END:variables
}
