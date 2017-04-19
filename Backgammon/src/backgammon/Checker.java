
package backgammon;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Checker extends GameObject{
    
    private Icon image;
    private JLabel lblIcon;
    private Colors colorID;
    private boolean hitFlag;
    private boolean bearOffFlag;
    public final int diameter = 50;
    public int num;   
    
    public Checker(){
        super();
        num = 5;       
    }
    
    public Checker(int x, int y){
        positionX = x;
        positionY = y;
        
        //this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkerBlack.jpg")));
    }
    
    public Colors getColorID(){
        return colorID;
    }
    
    public void setColorID(Colors colorID){
        this.colorID = colorID;
    }
    
    public boolean getHitFlag(){
        return hitFlag;
    }
    
    public void setHitFlag(boolean hitFlag){
        this.hitFlag = hitFlag;
    }
    
    public boolean getBearOffFlag(){
        return bearOffFlag;
    }
    
    public void setBearOffFlag(boolean bearOffFlag){
        this.bearOffFlag = bearOffFlag;
    }
}
