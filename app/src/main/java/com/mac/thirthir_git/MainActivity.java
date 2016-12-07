package com.mac.thirthir_git;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {


    String[] REMIND_TIME;
    int REMIND_COUNT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //onCreate內才可以初始化
        REMIND_TIME = new String[]{"9:00","12:00","18:00"};
        REMIND_COUNT = REMIND_TIME.length;

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
        LinearLayout subLayout = new LinearLayout(this);
        subLayout.setOrientation(LinearLayout.VERTICAL);
        RelativeLayout.LayoutParams para = new RelativeLayout.LayoutParams(10,10);
        para.rightMargin = 5;
        para.addRule(RelativeLayout.CENTER_VERTICAL, -1);  //對父控件的位置置中
        RelativeLayout.LayoutParams para02 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        for(int i=1; i<=REMIND_COUNT; i++){
            LinearLayout listLayout = new LinearLayout(this);
            listLayout.setOrientation(LinearLayout.HORIZONTAL);

            TextView tv = new TextView(this);
            String i2 = ""+i;
            tv.setText(i2);
            tv.setTextSize(8);
            tv.setBackgroundResource(R.drawable.whitecircle_bg);
            listLayout.addView(tv,para);

            TextView tv02 = new TextView(this);
            tv02.setText(REMIND_TIME[i-1]);
            tv02.setTextSize(12);
            listLayout.addView(tv02,para02);

        }

    }

    private void setInsistanceContent() {
    }
}
