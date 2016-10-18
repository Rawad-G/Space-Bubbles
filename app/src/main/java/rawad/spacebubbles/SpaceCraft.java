package rawad.spacebubbles;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SpaceCraft {

    private RelativeLayout gameLinearLayout;
    private Activity gameBoard;
    private ImageView spaceCraft;

    public SpaceCraft(RelativeLayout gameLinearLayout, int width, Activity gameBoard){
        this.gameLinearLayout = gameLinearLayout;
        this.gameBoard = gameBoard;

        spaceCraft = new ImageView(this.gameBoard);
        spaceCraft.setBackgroundResource(R.drawable.craft2);
        spaceCraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        spaceCraft.setX(spaceCraft.getX() - width + 100);
        spaceCraft.setY(650);
        spaceCraft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    if(event.getY() < -200){

                    }
                    else {
                        spaceCraft.setX(spaceCraft.getX() + event.getX());
                    }
                }
                return true;
            }
        });
        this.gameLinearLayout.addView(spaceCraft);
    }
}
