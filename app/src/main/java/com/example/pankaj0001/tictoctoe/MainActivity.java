package com.example.pankaj0001.tictoctoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//1=cross 0=o
    int activeP = 1;
    //default values for trigger=2
    //if trigger has value 8 then cross tapped and if trigger has 9 then o
    int[] trigger = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    public void dropin(View view) {
        ImageView i = (ImageView) view;







//tag from image view to use as index for storing values


        int tapped = Integer.parseInt(i.getTag().toString());





        if (trigger[tapped] == 2) {
            i.setTranslationX(-1000f);

            if (activeP == 1) {
                i.setImageResource(R.drawable.cross);
                activeP = 0;
                trigger[tapped]=8;
            } else if (activeP == 0) {
                i.setImageResource(R.drawable.o);
                activeP = 1;
                trigger[tapped]=9;

            }


            i.animate().translationXBy(1000f).rotation(360f).setDuration(300);
            if((trigger[0]==8&&trigger[4]==8&&trigger[8]==8)
                    ||(trigger[2]==8&&trigger[4]==8&&trigger[6]==8)
                    ||(trigger[3]==8&&trigger[8]==8&&trigger[5]==8)
                    ||(trigger[1]==8&&trigger[4]==8&&trigger[7]==8)
                    ||(trigger[0]==8&&trigger[3]==8&&trigger[6]==8)
                    ||(trigger[2]==8&&trigger[5]==8&&trigger[8]==8)
                    ||(trigger[0]==8&&trigger[1]==8&&trigger[2]==8)
                    ||(trigger[3]==8&&trigger[4]==8&&trigger[5]==8)
                    ||(trigger[6]==8&&trigger[7]==8&&trigger[8]==8)
            )
            {

                Log.d("haha",trigger[0]+"");
                Toast toast = Toast.makeText(getApplicationContext(),"player 1 wins",Toast.LENGTH_LONG);
                toast.show();
                // System.out.println(trigger[0]+trigger[4]+trigger[8]);

            }
            else if((trigger[0]==9&&trigger[4]==9&&trigger[8]==9)
                    ||(trigger[2]==9&&trigger[4]==9&&trigger[6]==9)
                    ||(trigger[3]==9&&trigger[8]==9&&trigger[5]==9)
                    ||(trigger[1]==9&&trigger[4]==9&&trigger[7]==9)
                    ||(trigger[0]==9&&trigger[3]==9&&trigger[6]==9)
                    ||(trigger[2]==9&&trigger[5]==9&&trigger[8]==9)
                    ||(trigger[0]==9&&trigger[1]==9&&trigger[2]==9)
                    ||(trigger[3]==9&&trigger[4]==9&&trigger[5]==9)
                    ||(trigger[6]==9&&trigger[7]==9&&trigger[8]==9)
            )
            {

                Log.d("haha",trigger[0]+"");
                Toast toast = Toast.makeText(getApplicationContext(),"player 2 wins",Toast.LENGTH_LONG);
                toast.show();
                // System.out.println(trigger[0]+trigger[4]+trigger[8]);

            }

        }
        else
        {
            Toast  toast=Toast.makeText(getApplicationContext(),"invalid action",Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}