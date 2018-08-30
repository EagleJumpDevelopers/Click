package com.example.root.click;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FreeGame extends AppCompatActivity implements View.OnClickListener {

    Button bt[], back_bt;

    TextView tv;

    String count_str;

    int a, count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_game);

        tv = findViewById(R.id.textView);

        back_bt = findViewById(R.id.back_free_game_bt);
        back_bt.setOnClickListener(this);

        bt = new Button[58];
        bt[0] = findViewById(R.id.button56);
        bt[1] = findViewById(R.id.button1);
        bt[2] = findViewById(R.id.button2);
        bt[3] = findViewById(R.id.button3);
        bt[4] = findViewById(R.id.button4);
        bt[5] = findViewById(R.id.button5);
        bt[6] = findViewById(R.id.button6);
        bt[7] = findViewById(R.id.button7);
        bt[8] = findViewById(R.id.button8);
        bt[9] = findViewById(R.id.button9);
        bt[10] = findViewById(R.id.button10);
        bt[11] = findViewById(R.id.button11);
        bt[12] = findViewById(R.id.button12);
        bt[13] = findViewById(R.id.button13);
        bt[14] = findViewById(R.id.button14);
        bt[15] = findViewById(R.id.button15);
        bt[16] = findViewById(R.id.button16);
        bt[17] = findViewById(R.id.button17);
        bt[18] = findViewById(R.id.button18);
        bt[19] = findViewById(R.id.button19);
        bt[20] = findViewById(R.id.button20);
        bt[21] = findViewById(R.id.button21);
        bt[22] = findViewById(R.id.button22);
        bt[23] = findViewById(R.id.button23);
        bt[24] = findViewById(R.id.button24);
        bt[25] = findViewById(R.id.button25);
        bt[26] = findViewById(R.id.button26);
        bt[27] = findViewById(R.id.button27);
        bt[28] = findViewById(R.id.button28);
        bt[29] = findViewById(R.id.button29);
        bt[30] = findViewById(R.id.button30);
        bt[31] = findViewById(R.id.button31);
        bt[32] = findViewById(R.id.button32);
        bt[33] = findViewById(R.id.button33);
        bt[34] = findViewById(R.id.button34);
        bt[35] = findViewById(R.id.button35);
        bt[36] = findViewById(R.id.button36);
        bt[37] = findViewById(R.id.button37);
        bt[38] = findViewById(R.id.button38);
        bt[39] = findViewById(R.id.button39);
        bt[40] = findViewById(R.id.button40);
        bt[41] = findViewById(R.id.button41);
        bt[42] = findViewById(R.id.button42);
        bt[43] = findViewById(R.id.button43);
        bt[44] = findViewById(R.id.button44);
        bt[45] = findViewById(R.id.button45);
        bt[46] = findViewById(R.id.button46);
        bt[47] = findViewById(R.id.button47);
        bt[48] = findViewById(R.id.button48);
        bt[49] = findViewById(R.id.button49);
        bt[50] = findViewById(R.id.button50);
        bt[51] = findViewById(R.id.button51);
        bt[52] = findViewById(R.id.button52);
        bt[53] = findViewById(R.id.button53);
        bt[54] = findViewById(R.id.button54);
        bt[55] = findViewById(R.id.button55);


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

        vis();


        count = 0;

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
            case R.id.back_free_game_bt:
                finish();
                break;

            case R.id.button1:
                bt[1].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button2:
                bt[2].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button3:
                bt[3].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button4:
                bt[4].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button5:
                bt[5].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button6:
                bt[6].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button7:
                bt[7].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button8:
                bt[8].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button41:
                bt[41].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button9:
                bt[9].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button10:
                bt[10].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button11:
                bt[11].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button12:
                bt[12].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button13:
                bt[13].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button14:
                bt[14].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button15:
                bt[15].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button16:
                bt[16].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button17:
                bt[17].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button19:
                bt[19].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button18:
                bt[18].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button20:
                bt[20].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button21:
                bt[21].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button22:
                bt[22].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button23:
                bt[23].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button24:
                bt[24].setVisibility(View.INVISIBLE);
                vis();
                break;
            case R.id.button25:
                bt[25].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button26:
                bt[26].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button27:
                bt[27].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button28:
                bt[28].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button29:
                bt[29].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button30:
                bt[30].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button31:
                bt[31].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button32:
                bt[32].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button33:
                bt[33].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button34:
                bt[34].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button35:
                bt[35].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button36:
                bt[36].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button37:
                bt[37].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button38:
                bt[38].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button39:
                bt[39].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button40:
                bt[40].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button42:
                bt[42].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button43:
                bt[43].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button44:
                bt[44].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button45:
                bt[45].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button46:
                bt[46].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button47:
                bt[47].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button48:
                bt[48].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button49:
                bt[49].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button50:
                bt[50].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button51:
                bt[51].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button52:
                bt[52].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button53:
                bt[53].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button54:
                bt[54].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button55:
                bt[55].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;

            case R.id.button56:
                bt[0].setVisibility(View.INVISIBLE);
                vis();
                setCount();
                break;


            default:
                break;
        }
    }
}
