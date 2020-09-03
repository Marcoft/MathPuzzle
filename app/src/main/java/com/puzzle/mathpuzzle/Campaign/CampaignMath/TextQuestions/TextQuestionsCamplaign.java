package com.puzzle.mathpuzzle.Campaign.CampaignMath.TextQuestions;

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

import java.util.HashMap;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TextQuestionsCamplaign extends AppCompatActivity {

    ProgressBar progressBar;

    Random r;
    String word = "";

    HashMap<Integer, Button> hashMap = new HashMap<>();

    SharedPreferences sharedPreferences;

    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;


    int j = 1;


    int i = 0;
    int x = 0;

    String dictionary[] = {
            "1",
            "2",
            "",
            ""
    };

    Toast toast;


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


    @BindView(R.id.hints) Button hints;
    @BindView(R.id.check) Button check;
    @BindView(R.id.edt1) EditText edt1;
    @BindView(R.id.edt2) EditText edt2;
    @BindView(R.id.text) TextView text;
    @BindView(R.id.money) TextView Money_text;
    @BindView(R.id.textLvls) TextView textLvls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_questions_camplaign);
        ButterKnife.bind(this);


        r = new Random();

        progressBar = (ProgressBar) findViewById(R.id.progress);
        progressBar.setMax(110);

        changeWord();
        newGame();
        enterWord();
        progressBar1();
        SaveMoney();
    }

    private void checkAnswer(){
        if(dictionary[2].equalsIgnoreCase("19")) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[1]) && edt2.getText().toString().equalsIgnoreCase(dictionary[3])) {
                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                edt2.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(TextQuestionsCamplaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else if(dictionary[2].equalsIgnoreCase("66")) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[1]) || edt2.getText().toString().equalsIgnoreCase(dictionary[3])) {
                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                edt2.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(TextQuestionsCamplaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else if(dictionary[2].equalsIgnoreCase("88")) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[1]) || edt1.getText().toString().equalsIgnoreCase(dictionary[3])) {
                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(TextQuestionsCamplaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else if(dictionary[2].equalsIgnoreCase("105")) {
            if((edt1.getText().toString().equalsIgnoreCase(dictionary[1]) || edt1.getText().toString().equalsIgnoreCase(dictionary[3])) ||
                    (edt1.getText().toString().equalsIgnoreCase("42") || edt1.getText().toString().equalsIgnoreCase("24"))) {
                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(TextQuestionsCamplaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else if (edt1.getText().toString().equalsIgnoreCase(dictionary[1])) {
            int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
            money_for_open_word += 10;
            Money_text.setText(""+money_for_open_word);
            forResult();
        } else {
            edt1.setText("");
            String answer = getResources().getString(R.string.toastButtonCamp);
            toast = Toast.makeText(TextQuestionsCamplaign.this, answer, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void Check(View view) {
        checkAnswer();
    }

    public void ClickButt(View view) {
        switch (view.getId()){
            case R.id.Word0:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word0.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word0.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word0.getText().toString());
                break;
            case R.id.Word1:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word1.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word1.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word1.getText().toString());
                break;
            case R.id.Word2:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word2.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word2.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word2.getText().toString());
                break;
            case R.id.Word3:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word3.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word3.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word3.getText().toString());
                break;
            case R.id.Word4:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word4.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word4.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word4.getText().toString());
                break;
            case R.id.Word5:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word5.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word5.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word5.getText().toString());
                break;
            case R.id.Word6:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word6.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word6.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word6.getText().toString());
                break;
            case R.id.Word7:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word7.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word7.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word7.getText().toString());
                break;
            case R.id.Word8:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word8.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word8.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word8.getText().toString());
                break;
            case R.id.Word9:
                if(dictionary[2].equalsIgnoreCase("19")) {
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word9.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word9.getText().toString());
                    }
                }else
                    edt1.setText(edt1.getText().toString() + Word9.getText().toString());
                break;
        }
    }

    public void CleanEdt(View view) {
        edt1.setText("");
        edt2.setText("");
    }


    public void progressBar1() {
        Intent intent = getIntent();
        x = intent.getIntExtra("progress", 0);
        progressBar.setProgress(x);
    }

    public void forResult() {
        switch (dictionary[2]) {
            case "1":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_1 = new Intent();
                intent_1.putExtra("money_result", Money_text.getText().toString());
                intent_1.putExtra("block", "1");
                setResult(RESULT_OK, intent_1);
                finish();
                break;
            case "3":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_2 = new Intent();
                intent_2.putExtra("money_result", Money_text.getText().toString());
                intent_2.putExtra("block", "3");
                setResult(RESULT_OK, intent_2);
                finish();
                break;
            case "6":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_4 = new Intent();
                intent_4.putExtra("money_result", Money_text.getText().toString());
                intent_4.putExtra("block", "6");
                setResult(RESULT_OK, intent_4);
                finish();
                break;
            case "7":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_5 = new Intent();
                intent_5.putExtra("money_result", Money_text.getText().toString());
                intent_5.putExtra("block", "7");
                setResult(RESULT_OK, intent_5);
                finish();
                break;
            case "8":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_6 = new Intent();
                intent_6.putExtra("money_result", Money_text.getText().toString());
                intent_6.putExtra("block", "8");
                setResult(RESULT_OK, intent_6);
                finish();
                break;
            case "10":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_8 = new Intent();
                intent_8.putExtra("money_result", Money_text.getText().toString());
                intent_8.putExtra("block", "10");
                setResult(RESULT_OK, intent_8);
                finish();
                break;
            case "11":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_9 = new Intent();
                intent_9.putExtra("money_result", Money_text.getText().toString());
                intent_9.putExtra("block", "11");
                setResult(RESULT_OK, intent_9);
                finish();
                break;
            case "12":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_11 = new Intent();
                intent_11.putExtra("money_result", Money_text.getText().toString());
                intent_11.putExtra("block", "12");
                setResult(RESULT_OK, intent_11);
                finish();
                break;
            case "14":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_12 = new Intent();
                intent_12.putExtra("money_result", Money_text.getText().toString());
                intent_12.putExtra("block", "14");
                setResult(RESULT_OK, intent_12);
                finish();
                break;
            case "16":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_14 = new Intent();
                intent_14.putExtra("money_result", Money_text.getText().toString());
                intent_14.putExtra("block", "16");
                setResult(RESULT_OK, intent_14);
                finish();
                break;
            case "19":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_15 = new Intent();
                intent_15.putExtra("money_result", Money_text.getText().toString());
                intent_15.putExtra("block", "19");
                setResult(RESULT_OK, intent_15);
                finish();
                break;
            case "21":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_16 = new Intent();
                intent_16.putExtra("money_result", Money_text.getText().toString());
                intent_16.putExtra("block", "21");
                setResult(RESULT_OK, intent_16);
                finish();
                break;
            case "22":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_17 = new Intent();
                intent_17.putExtra("money_result", Money_text.getText().toString());
                intent_17.putExtra("block", "22");
                setResult(RESULT_OK, intent_17);
                finish();
                break;
            case "23":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_21 = new Intent();
                intent_21.putExtra("money_result", Money_text.getText().toString());
                intent_21.putExtra("block", "23");
                setResult(RESULT_OK, intent_21);
                finish();
                break;
            case "24":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_26 = new Intent();
                intent_26.putExtra("money_result", Money_text.getText().toString());
                intent_26.putExtra("block", "24");
                setResult(RESULT_OK, intent_26);
                finish();
                break;
            case "26":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_266 = new Intent();
                intent_266.putExtra("money_result", Money_text.getText().toString());
                intent_266.putExtra("block", "26");
                setResult(RESULT_OK, intent_266);
                finish();
                break;
            case "27":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_27 = new Intent();
                intent_27.putExtra("money_result", Money_text.getText().toString());
                intent_27.putExtra("block", "27");
                setResult(RESULT_OK, intent_27);
                finish();
                break;
            case "28":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_30 = new Intent();
                intent_30.putExtra("money_result", Money_text.getText().toString());
                intent_30.putExtra("block", "28");
                setResult(RESULT_OK, intent_30);
                finish();
                break;
            case "30":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_31 = new Intent();
                intent_31.putExtra("money_result", Money_text.getText().toString());
                intent_31.putExtra("block", "30");
                setResult(RESULT_OK, intent_31);
                finish();
                break;
            case "31":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_32 = new Intent();
                intent_32.putExtra("money_result", Money_text.getText().toString());
                intent_32.putExtra("block", "31");
                setResult(RESULT_OK, intent_32);
                finish();
                break;
            case "32":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_34 = new Intent();
                intent_34.putExtra("money_result", Money_text.getText().toString());
                intent_34.putExtra("block", "32");
                setResult(RESULT_OK, intent_34);
                finish();
                break;
            case "33":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_33 = new Intent();
                intent_33.putExtra("money_result", Money_text.getText().toString());
                intent_33.putExtra("block", "33");
                setResult(RESULT_OK, intent_33);
                finish();
                break;
            case "34":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_36 = new Intent();
                intent_36.putExtra("money_result", Money_text.getText().toString());
                intent_36.putExtra("block", "34");
                setResult(RESULT_OK, intent_36);
                finish();
                break;
            case "35":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_37 = new Intent();
                intent_37.putExtra("money_result", Money_text.getText().toString());
                intent_37.putExtra("block", "35");
                setResult(RESULT_OK, intent_37);
                finish();
                break;
            case "36":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_38 = new Intent();
                intent_38.putExtra("money_result", Money_text.getText().toString());
                intent_38.putExtra("block", "36");
                setResult(RESULT_OK, intent_38);
                finish();
                break;
            case "40":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_40 = new Intent();
                intent_40.putExtra("money_result", Money_text.getText().toString());
                intent_40.putExtra("block", "40");
                setResult(RESULT_OK, intent_40);
                finish();
                break;
            case "41":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_41 = new Intent();
                intent_41.putExtra("money_result", Money_text.getText().toString());
                intent_41.putExtra("block", "41");
                setResult(RESULT_OK, intent_41);
                finish();
                break;
            case "42":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_39 = new Intent();
                intent_39.putExtra("money_result", Money_text.getText().toString());
                intent_39.putExtra("block", "42");
                setResult(RESULT_OK, intent_39);
                finish();
                break;
            case "43":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_43 = new Intent();
                intent_43.putExtra("money_result", Money_text.getText().toString());
                intent_43.putExtra("block", "43");
                setResult(RESULT_OK, intent_43);
                finish();
                break;
            case "45":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_45 = new Intent();
                intent_45.putExtra("money_result", Money_text.getText().toString());
                intent_45.putExtra("block", "45");
                setResult(RESULT_OK, intent_45);
                finish();
                break;
            case "47":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_47 = new Intent();
                intent_47.putExtra("money_result", Money_text.getText().toString());
                intent_47.putExtra("block", "47");
                setResult(RESULT_OK, intent_47);
                finish();
                break;
            case "49":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_49 = new Intent();
                intent_49.putExtra("money_result", Money_text.getText().toString());
                intent_49.putExtra("block", "49");
                setResult(RESULT_OK, intent_49);
                finish();
                break;
            case "48":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_42 = new Intent();
                intent_42.putExtra("money_result", Money_text.getText().toString());
                intent_42.putExtra("block", "48");
                setResult(RESULT_OK, intent_42);
                finish();
                break;
            case "50":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_50 = new Intent();
                intent_50.putExtra("money_result", Money_text.getText().toString());
                intent_50.putExtra("block", "50");
                setResult(RESULT_OK, intent_50);
                finish();
                break;
            case "52":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_44 = new Intent();
                intent_44.putExtra("money_result", Money_text.getText().toString());
                intent_44.putExtra("block", "52");
                setResult(RESULT_OK, intent_44);
                finish();
                break;
            case "54":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_54 = new Intent();
                intent_54.putExtra("money_result", Money_text.getText().toString());
                intent_54.putExtra("block", "54");
                setResult(RESULT_OK, intent_54);
                finish();
                break;
            case "56":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_56 = new Intent();
                intent_56.putExtra("money_result", Money_text.getText().toString());
                intent_56.putExtra("block", "56");
                setResult(RESULT_OK, intent_56);
                finish();
                break;
            case "57":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_57 = new Intent();
                intent_57.putExtra("money_result", Money_text.getText().toString());
                intent_57.putExtra("block", "57");
                setResult(RESULT_OK, intent_57);
                finish();
                break;
            case "60":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_74 = new Intent();
                intent_74.putExtra("money_result", Money_text.getText().toString());
                intent_74.putExtra("block", "60");
                setResult(RESULT_OK, intent_74);
                finish();
                break;
            case "61":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_61 = new Intent();
                intent_61.putExtra("money_result", Money_text.getText().toString());
                intent_61.putExtra("block", "61");
                setResult(RESULT_OK, intent_61);
                finish();
                break;
            case "65":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_65 = new Intent();
                intent_65.putExtra("money_result", Money_text.getText().toString());
                intent_65.putExtra("block", "65");
                setResult(RESULT_OK, intent_65);
                finish();
                break;
            case "66":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_82 = new Intent();
                intent_82.putExtra("money_result", Money_text.getText().toString());
                intent_82.putExtra("block", "66");
                setResult(RESULT_OK, intent_82);
                finish();
                break;
            case "67":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_83 = new Intent();
                intent_83.putExtra("money_result", Money_text.getText().toString());
                intent_83.putExtra("block", "67");
                setResult(RESULT_OK, intent_83);
                finish();
                break;
            case "68":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_84 = new Intent();
                intent_84.putExtra("money_result", Money_text.getText().toString());
                intent_84.putExtra("block", "68");
                setResult(RESULT_OK, intent_84);
                finish();
                break;
            case "69":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_69 = new Intent();
                intent_69.putExtra("money_result", Money_text.getText().toString());
                intent_69.putExtra("block", "69");
                setResult(RESULT_OK, intent_69);
                finish();
                break;
            case "72":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_89 = new Intent();
                intent_89.putExtra("money_result", Money_text.getText().toString());
                intent_89.putExtra("block", "72");
                setResult(RESULT_OK, intent_89);
                finish();
            case "73":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_73 = new Intent();
                intent_73.putExtra("money_result", Money_text.getText().toString());
                intent_73.putExtra("block", "73");
                setResult(RESULT_OK, intent_73);
                finish();
                break;
            case "74":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_92 = new Intent();
                intent_92.putExtra("money_result", Money_text.getText().toString());
                intent_92.putExtra("block", "74");
                setResult(RESULT_OK, intent_92);
                finish();
                break;
            case "75":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_93 = new Intent();
                intent_93.putExtra("money_result", Money_text.getText().toString());
                intent_93.putExtra("block", "75");
                setResult(RESULT_OK, intent_93);
                finish();
                break;
            case "77":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_77 = new Intent();
                intent_77.putExtra("money_result", Money_text.getText().toString());
                intent_77.putExtra("block", "77");
                setResult(RESULT_OK, intent_77);
                finish();
                break;
            case "79":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_98 = new Intent();
                intent_98.putExtra("money_result", Money_text.getText().toString());
                intent_98.putExtra("block", "79");
                setResult(RESULT_OK, intent_98);
                finish();
                break;
            case "80":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_99 = new Intent();
                intent_99.putExtra("money_result", Money_text.getText().toString());
                intent_99.putExtra("block", "80");
                setResult(RESULT_OK, intent_99);
                finish();
                break;
            case "85":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_108 = new Intent();
                intent_108.putExtra("money_result", Money_text.getText().toString());
                intent_108.putExtra("block", "85");
                setResult(RESULT_OK, intent_108);
                finish();
                break;
            case "88":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_113 = new Intent();
                intent_113.putExtra("money_result", Money_text.getText().toString());
                intent_113.putExtra("block", "88");
                setResult(RESULT_OK, intent_113);
                finish();
                break;
            case "89":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_114 = new Intent();
                intent_114.putExtra("money_result", Money_text.getText().toString());
                intent_114.putExtra("block", "89");
                setResult(RESULT_OK, intent_114);
                finish();
                break;
            case "92":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_119 = new Intent();
                intent_119.putExtra("money_result", Money_text.getText().toString());
                intent_119.putExtra("block", "92");
                setResult(RESULT_OK, intent_119);
                finish();
                break;
            case "94":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_123 = new Intent();
                intent_123.putExtra("money_result", Money_text.getText().toString());
                intent_123.putExtra("block", "94");
                setResult(RESULT_OK, intent_123);
                finish();
                break;
            case "95":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_95 = new Intent();
                intent_95.putExtra("money_result", Money_text.getText().toString());
                intent_95.putExtra("block", "95");
                setResult(RESULT_OK, intent_95);
                finish();
                break;
            case "97":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_128 = new Intent();
                intent_128.putExtra("money_result", Money_text.getText().toString());
                intent_128.putExtra("block", "97");
                setResult(RESULT_OK, intent_128);
                finish();
                break;
            case "98":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_129 = new Intent();
                intent_129.putExtra("money_result", Money_text.getText().toString());
                intent_129.putExtra("block", "98");
                setResult(RESULT_OK, intent_129);
                finish();
                break;
            case "103":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_138 = new Intent();
                intent_138.putExtra("money_result", Money_text.getText().toString());
                intent_138.putExtra("block", "103");
                setResult(RESULT_OK, intent_138);
                finish();
                break;
            case "105":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_142 = new Intent();
                intent_142.putExtra("money_result", Money_text.getText().toString());
                intent_142.putExtra("block", "105");
                setResult(RESULT_OK, intent_142);
                finish();
                break;
            case "108":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_147 = new Intent();
                intent_147.putExtra("money_result", Money_text.getText().toString());
                intent_147.putExtra("block", "108");
                setResult(RESULT_OK, intent_147);
                finish();
                break;
            case "109":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_148 = new Intent();
                intent_148.putExtra("money_result", Money_text.getText().toString());
                intent_148.putExtra("block", "109");
                setResult(RESULT_OK, intent_148);
                finish();
                break;

        }
    }

    private void loadMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        Money_text.setText(""+prefs.getInt("money", 0));
    }

    public void changeWord() {
        Intent intent = getIntent();
        dictionary[0] = intent.getStringExtra("dictionary");
        dictionary[1] = intent.getStringExtra("answer");
        dictionary[3] = intent.getStringExtra("answer1");
        dictionary[2] = String.valueOf(intent.getIntExtra("lvl",0));
        if(dictionary[2].equalsIgnoreCase("19")){
            edt2.setVisibility(View.VISIBLE);
        } else {
            edt2.setVisibility(View.GONE);
        }

        if(dictionary[2].equalsIgnoreCase("105") || dictionary[2].equalsIgnoreCase("109") || dictionary[2].equalsIgnoreCase("88")){
            text.setTextSize(24);
        }

        if(intent!=null) {
            int m = intent.getIntExtra("money_data",0);
            Money_text.setText(String.valueOf(m));
            SaveMoney();
        }else{
            loadMoney();
        }
        String level = getResources().getString(R.string.levelButtonCamp);
        textLvls.setText(level + ": " + intent.getIntExtra("lvl",0));

    }

    private void newGame() {
        text.setText(dictionary[0]);

        edt1.setText("");

        edt1.setEnabled(true);

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


        String[] words = {"Показать подсказку", "Показать ответ"};


        final View view;
        view = LayoutInflater.from(TextQuestionsCamplaign.this).inflate(R.layout.mathcampaigntips, null);
        final ImageButton imageButton = (ImageButton) view.findViewById(R.id.imageTips);
        builder.setItems(words, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        AlertDialog.Builder builder = new AlertDialog.Builder(TextQuestionsCamplaign.this);


                        if(dictionary[2].equalsIgnoreCase("1")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("3")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("6")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("7")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("8")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }  else if(dictionary[2].equalsIgnoreCase("10")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("11")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("12")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }  else if(dictionary[2].equalsIgnoreCase("14")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("16")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }  else if(dictionary[2].equalsIgnoreCase("19")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("21")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("22")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("23")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("24")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("26")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("27")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("28")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("30")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("31")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("32")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("33")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("34")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("35")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("36")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("40")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("41")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("42")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("43")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("45")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("47")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("48")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("49")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("50")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("52")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("54")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("56")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("57")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("60")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("61")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("65")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("66")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("67")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("68")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("69")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("72")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("73")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("74")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("75")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("77")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("79")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("80")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("85")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("88")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("89")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("92")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("94")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("95")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("97")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("98")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("103")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("105")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("108")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("109")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }

                        builder.setView(view);
                        builder.show();
                        break;
                    case 1:
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(TextQuestionsCamplaign.this);


                        if(dictionary[2].equalsIgnoreCase("1")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("3")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("5")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("6")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("7")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("8")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("9")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("10")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("11")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("12")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("13")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("14")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("16")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("17")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("19")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("21")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("22")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("23")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("24")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("26")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("27")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("28")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("30")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("31")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("32")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("33")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("34")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("35")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("36")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("40")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("41")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("42")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("43")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("45")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("47")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("48")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("49")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("50")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("52")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("54")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("56")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("57")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("60")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("61")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("65")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("66")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("67")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("68")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("69")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("72")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("73")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        }else if(dictionary[2].equalsIgnoreCase("74")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("75")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("77")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("79")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("80")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("85")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("88")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("89")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("92")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("94")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("95")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("97")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("98")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("103")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("105")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("108")) {
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else if(dictionary[2].equalsIgnoreCase("109")) {
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
        SaveMoney();
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

    private void SaveMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        prefEdit = prefs.edit();
        prefEdit.putInt("money", Integer.parseInt(Money_text.getText().toString()));
        prefEdit.commit();
    }

    public void GoShop(View view) {
        //Intent intent = new Intent(TextQuestionsCamplaign.this, Shop.class);
        //startActivity(intent);
    }
}
