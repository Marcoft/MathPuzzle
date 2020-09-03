package com.puzzle.mathpuzzle.Campaign.CampaignMath.Buttons;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.puzzle.mathpuzzle.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ButtonsCampaign extends AppCompatActivity{
    Random r1;
    Random r2;


    Toast toast;
    int x;
    Random colorrs;

    @BindView(R.id.money) TextView Money_text;
    @BindView(R.id.textFind) TextView textFind;
    @BindView(R.id.textLvls) TextView textLvls;
    @BindView(R.id.edt1) EditText edt1;
    @BindView(R.id.edt2) EditText edt2;
    @BindView(R.id.edt3) EditText edt3;
    @BindView(R.id.edt4) EditText edt4;


    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;

    @BindView(R.id.progress) ProgressBar progressBar;

    String dictionary[] = {
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    @BindView(R.id.hints) Button hints;
    @BindView(R.id.check) Button check;

    @BindView(R.id.Word1) Button Word1;
    @BindView(R.id.Word2) Button Word2;
    @BindView(R.id.Word3) Button Word3;
    @BindView(R.id.Word4) Button Word4;
    @BindView(R.id.Word5) Button Word5;
    @BindView(R.id.Word6) Button Word6;
    @BindView(R.id.Word7) Button Word7;
    @BindView(R.id.Word8) Button Word8;
    @BindView(R.id.Word9) Button Word9;
    @BindView(R.id.Word0) Button Word0;

    @BindView(R.id.btn_00) Button btn_00;
    @BindView(R.id.btn_01) Button btn_01;
    @BindView(R.id.btn_02) Button btn_02;
    @BindView(R.id.btn_03) Button btn_03;
    @BindView(R.id.btn_04) Button btn_04;
    @BindView(R.id.btn_10) Button btn_10;
    @BindView(R.id.btn_11) Button btn_11;
    @BindView(R.id.btn_12) Button btn_12;
    @BindView(R.id.btn_13) Button btn_13;
    @BindView(R.id.btn_14) Button btn_14;
    @BindView(R.id.btn_20) Button btn_20;
    @BindView(R.id.btn_21) Button btn_21;
    @BindView(R.id.btn_22) Button btn_22;
    @BindView(R.id.btn_23) Button btn_23;
    @BindView(R.id.btn_24) Button btn_24;
    @BindView(R.id.btn_30) Button btn_30;
    @BindView(R.id.btn_31) Button btn_31;
    @BindView(R.id.btn_32) Button btn_32;
    @BindView(R.id.btn_33) Button btn_33;
    @BindView(R.id.btn_34) Button btn_34;
    @BindView(R.id.btn_40) Button btn_40;
    @BindView(R.id.btn_41) Button btn_41;
    @BindView(R.id.btn_42) Button btn_42;
    @BindView(R.id.btn_43) Button btn_43;
    @BindView(R.id.btn_44) Button btn_44;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_campaign);
        ButterKnife.bind(this);


        r1 = new Random();
        r2 = new Random();
        colorrs = new Random();
        progressBar.setMax(110);

        changeWord();
        newGame();
        enterWord();
        progressBar1();

    }

    private void checkAnswer(){
        if(dictionary[4].equals("2") || dictionary[4].equals("4") || dictionary[4].equals("15") || dictionary[4].equals("18") || dictionary[4].equals("25") || dictionary[4].equals("29") || dictionary[4].equals("37")|| dictionary[4].equals("53")
                || dictionary[4].equals("71") || dictionary[4].equals("78")
                || dictionary[4].equals("93")|| dictionary[4].equals("99")|| dictionary[4].equals("100")|| dictionary[4].equals("102")
                || dictionary[4].equals("104") || dictionary[4].equals("106")|| dictionary[4].equals("107")) {
            if (edt1.getText().toString().equalsIgnoreCase(dictionary[1]) || edt1.getText().toString().equalsIgnoreCase(dictionary[2])) {

                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(ButtonsCampaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
        } else if (dictionary[4].equals("110") ){
            if ((edt1.getText().toString().equalsIgnoreCase(dictionary[1]) && edt2.getText().toString().equalsIgnoreCase(dictionary[2]) &&
                    edt3.getText().toString().equalsIgnoreCase(dictionary[5])) || (edt1.getText().toString().equalsIgnoreCase(dictionary[1]) && edt2.getText().toString().equalsIgnoreCase(dictionary[5]) &&
                    edt3.getText().toString().equalsIgnoreCase(dictionary[2])) || (edt1.getText().toString().equalsIgnoreCase(dictionary[2]) && edt2.getText().toString().equalsIgnoreCase(dictionary[1]) &&
                    edt3.getText().toString().equalsIgnoreCase(dictionary[5])) || (edt1.getText().toString().equalsIgnoreCase(dictionary[2]) && edt2.getText().toString().equalsIgnoreCase(dictionary[5]) &&
                    edt3.getText().toString().equalsIgnoreCase(dictionary[1])) || (edt1.getText().toString().equalsIgnoreCase(dictionary[5]) && edt2.getText().toString().equalsIgnoreCase(dictionary[2]) &&
                    edt3.getText().toString().equalsIgnoreCase(dictionary[1])) || (edt1.getText().toString().equalsIgnoreCase(dictionary[5]) && edt2.getText().toString().equalsIgnoreCase(dictionary[1]) &&
                    edt3.getText().toString().equalsIgnoreCase(dictionary[2])) ) {

                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                edt2.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(ButtonsCampaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }

        } else if(dictionary[4].equals("87")){
            //(edt1.getText().toString().equalsIgnoreCase(dictionary[1]) && edt2.getText().toString().equalsIgnoreCase(dictionary[2]) &&
            //                    edt3.getText().toString().equalsIgnoreCase(dictionary[5]) &&edt4.getText().toString().equalsIgnoreCase(dictionary[6])) ||
            if ((((Integer.parseInt(edt1.getText().toString()) + Integer.parseInt(edt2.getText().toString())) ==  16) &&
                            (((Integer.parseInt(edt3.getText().toString()) - Integer.parseInt(edt4.getText().toString())) ==  12))
                    && (((Integer.parseInt(edt1.getText().toString()) + Integer.parseInt(edt3.getText().toString())) ==  26))
                    && (((Integer.parseInt(edt2.getText().toString()) + Integer.parseInt(edt4.getText().toString())) ==  16))) ) {

                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                edt2.setText("");
                edt3.setText("");
                edt4.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(ButtonsCampaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }


    public void Check(View view) {
        checkAnswer();
    }

    public void ClickButt(View view) {
        switch (view.getId()){
            case R.id.Word0:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word0.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word0.getText().toString());
                    } else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word0.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word0.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word0.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word0.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word0.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word0.getText().toString());
                break;
            case R.id.Word1:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word1.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word1.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word1.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word1.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word1.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word1.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word1.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word1.getText().toString());
                break;
            case R.id.Word2:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word2.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word2.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word2.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word2.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word2.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word2.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word2.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word2.getText().toString());
                break;
            case R.id.Word3:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word3.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word3.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word3.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word3.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word3.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word3.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word3.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word3.getText().toString());
                break;
            case R.id.Word4:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word4.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word4.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word4.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word4.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word4.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word4.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word4.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word4.getText().toString());
                break;
            case R.id.Word5:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word5.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word5.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word5.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word5.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word5.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word5.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word5.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word5.getText().toString());
                break;
            case R.id.Word6:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word6.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word6.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word6.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word6.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word6.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word6.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word6.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word6.getText().toString());
                break;
            case R.id.Word7:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word7.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word7.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word7.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word7.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word7.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word7.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word7.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word7.getText().toString());
                break;
            case R.id.Word8:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word8.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word8.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word8.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word8.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word8.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word8.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word8.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word8.getText().toString());
                break;
            case R.id.Word9:
                if(Integer.parseInt(dictionary[4]) == 87){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word9.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word9.getText().toString());
                    }  else if(edt3.getText().length() < 2){
                        edt3.setText(edt3.getText().toString() + Word9.getText().toString());
                    } else if(edt4.getText().toString().equals("")){
                        edt4.setText(Word9.getText().toString());
                    }
                } else if(Integer.parseInt(dictionary[4]) == 110){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word9.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word9.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word9.getText().toString());
                    }
                }else
                edt1.setText(edt1.getText().toString() + Word9.getText().toString());
                break;
        }
    }

    public void CleanEdt(View view) {
        edt1.setText("");
        edt2.setText("");
        edt3.setText("");
        edt4.setText("");
    }


    public void progressBar1() {
        Intent intent = getIntent();
        x = intent.getIntExtra("progress", 0);
        progressBar.setProgress(x);
    }

    public void forResult() {
        switch (dictionary[4]) {
            case "2":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_1 = new Intent();
                intent_1.putExtra("money_result", Money_text.getText().toString());
                intent_1.putExtra("block", "2");
                setResult(RESULT_OK, intent_1);
                finish();
                break;
            case "4":
                if (toast!= null) {
                toast.cancel();
             }
                Intent intent_4 = new Intent();
                intent_4.putExtra("money_result", Money_text.getText().toString());
                intent_4.putExtra("block", "4");
                setResult(RESULT_OK, intent_4);
                finish();
                break;
            case "15":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent18 = new Intent();
                intent18.putExtra("money_result", Money_text.getText().toString());
                intent18.putExtra("block", "15");
                setResult(RESULT_OK, intent18);
                finish();
                break;
            case "18":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent22 = new Intent();
                intent22.putExtra("money_result", Money_text.getText().toString());
                intent22.putExtra("block", "18");
                setResult(RESULT_OK, intent22);
                finish();
                break;
            case "25":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent25 = new Intent();
                intent25.putExtra("money_result", Money_text.getText().toString());
                intent25.putExtra("block", "25");
                setResult(RESULT_OK, intent25);
                finish();
                break;
            case "29":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent29 = new Intent();
                intent29.putExtra("money_result", Money_text.getText().toString());
                intent29.putExtra("block", "29");
                setResult(RESULT_OK, intent29);
                finish();
                break;
            case "37":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent37 = new Intent();
                intent37.putExtra("money_result", Money_text.getText().toString());
                intent37.putExtra("block", "37");
                setResult(RESULT_OK, intent37);
                finish();
                break;
            case "53":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent53 = new Intent();
                intent53.putExtra("money_result", Money_text.getText().toString());
                intent53.putExtra("block", "53");
                setResult(RESULT_OK, intent53);
                finish();
                break;
            case "71":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent88 = new Intent();
                intent88.putExtra("money_result", Money_text.getText().toString());
                intent88.putExtra("block", "71");
                setResult(RESULT_OK, intent88);
                finish();
                break;
            case "78":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent78 = new Intent();
                intent78.putExtra("money_result", Money_text.getText().toString());
                intent78.putExtra("block", "78");
                setResult(RESULT_OK, intent78);
                finish();
                break;
            case "87":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent112 = new Intent();
                intent112.putExtra("money_result", Money_text.getText().toString());
                intent112.putExtra("block", "87");
                setResult(RESULT_OK, intent112);
                finish();
                break;
            case "93":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent122 = new Intent();
                intent122.putExtra("money_result", Money_text.getText().toString());
                intent122.putExtra("block", "93");
                setResult(RESULT_OK, intent122);
                finish();
                break;
            case "99":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent132 = new Intent();
                intent132.putExtra("money_result", Money_text.getText().toString());
                intent132.putExtra("block", "99");
                setResult(RESULT_OK, intent132);
                finish();
                break;
            case "100":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent133 = new Intent();
                intent133.putExtra("money_result", Money_text.getText().toString());
                intent133.putExtra("block", "100");
                setResult(RESULT_OK, intent133);
                finish();
                break;
            case "102":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent137 = new Intent();
                intent137.putExtra("money_result", Money_text.getText().toString());
                intent137.putExtra("block", "102");
                setResult(RESULT_OK, intent137);
                finish();
                break;
            case "104":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent139 = new Intent();
                intent139.putExtra("money_result", Money_text.getText().toString());
                intent139.putExtra("block", "104");
                setResult(RESULT_OK, intent139);
                finish();
                break;
            case "106":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent143 = new Intent();
                intent143.putExtra("money_result", Money_text.getText().toString());
                intent143.putExtra("block", "106");
                setResult(RESULT_OK, intent143);
                finish();
                break;
            case "107":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent144 = new Intent();
                intent144.putExtra("money_result", Money_text.getText().toString());
                intent144.putExtra("block", "107");
                setResult(RESULT_OK, intent144);
                finish();
                break;
            case "110":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent149 = new Intent();
                intent149.putExtra("money_result", Money_text.getText().toString());
                intent149.putExtra("block", "110");
                setResult(RESULT_OK, intent149);
                finish();
                break;
        }
    }

    public void changeWord() {
        Intent intent = getIntent();
        dictionary[0] = intent.getStringExtra("dictionary");
        textFind.setText(dictionary[0]);
        dictionary[1] = intent.getStringExtra("answer");
        dictionary[2] = intent.getStringExtra("answer1");
        dictionary[5] = intent.getStringExtra("answer2");
        dictionary[6] = intent.getStringExtra("answer3");
        dictionary[3] = intent.getStringExtra("size");
        dictionary[4] = String.valueOf(intent.getIntExtra("lvl",0));


        String level = getResources().getString(R.string.levelButtonCamp);
        textLvls.setText(level + ": " + intent.getIntExtra("lvl",0));

        if(dictionary[3].equalsIgnoreCase("3x3")){
            Visibilite(View.VISIBLE,View.VISIBLE,View.VISIBLE,View.GONE,View.GONE);
        }else if(dictionary[3].equalsIgnoreCase("4x4")){
            Visibilite(View.VISIBLE,View.VISIBLE,View.VISIBLE,View.VISIBLE,View.GONE);
        }else if(dictionary[3].equalsIgnoreCase("5x5")){
            Visibilite(View.VISIBLE,View.VISIBLE,View.VISIBLE,View.VISIBLE,View.VISIBLE);
        }

        if((intent.getIntExtra("lvl",0)) == 2){
            btn_00.setText("1");
            btn_01.setText("?");
            btn_02.setText("12");
            btn_03.setText("11");

            btn_10.setText("6");
            btn_11.setText("7");
            btn_12.setText("14");
            btn_13.setText("13");

            btn_20.setText("8");
            btn_21.setText("5");
            btn_22.setText("10");
            btn_23.setText("15");

            btn_30.setText("4");
            btn_31.setText("2");
            btn_32.setText("9");
            btn_33.setText("3");

            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        } else if((intent.getIntExtra("lvl",0)) == 4){
            btn_01.setText("1");
            btn_00.setVisibility(View.INVISIBLE);
            btn_02.setVisibility(View.INVISIBLE);
            btn_10.setText("3");
            btn_11.setText("?");
            btn_12.setText("2");
            btn_21.setText("4");
            btn_20.setVisibility(View.INVISIBLE);
            btn_22.setVisibility(View.INVISIBLE);
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        } else if((intent.getIntExtra("lvl",0)) == 15){
            btn_00.setText("3");
            btn_01.setText("*");
            btn_02.setText("5");
            btn_03.setText("=");
            btn_04.setText("4");

            btn_10.setText("4");
            btn_11.setText("*");
            btn_12.setText("6");
            btn_13.setText("=");
            btn_14.setText("5");

            btn_20.setText("5");
            btn_21.setText("*");
            btn_22.setText("?");
            btn_23.setText("=");
            btn_24.setText("6");

            btn_30.setText("6");
            btn_31.setText("*");
            btn_32.setText("8");
            btn_33.setText("=");
            btn_34.setText("7");

            btn_40.setVisibility(View.INVISIBLE);
            btn_41.setVisibility(View.INVISIBLE);
            btn_42.setVisibility(View.INVISIBLE);
            btn_43.setVisibility(View.INVISIBLE);
            btn_44.setVisibility(View.INVISIBLE);
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 18){
            btn_00.setText("5");
            btn_01.setText("40");
            btn_02.setText("8");

            btn_10.setText("30");
            btn_11.setVisibility(View.INVISIBLE);
            btn_12.setText("24");

            btn_20.setText("6");
            btn_21.setText("?");
            btn_22.setText("3");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 25){
            btn_00.setText("14");
            btn_01.setText("9");
            btn_02.setText("5");

            btn_10.setText("21");
            btn_11.setText("8");
            btn_12.setText("13");

            btn_20.setText("28");
            btn_21.setText("9");
            btn_22.setText("?");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 29){
            btn_00.setText("4");
            btn_01.setText("8");
            btn_02.setText("16");

            btn_10.setText("5");
            btn_11.setText("10");
            btn_12.setText("20");

            btn_20.setText("6");
            btn_21.setText("12");
            btn_22.setText("?");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 37){
            btn_00.setText("2");
            btn_01.setText("6");
            btn_02.setText("15");

            btn_10.setText("4");
            btn_11.setText("8");
            btn_12.setText("37");

            btn_20.setText("3");
            btn_21.setText("7");
            btn_22.setText("?");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 53){
            btn_00.setText("1");
            btn_01.setText("5");
            btn_02.setText("2");
            btn_03.setText("2");


            btn_10.setText("4");
            btn_11.setText("4");
            btn_12.setText("1");
            btn_13.setText("1");


            btn_20.setText("3");
            btn_21.setText("3");
            btn_22.setText("1");
            btn_23.setText("3");


            btn_30.setText("2");
            btn_31.setText("5");
            btn_32.setText("1");
            btn_33.setText("?");


            btn_40.setVisibility(View.GONE);
            btn_41.setVisibility(View.GONE);
            btn_42.setVisibility(View.GONE);
            btn_43.setVisibility(View.GONE);
            btn_44.setVisibility(View.GONE);
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 71){
            btn_00.setText("8");
            btn_01.setText("1");
            btn_02.setText("6");

            btn_10.setText("3");
            btn_11.setText("5");
            btn_12.setText("7");

            btn_20.setText("4");
            btn_21.setText("?");
            btn_22.setText("2");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 78){
            btn_00.setText("2");
            btn_01.setText("7");
            btn_02.setText("6");

            btn_10.setText("9");
            btn_11.setText("?");
            btn_12.setText("1");

            btn_20.setText("4");
            btn_21.setText("3");
            btn_22.setText("8");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }
        else if((intent.getIntExtra("lvl",0)) == 87){
            btn_00.setText("");
            btn_01.setText("+");
            btn_02.setText("");
            btn_03.setText("=");
            btn_04.setText("16");

            btn_10.setText("+");
            btn_11.setVisibility(View.INVISIBLE);
            btn_12.setText("+");
            btn_13.setVisibility(View.INVISIBLE);
            btn_14.setVisibility(View.INVISIBLE);

            btn_20.setText("");
            btn_21.setText("-");
            btn_22.setText("");
            btn_23.setText("=");
            btn_24.setText("12");

            btn_30.setText("=");
            btn_31.setVisibility(View.INVISIBLE);
            btn_32.setText("=");
            btn_33.setVisibility(View.INVISIBLE);
            btn_34.setVisibility(View.INVISIBLE);

            btn_40.setText("26");
            btn_41.setVisibility(View.INVISIBLE);
            btn_42.setText("16");
            btn_43.setVisibility(View.INVISIBLE);
            btn_44.setVisibility(View.INVISIBLE);
            edt2.setVisibility(View.VISIBLE);
            edt3.setVisibility(View.VISIBLE);
            edt4.setVisibility(View.VISIBLE);
        }  else if((intent.getIntExtra("lvl",0)) == 93){
            btn_00.setText("2");
            btn_01.setText("0");
            btn_02.setText("3");

            btn_10.setVisibility(View.INVISIBLE);
            btn_11.setText("7");
            btn_12.setVisibility(View.INVISIBLE);

            btn_20.setText("1");
            btn_21.setText("9");
            btn_22.setText("?");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        } else if((intent.getIntExtra("lvl",0)) == 99){
            btn_00.setText("1");
            btn_01.setText("2");
            btn_02.setText("3");
            btn_03.setVisibility(View.GONE);

            btn_10.setText("4");
            btn_11.setText("5");
            btn_12.setText("6");
            btn_13.setVisibility(View.GONE);

            btn_20.setText("7");
            btn_21.setText("8");
            btn_22.setText("9");
            btn_23.setVisibility(View.GONE);

            btn_30.setText("27");
            btn_31.setText("38");
            btn_32.setText("?");
            btn_33.setVisibility(View.GONE);

            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }else if((intent.getIntExtra("lvl",0)) == 100){
            btn_00.setText("11");
            btn_01.setText("2");
            btn_02.setText("18");

            btn_10.setText("5");
            btn_11.setText("2");
            btn_12.setText("?");

            btn_20.setText("12");
            btn_21.setText("5");
            btn_22.setText("14");
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }else if((intent.getIntExtra("lvl",0)) == 102){
            btn_00.setText("3");
            btn_01.setText("4");
            btn_02.setText("5");
            btn_03.setText("=");
            btn_04.setText("8");

            btn_10.setText("5");
            btn_11.setText("6");
            btn_12.setText("7");
            btn_13.setText("=");
            btn_14.setText("12");

            btn_20.setText("7");
            btn_21.setText("8");
            btn_22.setText("9");
            btn_23.setText("=");
            btn_24.setText("16");

            btn_30.setText("8");
            btn_31.setText("9");
            btn_32.setText("10");
            btn_33.setText("=");
            btn_34.setText("?");

            btn_40.setVisibility(View.GONE);
            btn_41.setVisibility(View.GONE);
            btn_42.setVisibility(View.GONE);
            btn_43.setVisibility(View.GONE);
            btn_44.setVisibility(View.GONE);
            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }else if((intent.getIntExtra("lvl",0)) == 104){
            btn_00.setText("6");
            btn_01.setText("5");
            btn_02.setText("12");
            btn_03.setVisibility(View.GONE);

            btn_10.setText("12");
            btn_11.setText("15");
            btn_12.setText("36");
            btn_13.setVisibility(View.GONE);

            btn_20.setText("36");
            btn_21.setText("60");
            btn_22.setText("144");
            btn_23.setVisibility(View.GONE);

            btn_30.setText("144");
            btn_31.setText("300");
            btn_32.setText("?");
            btn_33.setVisibility(View.GONE);

            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        } else if((intent.getIntExtra("lvl",0)) == 106){
            btn_00.setText("1");
            btn_01.setText("2");
            btn_02.setText("6");
            btn_03.setText("9");

            btn_10.setText("6");
            btn_11.setText("8");
            btn_12.setText("7");
            btn_13.setText("3");

            btn_20.setText("2");
            btn_21.setText("4");
            btn_22.setText("?");
            btn_23.setText("6");

            btn_30.setText("6");
            btn_31.setText("4");
            btn_32.setText("7");
            btn_33.setText("2");

            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        } else if((intent.getIntExtra("lvl",0)) == 107){
            btn_00.setText("5");
            btn_01.setText("5");
            btn_02.setText("5");
            btn_03.setVisibility(View.GONE);

            btn_10.setText("6");
            btn_11.setText("7");
            btn_12.setText("22");
            btn_13.setVisibility(View.GONE);

            btn_20.setText("7");
            btn_21.setText("836");
            btn_22.setText("144");
            btn_23.setVisibility(View.GONE);

            btn_30.setText("8");
            btn_31.setText("8");
            btn_32.setText("?");
            btn_33.setVisibility(View.GONE);

            edt2.setVisibility(View.GONE);
            edt3.setVisibility(View.GONE);
            edt4.setVisibility(View.GONE);
        }else if((intent.getIntExtra("lvl",0)) == 110){
            btn_00.setVisibility(View.INVISIBLE);
            btn_01.setText("x");
            btn_02.setText("y");
            btn_03.setText("z");
            btn_04.setVisibility(View.INVISIBLE);

            btn_10.setText("+");
            btn_11.setText("x");
            btn_12.setText("y");
            btn_13.setText("z");
            btn_14.setVisibility(View.INVISIBLE);

            btn_20.setText("+");
            btn_21.setText("x");
            btn_22.setText("y");
            btn_23.setText("z");
            btn_24.setVisibility(View.INVISIBLE);

            btn_30.setVisibility(View.INVISIBLE);
            btn_31.setVisibility(View.INVISIBLE);
            btn_32.setVisibility(View.INVISIBLE);
            btn_33.setVisibility(View.INVISIBLE);
            btn_34.setVisibility(View.INVISIBLE);

            btn_40.setText("=");
            btn_41.setText("z");
            btn_42.setText("z");
            btn_43.setText("z");
            btn_44.setVisibility(View.INVISIBLE);

            edt2.setVisibility(View.VISIBLE);
            edt3.setVisibility(View.VISIBLE);
            edt4.setVisibility(View.GONE);

            edt1.setMaxEms(1);
            edt1.setMaxLines(1);
            edt1.setHint("x");
            edt2.setMaxEms(1);
            edt2.setMaxLines(1);
            edt2.setHint("y");
            edt3.setMaxEms(1);
            edt3.setMaxLines(1);
            edt3.setHint("z");
        }
    }

    private void Visibilite(int one,int two,int three,int four,int five){
        btn_00.setVisibility(one);
        btn_01.setVisibility(two);
        btn_02.setVisibility(three);
        btn_03.setVisibility(four);
        btn_04.setVisibility(five);
        btn_10.setVisibility(two);
        btn_11.setVisibility(two);
        btn_12.setVisibility(three);
        btn_13.setVisibility(four);
        btn_14.setVisibility(five);
        btn_20.setVisibility(three);
        btn_21.setVisibility(three);
        btn_22.setVisibility(three);
        btn_23.setVisibility(four);
        btn_24.setVisibility(five);
        btn_30.setVisibility(four);
        btn_31.setVisibility(four);
        btn_32.setVisibility(four);
        btn_33.setVisibility(four);
        btn_34.setVisibility(five);
        btn_40.setVisibility(five);
        btn_41.setVisibility(five);
        btn_42.setVisibility(five);
        btn_43.setVisibility(five);
        btn_44.setVisibility(five);
    }

    private void newGame() {
        edt1.setText("");

        edt1.setEnabled(true);

        btn_00.setEnabled(false);
        btn_01.setEnabled(false);
        btn_02.setEnabled(false);
        btn_03.setEnabled(false);
        btn_04.setEnabled(false);
        btn_10.setEnabled(false);
        btn_11.setEnabled(false);
        btn_12.setEnabled(false);
        btn_13.setEnabled(false);
        btn_14.setEnabled(false);
        btn_20.setEnabled(false);
        btn_21.setEnabled(false);
        btn_22.setEnabled(false);
        btn_23.setEnabled(false);
        btn_24.setEnabled(false);
        btn_30.setEnabled(false);
        btn_31.setEnabled(false);
        btn_32.setEnabled(false);
        btn_33.setEnabled(false);
        btn_34.setEnabled(false);
        btn_40.setEnabled(false);
        btn_41.setEnabled(false);
        btn_42.setEnabled(false);
        btn_43.setEnabled(false);
        btn_44.setEnabled(false);
    }


    private void Edt(EditText edt1){
        edt1.setCursorVisible(false);
        edt1.setLongClickable(false);
        edt1.setClickable(false);
        edt1.setFocusable(false);
        edt1.setSelected(false);
        edt1.setKeyListener(null);
    }

    private void enterWord() { // Количество вводимых слов в строку
        Edt(edt1);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("save_count", Money_text.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Money_text.setText(savedInstanceState.getString("save_count"));
    }

    @Override
    public void onBackPressed() {
        if (toast!= null) {
            toast.cancel();
        }
        Intent i2 = new Intent();
        i2.putExtra("money_result", Money_text.getText().toString());
        i2.putExtra("block", "0");
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();
    }



    public void HintsAnag(View view) {

        //showAlertDialogButtonClicked();
        finish();
    }

    public void showAlertDialogButtonClicked() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Выберите подсказку");

        final View view;
        view = LayoutInflater.from(ButtonsCampaign.this).inflate(R.layout.mathcampaigntips, null);
        final ImageButton imageButton = (ImageButton) view.findViewById(R.id.imageTips);

        String[] words = {"Показать подсказку", "Показать ответ"};
        builder.setItems(words, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        AlertDialog.Builder builder = new AlertDialog.Builder(ButtonsCampaign.this);

                        if(dictionary[4].equalsIgnoreCase("2")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("4")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("15")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("18")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("25")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("29")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("37")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("53")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("71")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("78")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("87")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }  else if(dictionary[4].equalsIgnoreCase("93")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("99")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("100")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("102")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("104")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("106")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("107")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("110")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }

                        builder.setView(view);
                        builder.show();
                        break;
                    case 1:
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(ButtonsCampaign.this);

                        if(dictionary[4].equalsIgnoreCase("2")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("4")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("15")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("18")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("25")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("29")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("37")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("53")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("71")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("78")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }
                        else if(dictionary[4].equalsIgnoreCase("87")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }  else if(dictionary[4].equalsIgnoreCase("93")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("99")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("100")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("102")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("104")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("106")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[4].equalsIgnoreCase("107")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[4].equalsIgnoreCase("110")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }

                        builder2.setView(view);
                        builder2.show();
                        break;

                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }


    @Override
    protected void onDestroy() {
        if (toast!= null) {
            toast.cancel();
        }
        super.onDestroy();
    }

    public void GetBack(View view) {
        if (toast!= null) {
            toast.cancel();
        }
        Intent i2 = new Intent();
        i2.putExtra("money_result", Money_text.getText().toString());
        i2.putExtra("block", "0");
        setResult(RESULT_OK, i2);
        finish();
    }

}
