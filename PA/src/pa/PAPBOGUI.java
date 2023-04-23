package pa;

import java.awt.Color;
import java.util.ArrayList;

public class PAPBOGUI {
    public static ArrayList<Goal> ListGoal = new ArrayList<Goal>();   
    static Goal gl = new Goal("tes", 2123, "1", "tes", "goal", "tes", 0);
    static GoalGUI gg = new GoalGUI();
    public static void main(String[] args) {
        ListGoal.add(gl);
        gl = new Goal("tes2", 2123, "2", "2", "goal2", "te2s", 0);
        ListGoal.add(gl);
        gl = new Goal("tes3", 2123, "3", "3", "goal3", "te3s", 0);
        ListGoal.add(gl);
        gg.tampil();
        
        gg.setVisible(true);
        //new Tes();
    }
    
}
