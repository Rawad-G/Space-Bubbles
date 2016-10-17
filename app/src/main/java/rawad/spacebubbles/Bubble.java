package rawad.spacebubbles;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;

public class Bubble {
    private LinearLayout gameLinearLayout;
    private int xCordinate;
    private int yCordinate;
    private Activity gameBoard;

    private CustomDrawableView myCustomDrawableView;

    public Bubble(RelativeLayout gameLinearLayout, int width, int height, Activity gameBoard){
        this.gameBoard = gameBoard;
        Random random = new Random();
        int x = random.nextInt(width);

        myCustomDrawableView = new CustomDrawableView(this.gameBoard, 10, 10);
        gameLinearLayout.addView(myCustomDrawableView);
    }

    public void updateBubble(){
        this.myCustomDrawableView.setY(this.myCustomDrawableView.getY() + 10);
    }
}
