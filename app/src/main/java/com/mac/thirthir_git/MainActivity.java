package com.mac.thirthir_git;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    int REMIND_COUNT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(REMIND_COUNT != 0){
            setRemindContent();
        }
        if(REMIND_COUNT != 0){
            setInsistanceContent();
        }

    }

    private void setRemindContent() {

        RelativeLayout rl_remind_content = (RelativeLayout)findViewById(R.id.rl_remind_content);
        TextView tv_remind_stm = (TextView)findViewById(R.id.tv_remind_stm);
        tv_remind_stm.setText("");
        LinearLayout sublayout = new LinearLayout(this);
        sublayout.setOrientation(LinearLayout.VERTICAL);
        for(int i=1; i<=REMIND_COUNT; i++){
           TextView tv = new TextView(this);
            String i2 = ""+i;
            tv.setText(i2);
            tv.setTextSize(8);
            tv.setBackgroundResource(R.drawable.whitecircle_bg);
            TextView tv2;
        }

    }

    private void setInsistanceContent() {
    }
}
