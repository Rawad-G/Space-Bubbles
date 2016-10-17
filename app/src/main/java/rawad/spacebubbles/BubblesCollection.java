package rawad.spacebubbles;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class BubblesCollection {
    private RelativeLayout gameLinearLayout;
    private ArrayList<Bubble> bubbles;
    private int width;
    private int height;
    Activity gameBoard;

    public BubblesCollection(RelativeLayout gameLinearLayout, int width, int height, Activity gameBoard){
        this.gameLinearLayout = gameLinearLayout;
        this.bubbles = new ArrayList<Bubble>();
        this.width = width;
        this.height = height;
        this.gameBoard = gameBoard;
    }

    public void addBubble(){
        Bubble newBubble = new Bubble(gameLinearLayout, width, height, this.gameBoard);
        this.bubbles.add(newBubble);
    }

    public void updateBubbles(){
        for(Bubble bubble: this.bubbles){
            bubble.updateBubble();
        }
    }
}
