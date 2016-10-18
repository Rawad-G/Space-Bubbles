package rawad.spacebubbles;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.Random;

public class Bubble {
    private RelativeLayout gameLinearLayout;
    private int xCordinate;
    private int yCordinate;
    private Activity gameBoard;

    private CustomDrawableView myCustomDrawableView;

    public Bubble(RelativeLayout gameLinearLayout, int width, int height, Activity gameBoard){
        this.gameLinearLayout = gameLinearLayout;
        this.gameBoard = gameBoard;
        Random random = new Random();
        this.xCordinate = random.nextInt(width - 50);
        this.yCordinate = 10;

        myCustomDrawableView = new CustomDrawableView(this.gameBoard, xCordinate, yCordinate);
        myCustomDrawableView.setBackgroundColor(3);

        gameLinearLayout.addView(myCustomDrawableView);
    }

    public void updateBubble(){
        this.myCustomDrawableView.setY(this.myCustomDrawableView.getY() + 10);
    }
}
