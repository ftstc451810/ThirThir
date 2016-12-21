package com.mac.thirthir_git;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

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
            //其實不用動態添加，位置太難找(para難設定大小跟相對位置，單位不同)，直接判斷是否有提醒跟記錄設定然後載入不同的layout，再找到控件改變text的內容
            //只四似乎要多寫三個，因為有兩個部分可以改變設置> 改變設計，設置後變為兩個按鈕，只剩更改，再到下一步改變設置或是取消
        }
        if(REMIND_COUNT != 0) {
            setInsistanceContent();
            //text部分改為
        }

    }

    private void setRemindContent() {
        TextView tv_remind_stm = (TextView)findViewById(R.id.tv_remind_stm);
        tv_remind_stm.setVisibility(View.INVISIBLE);
        RelativeLayout rl_remind_already = (RelativeLayout)findViewById(R.id.rl_remind_already);
        rl_remind_already.setVisibility(View.VISIBLE);
        ArrayList array = new ArrayList();
        TextView tv_upper = (TextView)findViewById(R.id.tv_upper);
        TextView tv_set01 = (TextView)findViewById(R.id.tv_set01);
        TextView tv_middle = (TextView)findViewById(R.id.tv_middle);
        TextView tv_set02 = (TextView)findViewById(R.id.tv_set02);
        TextView tv_below = (TextView)findViewById(R.id.tv_below);
        TextView tv_set03 = (TextView)findViewById(R.id.tv_set03);
        //將控件放入序列方便設定
        array.add(tv_upper);
        array.add(tv_set01);
        array.add(tv_middle);
        array.add(tv_set02);
        array.add(tv_below);
        array.add(tv_set03);

        if(REMIND_COUNT == 1){
            //array.get(0)  //只能取值


        }
//        RelativeLayout rl_remind_content = (RelativeLayout)findViewById(R.id.rl_remind_content);
//        TextView tv_remind_stm = (TextView)findViewById(R.id.tv_remind_stm);
//        tv_remind_stm.setText("");
//
//        TextView tv_remind_setbtn = (TextView)findViewById(R.id.tv_remind_setbtn);
//        tv_remind_setbtn.setVisibility(View.GONE);
//
//        TextView tv_remind_stopbtn = new TextView(this);
//        tv_remind_stopbtn.setText(getResources().getString(R.string.stop));
//        tv_remind_stopbtn.setBackgroundResource(R.drawable.bluecircle_bg);
//        tv_remind_stopbtn.setTextSize(25);
////        tv_remind_stopbtn.setScaleX(1);  //胖瘦效果不對
////        tv_remind_stopbtn.setScaleY(2);
//        RelativeLayout.LayoutParams para04 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        //RelativeLayout.LayoutParams para04 = new RelativeLayout.LayoutParams(400,400);
//        para04.topMargin = 400;
//        para04.leftMargin = 450;
//        rl_remind_content.addView(tv_remind_stopbtn,para04);
//
//        TextView tv_remind_changebtn = new TextView(this);
//        tv_remind_changebtn.setText(getResources().getString(R.string.change));
//        tv_remind_changebtn.setTextSize(25);
//        tv_remind_changebtn.setBackgroundResource(R.drawable.bluecircle_bg);
//        RelativeLayout.LayoutParams para05 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        para05.topMargin = 400;
//        para05.leftMargin = 700;
//        rl_remind_content.addView(tv_remind_changebtn,para05);
//
//        LinearLayout subLayout = new LinearLayout(this);
//        subLayout.setOrientation(LinearLayout.VERTICAL);
//        RelativeLayout.LayoutParams para = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        para.rightMargin = 10;  //para 給數字圖標用
//        para.addRule(RelativeLayout.CENTER_VERTICAL, -1);  //對父控件的位置置中
//        RelativeLayout.LayoutParams para02 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);  //para02 給數字右邊的時間用
//        RelativeLayout.LayoutParams para03 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);  //para03給新生成的sublayout用
//        para03.leftMargin = 400;
//        para03.topMargin = 60;
//
//
//        for(int i=1; i<=REMIND_COUNT; i++){
//            LinearLayout listLayout = new LinearLayout(this);
//            listLayout.setOrientation(LinearLayout.HORIZONTAL);
//
//            TextView tv = new TextView(this);
//            String i2 = ""+i;
//            tv.setText(i2);
//            tv.setTextSize(14);
//            tv.setBackgroundResource(R.drawable.whitecircle_bg);
//            listLayout.addView(tv,para);
//
//            TextView tv02 = new TextView(this);
//            tv02.setText(REMIND_TIME[i-1]);
//            tv02.setTextSize(20);
//            listLayout.addView(tv02,para02);
//
//            subLayout.addView(listLayout);
//        }
//
//        rl_remind_content.addView(subLayout,para03);

    }

    private void setInsistanceContent() {
    }
}
