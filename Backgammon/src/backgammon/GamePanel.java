
package backgammon;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author mertarmagan
 */
public class GamePanel extends JPanel {
   
    private BufferedImage imageBoard;
    private final int WIDTH = 1000;
    private final int HEIGHT = 800;
    
    private ArrayList<Slot> slotSet1;
    private ArrayList<Slot> slotSet2;
    private ArrayList<Slot> slotSet3;
    private ArrayList<Slot> slotSet4;
    private CheckerSet ch1;
    public  Checker chc;

    public GamePanel() {
        try {
           imageBoard = ImageIO.read(getClass().getResource("/images/board.jpg"));
       } catch (IOException e) {
           System.out.println("file error");
       }
        initComponents();
    }
    
    
    public void initSlots(){
        
        int slotWidth = 56;
        int slotHeight = 320;
        int slot1X = 578;
        int slot1Y = 30;
        
        slotSet1 = new ArrayList<Slot>(6);
        slotSet2 = new ArrayList<Slot>(6);
        slotSet3 = new ArrayList<Slot>(6);
        slotSet4 = new ArrayList<Slot>(6);
        
        for(int i = 0; i<6; i++){
            
            slotSet1.add(i, new Slot(slot1X + (i * 57), 30, slotWidth, slotHeight));
            slotSet1.get(i).setOpaque(true);
            slotSet1.get(i).setBounds(slot1X + (i * 57), 30, slotWidth, slotHeight);
            lp.add(slotSet1.get(i), new Integer(0),0);
                     
        }
         
    }
    
    public void initCheckers(){
        
        for(int i=0;i<6;i++){
            
            for(int j=0;j<9;j++){
                slotSet1.get(i).addChecker(new Checker());
            }
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lp = new JLayeredPane();

        setPreferredSize(new java.awt.Dimension(1500, 1000));

        lp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lp.setMaximumSize(new java.awt.Dimension(1024, 804));
        lp.setMinimumSize(new java.awt.Dimension(1024, 804));
        initSlots();
        initCheckers();

        //lp.add(b.getCheckerSet1().getChecker(0),new Integer(2), 0);

        javax.swing.GroupLayout lpLayout = new javax.swing.GroupLayout(lp);
        lp.setLayout(lpLayout);
        lpLayout.setHorizontalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        lpLayout.setVerticalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void paintComponent(Graphics g){
        
        g.drawImage(imageBoard,0,0,null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane lp;
    // End of variables declaration//GEN-END:variables
}