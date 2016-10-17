package rawad.spacebubbles;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.RelativeLayout;

public class Game extends Activity {
    private int height;
    private int width;
    private RelativeLayout gameLinearLayout;
    BubblesCollection collection;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        this.gameLinearLayout = (RelativeLayout ) findViewById(R.id.gameView);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        this.height = displaymetrics.heightPixels;
        this.width = displaymetrics.widthPixels;
        this.collection = new BubblesCollection(gameLinearLayout, this.width, this.height, this);

        gameEngine();
        bubblesAdder();

    }

    public void alertText(String text) {
        AlertDialog alertDialog = new AlertDialog.Builder(Game.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(text);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public void gameEngine(){
        final Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                collection.updateBubbles();
                h.postDelayed(this, 1000);
            }
        }, 1000);
    }
    public void bubblesAdder(){
        final Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                collection.addBubble();
                h.postDelayed(this, 5000);
            }
        }, 5000);
    }
}
