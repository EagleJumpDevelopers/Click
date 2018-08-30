package com.example.root.click;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OneMinuteGame extends AppCompatActivity implements View.OnClickListener {

    Button bt[], back_bt;

    TextView tv, time_tv;

    String count_str, time_str;

    int a, count, time_int, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_minute_game);
        tv = findViewById(R.id.one_minute_game_count_tv);
        time_tv = findViewById(R.id.time_one_minute_game_tv);

        back_bt = findViewById(R.id.back_one_minute_game_bt);
        back_bt.setOnClickListener(this);

        bt = new Button[58];
        bt[0] = findViewById(R.id.button58);
        bt[1] = findViewById(R.id.button59);
        bt[2] = findViewById(R.id.button60);
        bt[3] = findViewById(R.id.button61);
        bt[4] = findViewById(R.id.button62);
        bt[5] = findViewById(R.id.button63);
        bt[6] = findViewById(R.id.button64);
        bt[7] = findViewById(R.id.button65);
        bt[8] = findViewById(R.id.button66);
        bt[9] = findViewById(R.id.button67);
        bt[10] = findViewById(R.id.button68);
        bt[11] = findViewById(R.id.button69);
        bt[12] = findViewById(R.id.button70);
        bt[13] = findViewById(R.id.button71);
        bt[14] = findViewById(R.id.button72);
        bt[15] = findViewById(R.id.button73);
        bt[16] = findViewById(R.id.button74);
        bt[17] = findViewById(R.id.button75);
        bt[18] = findViewById(R.id.button76);
        bt[19] = findViewById(R.id.button77);
        bt[20] = findViewById(R.id.button78);
        bt[21] = findViewById(R.id.button79);
        bt[22] = findViewById(R.id.button80);
        bt[23] = findViewById(R.id.button81);
        bt[24] = findViewById(R.id.button82);
        bt[25] = findViewById(R.id.button83);
        bt[26] = findViewById(R.id.button84);
        bt[27] = findViewById(R.id.button85);
        bt[28] = findViewById(R.id.button86);
        bt[29] = findViewById(R.id.button87);
        bt[30] = findViewById(R.id.button88);
        bt[31] = findViewById(R.id.button89);
        bt[32] = findViewById(R.id.button90);
        bt[33] = findViewById(R.id.button91);
        bt[34] = findViewById(R.id.button92);
        bt[35] = findViewById(R.id.button93);
        bt[36] = findViewById(R.id.button94);
        bt[37] = findViewById(R.id.button95);
        bt[38] = findViewById(R.id.button96);
        bt[39] = findViewById(R.id.button97);
        bt[40] = findViewById(R.id.button98);
        bt[41] = findViewById(R.id.button99);
        bt[42] = findViewById(R.id.button100);
        bt[43] = findViewById(R.id.button101);
        bt[44] = findViewById(R.id.button102);
        bt[45] = findViewById(R.id.button103);
        bt[46] = findViewById(R.id.button104);
        bt[47] = findViewById(R.id.button105);
        bt[48] = findViewById(R.id.button106);
        bt[49] = findViewById(R.id.button107);
        bt[50] = findViewById(R.id.button108);
        bt[51] = findViewById(R.id.button109);
        bt[52] = findViewById(R.id.button110);
        bt[53] = findViewById(R.id.button111);
        bt[54] = findViewById(R.id.button112);
        bt[55] = findViewById(R.id.button57);


        //////////////////////////////////////////
        bt[0].setVisibility(View.INVISIBLE);
        bt[1].setVisibility(View.INVISIBLE);
        bt[2].setVisibility(View.INVISIBLE);
        bt[3].setVisibility(View.INVISIBLE);
        bt[4].setVisibility(View.INVISIBLE);
        bt[5].setVisibility(View.INVISIBLE);
        bt[6].setVisibility(View.INVISIBLE);
        bt[7].setVisibility(View.INVISIBLE);
        bt[8].setVisibility(View.INVISIBLE);
        bt[9].setVisibility(View.INVISIBLE);
        bt[10].setVisibility(View.INVISIBLE);
        bt[11].setVisibility(View.INVISIBLE);
        bt[12].setVisibility(View.INVISIBLE);
        bt[13].setVisibility(View.INVISIBLE);
        bt[14].setVisibility(View.INVISIBLE);
        bt[15].setVisibility(View.INVISIBLE);
        bt[16].setVisibility(View.INVISIBLE);
        bt[17].setVisibility(View.INVISIBLE);
        bt[18].setVisibility(View.INVISIBLE);
        bt[19].setVisibility(View.INVISIBLE);
        bt[20].setVisibility(View.INVISIBLE);
        bt[21].setVisibility(View.INVISIBLE);
        bt[22].setVisibility(View.INVISIBLE);
        bt[23].setVisibility(View.INVISIBLE);
        bt[24].setVisibility(View.INVISIBLE);
        bt[25].setVisibility(View.INVISIBLE);
        bt[26].setVisibility(View.INVISIBLE);
        bt[27].setVisibility(View.INVISIBLE);
        bt[28].setVisibility(View.INVISIBLE);
        bt[29].setVisibility(View.INVISIBLE);
        bt[30].setVisibility(View.INVISIBLE);
        bt[31].setVisibility(View.INVISIBLE);
        bt[32].setVisibility(View.INVISIBLE);
        bt[33].setVisibility(View.INVISIBLE);
        bt[34].setVisibility(View.INVISIBLE);
        bt[35].setVisibility(View.INVISIBLE);
        bt[36].setVisibility(View.INVISIBLE);
        bt[37].setVisibility(View.INVISIBLE);
        bt[38].setVisibility(View.INVISIBLE);
        bt[39].setVisibility(View.INVISIBLE);
        bt[40].setVisibility(View.INVISIBLE);
        bt[41].setVisibility(View.INVISIBLE);
        bt[42].setVisibility(View.INVISIBLE);
        bt[43].setVisibility(View.INVISIBLE);
        bt[44].setVisibility(View.INVISIBLE);
        bt[45].setVisibility(View.INVISIBLE);
        bt[46].setVisibility(View.INVISIBLE);
        bt[47].setVisibility(View.INVISIBLE);
        bt[48].setVisibility(View.INVISIBLE);
        bt[49].setVisibility(View.INVISIBLE);
        bt[50].setVisibility(View.INVISIBLE);
        bt[51].setVisibility(View.INVISIBLE);
        bt[52].setVisibility(View.INVISIBLE);
        bt[53].setVisibility(View.INVISIBLE);
        bt[54].setVisibility(View.INVISIBLE);
        bt[55].setVisibility(View.INVISIBLE);

        bt[0].setOnClickListener(this);
        bt[1].setOnClickListener(this);
        bt[2].setOnClickListener(this);
        bt[3].setOnClickListener(this);
        bt[4].setOnClickListener(this);
        bt[5].setOnClickListener(this);
        bt[6].setOnClickListener(this);
        bt[7].setOnClickListener(this);
        bt[8].setOnClickListener(this);
        bt[9].setOnClickListener(this);
        bt[10].setOnClickListener(this);
        bt[11].setOnClickListener(this);
        bt[12].setOnClickListener(this);
        bt[13].setOnClickListener(this);
        bt[14].setOnClickListener(this);
        bt[15].setOnClickListener(this);
        bt[16].setOnClickListener(this);
        bt[17].setOnClickListener(this);
        bt[18].setOnClickListener(this);
        bt[19].setOnClickListener(this);
        bt[20].setOnClickListener(this);
        bt[21].setOnClickListener(this);
        bt[22].setOnClickListener(this);
        bt[23].setOnClickListener(this);
        bt[24].setOnClickListener(this);
        bt[25].setOnClickListener(this);
        bt[26].setOnClickListener(this);
        bt[27].setOnClickListener(this);
        bt[28].setOnClickListener(this);
        bt[29].setOnClickListener(this);
        bt[30].setOnClickListener(this);
        bt[31].setOnClickListener(this);
        bt[32].setOnClickListener(this);
        bt[33].setOnClickListener(this);
        bt[34].setOnClickListener(this);
        bt[35].setOnClickListener(this);
        bt[36].setOnClickListener(this);
        bt[37].setOnClickListener(this);
        bt[38].setOnClickListener(this);
        bt[39].setOnClickListener(this);
        bt[40].setOnClickListener(this);
        bt[41].setOnClickListener(this);
        bt[42].setOnClickListener(this);
        bt[43].setOnClickListener(this);
        bt[44].setOnClickListener(this);
        bt[45].setOnClickListener(this);
        bt[46].setOnClickListener(this);
        bt[47].setOnClickListener(this);
        bt[48].setOnClickListener(this);
        bt[49].setOnClickListener(this);
        bt[50].setOnClickListener(this);
        bt[51].setOnClickListener(this);
        bt[52].setOnClickListener(this);
        bt[53].setOnClickListener(this);
        bt[54].setOnClickListener(this);
        bt[55].setOnClickListener(this);

        time_int = 0;
        time_str= String.valueOf(time_int);
        time_tv.setText(time_str);
        startTime();
        vis();


        count = 0;
        count_str = String.valueOf(count);
        tv.setText(count_str);

    }

    private void startTime(){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    time_int++;
                    time_str= String.valueOf(time_int);
                    time_tv.setText(time_str+ "sec");
                    startTime();
                    if(time_int==60){
                        time_tv.setVisibility(View.INVISIBLE);
                        bt[a].setVisibility(View.INVISIBLE);
                    }
                }
            }, 1000);
    }

    private void setCount() {
        count++;
        count_str = String.valueOf(count);
        tv.setText(count_str);
    }

    public void vis() {
        a = (int) (Math.random() * 56);
        bt[a].setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_one_minute_game_bt:
                finish();
                break;

            case R.id.button57:
                bt[55].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button58:
                bt[0].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button59:
                bt[1].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button60:
                bt[2].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button61:
                bt[3].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button62:
                bt[4].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button63:
                bt[5].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button64:
                bt[6].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button65:
                bt[7].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button66:
                bt[8].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button67:
                bt[9].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button68:
                bt[10].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button69:
                bt[11].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button70:
                bt[12].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button71:
                bt[13].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button72:
                bt[14].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button73:
                bt[15].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button74:
                bt[16].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button75:
                bt[17].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button76:
                bt[18].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button77:
                bt[19].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button78:
                bt[20].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button79:
                bt[21].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button80:
                bt[22].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button81:
                bt[23].setVisibility(View.INVISIBLE);
                vis();
                break;
            case R.id.button82:
                bt[24].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button83:
                bt[25].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button84:
                bt[26].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button85:
                bt[27].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button86:
                bt[28].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button87:
                bt[29].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button88:
                bt[30].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button89:
                bt[31].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button90:
                bt[32].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button91:
                bt[33].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button92:
                bt[34].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button93:
                bt[35].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button94:
                bt[36].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button95:
                bt[37].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button96:
                bt[38].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button97:
                bt[39].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button98:
                bt[40].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button99:
                bt[41].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button100:
                bt[42].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button101:
                bt[43].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button102:
                bt[44].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button103:
                bt[45].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button104:
                bt[46].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button105:
                bt[47].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button106:
                bt[48].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button107:
                bt[49].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button108:
                bt[50].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button109:
                bt[51].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button110:
                bt[52].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button111:
                bt[53].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button112:
                bt[54].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;


            default:
                break;
        }
    }
}
