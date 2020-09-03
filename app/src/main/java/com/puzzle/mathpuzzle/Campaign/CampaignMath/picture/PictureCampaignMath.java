package com.puzzle.mathpuzzle.Campaign.CampaignMath.picture;


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

public class PictureCampaignMath extends AppCompatActivity {

    Random r1;
    Random r2;


    int x;
    Random colorrs;


    String dictionary[] = {
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
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
    @BindView(R.id.image)
    ImageButton image;

    SharedPreferences sharedPreferences;

    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;

    @BindView(R.id.money) TextView Money_text;
    @BindView(R.id.textLvls) TextView textLvls;
    @BindView(R.id.edt1) EditText edt1;
    @BindView(R.id.edt2) EditText edt2;
    @BindView(R.id.edt3) EditText edt3;
    @BindView(R.id.textFind) TextView textFind;


    @BindView(R.id.progress)
    ProgressBar progressBar;

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_campaign_math);
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
        if(dictionary[4].equals("5") || dictionary[4].equals("9") || dictionary[4].equals("13") || dictionary[4].equals("17") || dictionary[4].equals("20") || dictionary[4].equals("38") || dictionary[4].equals("39") || dictionary[4].equals("44") || dictionary[4].equals("51") || dictionary[4].equals("55") || dictionary[4].equals("58")|| dictionary[4].equals("59") || dictionary[4].equals("62") || dictionary[4].equals("63") || dictionary[4].equals("70") || dictionary[4].equals("76")  || dictionary[4].equals("81") || dictionary[4].equals("82") || dictionary[4].equals("83") || dictionary[4].equals("86") || dictionary[4].equals("90") ||  dictionary[4].equals("91")  || dictionary[4].equals("96") ||  dictionary[4].equals("101")) {
            if (edt1.getText().toString().equalsIgnoreCase(dictionary[1]) || edt1.getText().toString().equalsIgnoreCase(dictionary[2])) {

                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(PictureCampaignMath.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
        } else if(dictionary[4].equals("84")){
            if (edt1.getText().toString().equalsIgnoreCase(dictionary[1])&& edt2.getText().toString().equalsIgnoreCase(dictionary[2])
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[5])) {

                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                edt2.setText("");
                edt3.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(PictureCampaignMath.this, answer, Toast.LENGTH_LONG);
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
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word0.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word0.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word0.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word0.getText().toString());
                }

                break;
            case R.id.Word1:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word1.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word1.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word1.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word1.getText().toString());
                }

                break;
            case R.id.Word2:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word2.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word2.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word2.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word2.getText().toString());
                }
                break;
            case R.id.Word3:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word3.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word3.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word3.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word3.getText().toString());
                }

                break;
            case R.id.Word4:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word4.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word4.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word4.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word4.getText().toString());
                }

                break;
            case R.id.Word5:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word5.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word5.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word5.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word5.getText().toString());
                }

                break;
            case R.id.Word6:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word6.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word6.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word6.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word6.getText().toString());
                }

                break;
            case R.id.Word7:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word7.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word7.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word7.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word7.getText().toString());
                }

                break;
            case R.id.Word8:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word8.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word8.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word8.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word8.getText().toString());
                }

                break;
            case R.id.Word9:
                if(dictionary[4].equals("84")){
                    if(edt1.getText().toString().equals("")){
                        edt1.setText(Word9.getText().toString());
                    } else if(edt2.getText().toString().equals("")) {
                        edt2.setText(Word9.getText().toString());
                    } else if(edt3.getText().toString().equals("")){
                        edt3.setText(Word9.getText().toString());
                    }
                }else{
                    edt1.setText(edt1.getText().toString() + Word9.getText().toString());
                }

                break;
        }
    }

    public void CleanEdt(View view) {

        edt1.setText("");
        edt2.setText("");
        edt3.setText("");
    }


    public void progressBar1() {
        Intent intent = getIntent();
        x = intent.getIntExtra("progress", 0);
        progressBar.setProgress(x);
    }

    public void forResult() {
        switch (dictionary[4]) {
            case "5":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_5 = new Intent();
                intent_5.putExtra("money_result", Money_text.getText().toString());
                intent_5.putExtra("block", "5");
                setResult(RESULT_OK, intent_5);
                finish();
                break;
            case "9":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_9 = new Intent();
                intent_9.putExtra("money_result", Money_text.getText().toString());
                intent_9.putExtra("block", "9");
                setResult(RESULT_OK, intent_9);
                finish();
                break;
            case "13":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_13 = new Intent();
                intent_13.putExtra("money_result", Money_text.getText().toString());
                intent_13.putExtra("block", "13");
                setResult(RESULT_OK, intent_13);
                finish();
                break;
            case "17":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_17 = new Intent();
                intent_17.putExtra("money_result", Money_text.getText().toString());
                intent_17.putExtra("block", "17");
                setResult(RESULT_OK, intent_17);
                finish();
                break;
            case "20":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_20 = new Intent();
                intent_20.putExtra("money_result", Money_text.getText().toString());
                intent_20.putExtra("block", "20");
                setResult(RESULT_OK, intent_20);
                finish();
                break;
            case "38":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_38 = new Intent();
                intent_38.putExtra("money_result", Money_text.getText().toString());
                intent_38.putExtra("block", "38");
                setResult(RESULT_OK, intent_38);
                finish();
                break;
            case "39":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_39 = new Intent();
                intent_39.putExtra("money_result", Money_text.getText().toString());
                intent_39.putExtra("block", "39");
                setResult(RESULT_OK, intent_39);
                finish();
                break;
            case "44":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_44 = new Intent();
                intent_44.putExtra("money_result", Money_text.getText().toString());
                intent_44.putExtra("block", "44");
                setResult(RESULT_OK, intent_44);
                finish();
                break;
            case "51":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_51 = new Intent();
                intent_51.putExtra("money_result", Money_text.getText().toString());
                intent_51.putExtra("block", "51");
                setResult(RESULT_OK, intent_51);
                finish();
                break;
            case "55":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_55 = new Intent();
                intent_55.putExtra("money_result", Money_text.getText().toString());
                intent_55.putExtra("block", "55");
                setResult(RESULT_OK, intent_55);
                finish();
                break;
            case "58":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_58 = new Intent();
                intent_58.putExtra("money_result", Money_text.getText().toString());
                intent_58.putExtra("block", "58");
                setResult(RESULT_OK, intent_58);
                finish();
                break;
            case "59":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_59 = new Intent();
                intent_59.putExtra("money_result", Money_text.getText().toString());
                intent_59.putExtra("block", "59");
                setResult(RESULT_OK, intent_59);
                finish();
                break;
            case "62":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_62 = new Intent();
                intent_62.putExtra("money_result", Money_text.getText().toString());
                intent_62.putExtra("block", "62");
                setResult(RESULT_OK, intent_62);
                finish();
                break;
            case "63":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_63 = new Intent();
                intent_63.putExtra("money_result", Money_text.getText().toString());
                intent_63.putExtra("block", "63");
                setResult(RESULT_OK, intent_63);
                finish();
                break;
            case "70":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_70 = new Intent();
                intent_70.putExtra("money_result", Money_text.getText().toString());
                intent_70.putExtra("block", "70");
                setResult(RESULT_OK, intent_70);
                finish();
                break;
            case "76":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_76 = new Intent();
                intent_76.putExtra("money_result", Money_text.getText().toString());
                intent_76.putExtra("block", "76");
                setResult(RESULT_OK, intent_76);
                finish();
                break;
            case "81":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_81 = new Intent();
                intent_81.putExtra("money_result", Money_text.getText().toString());
                intent_81.putExtra("block", "81");
                setResult(RESULT_OK, intent_81);
                finish();
                break;
            case "82":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_82 = new Intent();
                intent_82.putExtra("money_result", Money_text.getText().toString());
                intent_82.putExtra("block", "82");
                setResult(RESULT_OK, intent_82);
                finish();
                break;
            case "83":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_83 = new Intent();
                intent_83.putExtra("money_result", Money_text.getText().toString());
                intent_83.putExtra("block", "83");
                setResult(RESULT_OK, intent_83);
                finish();
                break;
            case "84":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_84 = new Intent();
                intent_84.putExtra("money_result", Money_text.getText().toString());
                intent_84.putExtra("block", "84");
                setResult(RESULT_OK, intent_84);
                finish();
                break;
            case "86":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_86 = new Intent();
                intent_86.putExtra("money_result", Money_text.getText().toString());
                intent_86.putExtra("block", "86");
                setResult(RESULT_OK, intent_86);
                finish();
                break;
            case "90":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_90 = new Intent();
                intent_90.putExtra("money_result", Money_text.getText().toString());
                intent_90.putExtra("block", "90");
                setResult(RESULT_OK, intent_90);
                finish();
                break;
            case "91":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_91 = new Intent();
                intent_91.putExtra("money_result", Money_text.getText().toString());
                intent_91.putExtra("block", "91");
                setResult(RESULT_OK, intent_91);
                finish();
                break;
            case "96":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_96 = new Intent();
                intent_96.putExtra("money_result", Money_text.getText().toString());
                intent_96.putExtra("block", "96");
                setResult(RESULT_OK, intent_96);
                finish();
                break;
            case "101":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_101 = new Intent();
                intent_101.putExtra("money_result", Money_text.getText().toString());
                intent_101.putExtra("block", "101");
                setResult(RESULT_OK, intent_101);
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
        textFind.setText(dictionary[0]);
        dictionary[1] = intent.getStringExtra("answer");
        dictionary[2] = intent.getStringExtra("answer1");
        dictionary[5] = intent.getStringExtra("answer2");
        dictionary[6] = intent.getStringExtra("answer3");
        dictionary[3] = intent.getStringExtra("size");
        dictionary[4] = String.valueOf(intent.getIntExtra("lvl",0));


        String level = getResources().getString(R.string.levelButtonCamp);
        textLvls.setText(level + ": " + intent.getIntExtra("lvl",0));

        edt2.setVisibility(View.GONE);
        edt3.setVisibility(View.GONE);

        if((intent.getIntExtra("lvl",0)) == 39){
            image.setImageResource(R.drawable.lvl39);
        } else if((intent.getIntExtra("lvl",0)) == 5){
            image.setImageResource(R.drawable.lvl5);
        } else if((intent.getIntExtra("lvl",0)) == 9){
            image.setImageResource(R.drawable.lvl9);
        } else if((intent.getIntExtra("lvl",0)) == 13){
            image.setImageResource(R.drawable.lvl13);
        } else if((intent.getIntExtra("lvl",0)) == 17){
            image.setImageResource(R.drawable.lvl17);
        } else if((intent.getIntExtra("lvl",0)) == 38){
            image.setImageResource(R.drawable.lvl38);
        } else if((intent.getIntExtra("lvl",0)) == 20){
            image.setImageResource(R.drawable.lvl20);
        } else if((intent.getIntExtra("lvl",0)) == 44){
            image.setImageResource(R.drawable.lvl44);
        } else if((intent.getIntExtra("lvl",0)) == 51){
            image.setImageResource(R.drawable.lvl51);
        } else if((intent.getIntExtra("lvl",0)) == 55){
            image.setImageResource(R.drawable.lvl55);
        } else if((intent.getIntExtra("lvl",0)) == 58){
            image.setImageResource(R.drawable.lvl58);
        }else if((intent.getIntExtra("lvl",0)) == 59){
            image.setImageResource(R.drawable.lvl59);
        } else if((intent.getIntExtra("lvl",0)) == 62){
            image.setImageResource(R.drawable.lvl62);
        } else if((intent.getIntExtra("lvl",0)) == 63){
            image.setImageResource(R.drawable.lvl63);
        } else if((intent.getIntExtra("lvl",0)) == 70){
            image.setImageResource(R.drawable.lvl70);
        } else if((intent.getIntExtra("lvl",0)) == 76){
            image.setImageResource(R.drawable.lvl76);
        }  else if((intent.getIntExtra("lvl",0)) == 81){
            image.setImageResource(R.drawable.lvl81);
        } else if((intent.getIntExtra("lvl",0)) == 82){
            image.setImageResource(R.drawable.lvl82);
        }else if((intent.getIntExtra("lvl",0)) == 83){
            image.setImageResource(R.drawable.lvl83);
        }  else if((intent.getIntExtra("lvl",0)) == 84){
            edt2.setVisibility(View.VISIBLE);
            edt3.setVisibility(View.VISIBLE);
            edt1.setMaxLines(1);
            edt1.setMaxEms(1);
            edt2.setMaxLines(1);
            edt3.setMaxLines(1);
            image.setImageResource(R.drawable.lvl84);
        }else if((intent.getIntExtra("lvl",0)) == 86){
            image.setImageResource(R.drawable.lvl86);
        } else if((intent.getIntExtra("lvl",0)) == 90){
            image.setImageResource(R.drawable.lvl90);
        } else if((intent.getIntExtra("lvl",0)) == 91){
            image.setImageResource(R.drawable.lvl91);
        }  else if((intent.getIntExtra("lvl",0)) == 96){
            image.setImageResource(R.drawable.lvl96);
        } else if((intent.getIntExtra("lvl",0)) == 101){
            image.setImageResource(R.drawable.lvl101);
        }
    }

    private void newGame() {
        edt1.setText("");
        edt2.setText("");
        edt3.setText("");
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
        Edt(edt2);
        Edt(edt3);
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
        view = LayoutInflater.from(PictureCampaignMath.this).inflate(R.layout.mathcampaigntips, null);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.imageTips);

        String[] words = {"Показать подсказку", "Показать ответ"};
        builder.setItems(words, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        AlertDialog.Builder builder = new AlertDialog.Builder(PictureCampaignMath.this);


                        if(dictionary[4].equalsIgnoreCase("39")){
                            image.setImageResource(R.drawable.lvl39);
                        } else if(dictionary[4].equalsIgnoreCase("20")){
                            image.setImageResource(R.drawable.lvl20);
                        } else if(dictionary[4].equalsIgnoreCase("44")){
                            image.setImageResource(R.drawable.lvl44);
                        } else if(dictionary[4].equalsIgnoreCase("51")){
                            image.setImageResource(R.drawable.lvl51);
                        } else if(dictionary[4].equalsIgnoreCase("55")){
                            image.setImageResource(R.drawable.lvl55);
                        } else if(dictionary[4].equalsIgnoreCase("58")){
                            image.setImageResource(R.drawable.lvl58);
                        }else if(dictionary[4].equalsIgnoreCase("59")){
                            image.setImageResource(R.drawable.lvl59);
                        } else if(dictionary[4].equalsIgnoreCase("62")){
                            image.setImageResource(R.drawable.lvl62);
                        } else if(dictionary[4].equalsIgnoreCase("63")){
                            image.setImageResource(R.drawable.lvl63);
                        } else if(dictionary[4].equalsIgnoreCase("70")){
                            image.setImageResource(R.drawable.lvl70);
                        } else if(dictionary[4].equalsIgnoreCase("76")){
                            image.setImageResource(R.drawable.lvl76);
                        }  else if(dictionary[4].equalsIgnoreCase("81")){
                            image.setImageResource(R.drawable.lvl81);
                        } else if(dictionary[4].equalsIgnoreCase("82")){
                            image.setImageResource(R.drawable.lvl82);
                        }else if(dictionary[4].equalsIgnoreCase("83")){
                            image.setImageResource(R.drawable.lvl83);
                        }  else if(dictionary[4].equalsIgnoreCase("84")){
                            image.setImageResource(R.drawable.lvl84);
                        }else if(dictionary[4].equalsIgnoreCase("86")){
                            image.setImageResource(R.drawable.lvl86);
                        } else if(dictionary[4].equalsIgnoreCase("90")){
                            image.setImageResource(R.drawable.lvl90);
                        } else if(dictionary[4].equalsIgnoreCase("91")){
                            image.setImageResource(R.drawable.lvl91);
                        }  else if(dictionary[4].equalsIgnoreCase("96")){
                            image.setImageResource(R.drawable.lvl96);
                        } else if(dictionary[4].equalsIgnoreCase("101")){
                            image.setImageResource(R.drawable.lvl101);
                        }

                        builder.setView(view);
                        builder.show();
                        break;
                    case 1:
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(PictureCampaignMath.this);


                        if(dictionary[4].equalsIgnoreCase("39")){
                            image.setImageResource(R.drawable.lvl39);
                        } else if(dictionary[4].equalsIgnoreCase("20")){
                            image.setImageResource(R.drawable.lvl20);
                        } else if(dictionary[4].equalsIgnoreCase("44")){
                            image.setImageResource(R.drawable.lvl44);
                        } else if(dictionary[4].equalsIgnoreCase("51")){
                            image.setImageResource(R.drawable.lvl51);
                        } else if(dictionary[4].equalsIgnoreCase("55")){
                            image.setImageResource(R.drawable.lvl55);
                        } else if(dictionary[4].equalsIgnoreCase("58")){
                            image.setImageResource(R.drawable.lvl58);
                        }else if(dictionary[4].equalsIgnoreCase("59")){
                            image.setImageResource(R.drawable.lvl59);
                        } else if(dictionary[4].equalsIgnoreCase("62")){
                            image.setImageResource(R.drawable.lvl62);
                        } else if(dictionary[4].equalsIgnoreCase("63")){
                            image.setImageResource(R.drawable.lvl63);
                        } else if(dictionary[4].equalsIgnoreCase("70")){
                            image.setImageResource(R.drawable.lvl70);
                        } else if(dictionary[4].equalsIgnoreCase("76")){
                            image.setImageResource(R.drawable.lvl76);
                        }  else if(dictionary[4].equalsIgnoreCase("81")){
                            image.setImageResource(R.drawable.lvl81);
                        } else if(dictionary[4].equalsIgnoreCase("82")){
                            image.setImageResource(R.drawable.lvl82);
                        }else if(dictionary[4].equalsIgnoreCase("83")){
                            image.setImageResource(R.drawable.lvl83);
                        }  else if(dictionary[4].equalsIgnoreCase("84")){
                            image.setImageResource(R.drawable.lvl84);
                        }else if(dictionary[4].equalsIgnoreCase("86")){
                            image.setImageResource(R.drawable.lvl86);
                        } else if(dictionary[4].equalsIgnoreCase("90")){
                            image.setImageResource(R.drawable.lvl90);
                        } else if(dictionary[4].equalsIgnoreCase("91")){
                            image.setImageResource(R.drawable.lvl91);
                        }  else if(dictionary[4].equalsIgnoreCase("96")){
                            image.setImageResource(R.drawable.lvl96);
                        } else if(dictionary[4].equalsIgnoreCase("101")){
                            image.setImageResource(R.drawable.lvl101);
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

