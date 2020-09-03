package com.puzzle.mathpuzzle.Campaign.CampaignMath;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.puzzle.mathpuzzle.Campaign.CampaignMath.Buttons.ButtonsCampaign;
import com.puzzle.mathpuzzle.Campaign.CampaignMath.Signs.SignsCampaign;
import com.puzzle.mathpuzzle.Campaign.CampaignMath.TextQuestions.TextQuestionsCamplaign;
import com.puzzle.mathpuzzle.Campaign.CampaignMath.picture.PictureCampaignMath;
import com.puzzle.mathpuzzle.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MapLevel extends AppCompatActivity {

    @BindView(R.id.btn) Button btn;
    @BindView(R.id.btn2) Button btn2;
    @BindView(R.id.btn3) Button btn3;
    @BindView(R.id.btn4) Button btn4;
    @BindView(R.id.btn5) Button btn5;
    @BindView(R.id.btn6) Button btn6;
    @BindView(R.id.btn7) Button btn7;
    @BindView(R.id.btn8) Button btn8;
    @BindView(R.id.btn9) Button btn9;
    @BindView(R.id.btn10) Button btn10;
    @BindView(R.id.btn11) Button btn11;
    @BindView(R.id.btn12) Button btn12;
    @BindView(R.id.btn13) Button btn13;
    @BindView(R.id.btn14) Button btn14;
    @BindView(R.id.btn15) Button btn15;
    @BindView(R.id.btn16) Button btn16;
    @BindView(R.id.btn17) Button btn17;
    @BindView(R.id.btn18) Button btn18;
    @BindView(R.id.btn19) Button btn19;
    @BindView(R.id.btn20) Button btn20;
    @BindView(R.id.btn21) Button btn21;
    @BindView(R.id.btn22) Button btn22;
    @BindView(R.id.btn23) Button btn23;
    @BindView(R.id.btn24) Button btn24;
    @BindView(R.id.btn25) Button btn25;
    @BindView(R.id.btn26) Button btn26;
    @BindView(R.id.btn27) Button btn27;
    @BindView(R.id.btn28) Button btn28;
    @BindView(R.id.btn29) Button btn29;
    @BindView(R.id.btn30) Button btn30;
    @BindView(R.id.btn31) Button btn31;
    @BindView(R.id.btn32) Button btn32;
    @BindView(R.id.btn33) Button btn33;
    @BindView(R.id.btn34) Button btn34;
    @BindView(R.id.btn35) Button btn35;
    @BindView(R.id.btn36) Button btn36;
    @BindView(R.id.btn37) Button btn37;
    @BindView(R.id.btn38) Button btn38;
    @BindView(R.id.btn39) Button btn39;
    @BindView(R.id.btn40) Button btn40;
    @BindView(R.id.btn41) Button btn41;
    @BindView(R.id.btn42) Button btn42;
    @BindView(R.id.btn43) Button btn43;
    @BindView(R.id.btn44) Button btn44;
    @BindView(R.id.btn45) Button btn45;
    @BindView(R.id.btn46) Button btn46;
    @BindView(R.id.btn47) Button btn47;
    @BindView(R.id.btn48) Button btn48;
    @BindView(R.id.btn49) Button btn49;
    @BindView(R.id.btn50) Button btn50;
    @BindView(R.id.btn51) Button btn51;
    @BindView(R.id.btn52) Button btn52;
    @BindView(R.id.btn53) Button btn53;
    @BindView(R.id.btn54) Button btn54;
    @BindView(R.id.btn55) Button btn55;
    @BindView(R.id.btn56) Button btn56;
    @BindView(R.id.btn57) Button btn57;
    @BindView(R.id.btn58) Button btn58;
    @BindView(R.id.btn59) Button btn59;
    @BindView(R.id.btn60) Button btn60;
    @BindView(R.id.btn61) Button btn61;
    @BindView(R.id.btn62) Button btn62;
    @BindView(R.id.btn63) Button btn63;
    @BindView(R.id.btn64) Button btn64;
    @BindView(R.id.btn65) Button btn65;
    @BindView(R.id.btn66) Button btn66;
    @BindView(R.id.btn67) Button btn67;
    @BindView(R.id.btn68) Button btn68;
    @BindView(R.id.btn69) Button btn69;
    @BindView(R.id.btn70) Button btn70;
    @BindView(R.id.btn71) Button btn71;
    @BindView(R.id.btn72) Button btn72;
    @BindView(R.id.btn73) Button btn73;
    @BindView(R.id.btn74) Button btn74;
    @BindView(R.id.btn75) Button btn75;
    @BindView(R.id.btn76) Button btn76;
    @BindView(R.id.btn77) Button btn77;
    @BindView(R.id.btn78) Button btn78;
    @BindView(R.id.btn79) Button btn79;
    @BindView(R.id.btn80) Button btn80;
    @BindView(R.id.btn81) Button btn81;
    @BindView(R.id.btn82) Button btn82;
    @BindView(R.id.btn83) Button btn83;
    @BindView(R.id.btn84) Button btn84;
    @BindView(R.id.btn85) Button btn85;
    @BindView(R.id.btn86) Button btn86;
    @BindView(R.id.btn87) Button btn87;
    @BindView(R.id.btn88) Button btn88;
    @BindView(R.id.btn89) Button btn89;
    @BindView(R.id.btn90) Button btn90;
    @BindView(R.id.btn91) Button btn91;
    @BindView(R.id.btn92) Button btn92;
    @BindView(R.id.btn93) Button btn93;
    @BindView(R.id.btn94) Button btn94;
    @BindView(R.id.btn95) Button btn95;
    @BindView(R.id.btn96) Button btn96;
    @BindView(R.id.btn97) Button btn97;
    @BindView(R.id.btn98) Button btn98;
    @BindView(R.id.btn99) Button btn99;
    @BindView(R.id.btn100) Button btn100;
    @BindView(R.id.btn101) Button btn101;
    @BindView(R.id.btn102) Button btn102;
    @BindView(R.id.btn103) Button btn103;
    @BindView(R.id.btn104) Button btn104;
    @BindView(R.id.btn105) Button btn105;
    @BindView(R.id.btn106) Button btn106;
    @BindView(R.id.btn107) Button btn107;
    @BindView(R.id.btn108) Button btn108;
    @BindView(R.id.btn109) Button btn109;
    @BindView(R.id.btn110) Button btn110;


    String block = "";
    int money = 0;
    int progress = 0;
    String money_result = "" ;

    SharedPreferences sharedPreferences;

    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;
    boolean isClicked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_level);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        if(intent!=null) {
            money = intent.getIntExtra("money", 0);
            SaveMoney();
        }else{
            loadMoney();
        }

        LoadPreferences();
        isClicked = false;

    }


    private void resultAfterTest(String numb){

        Intent intent = new Intent(this, Math_text_and_signs_after_lvl.class);
        intent.putExtra("block",numb);
        intent.putExtra("money",money);


        if(numb.equals("1")){
            intent.putExtra("Answer","6");
        } else  if(numb.equals("2")){
            intent.putExtra("Answer","0 " + getResources().getText(R.string.or) + " 16");
        }else  if(numb.equals("3")){
            intent.putExtra("Answer","16");
        }else  if(numb.equals("4")){
            intent.putExtra("Answer","5");
        }else  if(numb.equals("5")){
            intent.putExtra("Answer","1");
        }else  if(numb.equals("6")){
            intent.putExtra("Answer","11");
        }else  if(numb.equals("7")){
            intent.putExtra("Answer","15");
        }else  if(numb.equals("8")){
            intent.putExtra("Answer","2");
        }else  if(numb.equals("9")){
            intent.putExtra("Answer","6");
        }else  if(numb.equals("10")){
            intent.putExtra("Answer","8");
        }else  if(numb.equals("11")){
            intent.putExtra("Answer","2");
        }else  if(numb.equals("12")){
            intent.putExtra("Answer","5");
        }else  if(numb.equals("13")){
            intent.putExtra("Answer","4");
        }else  if(numb.equals("14")){
            intent.putExtra("Answer","96");
        }else  if(numb.equals("15")){
            intent.putExtra("Answer","7");
        }else  if(numb.equals("16")){
            intent.putExtra("Answer","5");
        }else  if(numb.equals("17")){
            intent.putExtra("Answer","13");
        }else  if(numb.equals("18")){
            intent.putExtra("Answer","18");
        }else  if(numb.equals("19")){
            intent.putExtra("Answer","2 " + getResources().getText(R.string.and) + " 2");
        }else  if(numb.equals("20")){
            intent.putExtra("Answer","2");
        }else  if(numb.equals("21")){
            intent.putExtra("Answer","50");
        }else  if(numb.equals("22")){
            intent.putExtra("Answer","5");
        }else  if(numb.equals("23")){
            intent.putExtra("Answer","20");
        }else  if(numb.equals("24")){
            intent.putExtra("Answer","48");
        }else  if(numb.equals("25")){
            intent.putExtra("Answer","19");
        }else  if(numb.equals("26")){
            intent.putExtra("Answer","8");
        }else  if(numb.equals("27")){
            intent.putExtra("Answer","96");
        }else  if(numb.equals("28")){
            intent.putExtra("Answer","3");
        }else  if(numb.equals("29")){
            intent.putExtra("Answer","24");
        }else  if(numb.equals("30")){
            intent.putExtra("Answer","2");
        }else  if(numb.equals("31")){
            intent.putExtra("Answer","42");
        }else  if(numb.equals("32")){
            intent.putExtra("Answer","36");
        }else  if(numb.equals("33")){
            intent.putExtra("Answer","6");
        }else  if(numb.equals("34")){
            intent.putExtra("Answer","6");
        }else  if(numb.equals("35")){
            intent.putExtra("Answer","5");
        }else  if(numb.equals("36")){
            intent.putExtra("Answer","5");
        }else  if(numb.equals("37")){
            intent.putExtra("Answer","26");
        }else  if(numb.equals("38")){
            intent.putExtra("Answer","20");
        }else  if(numb.equals("39")){
            intent.putExtra("Answer","7");
        }else  if(numb.equals("40")){
            intent.putExtra("Answer","30");
        }else  if(numb.equals("41")){
            intent.putExtra("Answer","60");
        }else  if(numb.equals("42")){
            intent.putExtra("Answer","90");
        }else  if(numb.equals("43")){
            intent.putExtra("Answer","32");
        }else  if(numb.equals("44")){
            intent.putExtra("Answer","16");
        }else  if(numb.equals("45")){
            intent.putExtra("Answer","24");
        }else  if(numb.equals("46")){
            intent.putExtra("Answer"," * , + , - , * ");
        }else  if(numb.equals("47")){
            intent.putExtra("Answer","2");
        }else  if(numb.equals("48")){
            intent.putExtra("Answer","1");
        }else  if(numb.equals("49")){
            intent.putExtra("Answer","69");
        }else  if(numb.equals("50")){
            intent.putExtra("Answer","9");
        } else  if(numb.equals("51")){
            intent.putExtra("Answer","3");
        } else  if(numb.equals("52")){
            intent.putExtra("Answer","25");
        } else  if(numb.equals("53")){
            intent.putExtra("Answer","2");
        } else  if(numb.equals("54")){
            intent.putExtra("Answer","0");
        } else  if(numb.equals("55")){
            intent.putExtra("Answer","7");
        } else  if(numb.equals("56")){
            intent.putExtra("Answer","810");
        } else  if(numb.equals("57")){
            intent.putExtra("Answer","7");
        } else  if(numb.equals("58")){
            intent.putExtra("Answer","3");
        } else  if(numb.equals("59")){
            intent.putExtra("Answer","0");
        } else  if(numb.equals("60")){
            intent.putExtra("Answer","5");
        } else  if(numb.equals("61")){
            intent.putExtra("Answer","64");
        } else  if(numb.equals("62")){
            intent.putExtra("Answer","20");
        } else  if(numb.equals("63")){
            intent.putExtra("Answer","25");
        } else  if(numb.equals("64")){
            intent.putExtra("Answer"," + , - ,  + ");
        } else  if(numb.equals("65")){
            intent.putExtra("Answer","936");
        } else  if(numb.equals("66")){
            intent.putExtra("Answer","100 " + getResources().getText(R.string.or) + " 1000000");
        } else  if(numb.equals("67")){
            intent.putExtra("Answer","64");
        } else  if(numb.equals("68")){
            intent.putExtra("Answer","915");
        } else  if(numb.equals("69")){
            intent.putExtra("Answer","9");
        } else  if(numb.equals("70")){
            intent.putExtra("Answer","48");
        } else  if(numb.equals("71")){
            intent.putExtra("Answer","9");
        } else  if(numb.equals("72")){
            intent.putExtra("Answer","153");
        } else  if(numb.equals("73")){
            intent.putExtra("Answer","85");
        } else  if(numb.equals("74")){
            intent.putExtra("Answer","256");
        } else  if(numb.equals("75")){
            intent.putExtra("Answer","200");
        } else  if(numb.equals("76")){
            intent.putExtra("Answer","2");
        } else  if(numb.equals("77")){
            intent.putExtra("Answer","86");
        } else  if(numb.equals("78")){
            intent.putExtra("Answer","5");
        } else  if(numb.equals("79")){
            intent.putExtra("Answer","1");
        } else  if(numb.equals("80")){
            intent.putExtra("Answer","120");
        } else  if(numb.equals("81")){
            intent.putExtra("Answer","8");
        } else  if(numb.equals("82")){
            intent.putExtra("Answer","52");
        } else  if(numb.equals("83")){
            intent.putExtra("Answer","68");
        } else  if(numb.equals("84")){
            intent.putExtra("Answer"," x = 2 , y = 1 , z = 3 ");
        } else  if(numb.equals("85")){
            intent.putExtra("Answer","1");
        } else  if(numb.equals("86")){
            intent.putExtra("Answer","10");
        } else  if(numb.equals("87")){
            intent.putExtra("Answer"," 7 , 9 , 19 , 7 ");
        } else  if(numb.equals("88")){
            intent.putExtra("Answer"," 10 " + getResources().getText(R.string.or) + " 14 ");
        } else  if(numb.equals("89")){
            intent.putExtra("Answer","10");
        } else  if(numb.equals("90")){
            intent.putExtra("Answer","11");
        } else  if(numb.equals("91")){
            intent.putExtra("Answer","14");
        } else  if(numb.equals("92")){
            intent.putExtra("Answer","23");
        } else  if(numb.equals("93")){
            intent.putExtra("Answer","6");
        } else  if(numb.equals("94")){
            intent.putExtra("Answer","71");
        } else  if(numb.equals("95")){
            intent.putExtra("Answer","9");
        } else  if(numb.equals("96")){
            intent.putExtra("Answer","29");
        } else  if(numb.equals("97")){
            intent.putExtra("Answer","2");
        } else  if(numb.equals("98")){
            intent.putExtra("Answer","925136");
        } else  if(numb.equals("99")){
            intent.putExtra("Answer","51");
        } else  if(numb.equals("100")){
            intent.putExtra("Answer","24");
        } else  if(numb.equals("101")){
            intent.putExtra("Answer","7");
        } else  if(numb.equals("102")){
            intent.putExtra("Answer","18");
        } else  if(numb.equals("103")){
            intent.putExtra("Answer","722214");
        } else  if(numb.equals("104")){
            intent.putExtra("Answer","720");
        } else  if(numb.equals("105")){
            intent.putExtra("Answer"," 51 " + getResources().getText(R.string.or) + " 15 ");
        } else  if(numb.equals("106")){
            intent.putExtra("Answer","4");
        } else  if(numb.equals("107")){
            intent.putExtra("Answer","44");
        } else  if(numb.equals("108")){
            intent.putExtra("Answer","276");
        } else  if(numb.equals("109")){
            intent.putExtra("Answer","44");
        } else  if(numb.equals("110")){
            intent.putExtra("Answer"," x = 1 , y = 8 , z = 5 ");
        }

        startActivityForResult(intent,111);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data == null){
            return;
        }


        if(requestCode == 111){
            block = data.getStringExtra("Block");
            if(block.equalsIgnoreCase("110")){
                finish();
            }else {
                nextLevel();
            }
        }else {
            money_result = data.getStringExtra("money_result");
            money = Integer.parseInt(money_result);
            SaveMoney();

        sharedPreferences = getPreferences(MODE_PRIVATE);
        if(data!=null)
            block = data.getStringExtra("block");
        else block = "0";

            switch (block) {
                case "0":
                    break;
                case "1":
                    progress = 1;
                    SaveProgress();
                    btn.setClickable(true);
                    btn.setEnabled(true);

                    btn2.setEnabled(true);
                    btn2.setClickable(true);

                    resultAfterTest("1");

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("state", btn.isClickable());
                    editor.putBoolean("Next", btn2.isClickable());
                    editor.apply();

                    break;
                case "2":
                    progress = 2;
                    SaveProgress();
                    btn2.setClickable(true);
                    btn2.setEnabled(true);

                    btn3.setEnabled(true);
                    btn3.setClickable(true);

                    resultAfterTest("2");

                    SharedPreferences.Editor editor2 = sharedPreferences.edit();
                    editor2.putBoolean("state2", btn2.isClickable());
                    editor2.putBoolean("Next2", btn3.isClickable());
                    editor2.apply();
                    break;
                case "3":
                    progress = 3;
                    SaveProgress();
                    btn3.setClickable(true);
                    btn3.setEnabled(true);

                    btn4.setEnabled(true);
                    btn4.setClickable(true);

                    resultAfterTest("3");

                    SharedPreferences.Editor editor3 = sharedPreferences.edit();
                    editor3.putBoolean("state3", btn3.isClickable());
                    editor3.putBoolean("Next3", btn4.isClickable());
                    editor3.apply();
                    break;
                case "4":
                    progress = 4;
                    SaveProgress();
                    btn4.setClickable(true);
                    btn4.setEnabled(true);

                    btn5.setEnabled(true);
                    btn5.setClickable(true);

                    resultAfterTest("4");

                    SharedPreferences.Editor editor4 = sharedPreferences.edit();
                    editor4.putBoolean("state4", btn4.isClickable());
                    editor4.putBoolean("Next4", btn5.isClickable());
                    editor4.apply();
                    break;
                case "5":
                    progress = 5;
                    SaveProgress();
                    btn5.setClickable(true);
                    btn5.setEnabled(true);

                    btn6.setEnabled(true);
                    btn6.setClickable(true);

                    resultAfterTest("5");

                    SharedPreferences.Editor editor5 = sharedPreferences.edit();
                    editor5.putBoolean("state5", btn5.isClickable());
                    editor5.putBoolean("Next5", btn6.isClickable());
                    editor5.apply();
                    break;
                case "6":
                    progress = 6;
                    SaveProgress();
                    btn6.setClickable(true);
                    btn6.setEnabled(true);

                    btn7.setEnabled(true);
                    btn7.setClickable(true);

                    resultAfterTest("6");

                    SharedPreferences.Editor editor6 = sharedPreferences.edit();
                    editor6.putBoolean("state6", btn6.isClickable());
                    editor6.putBoolean("Next6", btn7.isClickable());
                    editor6.apply();
                    break;
                case "7":
                    progress = 7;
                    SaveProgress();
                    btn7.setClickable(true);
                    btn7.setEnabled(true);

                    btn8.setEnabled(true);
                    btn8.setClickable(true);

                    resultAfterTest("7");

                    SharedPreferences.Editor editor7 = sharedPreferences.edit();
                    editor7.putBoolean("state7", btn7.isClickable());
                    editor7.putBoolean("Next7", btn8.isClickable());
                    editor7.apply();
                    break;
                case "8":
                    progress = 8;
                    SaveProgress();
                    btn8.setClickable(true);
                    btn8.setEnabled(true);

                    btn9.setEnabled(true);
                    btn9.setClickable(true);

                    resultAfterTest("8");

                    SharedPreferences.Editor editor8 = sharedPreferences.edit();
                    editor8.putBoolean("state8", btn8.isClickable());
                    editor8.putBoolean("Next8", btn9.isClickable());
                    editor8.apply();
                    break;
                case "9":
                    progress = 9;
                    SaveProgress();
                    btn9.setClickable(true);
                    btn9.setEnabled(true);

                    btn10.setEnabled(true);
                    btn10.setClickable(true);

                    resultAfterTest("9");

                    SharedPreferences.Editor editor9 = sharedPreferences.edit();
                    editor9.putBoolean("state9", btn9.isClickable());
                    editor9.putBoolean("Next9", btn10.isClickable());
                    editor9.apply();
                    break;
                case "10":
                    progress = 10;
                    SaveProgress();
                    btn10.setClickable(true);
                    btn10.setEnabled(true);

                    btn11.setEnabled(true);
                    btn11.setClickable(true);

                    resultAfterTest("10");

                    SharedPreferences.Editor editor10 = sharedPreferences.edit();
                    editor10.putBoolean("state10", btn10.isClickable());
                    editor10.putBoolean("Next10", btn11.isClickable());
                    editor10.apply();
                    break;
                case "11":
                    progress = 11;
                    SaveProgress();
                    btn11.setClickable(true);
                    btn11.setEnabled(true);

                    btn12.setEnabled(true);
                    btn12.setClickable(true);

                    resultAfterTest("11");

                    SharedPreferences.Editor editor11 = sharedPreferences.edit();
                    editor11.putBoolean("state11", btn11.isClickable());
                    editor11.putBoolean("Next11", btn12.isClickable());
                    editor11.apply();
                    break;
                case "12":

                    progress = 12;
                    SaveProgress();
                    btn12.setClickable(true);
                    btn12.setEnabled(true);

                    btn13.setEnabled(true);
                    btn13.setClickable(true);

                    resultAfterTest("12");

                    SharedPreferences.Editor editor12 = sharedPreferences.edit();
                    editor12.putBoolean("state12", btn12.isClickable());
                    editor12.putBoolean("Next12", btn13.isClickable());
                    editor12.apply();
                    break;
                case "13":

                    progress = 13;
                    SaveProgress();
                    btn13.setClickable(true);
                    btn13.setEnabled(true);

                    btn14.setEnabled(true);
                    btn14.setClickable(true);

                    resultAfterTest("13");

                    SharedPreferences.Editor editor13 = sharedPreferences.edit();
                    editor13.putBoolean("state13", btn13.isClickable());
                    editor13.putBoolean("Next13", btn14.isClickable());
                    editor13.apply();
                    break;
                case "14":

                    progress = 14;
                    SaveProgress();
                    btn14.setClickable(true);
                    btn14.setEnabled(true);

                    btn15.setEnabled(true);
                    btn15.setClickable(true);

                    resultAfterTest("14");

                    SharedPreferences.Editor editor14 = sharedPreferences.edit();
                    editor14.putBoolean("state14", btn14.isClickable());
                    editor14.putBoolean("Next14", btn15.isClickable());
                    editor14.apply();
                    break;
                case "15":

                    progress = 15;
                    SaveProgress();
                    btn15.setClickable(true);
                    btn15.setEnabled(true);

                    btn16.setEnabled(true);
                    btn16.setClickable(true);

                    resultAfterTest("15");

                    SharedPreferences.Editor editor15 = sharedPreferences.edit();
                    editor15.putBoolean("state15", btn15.isClickable());
                    editor15.putBoolean("Next15", btn16.isClickable());
                    editor15.apply();
                    break;
                case "16":

                    progress = 16;
                    SaveProgress();
                    btn16.setClickable(true);
                    btn16.setEnabled(true);

                    btn17.setEnabled(true);
                    btn17.setClickable(true);

                    resultAfterTest("16");

                    SharedPreferences.Editor editor16 = sharedPreferences.edit();
                    editor16.putBoolean("state16", btn16.isClickable());
                    editor16.putBoolean("Next16", btn17.isClickable());
                    editor16.apply();
                    break;
                case "17":

                    progress = 17;
                    SaveProgress();
                    btn17.setClickable(true);
                    btn17.setEnabled(true);

                    btn18.setEnabled(true);
                    btn18.setClickable(true);

                    resultAfterTest("17");

                    SharedPreferences.Editor editor17 = sharedPreferences.edit();
                    editor17.putBoolean("state17", btn17.isClickable());
                    editor17.putBoolean("Next17", btn18.isClickable());
                    editor17.apply();
                    break;
                case "18":

                    progress = 18;
                    SaveProgress();
                    btn18.setClickable(true);
                    btn18.setEnabled(true);

                    btn19.setEnabled(true);
                    btn19.setClickable(true);

                    resultAfterTest("18");

                    SharedPreferences.Editor editor18 = sharedPreferences.edit();
                    editor18.putBoolean("state18", btn18.isClickable());
                    editor18.putBoolean("Next18", btn19.isClickable());
                    editor18.apply();
                    break;
                case "19":

                    progress = 19;
                    SaveProgress();
                    btn19.setClickable(true);
                    btn19.setEnabled(true);

                    btn20.setEnabled(true);
                    btn20.setClickable(true);

                    resultAfterTest("19");

                    SharedPreferences.Editor editor19 = sharedPreferences.edit();
                    editor19.putBoolean("state19", btn19.isClickable());
                    editor19.putBoolean("Next19", btn20.isClickable());
                    editor19.apply();
                    break;
                case "20":

                    progress = 20;
                    SaveProgress();
                    btn20.setClickable(true);
                    btn20.setEnabled(true);

                    btn21.setEnabled(true);
                    btn21.setClickable(true);

                    resultAfterTest("20");

                    SharedPreferences.Editor editor20 = sharedPreferences.edit();
                    editor20.putBoolean("state20", btn20.isClickable());
                    editor20.putBoolean("Next20", btn21.isClickable());
                    editor20.apply();
                    break;
                case "21":

                    progress = 21;
                    SaveProgress();
                    btn21.setClickable(true);
                    btn21.setEnabled(true);

                    btn22.setEnabled(true);
                    btn22.setClickable(true);

                    resultAfterTest("21");

                    SharedPreferences.Editor editor21 = sharedPreferences.edit();
                    editor21.putBoolean("state21", btn21.isClickable());
                    editor21.putBoolean("Next21", btn22.isClickable());
                    editor21.apply();
                    break;
                case "22":

                    progress = 22;
                    SaveProgress();
                    btn22.setClickable(true);
                    btn22.setEnabled(true);

                    btn23.setEnabled(true);
                    btn23.setClickable(true);

                    resultAfterTest("22");

                    SharedPreferences.Editor editor22 = sharedPreferences.edit();
                    editor22.putBoolean("state22", btn22.isClickable());
                    editor22.putBoolean("Next22", btn23.isClickable());
                    editor22.apply();
                    break;
                case "23":

                    progress = 23;
                    SaveProgress();
                    btn23.setClickable(true);
                    btn23.setEnabled(true);

                    btn24.setEnabled(true);
                    btn24.setClickable(true);

                    resultAfterTest("23");

                    SharedPreferences.Editor editor23 = sharedPreferences.edit();
                    editor23.putBoolean("state23", btn23.isClickable());
                    editor23.putBoolean("Next23", btn24.isClickable());
                    editor23.apply();
                    break;
                case "24":

                    progress = 24;
                    SaveProgress();
                    btn24.setClickable(true);
                    btn24.setEnabled(true);

                    btn25.setEnabled(true);
                    btn25.setClickable(true);

                    resultAfterTest("24");

                    SharedPreferences.Editor editor24 = sharedPreferences.edit();
                    editor24.putBoolean("state24", btn24.isClickable());
                    editor24.putBoolean("Next24", btn25.isClickable());
                    editor24.apply();
                    break;
                case "25":

                    progress = 25;
                    SaveProgress();
                    btn25.setClickable(true);
                    btn25.setEnabled(true);

                    btn26.setEnabled(true);
                    btn26.setClickable(true);

                    resultAfterTest("25");

                    SharedPreferences.Editor editor25 = sharedPreferences.edit();
                    editor25.putBoolean("state25", btn25.isClickable());
                    editor25.putBoolean("Next25", btn26.isClickable());
                    editor25.apply();
                    break;
                case "26":

                    progress = 26;
                    SaveProgress();
                    btn26.setClickable(true);
                    btn26.setEnabled(true);

                    btn27.setEnabled(true);
                    btn27.setClickable(true);

                    resultAfterTest("26");

                    SharedPreferences.Editor editor26 = sharedPreferences.edit();
                    editor26.putBoolean("state26", btn26.isClickable());
                    editor26.putBoolean("Next26", btn27.isClickable());
                    editor26.apply();
                    break;
                case "27":

                    progress = 27;
                    SaveProgress();
                    btn27.setClickable(true);
                    btn27.setEnabled(true);

                    btn28.setEnabled(true);
                    btn28.setClickable(true);

                    resultAfterTest("27");

                    SharedPreferences.Editor editor27 = sharedPreferences.edit();
                    editor27.putBoolean("state27", btn27.isClickable());
                    editor27.putBoolean("Next27", btn28.isClickable());
                    editor27.apply();
                    break;
                case "28":

                    progress = 28;
                    SaveProgress();
                    btn28.setClickable(true);
                    btn28.setEnabled(true);

                    btn29.setEnabled(true);
                    btn29.setClickable(true);

                    resultAfterTest("28");

                    SharedPreferences.Editor editor28 = sharedPreferences.edit();
                    editor28.putBoolean("state28", btn28.isClickable());
                    editor28.putBoolean("Next28", btn29.isClickable());
                    editor28.apply();
                    break;
                case "29":

                    progress = 29;
                    SaveProgress();
                    btn29.setClickable(true);
                    btn29.setEnabled(true);

                    btn30.setEnabled(true);
                    btn30.setClickable(true);

                    resultAfterTest("29");

                    SharedPreferences.Editor editor29 = sharedPreferences.edit();
                    editor29.putBoolean("state29", btn29.isClickable());
                    editor29.putBoolean("Next29", btn30.isClickable());
                    editor29.apply();
                    break;
                case "30":

                    progress = 30;
                    SaveProgress();
                    btn30.setClickable(true);
                    btn30.setEnabled(true);

                    btn31.setEnabled(true);
                    btn31.setClickable(true);

                    resultAfterTest("30");

                    SharedPreferences.Editor editor30 = sharedPreferences.edit();
                    editor30.putBoolean("state30", btn30.isClickable());
                    editor30.putBoolean("Next30", btn31.isClickable());
                    editor30.apply();
                    break;
                case "31":

                    progress = 31;
                    SaveProgress();
                    btn31.setClickable(true);
                    btn31.setEnabled(true);

                    btn32.setEnabled(true);
                    btn32.setClickable(true);

                    resultAfterTest("31");

                    SharedPreferences.Editor editor31 = sharedPreferences.edit();
                    editor31.putBoolean("state31", btn31.isClickable());
                    editor31.putBoolean("Nex31", btn32.isClickable());
                    editor31.apply();
                    break;
                case "32":

                    progress = 32;
                    SaveProgress();
                    btn32.setClickable(true);
                    btn32.setEnabled(true);

                    btn33.setEnabled(true);
                    btn33.setClickable(true);

                    resultAfterTest("32");

                    SharedPreferences.Editor editor32 = sharedPreferences.edit();
                    editor32.putBoolean("state32", btn32.isClickable());
                    editor32.putBoolean("Next32", btn33.isClickable());
                    editor32.apply();
                    break;
                case "33":

                    progress = 33;
                    SaveProgress();
                    btn33.setClickable(true);
                    btn33.setEnabled(true);

                    btn34.setEnabled(true);
                    btn34.setClickable(true);

                    resultAfterTest("33");

                    SharedPreferences.Editor editor33 = sharedPreferences.edit();
                    editor33.putBoolean("state33", btn33.isClickable());
                    editor33.putBoolean("Next33", btn34.isClickable());
                    editor33.apply();
                    break;
                case "34":

                    progress = 34;
                    SaveProgress();
                    btn34.setClickable(true);
                    btn34.setEnabled(true);

                    btn35.setEnabled(true);
                    btn35.setClickable(true);

                    resultAfterTest("34");

                    SharedPreferences.Editor editor34 = sharedPreferences.edit();
                    editor34.putBoolean("state34", btn34.isClickable());
                    editor34.putBoolean("Next34", btn35.isClickable());
                    editor34.apply();
                    break;
                case "35":

                    progress = 35;
                    SaveProgress();
                    btn35.setClickable(true);
                    btn35.setEnabled(true);

                    btn36.setEnabled(true);
                    btn36.setClickable(true);

                    resultAfterTest("35");

                    SharedPreferences.Editor editor35 = sharedPreferences.edit();
                    editor35.putBoolean("state35", btn35.isClickable());
                    editor35.putBoolean("Next35", btn36.isClickable());
                    editor35.apply();
                    break;
                case "36":

                    progress = 36;
                    SaveProgress();
                    btn36.setClickable(true);
                    btn36.setEnabled(true);

                    btn37.setEnabled(true);
                    btn37.setClickable(true);

                    resultAfterTest("36");

                    SharedPreferences.Editor editor36 = sharedPreferences.edit();
                    editor36.putBoolean("state36", btn36.isClickable());
                    editor36.putBoolean("Next36", btn37.isClickable());
                    editor36.apply();
                    break;
                case "37":

                    progress = 37;
                    SaveProgress();
                    btn37.setClickable(true);
                    btn37.setEnabled(true);

                    btn38.setEnabled(true);
                    btn38.setClickable(true);

                    resultAfterTest("37");

                    SharedPreferences.Editor editor37 = sharedPreferences.edit();
                    editor37.putBoolean("state37", btn37.isClickable());
                    editor37.putBoolean("Next37", btn38.isClickable());
                    editor37.apply();
                    break;
                case "38":

                    progress = 38;
                    SaveProgress();
                    btn38.setClickable(true);
                    btn38.setEnabled(true);

                    btn39.setEnabled(true);
                    btn39.setClickable(true);

                    resultAfterTest("38");

                    SharedPreferences.Editor editor38 = sharedPreferences.edit();
                    editor38.putBoolean("state38", btn38.isClickable());
                    editor38.putBoolean("Next38", btn39.isClickable());
                    editor38.apply();
                    break;
                case "39":

                    progress = 39;
                    SaveProgress();
                    btn39.setClickable(true);
                    btn39.setEnabled(true);

                    btn40.setEnabled(true);
                    btn40.setClickable(true);

                    resultAfterTest("39");

                    SharedPreferences.Editor editor39 = sharedPreferences.edit();
                    editor39.putBoolean("state39", btn39.isClickable());
                    editor39.putBoolean("Next39", btn40.isClickable());
                    editor39.apply();
                    break;
                case "40":

                    progress = 40;
                    SaveProgress();
                    btn40.setClickable(true);
                    btn40.setEnabled(true);

                    btn41.setEnabled(true);
                    btn41.setClickable(true);

                    resultAfterTest("40");

                    SharedPreferences.Editor editor40 = sharedPreferences.edit();
                    editor40.putBoolean("state40", btn40.isClickable());
                    editor40.putBoolean("Next40", btn41.isClickable());
                    editor40.apply();
                    break;
                case "41":

                    progress = 41;
                    SaveProgress();
                    btn41.setClickable(true);
                    btn41.setEnabled(true);

                    btn42.setEnabled(true);
                    btn42.setClickable(true);

                    resultAfterTest("41");

                    SharedPreferences.Editor editor41 = sharedPreferences.edit();
                    editor41.putBoolean("state41", btn41.isClickable());
                    editor41.putBoolean("Next41", btn42.isClickable());
                    editor41.apply();
                    break;
                case "42":

                    progress = 42;
                    SaveProgress();
                    btn42.setClickable(true);
                    btn42.setEnabled(true);

                    btn43.setEnabled(true);
                    btn43.setClickable(true);

                    resultAfterTest("42");

                    SharedPreferences.Editor editor42 = sharedPreferences.edit();
                    editor42.putBoolean("state42", btn42.isClickable());
                    editor42.putBoolean("Next42", btn43.isClickable());
                    editor42.apply();
                    break;
                case "43":

                    progress = 43;
                    SaveProgress();
                    btn43.setClickable(true);
                    btn43.setEnabled(true);

                    btn44.setEnabled(true);
                    btn44.setClickable(true);

                    resultAfterTest("43");

                    SharedPreferences.Editor editor43 = sharedPreferences.edit();
                    editor43.putBoolean("state43", btn43.isClickable());
                    editor43.putBoolean("Next43", btn44.isClickable());
                    editor43.apply();
                    break;
                case "44":

                    progress = 44;
                    SaveProgress();
                    btn44.setClickable(true);
                    btn44.setEnabled(true);

                    btn45.setEnabled(true);
                    btn45.setClickable(true);

                    resultAfterTest("44");

                    SharedPreferences.Editor editor44 = sharedPreferences.edit();
                    editor44.putBoolean("state44", btn44.isClickable());
                    editor44.putBoolean("Next44", btn45.isClickable());
                    editor44.apply();
                    break;
                case "45":

                    progress = 45;
                    SaveProgress();
                    btn45.setClickable(true);
                    btn45.setEnabled(true);

                    btn46.setEnabled(true);
                    btn46.setClickable(true);

                    resultAfterTest("45");

                    SharedPreferences.Editor editor45 = sharedPreferences.edit();
                    editor45.putBoolean("state45", btn45.isClickable());
                    editor45.putBoolean("Next45", btn46.isClickable());
                    editor45.apply();
                    break;
                case "46":

                    progress = 46;
                    SaveProgress();
                    btn46.setClickable(true);
                    btn46.setEnabled(true);

                    btn47.setEnabled(true);
                    btn47.setClickable(true);

                    resultAfterTest("46");

                    SharedPreferences.Editor editor46 = sharedPreferences.edit();
                    editor46.putBoolean("state46", btn46.isClickable());
                    editor46.putBoolean("Next46", btn47.isClickable());
                    editor46.apply();
                    break;
                case "47":

                    progress = 47;
                    SaveProgress();
                    btn47.setClickable(true);
                    btn47.setEnabled(true);

                    btn48.setEnabled(true);
                    btn48.setClickable(true);

                    resultAfterTest("47");

                    SharedPreferences.Editor editor47 = sharedPreferences.edit();
                    editor47.putBoolean("state47", btn47.isClickable());
                    editor47.putBoolean("Next47", btn48.isClickable());
                    editor47.apply();
                    break;
                case "48":

                    progress = 48;
                    SaveProgress();
                    btn48.setClickable(true);
                    btn48.setEnabled(true);

                    btn49.setEnabled(true);
                    btn49.setClickable(true);

                    resultAfterTest("48");

                    SharedPreferences.Editor editor48 = sharedPreferences.edit();
                    editor48.putBoolean("state48", btn48.isClickable());
                    editor48.putBoolean("Next48", btn49.isClickable());
                    editor48.apply();
                    break;
                case "49":

                    progress = 49;
                    SaveProgress();
                    btn49.setClickable(true);
                    btn49.setEnabled(true);

                    btn50.setEnabled(true);
                    btn50.setClickable(true);

                    resultAfterTest("49");

                    SharedPreferences.Editor editor49 = sharedPreferences.edit();
                    editor49.putBoolean("state49", btn49.isClickable());
                    editor49.putBoolean("Next49", btn50.isClickable());
                    editor49.apply();
                    break;
                case "50":

                    progress = 50;
                    SaveProgress();
                    btn50.setClickable(true);
                    btn50.setEnabled(true);

                    btn51.setEnabled(true);
                    btn51.setClickable(true);

                    resultAfterTest("50");

                    SharedPreferences.Editor editor50 = sharedPreferences.edit();
                    editor50.putBoolean("state50", btn50.isClickable());
                    editor50.putBoolean("Next50", btn51.isClickable());
                    editor50.apply();
                    break;
                case "51":

                    progress = 51;
                    SaveProgress();
                    btn51.setClickable(true);
                    btn51.setEnabled(true);

                    btn52.setEnabled(true);
                    btn52.setClickable(true);

                    resultAfterTest("51");

                    SharedPreferences.Editor editor51 = sharedPreferences.edit();
                    editor51.putBoolean("state51", btn51.isClickable());
                    editor51.putBoolean("Next51", btn52.isClickable());
                    editor51.apply();
                    break;
                case "52":

                    progress = 52;
                    SaveProgress();
                    btn52.setClickable(true);
                    btn52.setEnabled(true);

                    btn53.setEnabled(true);
                    btn53.setClickable(true);

                    resultAfterTest("52");

                    SharedPreferences.Editor editor52 = sharedPreferences.edit();
                    editor52.putBoolean("state52", btn52.isClickable());
                    editor52.putBoolean("Next52", btn53.isClickable());
                    editor52.apply();
                    break;
                case "53":

                    progress = 53;
                    SaveProgress();
                    btn53.setClickable(true);
                    btn53.setEnabled(true);

                    btn54.setEnabled(true);
                    btn54.setClickable(true);

                    resultAfterTest("53");

                    SharedPreferences.Editor editor53 = sharedPreferences.edit();
                    editor53.putBoolean("state53", btn53.isClickable());
                    editor53.putBoolean("Next53", btn54.isClickable());
                    editor53.apply();
                    break;
                case "54":

                    progress = 54;
                    SaveProgress();
                    btn54.setClickable(true);
                    btn54.setEnabled(true);

                    btn55.setEnabled(true);
                    btn55.setClickable(true);

                    resultAfterTest("54");

                    SharedPreferences.Editor editor54 = sharedPreferences.edit();
                    editor54.putBoolean("state54", btn54.isClickable());
                    editor54.putBoolean("Next54", btn55.isClickable());
                    editor54.apply();
                    break;
                case "55":

                    progress = 55;
                    SaveProgress();
                    btn55.setClickable(true);
                    btn55.setEnabled(true);

                    btn56.setEnabled(true);
                    btn56.setClickable(true);

                    resultAfterTest("55");

                    SharedPreferences.Editor editor55 = sharedPreferences.edit();
                    editor55.putBoolean("state55", btn55.isClickable());
                    editor55.putBoolean("Next55", btn56.isClickable());
                    editor55.apply();
                    break;
                case "56":

                    progress = 56;
                    SaveProgress();
                    btn56.setClickable(true);
                    btn56.setEnabled(true);

                    btn57.setEnabled(true);
                    btn57.setClickable(true);

                    resultAfterTest("56");

                    SharedPreferences.Editor editor56 = sharedPreferences.edit();
                    editor56.putBoolean("state56", btn56.isClickable());
                    editor56.putBoolean("Next56", btn57.isClickable());
                    editor56.apply();
                    break;
                case "57":

                    progress = 57;
                    SaveProgress();
                    btn57.setClickable(true);
                    btn57.setEnabled(true);

                    btn58.setEnabled(true);
                    btn58.setClickable(true);

                    resultAfterTest("57");

                    SharedPreferences.Editor editor57 = sharedPreferences.edit();
                    editor57.putBoolean("state57", btn57.isClickable());
                    editor57.putBoolean("Next57", btn58.isClickable());
                    editor57.apply();
                    break;
                case "58":

                    progress = 58;
                    SaveProgress();
                    btn58.setClickable(true);
                    btn58.setEnabled(true);

                    btn59.setEnabled(true);
                    btn59.setClickable(true);

                    resultAfterTest("58");

                    SharedPreferences.Editor editor58 = sharedPreferences.edit();
                    editor58.putBoolean("state58", btn58.isClickable());
                    editor58.putBoolean("Next58", btn59.isClickable());
                    editor58.apply();
                    break;
                case "59":

                    progress = 59;
                    SaveProgress();
                    btn59.setClickable(true);
                    btn59.setEnabled(true);

                    btn60.setEnabled(true);
                    btn60.setClickable(true);

                    resultAfterTest("59");

                    SharedPreferences.Editor editor59 = sharedPreferences.edit();
                    editor59.putBoolean("state59", btn59.isClickable());
                    editor59.putBoolean("Next59", btn60.isClickable());
                    editor59.apply();
                    break;
                case "60":

                    progress = 60;
                    SaveProgress();
                    btn60.setClickable(true);
                    btn60.setEnabled(true);

                    btn61.setEnabled(true);
                    btn61.setClickable(true);

                    resultAfterTest("60");

                    SharedPreferences.Editor editor60 = sharedPreferences.edit();
                    editor60.putBoolean("state60", btn60.isClickable());
                    editor60.putBoolean("Next60", btn61.isClickable());
                    editor60.apply();
                    break;
                case "61":

                    progress = 61;
                    SaveProgress();
                    btn61.setClickable(true);
                    btn61.setEnabled(true);

                    btn62.setEnabled(true);
                    btn62.setClickable(true);

                    resultAfterTest("61");

                    SharedPreferences.Editor editor61 = sharedPreferences.edit();
                    editor61.putBoolean("state61", btn61.isClickable());
                    editor61.putBoolean("Next61", btn62.isClickable());
                    editor61.apply();
                    break;
                case "62":

                    progress = 62;
                    SaveProgress();
                    btn62.setClickable(true);
                    btn62.setEnabled(true);

                    btn63.setEnabled(true);
                    btn63.setClickable(true);

                    resultAfterTest("62");

                    SharedPreferences.Editor editor62 = sharedPreferences.edit();
                    editor62.putBoolean("state62", btn62.isClickable());
                    editor62.putBoolean("Next62", btn63.isClickable());
                    editor62.apply();
                    break;
                case "63":

                    progress = 63;
                    SaveProgress();
                    btn63.setClickable(true);
                    btn63.setEnabled(true);

                    btn64.setEnabled(true);
                    btn64.setClickable(true);

                    resultAfterTest("63");

                    SharedPreferences.Editor editor63 = sharedPreferences.edit();
                    editor63.putBoolean("state63", btn63.isClickable());
                    editor63.putBoolean("Next63", btn64.isClickable());
                    editor63.apply();
                    break;
                case "64":

                    progress = 64;
                    SaveProgress();
                    btn64.setClickable(true);
                    btn64.setEnabled(true);

                    btn65.setEnabled(true);
                    btn65.setClickable(true);

                    resultAfterTest("64");

                    SharedPreferences.Editor editor64 = sharedPreferences.edit();
                    editor64.putBoolean("state64", btn64.isClickable());
                    editor64.putBoolean("Next64", btn65.isClickable());
                    editor64.apply();
                    break;
                case "65":

                    progress = 65;
                    SaveProgress();
                    btn65.setClickable(true);
                    btn65.setEnabled(true);

                    btn66.setEnabled(true);
                    btn66.setClickable(true);

                    resultAfterTest("65");

                    SharedPreferences.Editor editor65 = sharedPreferences.edit();
                    editor65.putBoolean("state65", btn65.isClickable());
                    editor65.putBoolean("Next65", btn66.isClickable());
                    editor65.apply();
                    break;
                case "66":

                    progress = 66;
                    SaveProgress();
                    btn66.setClickable(true);
                    btn66.setEnabled(true);

                    btn67.setEnabled(true);
                    btn67.setClickable(true);

                    resultAfterTest("66");

                    SharedPreferences.Editor editor66 = sharedPreferences.edit();
                    editor66.putBoolean("state66", btn66.isClickable());
                    editor66.putBoolean("Next66", btn67.isClickable());
                    editor66.apply();
                    break;
                case "67":

                    progress = 67;
                    SaveProgress();
                    btn67.setClickable(true);
                    btn67.setEnabled(true);

                    btn68.setEnabled(true);
                    btn68.setClickable(true);

                    resultAfterTest("67");

                    SharedPreferences.Editor editor67 = sharedPreferences.edit();
                    editor67.putBoolean("state67", btn67.isClickable());
                    editor67.putBoolean("Next67", btn68.isClickable());
                    editor67.apply();
                    break;
                case "68":

                    progress = 68;
                    SaveProgress();
                    btn68.setClickable(true);
                    btn68.setEnabled(true);

                    btn69.setEnabled(true);
                    btn69.setClickable(true);

                    resultAfterTest("68");

                    SharedPreferences.Editor editor68 = sharedPreferences.edit();
                    editor68.putBoolean("state68", btn68.isClickable());
                    editor68.putBoolean("Next68", btn69.isClickable());
                    editor68.apply();
                    break;
                case "69":

                    progress = 69;
                    SaveProgress();
                    btn69.setClickable(true);
                    btn69.setEnabled(true);

                    btn70.setEnabled(true);
                    btn70.setClickable(true);

                    resultAfterTest("69");

                    SharedPreferences.Editor editor69 = sharedPreferences.edit();
                    editor69.putBoolean("state69", btn69.isClickable());
                    editor69.putBoolean("Next69", btn70.isClickable());
                    editor69.apply();
                    break;
                case "70":

                    progress = 70;
                    SaveProgress();
                    btn70.setClickable(true);
                    btn70.setEnabled(true);

                    btn71.setEnabled(true);
                    btn71.setClickable(true);

                    resultAfterTest("70");

                    SharedPreferences.Editor editor70 = sharedPreferences.edit();
                    editor70.putBoolean("state70", btn70.isClickable());
                    editor70.putBoolean("Next70", btn71.isClickable());
                    editor70.apply();
                    break;
                case "71":

                    progress = 71;
                    SaveProgress();
                    btn71.setClickable(true);
                    btn71.setEnabled(true);

                    btn72.setEnabled(true);
                    btn72.setClickable(true);

                    resultAfterTest("71");

                    SharedPreferences.Editor editor71 = sharedPreferences.edit();
                    editor71.putBoolean("state71", btn71.isClickable());
                    editor71.putBoolean("Next71", btn72.isClickable());
                    editor71.apply();
                    break;
                case "72":

                    progress = 72;
                    SaveProgress();
                    btn72.setClickable(true);
                    btn72.setEnabled(true);

                    btn73.setEnabled(true);
                    btn73.setClickable(true);

                    resultAfterTest("72");

                    SharedPreferences.Editor editor72 = sharedPreferences.edit();
                    editor72.putBoolean("state72", btn72.isClickable());
                    editor72.putBoolean("Next72", btn73.isClickable());
                    editor72.apply();
                    break;
                case "73":

                    progress = 73;
                    SaveProgress();
                    btn73.setClickable(true);
                    btn73.setEnabled(true);

                    btn74.setEnabled(true);
                    btn74.setClickable(true);

                    resultAfterTest("73");

                    SharedPreferences.Editor editor73 = sharedPreferences.edit();
                    editor73.putBoolean("state73", btn73.isClickable());
                    editor73.putBoolean("Next73", btn74.isClickable());
                    editor73.apply();
                    break;
                case "74":

                    progress = 74;
                    SaveProgress();
                    btn74.setClickable(true);
                    btn74.setEnabled(true);

                    btn75.setEnabled(true);
                    btn75.setClickable(true);

                    resultAfterTest("74");

                    SharedPreferences.Editor editor74 = sharedPreferences.edit();
                    editor74.putBoolean("state74", btn74.isClickable());
                    editor74.putBoolean("Next74", btn75.isClickable());
                    editor74.apply();
                    break;
                case "75":

                    progress = 75;
                    SaveProgress();
                    btn75.setClickable(true);
                    btn75.setEnabled(true);

                    btn76.setEnabled(true);
                    btn76.setClickable(true);

                    resultAfterTest("75");

                    SharedPreferences.Editor editor75 = sharedPreferences.edit();
                    editor75.putBoolean("state75", btn75.isClickable());
                    editor75.putBoolean("Next75", btn76.isClickable());
                    editor75.apply();
                    break;
                case "76":

                    progress = 76;
                    SaveProgress();
                    btn76.setClickable(true);
                    btn76.setEnabled(true);

                    btn77.setEnabled(true);
                    btn77.setClickable(true);

                    resultAfterTest("76");

                    SharedPreferences.Editor editor76 = sharedPreferences.edit();
                    editor76.putBoolean("state76", btn76.isClickable());
                    editor76.putBoolean("Next76", btn77.isClickable());
                    editor76.apply();
                    break;
                case "77":

                    progress = 77;
                    SaveProgress();
                    btn77.setClickable(true);
                    btn77.setEnabled(true);

                    btn78.setEnabled(true);
                    btn78.setClickable(true);

                    resultAfterTest("77");

                    SharedPreferences.Editor editor77 = sharedPreferences.edit();
                    editor77.putBoolean("state77", btn77.isClickable());
                    editor77.putBoolean("Next77", btn78.isClickable());
                    editor77.apply();
                    break;
                case "78":

                    progress = 78;
                    SaveProgress();
                    btn78.setClickable(true);
                    btn78.setEnabled(true);

                    btn79.setEnabled(true);
                    btn79.setClickable(true);

                    resultAfterTest("78");

                    SharedPreferences.Editor editor78 = sharedPreferences.edit();
                    editor78.putBoolean("state78", btn78.isClickable());
                    editor78.putBoolean("Next78", btn79.isClickable());
                    editor78.apply();
                    break;
                case "79":

                    progress = 79;
                    SaveProgress();
                    btn79.setClickable(true);
                    btn79.setEnabled(true);

                    btn80.setEnabled(true);
                    btn80.setClickable(true);

                    resultAfterTest("79");

                    SharedPreferences.Editor editor79 = sharedPreferences.edit();
                    editor79.putBoolean("state79", btn79.isClickable());
                    editor79.putBoolean("Next79", btn80.isClickable());
                    editor79.apply();
                    break;
                case "80":

                    progress = 80;
                    SaveProgress();
                    btn80.setClickable(true);
                    btn80.setEnabled(true);

                    btn81.setEnabled(true);
                    btn81.setClickable(true);

                    resultAfterTest("80");

                    SharedPreferences.Editor editor80 = sharedPreferences.edit();
                    editor80.putBoolean("state80", btn80.isClickable());
                    editor80.putBoolean("Next80", btn81.isClickable());
                    editor80.apply();
                    break;
                case "81":

                    progress = 81;
                    SaveProgress();
                    btn81.setClickable(true);
                    btn81.setEnabled(true);

                    btn82.setEnabled(true);
                    btn82.setClickable(true);

                    resultAfterTest("81");

                    SharedPreferences.Editor editor81 = sharedPreferences.edit();
                    editor81.putBoolean("state81", btn81.isClickable());
                    editor81.putBoolean("Next81", btn82.isClickable());
                    editor81.apply();
                    break;
                case "82":

                    progress = 82;
                    SaveProgress();
                    btn82.setClickable(true);
                    btn82.setEnabled(true);

                    btn83.setEnabled(true);
                    btn83.setClickable(true);

                    resultAfterTest("82");

                    SharedPreferences.Editor editor82 = sharedPreferences.edit();
                    editor82.putBoolean("state82", btn82.isClickable());
                    editor82.putBoolean("Next82", btn83.isClickable());
                    editor82.apply();
                    break;
                case "83":

                    progress = 83;
                    SaveProgress();
                    btn83.setClickable(true);
                    btn83.setEnabled(true);

                    btn84.setEnabled(true);
                    btn84.setClickable(true);

                    resultAfterTest("83");

                    SharedPreferences.Editor editor83 = sharedPreferences.edit();
                    editor83.putBoolean("state83", btn83.isClickable());
                    editor83.putBoolean("Next83", btn84.isClickable());
                    editor83.apply();
                    break;
                case "84":

                    progress = 84;
                    SaveProgress();
                    btn84.setClickable(true);
                    btn84.setEnabled(true);

                    btn85.setEnabled(true);
                    btn85.setClickable(true);

                    resultAfterTest("84");

                    SharedPreferences.Editor editor84 = sharedPreferences.edit();
                    editor84.putBoolean("state84", btn84.isClickable());
                    editor84.putBoolean("Next84", btn85.isClickable());
                    editor84.apply();
                    break;
                case "85":

                    progress = 85;
                    SaveProgress();
                    btn85.setClickable(true);
                    btn85.setEnabled(true);

                    btn86.setEnabled(true);
                    btn86.setClickable(true);

                    resultAfterTest("85");

                    SharedPreferences.Editor editor85 = sharedPreferences.edit();
                    editor85.putBoolean("state85", btn85.isClickable());
                    editor85.putBoolean("Next85", btn86.isClickable());
                    editor85.apply();
                    break;
                case "86":

                    progress = 86;
                    SaveProgress();
                    btn86.setClickable(true);
                    btn86.setEnabled(true);

                    btn87.setEnabled(true);
                    btn87.setClickable(true);

                    resultAfterTest("86");

                    SharedPreferences.Editor editor86 = sharedPreferences.edit();
                    editor86.putBoolean("state86", btn86.isClickable());
                    editor86.putBoolean("Next86", btn87.isClickable());
                    editor86.apply();
                    break;
                case "87":

                    progress = 87;
                    SaveProgress();
                    btn87.setClickable(true);
                    btn87.setEnabled(true);

                    btn88.setEnabled(true);
                    btn88.setClickable(true);

                    resultAfterTest("87");

                    SharedPreferences.Editor editor87 = sharedPreferences.edit();
                    editor87.putBoolean("state87", btn87.isClickable());
                    editor87.putBoolean("Next87", btn88.isClickable());
                    editor87.apply();
                    break;
                case "88":

                    progress = 88;
                    SaveProgress();
                    btn88.setClickable(true);
                    btn88.setEnabled(true);

                    btn89.setEnabled(true);
                    btn89.setClickable(true);

                    resultAfterTest("88");

                    SharedPreferences.Editor editor88 = sharedPreferences.edit();
                    editor88.putBoolean("state88", btn88.isClickable());
                    editor88.putBoolean("Next88", btn89.isClickable());
                    editor88.apply();
                    break;
                case "89":

                    progress = 89;
                    SaveProgress();
                    btn89.setClickable(true);
                    btn89.setEnabled(true);

                    btn90.setEnabled(true);
                    btn90.setClickable(true);

                    resultAfterTest("89");

                    SharedPreferences.Editor editor89 = sharedPreferences.edit();
                    editor89.putBoolean("state89", btn89.isClickable());
                    editor89.putBoolean("Next89", btn90.isClickable());
                    editor89.apply();
                    break;
                case "90":

                    progress = 90;
                    SaveProgress();
                    btn90.setClickable(true);
                    btn90.setEnabled(true);

                    btn91.setEnabled(true);
                    btn91.setClickable(true);

                    resultAfterTest("90");

                    SharedPreferences.Editor editor90 = sharedPreferences.edit();
                    editor90.putBoolean("state90", btn90.isClickable());
                    editor90.putBoolean("Next90", btn91.isClickable());
                    editor90.apply();
                    break;
                case "91":

                    progress = 91;
                    SaveProgress();
                    btn91.setClickable(true);
                    btn91.setEnabled(true);

                    btn92.setEnabled(true);
                    btn92.setClickable(true);

                    resultAfterTest("91");

                    SharedPreferences.Editor editor91 = sharedPreferences.edit();
                    editor91.putBoolean("state91", btn91.isClickable());
                    editor91.putBoolean("Next91", btn92.isClickable());
                    editor91.apply();
                    break;
                case "92":

                    progress = 92;
                    SaveProgress();
                    btn92.setClickable(true);
                    btn92.setEnabled(true);

                    btn93.setEnabled(true);
                    btn93.setClickable(true);

                    resultAfterTest("92");

                    SharedPreferences.Editor editor92 = sharedPreferences.edit();
                    editor92.putBoolean("state92", btn92.isClickable());
                    editor92.putBoolean("Next92", btn93.isClickable());
                    editor92.apply();
                    break;
                case "93":

                    progress = 93;
                    SaveProgress();
                    btn93.setClickable(true);
                    btn93.setEnabled(true);

                    btn94.setEnabled(true);
                    btn94.setClickable(true);

                    resultAfterTest("93");

                    SharedPreferences.Editor editor93 = sharedPreferences.edit();
                    editor93.putBoolean("state93", btn93.isClickable());
                    editor93.putBoolean("Next93", btn94.isClickable());
                    editor93.apply();
                    break;
                case "94":

                    progress = 94;
                    SaveProgress();
                    btn94.setClickable(true);
                    btn94.setEnabled(true);

                    btn95.setEnabled(true);
                    btn95.setClickable(true);

                    resultAfterTest("94");

                    SharedPreferences.Editor editor94 = sharedPreferences.edit();
                    editor94.putBoolean("state94", btn94.isClickable());
                    editor94.putBoolean("Next94", btn95.isClickable());
                    editor94.apply();
                    break;
                case "95":

                    progress = 95;
                    SaveProgress();
                    btn95.setClickable(true);
                    btn95.setEnabled(true);

                    btn96.setEnabled(true);
                    btn96.setClickable(true);

                    resultAfterTest("95");

                    SharedPreferences.Editor editor95 = sharedPreferences.edit();
                    editor95.putBoolean("state95", btn95.isClickable());
                    editor95.putBoolean("Next95", btn96.isClickable());
                    editor95.apply();
                    break;
                case "96":

                    progress = 96;
                    SaveProgress();
                    btn96.setClickable(true);
                    btn96.setEnabled(true);

                    btn97.setEnabled(true);
                    btn97.setClickable(true);

                    resultAfterTest("96");

                    SharedPreferences.Editor editor96 = sharedPreferences.edit();
                    editor96.putBoolean("state96", btn96.isClickable());
                    editor96.putBoolean("Next96", btn97.isClickable());
                    editor96.apply();
                    break;
                case "97":

                    progress = 97;
                    SaveProgress();
                    btn97.setClickable(true);
                    btn97.setEnabled(true);

                    btn98.setEnabled(true);
                    btn98.setClickable(true);

                    resultAfterTest("97");

                    SharedPreferences.Editor editor97 = sharedPreferences.edit();
                    editor97.putBoolean("state97", btn97.isClickable());
                    editor97.putBoolean("Next97", btn98.isClickable());
                    editor97.apply();
                    break;
                case "98":

                    progress = 98;
                    SaveProgress();
                    btn98.setClickable(true);
                    btn98.setEnabled(true);

                    btn99.setEnabled(true);
                    btn99.setClickable(true);

                    resultAfterTest("98");

                    SharedPreferences.Editor editor98 = sharedPreferences.edit();
                    editor98.putBoolean("state98", btn98.isClickable());
                    editor98.putBoolean("Next98", btn99.isClickable());
                    editor98.apply();
                    break;
                case "99":

                    progress = 99;
                    SaveProgress();
                    btn99.setClickable(true);
                    btn99.setEnabled(true);

                    btn100.setEnabled(true);
                    btn100.setClickable(true);

                    resultAfterTest("99");

                    SharedPreferences.Editor editor99 = sharedPreferences.edit();
                    editor99.putBoolean("state", btn99.isClickable());
                    editor99.putBoolean("Next", btn100.isClickable());
                    editor99.apply();
                    break;
                case "100":

                    progress = 100;
                    SaveProgress();
                    btn100.setClickable(true);
                    btn100.setEnabled(true);

                    btn101.setEnabled(true);
                    btn101.setClickable(true);

                    resultAfterTest("100");

                    SharedPreferences.Editor editor100 = sharedPreferences.edit();
                    editor100.putBoolean("state100", btn100.isClickable());
                    editor100.putBoolean("Next100", btn101.isClickable());
                    editor100.apply();
                    break;
                case "101":

                    progress = 101;
                    SaveProgress();
                    btn101.setClickable(true);
                    btn101.setEnabled(true);

                    btn102.setEnabled(true);
                    btn102.setClickable(true);

                    resultAfterTest("101");

                    SharedPreferences.Editor editor101 = sharedPreferences.edit();
                    editor101.putBoolean("state101", btn101.isClickable());
                    editor101.putBoolean("Next101", btn102.isClickable());
                    editor101.apply();
                    break;
                case "102":

                    progress = 102;
                    SaveProgress();
                    btn102.setClickable(true);
                    btn102.setEnabled(true);

                    btn103.setEnabled(true);
                    btn103.setClickable(true);

                    resultAfterTest("102");

                    SharedPreferences.Editor editor102 = sharedPreferences.edit();
                    editor102.putBoolean("state102", btn102.isClickable());
                    editor102.putBoolean("Next102", btn103.isClickable());
                    editor102.apply();
                    break;
                case "103":

                    progress = 103;
                    SaveProgress();
                    btn103.setClickable(true);
                    btn103.setEnabled(true);

                    btn104.setEnabled(true);
                    btn104.setClickable(true);

                    resultAfterTest("103");

                    SharedPreferences.Editor editor103 = sharedPreferences.edit();
                    editor103.putBoolean("state103", btn103.isClickable());
                    editor103.putBoolean("Next103", btn104.isClickable());
                    editor103.apply();
                    break;
                case "104":

                    progress = 104;
                    SaveProgress();
                    btn104.setClickable(true);
                    btn104.setEnabled(true);

                    btn105.setEnabled(true);
                    btn105.setClickable(true);

                    resultAfterTest("104");

                    SharedPreferences.Editor editor104 = sharedPreferences.edit();
                    editor104.putBoolean("state104", btn104.isClickable());
                    editor104.putBoolean("Next104", btn105.isClickable());
                    editor104.apply();
                    break;
                case "105":

                    progress = 105;
                    SaveProgress();
                    btn105.setClickable(true);
                    btn105.setEnabled(true);

                    btn106.setEnabled(true);
                    btn106.setClickable(true);

                    resultAfterTest("105");

                    SharedPreferences.Editor editor105 = sharedPreferences.edit();
                    editor105.putBoolean("state105", btn105.isClickable());
                    editor105.putBoolean("Next105", btn106.isClickable());
                    editor105.apply();
                    break;
                case "106":

                    progress = 106;
                    SaveProgress();
                    btn106.setClickable(true);
                    btn106.setEnabled(true);

                    btn107.setEnabled(true);
                    btn107.setClickable(true);

                    resultAfterTest("106");

                    SharedPreferences.Editor editor106 = sharedPreferences.edit();
                    editor106.putBoolean("state106", btn106.isClickable());
                    editor106.putBoolean("Next106", btn107.isClickable());
                    editor106.apply();
                    break;
                case "107":

                    progress = 107;
                    SaveProgress();
                    btn107.setClickable(true);
                    btn107.setEnabled(true);

                    btn108.setEnabled(true);
                    btn108.setClickable(true);

                    resultAfterTest("107");

                    SharedPreferences.Editor editor107 = sharedPreferences.edit();
                    editor107.putBoolean("state107", btn107.isClickable());
                    editor107.putBoolean("Next107", btn108.isClickable());
                    editor107.apply();
                    break;
                case "108":

                    progress = 108;
                    SaveProgress();
                    btn108.setClickable(true);
                    btn108.setEnabled(true);

                    btn109.setEnabled(true);
                    btn109.setClickable(true);

                    resultAfterTest("108");

                    SharedPreferences.Editor editor108 = sharedPreferences.edit();
                    editor108.putBoolean("state108", btn108.isClickable());
                    editor108.putBoolean("Next108", btn109.isClickable());
                    editor108.apply();
                    break;
                case "109":

                    progress = 109;
                    SaveProgress();
                    btn109.setClickable(true);
                    btn109.setEnabled(true);

                    btn110.setEnabled(true);
                    btn110.setClickable(true);

                    resultAfterTest("109");

                    SharedPreferences.Editor editor109 = sharedPreferences.edit();
                    editor109.putBoolean("state109", btn109.isClickable());
                    editor109.putBoolean("Next109", btn110.isClickable());
                    editor109.apply();
                    break;
                case "110":

                    progress = 110;
                    SaveProgress();
                    btn110.setClickable(true);
                    btn110.setEnabled(true);


                    resultAfterTest("110");

                    SharedPreferences.Editor editor110 = sharedPreferences.edit();
                    editor110.putBoolean("state110", btn110.isClickable());
                    editor110.apply();
                    break;

                default:
                    break;
            }
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("three", progress);
        editor.apply();
        }
    }

    public void onClick(View v){
        isClicked = false;
        switch (v.getId()){
            case R.id.btn:
                if(!isClicked) {
                    Intent intent = new Intent(MapLevel.this, TextQuestionsCamplaign.class);
                    String btn1 = getResources().getString(R.string.btn1);
                    intent.putExtra("dictionary",btn1);
                    intent.putExtra("answer","6");
                    intent.putExtra("progress",1);
                    intent.putExtra("lvl",1);
                    intent.putExtra("money_data",money);
                    startActivityForResult(intent,1);
                    isClicked = true;
                }
                break;
            case R.id.btn2:
                if(!isClicked) {
                    Intent intent2 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn2 = getResources().getString(R.string.btn2);
                    intent2.putExtra("dictionary",btn2);
                    intent2.putExtra("answer","0");
                    intent2.putExtra("answer1","16");
                    intent2.putExtra("size","4x4");
                    intent2.putExtra("progress",2);
                    intent2.putExtra("lvl",2);
                    intent2.putExtra("money_data",money);
                    startActivityForResult(intent2,2);
                    isClicked = true;
                }
                break;
            case R.id.btn3:
                if(!isClicked) {
                    Intent intent3 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent3.putExtra("dictionary"," 8 | 10 | 12 | 14 | ? ");
                    intent3.putExtra("answer","16");
                    intent3.putExtra("progress",3);
                    intent3.putExtra("lvl",3);
                    intent3.putExtra("money_data",money);
                    startActivityForResult(intent3,3);
                    isClicked = true;
                }
                break;
            case R.id.btn4:
                if(!isClicked) {
                    Intent intent4 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn4 = getResources().getString(R.string.btn4);
                    intent4.putExtra("dictionary",btn4);
                    intent4.putExtra("answer","5");
                    intent4.putExtra("size","3x3");
                    intent4.putExtra("progress",4);
                    intent4.putExtra("lvl",4);
                    intent4.putExtra("money_data",money);
                    startActivityForResult(intent4,4);
                    isClicked = true;
                }
                break;
            case R.id.btn5:
                if(!isClicked) {
                    Intent intent5 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn5 = getResources().getString(R.string.btn4);
                    intent5.putExtra("dictionary",btn5);
                    intent5.putExtra("answer","1");
                    intent5.putExtra("progress",5);
                    intent5.putExtra("lvl",5);
                    intent5.putExtra("money_data",money);
                    startActivityForResult(intent5,5);
                    isClicked = true;
                }
                break;
            case R.id.btn6:
                if(!isClicked) {
                    Intent intent6 = new Intent(MapLevel.this, TextQuestionsCamplaign.class);
                    String btn6 = getResources().getString(R.string.btn6);
                    intent6.putExtra("dictionary",btn6);
                    intent6.putExtra("answer","11");
                    intent6.putExtra("progress",6);
                    intent6.putExtra("lvl",6);
                    intent6.putExtra("money_data",money);
                    startActivityForResult(intent6,6);
                    isClicked = true;
                }
                break;
            case R.id.btn7:
                if(!isClicked) {
                    Intent intent7 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent7.putExtra("dictionary"," 5 | 6 | 8 | 11 | ? ");
                    intent7.putExtra("answer","15");
                    intent7.putExtra("progress",7);
                    intent7.putExtra("lvl",7);
                    intent7.putExtra("money_data",money);
                    startActivityForResult(intent7,7);
                    isClicked = true;
                }
                break;
            case R.id.btn8:
                if(!isClicked) {
                    Intent intent8 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent8.putExtra("dictionary","A+B = 7\nA+B+C = 9\nC- ?");
                    intent8.putExtra("answer","2");
                    intent8.putExtra("progress",8);
                    intent8.putExtra("lvl",8);
                    intent8.putExtra("money_data",money);
                    startActivityForResult(intent8,8);
                    isClicked = true;
                }
                break;
            case R.id.btn9:
                    Intent intent9 = new Intent(MapLevel.this,PictureCampaignMath.class);
                    String btn9 = getResources().getString(R.string.btn4);
                    intent9.putExtra("dictionary",btn9);
                    intent9.putExtra("answer","6");
                    intent9.putExtra("progress",9);
                    intent9.putExtra("lvl",9);
                    intent9.putExtra("money_data",money);
                    startActivityForResult(intent9,9);
                break;
            case R.id.btn10:
                if(!isClicked) {
                    Intent intent10 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn10 = getResources().getString(R.string.btn10);
                    intent10.putExtra("dictionary",btn10);
                    intent10.putExtra("answer","8");
                    intent10.putExtra("progress",10);
                    intent10.putExtra("lvl",10);
                    intent10.putExtra("money_data",money);
                    startActivityForResult(intent10,10);
                    isClicked = true;
                }
                break;
            case R.id.btn11:
                if(!isClicked) {
                    Intent intent11 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn11 = getResources().getString(R.string.btn11);
                    intent11.putExtra("dictionary",btn11);
                    intent11.putExtra("answer","2");
                    intent11.putExtra("progress",11);
                    intent11.putExtra("lvl",11);
                    intent11.putExtra("money_data",money);
                    startActivityForResult(intent11,11);
                    isClicked = true;
                }
                break;
            case R.id.btn12:
                if(!isClicked) {
                    Intent intent12 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent12.putExtra("dictionary"," 5 | 3 | 6 | 4 | 7 | ? ");
                    intent12.putExtra("answer","5");
                    intent12.putExtra("progress",12);
                    intent12.putExtra("lvl",12);
                    intent12.putExtra("money_data",money);
                    startActivityForResult(intent12,12);
                    isClicked = true;
                }
                break;
            case R.id.btn13:
                if(!isClicked) {
                    Intent intent13 = new Intent(MapLevel.this,PictureCampaignMath.class);
                    String btn13 = getResources().getString(R.string.btn4);
                    intent13.putExtra("dictionary",btn13);
                    intent13.putExtra("answer","4");
                    intent13.putExtra("progress",13);
                    intent13.putExtra("lvl",13);
                    intent13.putExtra("money_data",money);
                    startActivityForResult(intent13,13);
                    isClicked = true;
                }
                break;
            case R.id.btn14:
                if(!isClicked) {
                    Intent intent14 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent14.putExtra("dictionary","1 + 4 = 5 \n 2 + 5 = 12\n 3 + 6 = 21\n 8 + 11 = ?");
                    intent14.putExtra("answer","96");
                    intent14.putExtra("progress",14);
                    intent14.putExtra("lvl",14);
                    intent14.putExtra("money_data",money);
                    startActivityForResult(intent14,14);
                    isClicked = true;
                }
                break;
            case R.id.btn15:
                if(!isClicked) {
                    Intent intent15 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn15 = getResources().getString(R.string.btn4);
                    intent15.putExtra("dictionary",btn15);
                    intent15.putExtra("answer","7");
                    intent15.putExtra("size","5x5");
                    intent15.putExtra("progress",15);
                    intent15.putExtra("lvl",15);
                    intent15.putExtra("money_data",money);
                    startActivityForResult(intent15,15);
                    isClicked = true;
                }
                break;
            case R.id.btn16:
                if(!isClicked) {
                    Intent intent16 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent16.putExtra("dictionary","A + B + C = 20\n A = - C\n B = A + 15\n А - ?\n");
                    intent16.putExtra("answer","5");
                    intent16.putExtra("progress",16);
                    intent16.putExtra("lvl",16);
                    intent16.putExtra("money_data",money);
                    startActivityForResult(intent16,16);
                    isClicked = true;
                }
                break;
            case R.id.btn17:
                if(!isClicked) {
                    Intent intent17 = new Intent(MapLevel.this,PictureCampaignMath.class);
                    String btn17 = getResources().getString(R.string.btn4);
                    intent17.putExtra("dictionary",btn17);
                    intent17.putExtra("answer","13");
                    intent17.putExtra("progress",17);
                    intent17.putExtra("lvl",17);
                    intent17.putExtra("money_data",money);
                    startActivityForResult(intent17,17);
                    isClicked = true;
                }
                break;
            case R.id.btn18:
                if(!isClicked) {
                    Intent intent18 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn18 = getResources().getString(R.string.btn4);
                    intent18.putExtra("dictionary",btn18);
                    intent18.putExtra("answer","18");
                    intent18.putExtra("size","3x3");
                    intent18.putExtra("progress",18);
                    intent18.putExtra("lvl",18);
                    intent18.putExtra("money_data",money);
                    startActivityForResult(intent18,18);
                    isClicked = true;
                }
                break;
            case R.id.btn19:
                if(!isClicked) {
                    Intent intent19 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn19 = getResources().getString(R.string.btn19);
                    intent19.putExtra("dictionary",btn19);
                    intent19.putExtra("answer","2");
                    intent19.putExtra("answer1","2");
                    intent19.putExtra("progress",19);
                    intent19.putExtra("lvl",19);
                    intent19.putExtra("money_data",money);
                    startActivityForResult(intent19,19);
                    isClicked = true;
                }
                break;
            case R.id.btn20:
                if(!isClicked) {
                    Intent intent20 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn20 = getResources().getString(R.string.btn4);
                    intent20.putExtra("dictionary",btn20);
                    intent20.putExtra("answer","2");
                    intent20.putExtra("progress",20);
                    intent20.putExtra("lvl",20);
                    intent20.putExtra("money_data",money);
                    startActivityForResult(intent20,20);
                    isClicked = true;
                }
                break;
            case R.id.btn21:
                if(!isClicked) {
                    Intent intent21 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent21.putExtra("dictionary"," 7 + 7 / 7 + 7 * 7 - 7 = ? ");
                    intent21.putExtra("answer","50");
                    intent21.putExtra("progress",21);
                    intent21.putExtra("lvl",21);
                    intent21.putExtra("money_data",money);
                    startActivityForResult(intent21,21);
                    isClicked = true;
                }
                break;
            case R.id.btn22:
                if(!isClicked) {
                    Intent intent22 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent22.putExtra("dictionary","A+B=60\nA-B=40\nA/B=?");
                    intent22.putExtra("answer","5");
                    intent22.putExtra("progress",22);
                    intent22.putExtra("lvl",22);
                    intent22.putExtra("money_data",money);
                    startActivityForResult(intent22,22);
                    isClicked = true;
                }
                break;
            case R.id.btn23:
                if(!isClicked) {
                    Intent intent23 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent23.putExtra("dictionary","4*4+4*4+4-4*4=?");
                    intent23.putExtra("answer","20");
                    intent23.putExtra("progress",23);
                    intent23.putExtra("lvl",23);
                    intent23.putExtra("money_data",money);
                    startActivityForResult(intent23,23);
                    isClicked = true;
                }
                break;
            case R.id.btn24:
                if(!isClicked) {
                    Intent intent24 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn24 = getResources().getString(R.string.btn24);
                    intent24.putExtra("dictionary",btn24);
                    intent24.putExtra("answer","48");
                    intent24.putExtra("progress",24);
                    intent24.putExtra("lvl",24);
                    intent24.putExtra("money_data",money);
                    startActivityForResult(intent24,24);
                    isClicked = true;
                }
                break;
            case R.id.btn25:
                if(!isClicked) {
                    Intent intent25 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn25 = getResources().getString(R.string.btn4);
                    intent25.putExtra("dictionary",btn25);
                    intent25.putExtra("answer","19");
                    intent25.putExtra("size","3x3");
                    intent25.putExtra("progress",25);
                    intent25.putExtra("lvl",25);
                    intent25.putExtra("money_data",money);
                    startActivityForResult(intent25,25);
                    isClicked = true;
                }
                break;
            case R.id.btn26:
                if(!isClicked) {
                    Intent intent26 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent26.putExtra("dictionary"," 2 = -16 \n 7 = 56 \n 6 = -48 \n 1 = ? ");
                    intent26.putExtra("answer","8");
                    intent26.putExtra("progress",26);
                    intent26.putExtra("lvl",26);
                    intent26.putExtra("money_data",money);
                    startActivityForResult(intent26,26);
                    isClicked = true;
                }
                break;
            case R.id.btn27:
                if(!isClicked) {
                    Intent intent27 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent27.putExtra("dictionary"," 32 | 45 | 60 | 77 | ? ");
                    intent27.putExtra("answer","96");
                    intent27.putExtra("progress",27);
                    intent27.putExtra("lvl",27);
                    intent27.putExtra("money_data",money);
                    startActivityForResult(intent27,27);
                    isClicked = true;
                }
                break;
            case R.id.btn28:
                if(!isClicked) {
                    Intent intent28 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn28 = getResources().getString(R.string.btn28);
                    intent28.putExtra("dictionary",btn28);
                    intent28.putExtra("answer","3");
                    intent28.putExtra("progress",28);
                    intent28.putExtra("lvl",28);
                    intent28.putExtra("money_data",money);
                    startActivityForResult(intent28,28);
                    isClicked = true;
                }
                break;
            case R.id.btn29:
                if(!isClicked) {
                    Intent intent29 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn29 = getResources().getString(R.string.btn4);
                    intent29.putExtra("dictionary",btn29);
                    intent29.putExtra("answer","24");
                    intent29.putExtra("size","3x3");
                    intent29.putExtra("progress",29);
                    intent29.putExtra("lvl",29);
                    intent29.putExtra("money_data",money);
                    startActivityForResult(intent29,29);
                    isClicked = true;
                }
                break;
            case R.id.btn30:
                if(!isClicked) {
                    Intent intent30 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn30 = getResources().getString(R.string.btn30);
                    intent30.putExtra("dictionary",btn30);
                    intent30.putExtra("answer","2");
                    intent30.putExtra("progress",30);
                    intent30.putExtra("lvl",30);
                    intent30.putExtra("money_data",money);
                    startActivityForResult(intent30,30);
                    isClicked = true;
                }
                break;
            case R.id.btn31:
                if(!isClicked) {
                    Intent intent31 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent31.putExtra("dictionary","A+A+A = 30\nA+B+B = 18\nB-C = 2\nC+A*B=?");
                    intent31.putExtra("answer","42");
                    intent31.putExtra("progress",31);
                    intent31.putExtra("lvl",31);
                    intent31.putExtra("money_data",money);
                    startActivityForResult(intent31,31);
                    isClicked = true;
                }
                break;
            case R.id.btn32:
                if(!isClicked) {
                    Intent intent32 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent32.putExtra("dictionary","11*11=4\n22*22=16\n33*33=?");
                    intent32.putExtra("answer","36");
                    intent32.putExtra("progress",32);
                    intent32.putExtra("lvl",32);
                    intent32.putExtra("money_data",money);
                    startActivityForResult(intent32,32);
                    isClicked = true;
                }
                break;
            case R.id.btn33:
                if(!isClicked) {
                    Intent intent33 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent33.putExtra("dictionary"," 4 \n 6  2 \n 8 ? 2 \n 17 5 7 3 ");
                    intent33.putExtra("answer","6");
                    intent33.putExtra("progress",33);
                    intent33.putExtra("lvl",33);
                    intent33.putExtra("money_data",money);
                    startActivityForResult(intent33,33);
                    isClicked = true;
                }
                break;
            case R.id.btn34:
                if(!isClicked) {
                    Intent intent34 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                   intent34.putExtra("dictionary","8=56\n7=42\n6=30\n5=20\n3=?");
                   intent34.putExtra("answer","6");
                   intent34.putExtra("progress",34);
                   intent34.putExtra("lvl",34);
                   intent34.putExtra("money_data",money);
                    startActivityForResult(intent34,34);
                    isClicked = true;
                }
                break;
            case R.id.btn35:
                if(!isClicked) {
                    Intent intent35 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent35.putExtra("dictionary"," 15 | 13 | 10 | 8 | ? ");
                    intent35.putExtra("answer","5");
                    intent35.putExtra("progress",35);
                    intent35.putExtra("lvl",35);
                    intent35.putExtra("money_data",money);
                    startActivityForResult(intent35,35);
                    isClicked = true;
                }
                break;
            case R.id.btn36:
                if(!isClicked) {
                    Intent intent36 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn36 = getResources().getString(R.string.btn36);
                    intent36.putExtra("dictionary",btn36);
                    intent36.putExtra("answer","5");
                    intent36.putExtra("progress",36);
                    intent36.putExtra("lvl",36);
                    intent36.putExtra("money_data",money);
                    startActivityForResult(intent36,36);
                    isClicked = true;
                }
                break;
            case R.id.btn37:
                if(!isClicked) {
                    Intent intent37 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn37 = getResources().getString(R.string.btn4);
                    intent37.putExtra("dictionary",btn37);
                    intent37.putExtra("answer","26");
                    intent37.putExtra("size","3x3");
                    intent37.putExtra("progress",37);
                    intent37.putExtra("lvl",37);
                    intent37.putExtra("money_data",money);
                    startActivityForResult(intent37,37);
                    isClicked = true;
                }
                break;
            case R.id.btn38:
                if(!isClicked) {
                    Intent intent38 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn38 = getResources().getString(R.string.btn4);
                    intent38.putExtra("dictionary",btn38);
                   intent38.putExtra("answer","20");
                   intent38.putExtra("size","3x3");
                   intent38.putExtra("progress",38);
                   intent38.putExtra("lvl",38);
                   intent38.putExtra("money_data",money);
                    startActivityForResult(intent38,38);
                    isClicked = true;
                }
                break;
            case R.id.btn39:
                if(!isClicked) {
                    Intent intent39 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn39 = getResources().getString(R.string.btn39);
                    intent39.putExtra("dictionary",btn39);
                    intent39.putExtra("answer","7");
                    intent39.putExtra("progress",39);
                    intent39.putExtra("lvl",39);
                    intent39.putExtra("money_data",money);
                    startActivityForResult(intent39,39);
                    isClicked = true;
                }
                break;
            case R.id.btn40:
                if(!isClicked) {
                    Intent intent40 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent40.putExtra("dictionary"," 2 + 7 + 3 = 24 \n 9 + 7 - 4 = 24 \n 4 + 0 + 8 = 24 \n 5 + 5 + 5 = ? ");
                    intent40.putExtra("answer","30");
                    intent40.putExtra("progress",40);
                    intent40.putExtra("lvl",40);
                    intent40.putExtra("money_data",money);
                    startActivityForResult(intent40,40);
                    isClicked = true;
                }
                break;
            case R.id.btn41:
                if(!isClicked) {
                    Intent intent41 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent41.putExtra("dictionary"," 1 + 5 = 12 \n 2 + 10 = 24 \n 3 + 15 = 36 \n 5 + 25 = ? ");
                    intent41.putExtra("answer","60");
                    intent41.putExtra("progress",41);
                    intent41.putExtra("lvl",41);
                    intent41.putExtra("money_data",money);
                    startActivityForResult(intent41,41);
                    isClicked = true;
                }
                break;
            case R.id.btn42:
                if(!isClicked) {
                    Intent intent42 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn42 = getResources().getString(R.string.btn42);
                    intent42.putExtra("dictionary",btn42);
                    intent42.putExtra("answer","90");
                    intent42.putExtra("progress",42);
                    intent42.putExtra("lvl",42);
                    intent42.putExtra("money_data",money);
                    startActivityForResult(intent42,42);
                    isClicked = true;
                }
                break;
            case R.id.btn43:
                if(!isClicked) {
                    Intent intent43 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent43.putExtra("dictionary"," 2 | 4 | 8 | 16 | ? ");
                    intent43.putExtra("answer","32");
                    intent43.putExtra("progress",43);
                    intent43.putExtra("lvl",43);
                    intent43.putExtra("money_data",money);
                    startActivityForResult(intent43,43);
                    isClicked = true;
                }
                break;
            case R.id.btn44:
                if(!isClicked) {
                    Intent intent44 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn44 = getResources().getString(R.string.btn4);
                    intent44.putExtra("dictionary",btn44);
                    intent44.putExtra("answer","16");
                    intent44.putExtra("progress",44);
                    intent44.putExtra("lvl",44);
                    intent44.putExtra("money_data",money);
                    startActivityForResult(intent44,44);
                    isClicked = true;
                }
                break;
            case R.id.btn45:
                if(!isClicked) {
                    Intent intent45 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent45.putExtra("dictionary"," 3  4 \n 8  6 \n 12  16 \n 32  ? ");
                    intent45.putExtra("answer","24");
                    intent45.putExtra("progress",45);
                    intent45.putExtra("lvl",45);
                    intent45.putExtra("money_data",money);
                    startActivityForResult(intent45,45);
                    isClicked = true;
                }
                break;
            case R.id.btn46:
                if(!isClicked) {
                    Intent intent46 = new Intent(MapLevel.this, SignsCampaign.class);
                    String btn46 = getResources().getString(R.string.btn4);
                    intent46.putExtra("dictionary",btn46);
                    intent46.putExtra("answer","*");
                    intent46.putExtra("answer1","+");
                    intent46.putExtra("answer2","-");
                    intent46.putExtra("answer3","*");
                    intent46.putExtra("progress",46);
                    intent46.putExtra("lvl",46);
                    intent46.putExtra("money_data",money);
                    startActivityForResult(intent46,46);
                    isClicked = true;
                }
                break;
            case R.id.btn47:
                if(!isClicked) {
                    Intent intent47 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn47 = getResources().getString(R.string.btn47);
                    intent47.putExtra("dictionary",btn47);
                    intent47.putExtra("answer","2");
                    intent47.putExtra("progress",47);
                    intent47.putExtra("lvl",47);
                    intent47.putExtra("money_data",money);
                    startActivityForResult(intent47,47);
                    isClicked = true;
                }
                break;
            case R.id.btn48:
                if(!isClicked) {
                    Intent intent48 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent48.putExtra("dictionary","A+A = 10\nA*B+B = 12\nA*B-A*C=A\nC - ?");
                    intent48.putExtra("answer","1");
                    intent48.putExtra("progress",48);
                    intent48.putExtra("lvl",48);
                    intent48.putExtra("money_data",money);
                    startActivityForResult(intent48,48);
                    isClicked = true;
                }
                break;
            case R.id.btn49:
                if(!isClicked) {
                    Intent intent49 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent49.putExtra("dictionary"," 22 + 4 = 24 \n 13 + 6 = 16 \n 80 + 2 = 82 \n 67 + 9 = ? ");
                    intent49.putExtra("answer","69");
                    intent49.putExtra("progress",49);
                    intent49.putExtra("lvl",49);
                    intent49.putExtra("money_data",money);
                    startActivityForResult(intent49,49);
                    isClicked = true;
                }
                break;
            case R.id.btn50:
                if(!isClicked) {
                    Intent intent50 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn50 = getResources().getString(R.string.btn50);
                    String answer50 = getResources().getString(R.string.answer50);
                    intent50.putExtra("dictionary",btn50);
                    intent50.putExtra("answer",answer50);
                    intent50.putExtra("progress",50);
                    intent50.putExtra("lvl",50);
                    intent50.putExtra("money_data",money);
                    startActivityForResult(intent50,50);
                    isClicked = true;
                }
                break;
            case R.id.btn51:
                if(!isClicked) {
                    Intent intent51 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn51 = getResources().getString(R.string.btn4);
                    intent51.putExtra("dictionary",btn51);
                    intent51.putExtra("answer","3");
                    intent51.putExtra("progress",51);
                    intent51.putExtra("lvl",51);
                    intent51.putExtra("money_data",money);
                    startActivityForResult(intent51,51);
                    isClicked = true;
                }
                break;
            case R.id.btn52:
                if(!isClicked) {
                    Intent intent52 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent52.putExtra("dictionary"," 1 | 4 | 9 | 16 | ? ");
                    intent52.putExtra("answer","25");
                    intent52.putExtra("progress",52);
                    intent52.putExtra("lvl",52);
                    intent52.putExtra("money_data",money);
                    startActivityForResult(intent52,52);
                    isClicked = true;
                }
                break;
            case R.id.btn53:
                if(!isClicked) {
                    Intent intent53 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn53 = getResources().getString(R.string.btn4);
                    intent53.putExtra("dictionary",btn53);
                    intent53.putExtra("answer","2");
                    intent53.putExtra("size","4x4");
                    intent53.putExtra("progress",53);
                    intent53.putExtra("lvl",53);
                    intent53.putExtra("money_data",money);
                    startActivityForResult(intent53,53);
                    isClicked = true;
                }
                break;
            case R.id.btn54:
                if(!isClicked) {
                    Intent intent54 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn54 = getResources().getString(R.string.btn54);
                    intent54.putExtra("dictionary",btn54);
                     intent54.putExtra("answer","0");
                     intent54.putExtra("progress",54);
                     intent54.putExtra("lvl",54);
                     intent54.putExtra("money_data",money);
                    startActivityForResult(intent54,54);
                    isClicked = true;
                }
                break;
            case R.id.btn55:
                if(!isClicked) {
                    Intent intent55 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn55 = getResources().getString(R.string.btn4);
                    intent55.putExtra("dictionary",btn55);
                    intent55.putExtra("answer","7");
                    intent55.putExtra("progress",55);
                    intent55.putExtra("lvl",55);
                    intent55.putExtra("money_data",money);
                    startActivityForResult(intent55,55);
                    isClicked = true;
                }
                break;
            case R.id.btn56:
                if(!isClicked) {
                    Intent intent56 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                   intent56.putExtra("dictionary"," 21 = 42 \n 39 = 618 \n 17 = 214 \n 45 = ? ");
                   intent56.putExtra("answer","810");
                   intent56.putExtra("progress",56);
                   intent56.putExtra("lvl",56);
                   intent56.putExtra("money_data",money);
                    startActivityForResult(intent56,56);
                    isClicked = true;
                }
                break;
            case R.id.btn57:
                if(!isClicked) {
                    Intent intent57 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent57.putExtra("dictionary"," 14   5    9\n 22   4    6 \n 33   5    8\n 46   1    ?  ");
                    intent57.putExtra("answer","7");
                    intent57.putExtra("progress",57);
                    intent57.putExtra("lvl",57);
                    intent57.putExtra("money_data",money);
                    startActivityForResult(intent57,57);
                    isClicked = true;
                }
                break;
            case R.id.btn58:
                if(!isClicked) {
                    Intent intent58 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn58 = getResources().getString(R.string.btn4);
                    intent58.putExtra("dictionary",btn58);
                    intent58.putExtra("answer","3");
                    intent58.putExtra("progress",58);
                    intent58.putExtra("lvl",58);
                    intent58.putExtra("money_data",money);
                    startActivityForResult(intent58,58);
                    isClicked = true;
                }
                break;
            case R.id.btn59:
                if(!isClicked) {
                    Intent intent59 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn59 = getResources().getString(R.string.btn4);
                    intent59.putExtra("dictionary",btn59);
                    intent59.putExtra("answer","0");
                    intent59.putExtra("progress",59);
                    intent59.putExtra("lvl",59);
                    intent59.putExtra("money_data",money);
                    startActivityForResult(intent59,59);
                    isClicked = true;
                }
                break;
            case R.id.btn60:
                if(!isClicked) {
                    Intent intent60 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent60.putExtra("dictionary","4554 = 9\n9106 = 7\n1457 = 8\n3848 = ?");
                    intent60.putExtra("answer","5");
                    intent60.putExtra("progress",60);
                    intent60.putExtra("lvl",60);
                    intent60.putExtra("money_data",money);
                    startActivityForResult(intent60,60);
                    isClicked = true;
                }
                break;
            case R.id.btn61:
                if(!isClicked) {
                    Intent intent61 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent61.putExtra("dictionary"," 11 = 12 \n 13 = 16 \n 37 = 44 \n 54 = 58 \n 62 = ? ");
                    intent61.putExtra("answer","64");
                    intent61.putExtra("progress",61);
                    intent61.putExtra("lvl",61);
                    intent61.putExtra("money_data",money);
                    startActivityForResult(intent61,61);
                    isClicked = true;
                }
                break;
            case R.id.btn62:
                if(!isClicked) {
                    Intent intent62 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn62 = getResources().getString(R.string.btn4);
                    intent62.putExtra("dictionary",btn62);
                    intent62.putExtra("answer","20");
                    intent62.putExtra("progress",62);
                    intent62.putExtra("lvl",62);
                    intent62.putExtra("money_data",money);
                    startActivityForResult(intent62,62);
                    isClicked = true;
                }
                break;
            case R.id.btn63:
                if(!isClicked) {
                    Intent intent63 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn63 = getResources().getString(R.string.btn4);
                    intent63.putExtra("dictionary",btn63);
                    intent63.putExtra("answer","25");
                    intent63.putExtra("progress",63);
                    intent63.putExtra("lvl",63);
                    intent63.putExtra("money_data",money);
                    startActivityForResult(intent63,63);
                    isClicked = true;
                }
                break;
            case R.id.btn64:
                if(!isClicked) {
                    Intent intent64 = new Intent(MapLevel.this, SignsCampaign.class);
                    String btn64 = getResources().getString(R.string.btn4);
                    intent64.putExtra("dictionary",btn64);
                    intent64.putExtra("answer","+");
                    intent64.putExtra("answer1","-");
                    intent64.putExtra("answer2","+");
                    intent64.putExtra("progress",64);
                    intent64.putExtra("lvl",64);
                    intent64.putExtra("money_data",money);
                    startActivityForResult(intent64,64);
                    isClicked = true;
                }
                break;
            case R.id.btn65:
                if(!isClicked) {
                    Intent intent65 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent65.putExtra("dictionary"," 12  4  = 316 \n 2  35 = 48 \n 78  1 = 151 \n 90  6 = ? ");
                    intent65.putExtra("answer","936");
                    intent65.putExtra("progress",65);
                    intent65.putExtra("lvl",65);
                    intent65.putExtra("money_data",money);
                    startActivityForResult(intent65,65);
                    isClicked = true;
                }
                break;
            case R.id.btn66:
                if(!isClicked) {
                    Intent intent66 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn66 = getResources().getString(R.string.btn66);
                    intent66.putExtra("dictionary",btn66);
                    intent66.putExtra("answer","100");
                    intent66.putExtra("answer2","1000000");
                    intent66.putExtra("progress",66);
                    intent66.putExtra("lvl",66);
                    intent66.putExtra("money_data",money);
                    startActivityForResult(intent66,66);
                    isClicked = true;
                }
                break;
            case R.id.btn67:
                if(!isClicked) {
                    Intent intent67 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent67.putExtra("dictionary"," 2 | 8 | 3 | 27 | 4 | ? ");
                    intent67.putExtra("answer","64");
                    intent67.putExtra("progress",67);
                    intent67.putExtra("lvl",67);
                    intent67.putExtra("money_data",money);
                    startActivityForResult(intent67,67);
                    isClicked = true;
                }
                break;
            case R.id.btn68:
                if(!isClicked) {
                    Intent intent68 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent68.putExtra("dictionary","9+2=711\n14+6=820\n17+11=628\n12+3 = ?");
                    intent68.putExtra("answer","915");
                    intent68.putExtra("progress",68);
                    intent68.putExtra("lvl",68);
                    intent68.putExtra("money_data",money);
                    startActivityForResult(intent68,68);
                    isClicked = true;
                }
                break;
            case R.id.btn69:
                if(!isClicked) {
                    Intent intent69 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent69.putExtra("dictionary"," 273 = 7 \n 98162 = 1 \n 73472 = 4 \n 691 = ? ");
                    intent69.putExtra("answer","9");
                    intent69.putExtra("progress",69);
                    intent69.putExtra("lvl",69);
                    intent69.putExtra("money_data",money);
                    startActivityForResult(intent69,69);
                    isClicked = true;
                }
                break;
            case R.id.btn70:
                if(!isClicked) {
                    Intent intent70 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn70 = getResources().getString(R.string.btn4);
                    intent70.putExtra("dictionary",btn70);
                    intent70.putExtra("answer","48");
                    intent70.putExtra("progress",70);
                    intent70.putExtra("lvl",70);
                    intent70.putExtra("money_data",money);
                    startActivityForResult(intent70,70);
                    isClicked = true;
                }
                break;
            case R.id.btn71:
                if(!isClicked) {
                    Intent intent71 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn71 = getResources().getString(R.string.btn4);
                    intent71.putExtra("dictionary",btn71);
                    intent71.putExtra("answer","9");
                    intent71.putExtra("size","3x3");
                    intent71.putExtra("progress",71);
                    intent71.putExtra("lvl",71);
                    intent71.putExtra("money_data",money);
                    startActivityForResult(intent71,71);
                    isClicked = true;
                }
                break;
            case R.id.btn72:
                if(!isClicked) {
                    Intent intent72 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent72.putExtra("dictionary","2+3=10\n8+4=96\n7+2=63\n6+5=66\n9+8=?");
                    intent72.putExtra("answer","153");
                    intent72.putExtra("progress",72);
                    intent72.putExtra("lvl",72);
                    intent72.putExtra("money_data",money);
                    startActivityForResult(intent72,72);
                    isClicked = true;
                }
                break;
            case R.id.btn73:
                if(!isClicked) {
                    Intent intent73 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent73.putExtra("dictionary"," 523 = 19 \n 810 = 8 \n 625 = 37 \n 947 = ? ");
                    intent73.putExtra("answer","85");
                    intent73.putExtra("progress",73);
                    intent73.putExtra("lvl",73);
                    intent73.putExtra("money_data",money);
                    startActivityForResult(intent73,73);
                    isClicked = true;
                }
                break;
            case R.id.btn74:
                if(!isClicked) {
                    Intent intent74 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent74.putExtra("dictionary"," 1 | 4 | 16 | 64 | ? ");
                    intent74.putExtra("answer","256");
                    intent74.putExtra("progress",74);
                    intent74.putExtra("lvl",74);
                    intent74.putExtra("money_data",money);
                    startActivityForResult(intent74,74);
                    isClicked = true;
                }
                break;
            case R.id.btn75:
                if(!isClicked) {
                    Intent intent75 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent75.putExtra("dictionary","3=18\n4=32\n5=50\n6=72\n7=98\n10=?");
                    intent75.putExtra("answer","200");
                    intent75.putExtra("progress",75);
                    intent75.putExtra("lvl",75);
                    intent75.putExtra("money_data",money);
                    startActivityForResult(intent75,75);
                    isClicked = true;
                }
                break;
            case R.id.btn76:
                if(!isClicked) {
                    Intent intent76 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn76 = getResources().getString(R.string.btn4);
                    intent76.putExtra("dictionary",btn76);
                    intent76.putExtra("answer","2");
                    intent76.putExtra("progress",76);
                    intent76.putExtra("lvl",76);
                    intent76.putExtra("money_data",money);
                    startActivityForResult(intent76,76);
                    isClicked = true;
                }
                break;
            case R.id.btn77:
                if(!isClicked) {
                    Intent intent77 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent77.putExtra("dictionary"," 1 4 3 = 31 \n 9 9 7 = 79 \n 3 6 6 = 63 \n 6 0 8 = ?? ");
                    intent77.putExtra("answer","86");
                    intent77.putExtra("progress",77);
                    intent77.putExtra("lvl",77);
                    intent77.putExtra("money_data",money);
                    startActivityForResult(intent77,77);
                    isClicked = true;
                }
                break;
            case R.id.btn78:
                if(!isClicked) {
                    Intent intent78 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn78 = getResources().getString(R.string.btn4);
                    intent78.putExtra("dictionary",btn78);
                    intent78.putExtra("answer","5");
                    intent78.putExtra("size","3x3");
                    intent78.putExtra("progress",78);
                    intent78.putExtra("lvl",78);
                    intent78.putExtra("money_data",money);
                    startActivityForResult(intent78,78);
                    isClicked = true;
                }
                break;
            case R.id.btn79:
                    if(!isClicked) {
                        Intent intent79 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                        intent79.putExtra("dictionary","6636 | 3\n8118 | 4\n2242 | 0\n3316 | ?");
                        intent79.putExtra("answer","1");
                        intent79.putExtra("progress",79);
                        intent79.putExtra("lvl",79);
                        intent79.putExtra("money_data",money);
                        startActivityForResult(intent79,79);
                        isClicked = true;
                    }


                break;
            case R.id.btn80:
                if(!isClicked) {
                    Intent intent80 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent80.putExtra("dictionary"," 1 | 2 | 6 | 24 | ? ");
                    intent80.putExtra("answer","120");
                    intent80.putExtra("progress",80);
                    intent80.putExtra("lvl",80);
                    intent80.putExtra("money_data",money);
                    startActivityForResult(intent80,80);
                    isClicked = true;
                }
                break;
            case R.id.btn81:
                if(!isClicked) {
                    Intent intent81 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn81 = getResources().getString(R.string.btn4);
                    intent81.putExtra("dictionary",btn81);
                    intent81.putExtra("answer","8");
                    intent81.putExtra("progress",81);
                    intent81.putExtra("lvl",81);
                    intent81.putExtra("money_data",money);
                    startActivityForResult(intent81,81);
                    isClicked = true;
                }
                break;
            case R.id.btn82:
                if(!isClicked) {
                    Intent intent82 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn82 = getResources().getString(R.string.btn4);
                    intent82.putExtra("dictionary",btn82);
                    intent82.putExtra("answer","52");
                    intent82.putExtra("progress",82);
                    intent82.putExtra("lvl",82);
                    intent82.putExtra("money_data",money);
                    startActivityForResult(intent82,82);
                    isClicked = true;
                }
                break;
            case R.id.btn83:
                if(!isClicked) {
                    Intent intent83 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn83 = getResources().getString(R.string.btn4);
                    intent83.putExtra("dictionary",btn83);
                    intent83.putExtra("answer","68");
                    intent83.putExtra("progress",83);
                    intent83.putExtra("lvl",83);
                    intent83.putExtra("money_data",money);
                    startActivityForResult(intent83,83);
                    isClicked = true;
                }
                break;
            case R.id.btn84:
                if(!isClicked) {
                    Intent intent84 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn84 = getResources().getString(R.string.btn110);
                    intent84.putExtra("dictionary",btn84);
                    intent84.putExtra("answer","2");
                    intent84.putExtra("answer1","1");
                    intent84.putExtra("answer2","3");
                    intent84.putExtra("progress",84);
                    intent84.putExtra("lvl",84);
                    intent84.putExtra("money_data",money);
                    startActivityForResult(intent84,84);
                    isClicked = true;
                }
                break;
            case R.id.btn85:
                if(!isClicked) {
                    Intent intent85 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent85.putExtra("dictionary","A+A = 18\nA+A-B = 11\nB*A+C = 80\nC-B-D=A\nD - ?");
                    intent85.putExtra("answer","1");
                    intent85.putExtra("progress",85);
                    intent85.putExtra("lvl",85);
                    intent85.putExtra("money_data",money);
                    startActivityForResult(intent85,85);
                    isClicked = true;
                }
                break;
            case R.id.btn86:
                if(!isClicked) {
                    Intent intent86 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn86 = getResources().getString(R.string.btn4);
                    intent86.putExtra("dictionary",btn86);
                    intent86.putExtra("answer","10");
                    intent86.putExtra("progress",86);
                    intent86.putExtra("lvl",86);
                    intent86.putExtra("money_data",money);
                    startActivityForResult(intent86,86);
                    isClicked = true;
                }
                break;
            case R.id.btn87:
                if(!isClicked) {
                    Intent intent87 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn87 = getResources().getString(R.string.btn4);
                    intent87.putExtra("dictionary",btn87);
                    intent87.putExtra("answer","7");
                    intent87.putExtra("answer1","9");
                    intent87.putExtra("answer2","19");
                    intent87.putExtra("answer3","7");
                    intent87.putExtra("size","5x5");
                    intent87.putExtra("progress",87);
                    intent87.putExtra("lvl",87);
                    intent87.putExtra("money_data",money);
                    startActivityForResult(intent87,87);
                    isClicked = true;
                }
                break;
            case R.id.btn88:
                if(!isClicked) {
                    Intent intent88 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn88 = getResources().getString(R.string.btn88);
                    intent88.putExtra("dictionary",btn88);
                    intent88.putExtra("answer","10");
                    intent88.putExtra("answer1","14");
                    intent88.putExtra("progress",88);
                    intent88.putExtra("lvl",88);
                    intent88.putExtra("money_data",money);
                    startActivityForResult(intent88,88);
                    isClicked = true;
                }
                break;
            case R.id.btn89:
                if(!isClicked) {
                    Intent intent89 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent89.putExtra("dictionary","A+B*A = 55\nC+A+D = 12\nD+B-C = 9\nB-D+C=11\nD+C*B - ?");
                    intent89.putExtra("answer","43");
                    intent89.putExtra("progress",89);
                    intent89.putExtra("lvl",89);
                    intent89.putExtra("money_data",money);
                    startActivityForResult(intent89,89);
                    isClicked = true;
                }
                break;
            case R.id.btn90:
                if(!isClicked) {
                    Intent intent90 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn90 = getResources().getString(R.string.btn4);
                    intent90.putExtra("dictionary",btn90);
                    intent90.putExtra("answer","11");
                    intent90.putExtra("progress",90);
                    intent90.putExtra("lvl",90);
                    intent90.putExtra("money_data",money);
                    startActivityForResult(intent90,90);
                    isClicked = true;
                }
                break;
            case R.id.btn91:
                if(!isClicked) {
                    Intent intent91 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn91 = getResources().getString(R.string.btn4);
                    intent91.putExtra("dictionary",btn91);
                    intent91.putExtra("answer","14");
                    intent91.putExtra("progress",91);
                    intent91.putExtra("lvl",91);
                    intent91.putExtra("money_data",money);
                    startActivityForResult(intent91,91);
                    isClicked = true;
                }
                break;
            case R.id.btn92:
                if(!isClicked) {
                    Intent intent92 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn92 = getResources().getString(R.string.btn92);
                    intent92.putExtra("dictionary",btn92);
                    intent92.putExtra("answer","23");
                    intent92.putExtra("progress",92);
                    intent92.putExtra("lvl",92);
                    intent92.putExtra("money_data",money);
                    startActivityForResult(intent92,92);
                    isClicked = true;
                }
                break;
            case R.id.btn93:
                if(!isClicked) {
                    Intent intent93 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn93 = getResources().getString(R.string.btn4);
                    intent93.putExtra("dictionary",btn93);
                    intent93.putExtra("answer","6");
                    intent93.putExtra("size","3x3");
                    intent93.putExtra("progress",93);
                    intent93.putExtra("lvl",93);
                    intent93.putExtra("money_data",money);
                    startActivityForResult(intent93,93);
                    isClicked = true;
                }
                break;
            case R.id.btn94:
                if(!isClicked) {
                    Intent intent94 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent94.putExtra("dictionary"," 4 | 7 | 12 | 21 | 38 | ? ");
                    intent94.putExtra("answer","71");
                    intent94.putExtra("progress",94);
                    intent94.putExtra("lvl",94);
                    intent94.putExtra("money_data",money);
                    startActivityForResult(intent94,94);
                    isClicked = true;
                }
                break;
            case R.id.btn95:
                if(!isClicked) {
                    Intent intent95 = new Intent(MapLevel.this, TextQuestionsCamplaign.class);
                    intent95.putExtra("dictionary"," 2 * A - 3 * B = 8 \n 3 * A - 4 * B = 14 \n A - ? ");
                    intent95.putExtra("answer","10");
                    intent95.putExtra("progress",95);
                    intent95.putExtra("lvl",95);
                    intent95.putExtra("money_data",money);
                    startActivityForResult(intent95,95);
                    isClicked = true;
                }
                break;
            case R.id.btn96:
                if(!isClicked) {
                    Intent intent96 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn96 = getResources().getString(R.string.btn4);
                    intent96.putExtra("dictionary",btn96);
                    intent96.putExtra("answer","29");
                    intent96.putExtra("progress",96);
                    intent96.putExtra("lvl",96);
                    intent96.putExtra("money_data",money);
                    startActivityForResult(intent96,96);
                    isClicked = true;
                }
                break;
            case R.id.btn97:
                if(!isClicked) {
                    Intent intent97 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent97.putExtra("dictionary","1+1+1+1+1\n1+1+1+1+1\n1+1*0+1 = ?");
                    intent97.putExtra("answer","2");
                    intent97.putExtra("progress",97);
                    intent97.putExtra("lvl",97);
                    intent97.putExtra("money_data",money);
                    startActivityForResult(intent97,97);
                    isClicked = true;
                }
                break;
            case R.id.btn98:
                if(!isClicked) {
                    Intent intent98 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent98.putExtra("dictionary","7+3=41021\n8+3=51124\n5+4=1920\n9+6=31554\n7+4=31128\n5+2=3710\n13+6=71978\n17+8=?");
                    intent98.putExtra("answer","925136");
                    intent98.putExtra("progress",98);
                    intent98.putExtra("lvl",98);
                    intent98.putExtra("money_data",money);
                    startActivityForResult(intent98,98);
                    isClicked = true;
                }
                break;
            case R.id.btn99:
                if(!isClicked) {
                    Intent intent99 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn99 = getResources().getString(R.string.btn4);
                    intent99.putExtra("dictionary",btn99);
                    intent99.putExtra("answer","51");
                    intent99.putExtra("size","4x4");
                    intent99.putExtra("progress",99);
                    intent99.putExtra("lvl",99);
                    intent99.putExtra("money_data",money);
                    startActivityForResult(intent99,99);
                    isClicked = true;
                }
                break;
            case R.id.btn100:
                if(!isClicked) {
                    Intent intent100 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn100 = getResources().getString(R.string.btn4);
                    intent100.putExtra("dictionary",btn100);
                    intent100.putExtra("answer","24");
                    intent100.putExtra("size","3x3");
                    intent100.putExtra("progress",100);
                    intent100.putExtra("lvl",100);
                    intent100.putExtra("money_data",money);
                    startActivityForResult(intent100,100);
                    isClicked = true;
                }
                break;
            case R.id.btn101:
                if(!isClicked) {
                    Intent intent101 = new Intent(MapLevel.this, PictureCampaignMath.class);
                    String btn101 = getResources().getString(R.string.btn4);
                    intent101.putExtra("dictionary",btn101);
                    intent101.putExtra("answer","7");
                    intent101.putExtra("progress",101);
                    intent101.putExtra("lvl",101);
                    intent101.putExtra("money_data",money);
                    startActivityForResult(intent101,101);
                    isClicked = true;
                }
                break;
            case R.id.btn102:
                if(!isClicked) {
                    Intent intent102 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn102 = getResources().getString(R.string.btn4);
                    intent102.putExtra("dictionary",btn102);
                    intent102.putExtra("answer","18");
                    intent102.putExtra("size","5x5");
                    intent102.putExtra("progress",102);
                    intent102.putExtra("lvl",102);
                    intent102.putExtra("money_data",money);
                    startActivityForResult(intent102,102);
                    isClicked = true;
                }
                break;
            case R.id.btn103:
                if(!isClicked) {
                    Intent intent103 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent103.putExtra("dictionary","8+2=16106\n5+4=2091\n9+6=54153\n7+5=35122\n20+3=602317\n18+4=?");
                    intent103.putExtra("answer","722214");
                    intent103.putExtra("progress",103);
                    intent103.putExtra("lvl",103);
                    intent103.putExtra("money_data",money);
                    startActivityForResult(intent103,103);
                    isClicked = true;
                }
                break;
            case R.id.btn104:
                if(!isClicked) {
                    Intent intent104 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn104 = getResources().getString(R.string.btn4);
                    intent104.putExtra("dictionary",btn104);
                    intent104.putExtra("answer","720");
                    intent104.putExtra("size","4x4");
                    intent104.putExtra("progress",104);
                    intent104.putExtra("lvl",104);
                    intent104.putExtra("money_data",money);
                    startActivityForResult(intent104,104);
                    isClicked = true;
                }
                break;
            case R.id.btn105:
                if(!isClicked) {
                    Intent intent105 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn105 = getResources().getString(R.string.btn105);
                    intent105.putExtra("dictionary",btn105);
                    intent105.putExtra("answer","51");
                    intent105.putExtra("answer1","15");
                    intent105.putExtra("progress",105);
                    intent105.putExtra("lvl",105);
                    intent105.putExtra("money_data",money);
                    startActivityForResult(intent105,105);
                    isClicked = true;
                }
                break;
            case R.id.btn106:
                if(!isClicked) {
                    Intent intent106 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn106 = getResources().getString(R.string.btn4);
                    intent106.putExtra("dictionary",btn106);
                    intent106.putExtra("answer","4");
                    intent106.putExtra("size","4x4");
                    intent106.putExtra("progress",106);
                    intent106.putExtra("lvl",106);
                    intent106.putExtra("money_data",money);
                    startActivityForResult(intent106,106);
                    isClicked = true;
                }
                break;
            case R.id.btn107:
                if(!isClicked) {
                    Intent intent107 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn107 = getResources().getString(R.string.btn4);
                    intent107.putExtra("dictionary",btn107);
                    intent107.putExtra("answer","44");
                    intent107.putExtra("size","4x4");
                    intent107.putExtra("progress",107);
                    intent107.putExtra("lvl",107);
                    intent107.putExtra("money_data",money);
                    startActivityForResult(intent107,107);
                    isClicked = true;
                }
                break;
            case R.id.btn108:
                if(!isClicked) {
                    Intent intent108 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    intent108.putExtra("dictionary"," 6 | 14 | 36 | 98 | ? ");
                    intent108.putExtra("answer","276");
                    intent108.putExtra("progress",108);
                    intent108.putExtra("lvl",108);
                    intent108.putExtra("money_data",money);
                    startActivityForResult(intent108,108);
                    isClicked = true;
                }
                break;
            case R.id.btn109:
                if(!isClicked) {
                    Intent intent109 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
                    String btn109 = getResources().getString(R.string.btn109);
                    intent109.putExtra("dictionary",btn109);
                    intent109.putExtra("answer","44");
                    intent109.putExtra("progress",109);
                    intent109.putExtra("lvl",109);
                    intent109.putExtra("money_data",money);
                    startActivityForResult(intent109,109);
                    isClicked = true;
                }
            case R.id.btn110:
                if(!isClicked) {
                    Intent intent110 = new Intent(MapLevel.this, ButtonsCampaign.class);
                    String btn110 = getResources().getString(R.string.btn110);
                    intent110.putExtra("dictionary",btn110);
                    intent110.putExtra("answer","1");
                    intent110.putExtra("answer1","8");
                    intent110.putExtra("answer2","5");
                    intent110.putExtra("size","5x5");
                    intent110.putExtra("progress",110);
                    intent110.putExtra("lvl",110);
                    intent110.putExtra("money_data",money);
                    startActivityForResult(intent110,110);
                    isClicked = true;
                }
                break;

            default:
                break;
        }

    }

    private void LoadPreferences(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        boolean state = sharedPreferences.getBoolean("state", false);
        boolean state_next = sharedPreferences.getBoolean("Next", false);
        if(state) {
            btn.setEnabled(state);
            btn.setClickable(state);
            //btn.setBackgroundColor(Color.GREEN);
            btn2.setClickable(state_next);
            btn2.setEnabled(state_next);
        }

        boolean state2 = sharedPreferences.getBoolean("state2", false);
        boolean state_next2 = sharedPreferences.getBoolean("Next2", false);
        if(state2) {
            btn2.setEnabled(state2);
            btn2.setClickable(state2);
            //btn2.setBackgroundColor(Color.GREEN);
            btn3.setClickable(state_next2);
            btn3.setEnabled(state_next2);
        }

        boolean state3 = sharedPreferences.getBoolean("state3", false);
        boolean state_next3 = sharedPreferences.getBoolean("Next3", false);
        if(state3) {
            btn3.setEnabled(state3);
            btn3.setClickable(state3);
            //btn3.setBackgroundColor(Color.GREEN);
            btn4.setClickable(state_next3);
            btn4.setEnabled(state_next3);
        }

        boolean state4 = sharedPreferences.getBoolean("state4", false);
        boolean state_next4 = sharedPreferences.getBoolean("Next4", false);
        if(state4) {
            btn4.setEnabled(state4);
            btn4.setClickable(state4);
            //btn4.setBackgroundColor(Color.GREEN);
            btn5.setClickable(state_next4);
            btn5.setEnabled(state_next4);
        }

        boolean state5 = sharedPreferences.getBoolean("state5", false);
        boolean state_next5 = sharedPreferences.getBoolean("Next5", false);
        if(state5) {
            btn5.setEnabled(state5);
            btn5.setClickable(state5);
            // btn5.setBackgroundColor(Color.GREEN);
            btn6.setClickable(state_next5);
            btn6.setEnabled(state_next5);
        }

        boolean state6 = sharedPreferences.getBoolean("state6", false);
        boolean state_next6 = sharedPreferences.getBoolean("Next6", false);
        if(state6) {
            btn6.setEnabled(state6);
            btn6.setClickable(state6);
            //btn6.setBackgroundColor(Color.GREEN);
            btn7.setClickable(state_next6);
            btn7.setEnabled(state_next6);
        }

        boolean state7 = sharedPreferences.getBoolean("state7", false);
        boolean state_next7 = sharedPreferences.getBoolean("Next7", false);
        if(state7) {
            btn7.setEnabled(state7);
            btn7.setClickable(state7);
            // btn7.setBackgroundColor(Color.GREEN);
            btn8.setClickable(state_next7);
            btn8.setEnabled(state_next7);
        }

        boolean state8 = sharedPreferences.getBoolean("state8", false);
        boolean state_next8 = sharedPreferences.getBoolean("Next8", false);
        if(state8) {
            btn8.setEnabled(state8);
            btn8.setClickable(state8);
            //btn8.setBackgroundColor(Color.GREEN);
            btn9.setClickable(state_next8);
            btn9.setEnabled(state_next8);
        }

        boolean state9 = sharedPreferences.getBoolean("state9", false);
        boolean state_next9 = sharedPreferences.getBoolean("Next9", false);
        if(state9) {
            btn9.setEnabled(state9);
            btn9.setClickable(state9);
            //btn9.setBackgroundColor(Color.GREEN);
            btn10.setClickable(state_next9);
            btn10.setEnabled(state_next9);
        }

        boolean state10 = sharedPreferences.getBoolean("state10", false);
        boolean state_next10 = sharedPreferences.getBoolean("Next10", false);
        if(state10) {
            btn10.setEnabled(state10);
            btn10.setClickable(state10);
            //btn10.setBackgroundColor(Color.GREEN);
            btn11.setClickable(state_next10);
            btn11.setEnabled(state_next10);
        }

        boolean state11 = sharedPreferences.getBoolean("state11", false);
        boolean state_next11 = sharedPreferences.getBoolean("Next11", false);
        if(state11) {
            btn11.setEnabled(state11);
            btn11.setClickable(state11);
            //btn11.setBackgroundColor(Color.GREEN);
            btn12.setClickable(state_next11);
            btn12.setEnabled(state_next11);
        }

        boolean state12 = sharedPreferences.getBoolean("state12", false);
        boolean state_next12 = sharedPreferences.getBoolean("Next12", false);
        if(state12) {
            btn12.setEnabled(state12);
            btn12.setClickable(state12);
            //btn12.setBackgroundColor(Color.GREEN);
            btn13.setClickable(state_next12);
            btn13.setEnabled(state_next12);
        }

        boolean state13 = sharedPreferences.getBoolean("state13", false);
        boolean state_next13 = sharedPreferences.getBoolean("Next13", false);
        if(state13) {
            btn13.setEnabled(state13);
            btn13.setClickable(state13);
            //btn13.setBackgroundColor(Color.GREEN);
            btn14.setClickable(state_next13);
            btn14.setEnabled(state_next13);
        }

        boolean state14 = sharedPreferences.getBoolean("state14", false);
        boolean state_next14 = sharedPreferences.getBoolean("Next14", false);
        if(state14) {
            btn14.setEnabled(state14);
            btn14.setClickable(state14);
            //btn14.setBackgroundColor(Color.GREEN);
            btn15.setClickable(state_next14);
            btn15.setEnabled(state_next14);
        }

        boolean state15 = sharedPreferences.getBoolean("state15", false);
        boolean state_next15 = sharedPreferences.getBoolean("Next15", false);
        if(state15) {
            btn15.setEnabled(state15);
            btn15.setClickable(state15);
            //btn15.setBackgroundColor(Color.GREEN);
            btn16.setClickable(state_next15);
            btn16.setEnabled(state_next15);
        }

        boolean state16 = sharedPreferences.getBoolean("state16", false);
        boolean state_next16 = sharedPreferences.getBoolean("Next16", false);
        if(state16) {
            btn16.setEnabled(state16);
            btn16.setClickable(state16);
            //btn16.setBackgroundColor(Color.GREEN);
            btn17.setClickable(state_next16);
            btn17.setEnabled(state_next16);
        }

        boolean state17 = sharedPreferences.getBoolean("state17", false);
        boolean state_next17 = sharedPreferences.getBoolean("Next17", false);
        if(state17) {
            btn17.setEnabled(state17);
            btn17.setClickable(state17);
            //btn17.setBackgroundColor(Color.GREEN);
            btn18.setClickable(state_next17);
            btn18.setEnabled(state_next17);
        }

        boolean state18 = sharedPreferences.getBoolean("state18", false);
        boolean state_next18 = sharedPreferences.getBoolean("Next18", false);
        if(state18) {
            btn18.setEnabled(state18);
            btn18.setClickable(state18);
            //btn18.setBackgroundColor(Color.GREEN);
            btn19.setClickable(state_next18);
            btn19.setEnabled(state_next18);
        }

        boolean state19 = sharedPreferences.getBoolean("state19", false);
        boolean state_next19 = sharedPreferences.getBoolean("Next19", false);
        if(state19) {
            btn19.setEnabled(state19);
            btn19.setClickable(state19);
            //btn19.setBackgroundColor(Color.GREEN);
            btn20.setClickable(state_next19);
            btn20.setEnabled(state_next19);
        }

        boolean state20 = sharedPreferences.getBoolean("state20", false);
        boolean state_next20 = sharedPreferences.getBoolean("Next20", false);
        if(state20) {
            btn20.setEnabled(state20);
            btn20.setClickable(state20);
            //btn20.setBackgroundColor(Color.GREEN);
            btn21.setClickable(state_next20);
            btn21.setEnabled(state_next20);
        }

        boolean state21 = sharedPreferences.getBoolean("state21", false);
        boolean state_next21 = sharedPreferences.getBoolean("Next21", false);
        if(state21) {
            btn21.setEnabled(state21);
            btn21.setClickable(state21);
            //btn21.setBackgroundColor(Color.GREEN);
            btn22.setClickable(state_next21);
            btn22.setEnabled(state_next21);
        }

        boolean state22 = sharedPreferences.getBoolean("state22", false);
        boolean state_next22 = sharedPreferences.getBoolean("Next22", false);
        if(state22) {
            btn22.setEnabled(state22);
            btn22.setClickable(state22);
            //btn22.setBackgroundColor(Color.GREEN);
            btn23.setClickable(state_next22);
            btn23.setEnabled(state_next22);
        }

        boolean state23 = sharedPreferences.getBoolean("state23", false);
        boolean state_next23 = sharedPreferences.getBoolean("Next23", false);
        if(state23) {
            btn23.setEnabled(state23);
            btn23.setClickable(state23);
            //btn23.setBackgroundColor(Color.GREEN);
            btn24.setClickable(state_next23);
            btn24.setEnabled(state_next23);
        }


        boolean state24 = sharedPreferences.getBoolean("state24", false);
        boolean state_next24 = sharedPreferences.getBoolean("Next24", false);
        if(state24) {
            btn24.setEnabled(state24);
            btn24.setClickable(state24);
            // btn24.setBackgroundColor(Color.GREEN);
            btn25.setClickable(state_next24);
            btn25.setEnabled(state_next24);
        }

        boolean state25 = sharedPreferences.getBoolean("state25", false);
        boolean state_next25 = sharedPreferences.getBoolean("Next25", false);
        if(state25) {
            btn25.setEnabled(state25);
            btn25.setClickable(state25);
            //btn25.setBackgroundColor(Color.GREEN);
            btn26.setClickable(state_next25);
            btn26.setEnabled(state_next25);
        }

        boolean state26 = sharedPreferences.getBoolean("state26", false);
        boolean state_next26 = sharedPreferences.getBoolean("Next26", false);
        if(state26) {
            btn26.setEnabled(state26);
            btn26.setClickable(state26);
            //btn26.setBackgroundColor(Color.GREEN);
            btn27.setClickable(state_next26);
            btn27.setEnabled(state_next26);
        }

        boolean state27 = sharedPreferences.getBoolean("state27", false);
        boolean state_next27 = sharedPreferences.getBoolean("Next27", false);
        if(state27) {
            btn27.setEnabled(state27);
            btn27.setClickable(state27);
            //btn27.setBackgroundColor(Color.GREEN);
            btn28.setClickable(state_next27);
            btn28.setEnabled(state_next27);
        }

        boolean state28 = sharedPreferences.getBoolean("state28", false);
        boolean state_next28 = sharedPreferences.getBoolean("Next28", false);
        if(state28) {
            btn28.setEnabled(state28);
            btn28.setClickable(state28);
            //btn28.setBackgroundColor(Color.GREEN);
            btn29.setClickable(state_next28);
            btn29.setEnabled(state_next28);
        }

        boolean state29 = sharedPreferences.getBoolean("state29", false);
        boolean state_next29 = sharedPreferences.getBoolean("Next29", false);
        if(state29) {
            btn29.setEnabled(state29);
            btn29.setClickable(state29);
            //btn29.setBackgroundColor(Color.GREEN);
            btn30.setClickable(state_next29);
            btn30.setEnabled(state_next29);
        }

        boolean state30 = sharedPreferences.getBoolean("state30", false);
        boolean state_next30 = sharedPreferences.getBoolean("Next30", false);
        if(state30) {
            btn30.setEnabled(state30);
            btn30.setClickable(state30);
            //btn30.setBackgroundColor(Color.GREEN);
            btn31.setClickable(state_next30);
            btn31.setEnabled(state_next30);
        }

        boolean state31 = sharedPreferences.getBoolean("state31", false);
        boolean state_next31 = sharedPreferences.getBoolean("Next31", false);
        if(state31) {
            btn31.setEnabled(state31);
            btn31.setClickable(state31);
            // btn31.setBackgroundColor(Color.GREEN);
            btn32.setClickable(state_next31);
            btn32.setEnabled(state_next31);
        }

        boolean state32 = sharedPreferences.getBoolean("state32", false);
        boolean state_next32 = sharedPreferences.getBoolean("Next32", false);
        if(state32) {
            btn32.setEnabled(state32);
            btn32.setClickable(state32);
            //btn32.setBackgroundColor(Color.GREEN);
            btn33.setClickable(state_next32);
            btn33.setEnabled(state_next32);
        }

        boolean state33 = sharedPreferences.getBoolean("state33", false);
        boolean state_next33 = sharedPreferences.getBoolean("Next33", false);
        if(state33) {
            btn33.setEnabled(state33);
            btn33.setClickable(state33);
            // btn33.setBackgroundColor(Color.GREEN);
            btn34.setClickable(state_next33);
            btn34.setEnabled(state_next33);
        }

        boolean state34 = sharedPreferences.getBoolean("state34", false);
        boolean state_next34 = sharedPreferences.getBoolean("Next34", false);
        if(state34) {
            btn34.setEnabled(state34);
            btn34.setClickable(state34);
            //btn34.setBackgroundColor(Color.GREEN);
            btn35.setClickable(state_next34);
            btn35.setEnabled(state_next34);
        }

        boolean state35 = sharedPreferences.getBoolean("state35", false);
        boolean state_next35 = sharedPreferences.getBoolean("Next35", false);
        if(state35) {
            btn35.setEnabled(state35);
            btn35.setClickable(state35);
            //btn35.setBackgroundColor(Color.GREEN);
            btn36.setClickable(state_next35);
            btn36.setEnabled(state_next35);
        }

        boolean state36 = sharedPreferences.getBoolean("state36", false);
        boolean state_next36 = sharedPreferences.getBoolean("Next36", false);
        if(state36) {
            btn36.setEnabled(state36);
            btn36.setClickable(state36);
            //btn36.setBackgroundColor(Color.GREEN);
            btn37.setClickable(state_next36);
            btn37.setEnabled(state_next36);
        }

        boolean state37 = sharedPreferences.getBoolean("state37", false);
        boolean state_next37 = sharedPreferences.getBoolean("Next37", false);
        if(state37) {
            btn37.setEnabled(state37);
            btn37.setClickable(state37);
            //btn37.setBackgroundColor(Color.GREEN);
            btn38.setClickable(state_next37);
            btn38.setEnabled(state_next37);
        }

        boolean state38 = sharedPreferences.getBoolean("state38", false);
        boolean state_next38 = sharedPreferences.getBoolean("Next38", false);
        if(state38) {
            btn38.setEnabled(state38);
            btn38.setClickable(state38);
            //btn38.setBackgroundColor(Color.GREEN);
            btn39.setClickable(state_next38);
            btn39.setEnabled(state_next38);
        }


        boolean state39 = sharedPreferences.getBoolean("state39", false);
        boolean state_next39 = sharedPreferences.getBoolean("Next39", false);
        if(state39) {
            btn39.setEnabled(state39);
            btn39.setClickable(state39);
            // btn39.setBackgroundColor(Color.GREEN);
            btn40.setClickable(state_next39);
            btn40.setEnabled(state_next39);
        }

        boolean state40 = sharedPreferences.getBoolean("state40", false);
        boolean state_next40 = sharedPreferences.getBoolean("Next40", false);
        if(state40) {
            btn40.setEnabled(state40);
            btn40.setClickable(state40);
            //btn40.setBackgroundColor(Color.GREEN);
            btn41.setClickable(state_next40);
            btn41.setEnabled(state_next40);
        }

        boolean state41 = sharedPreferences.getBoolean("state41", false);
        boolean state_next41 = sharedPreferences.getBoolean("Next41", false);
        if(state41) {
            btn41.setEnabled(state41);
            btn41.setClickable(state41);
            // btn41.setBackgroundColor(Color.GREEN);
            btn42.setClickable(state_next41);
            btn42.setEnabled(state_next41);
        }

        boolean state42 = sharedPreferences.getBoolean("state42", false);
        boolean state_next42 = sharedPreferences.getBoolean("Next42", false);
        if(state42) {
            btn42.setEnabled(state42);
            btn42.setClickable(state42);
            // btn42.setBackgroundColor(Color.GREEN);
            btn43.setClickable(state_next42);
            btn43.setEnabled(state_next42);
        }

        boolean state43 = sharedPreferences.getBoolean("state43", false);
        boolean state_next43 = sharedPreferences.getBoolean("Next43", false);
        if(state43) {
            btn43.setEnabled(state43);
            btn43.setClickable(state43);
            //btn43.setBackgroundColor(Color.GREEN);
            btn44.setClickable(state_next43);
            btn44.setEnabled(state_next43);
        }

        boolean state44 = sharedPreferences.getBoolean("state44", false);
        boolean state_next44 = sharedPreferences.getBoolean("Next44", false);
        if(state44) {
            btn44.setEnabled(state44);
            btn44.setClickable(state44);
            // btn44.setBackgroundColor(Color.GREEN);
            btn45.setClickable(state_next44);
            btn45.setEnabled(state_next44);
        }

        boolean state45 = sharedPreferences.getBoolean("state45", false);
        boolean state_next45 = sharedPreferences.getBoolean("Next45", false);
        if(state45) {
            btn45.setEnabled(state45);
            btn45.setClickable(state45);
            // btn45.setBackgroundColor(Color.GREEN);
            btn46.setClickable(state_next45);
            btn46.setEnabled(state_next45);
        }

        boolean state46 = sharedPreferences.getBoolean("state46", false);
        boolean state_next46 = sharedPreferences.getBoolean("Next46", false);
        if(state46) {
            btn46.setEnabled(state46);
            btn46.setClickable(state46);
            // btn46.setBackgroundColor(Color.GREEN);
            btn47.setClickable(state_next46);
            btn47.setEnabled(state_next46);
        }

        boolean state47 = sharedPreferences.getBoolean("state47", false);
        boolean state_next47 = sharedPreferences.getBoolean("Next47", false);
        if(state47) {
            btn47.setEnabled(state47);
            btn47.setClickable(state47);
            // btn47.setBackgroundColor(Color.GREEN);
            btn48.setClickable(state_next47);
            btn48.setEnabled(state_next47);
        }

        boolean state48 = sharedPreferences.getBoolean("state48", false);
        boolean state_next48 = sharedPreferences.getBoolean("Next48", false);
        if(state48) {
            btn48.setEnabled(state48);
            btn48.setClickable(state48);
            // btn48.setBackgroundColor(Color.GREEN);
            btn49.setClickable(state_next48);
            btn49.setEnabled(state_next48);
        }

        boolean stat49 = sharedPreferences.getBoolean("state49", false);
        boolean state_next49 = sharedPreferences.getBoolean("Next49", false);
        if(stat49) {
            btn49.setEnabled(stat49);
            btn49.setClickable(stat49);
            // btn49.setBackgroundColor(Color.GREEN);
            btn50.setClickable(state_next49);
            btn50.setEnabled(state_next49);
        }

        boolean stat50 = sharedPreferences.getBoolean("state50", false);
        boolean state_next50 = sharedPreferences.getBoolean("Next50", false);
        if(stat50) {
            btn50.setEnabled(stat50);
            btn50.setClickable(stat50);
            // btn49.setBackgroundColor(Color.GREEN);
            btn51.setClickable(state_next50);
            btn51.setEnabled(state_next50);
        }
        boolean stat51 = sharedPreferences.getBoolean("state51", false);
        boolean state_next51 = sharedPreferences.getBoolean("Next51", false);
        if(stat51) {
            btn51.setEnabled(stat51);
            btn51.setClickable(stat51);
            // btn49.setBackgroundColor(Color.GREEN);
            btn52.setClickable(state_next51);
            btn52.setEnabled(state_next51);
        }
        boolean stat52 = sharedPreferences.getBoolean("state52", false);
        boolean state_next52 = sharedPreferences.getBoolean("Next52", false);
        if(stat52) {
            btn52.setEnabled(stat52);
            btn52.setClickable(stat52);
            // btn49.setBackgroundColor(Color.GREEN);
            btn53.setClickable(state_next52);
            btn53.setEnabled(state_next52);
        }
        boolean stat53 = sharedPreferences.getBoolean("state53", false);
        boolean state_next53 = sharedPreferences.getBoolean("Next53", false);
        if(stat53) {
            btn53.setEnabled(stat53);
            btn53.setClickable(stat53);
            // btn49.setBackgroundColor(Color.GREEN);
            btn54.setClickable(state_next53);
            btn54.setEnabled(state_next53);
        }
        boolean stat54 = sharedPreferences.getBoolean("state54", false);
        boolean state_next54 = sharedPreferences.getBoolean("Next54", false);
        if(stat54) {
            btn54.setEnabled(stat54);
            btn54.setClickable(stat54);
            // btn49.setBackgroundColor(Color.GREEN);
            btn55.setClickable(state_next54);
            btn55.setEnabled(state_next54);
        }
        boolean stat55 = sharedPreferences.getBoolean("state55", false);
        boolean state_next55 = sharedPreferences.getBoolean("Next55", false);
        if(stat55) {
            btn55.setEnabled(stat55);
            btn55.setClickable(stat55);
            // btn49.setBackgroundColor(Color.GREEN);
            btn56.setClickable(state_next55);
            btn56.setEnabled(state_next55);
        }
        boolean stat56 = sharedPreferences.getBoolean("state56", false);
        boolean state_next56 = sharedPreferences.getBoolean("Next56", false);
        if(stat56) {
            btn56.setEnabled(stat56);
            btn56.setClickable(stat56);
            // btn49.setBackgroundColor(Color.GREEN);
            btn57.setClickable(state_next56);
            btn57.setEnabled(state_next56);
        }
        boolean stat57 = sharedPreferences.getBoolean("state57", false);
        boolean state_next57 = sharedPreferences.getBoolean("Next57", false);
        if(stat57) {
            btn57.setEnabled(stat57);
            btn57.setClickable(stat57);
            // btn49.setBackgroundColor(Color.GREEN);
            btn58.setClickable(state_next57);
            btn58.setEnabled(state_next57);
        }
        boolean stat58 = sharedPreferences.getBoolean("state58", false);
        boolean state_next58 = sharedPreferences.getBoolean("Next58", false);
        if(stat58) {
            btn58.setEnabled(stat58);
            btn58.setClickable(stat58);
            // btn49.setBackgroundColor(Color.GREEN);
            btn59.setClickable(state_next58);
            btn59.setEnabled(state_next58);
        }
        boolean stat59 = sharedPreferences.getBoolean("state59", false);
        boolean state_next59 = sharedPreferences.getBoolean("Next59", false);
        if(stat59) {
            btn59.setEnabled(stat59);
            btn59.setClickable(stat59);
            // btn49.setBackgroundColor(Color.GREEN);
            btn60.setClickable(state_next59);
            btn60.setEnabled(state_next59);
        }
        boolean stat60 = sharedPreferences.getBoolean("state60", false);
        boolean state_next60 = sharedPreferences.getBoolean("Next60", false);
        if(stat60) {
            btn60.setEnabled(stat60);
            btn60.setClickable(stat60);
            // btn49.setBackgroundColor(Color.GREEN);
            btn61.setClickable(state_next60);
            btn61.setEnabled(state_next60);
        }
        boolean stat61 = sharedPreferences.getBoolean("state61", false);
        boolean state_next61 = sharedPreferences.getBoolean("Next61", false);
        if(stat61) {
            btn61.setEnabled(stat61);
            btn61.setClickable(stat61);
            // btn49.setBackgroundColor(Color.GREEN);
            btn62.setClickable(state_next61);
            btn62.setEnabled(state_next61);
        }
        boolean stat62 = sharedPreferences.getBoolean("state62", false);
        boolean state_next62 = sharedPreferences.getBoolean("Next62", false);
        if(stat62) {
            btn62.setEnabled(stat62);
            btn62.setClickable(stat62);
            // btn49.setBackgroundColor(Color.GREEN);
            btn63.setClickable(state_next62);
            btn63.setEnabled(state_next62);
        }
        boolean stat63 = sharedPreferences.getBoolean("state63", false);
        boolean state_next63 = sharedPreferences.getBoolean("Next63", false);
        if(stat63) {
            btn63.setEnabled(stat63);
            btn63.setClickable(stat63);
            // btn49.setBackgroundColor(Color.GREEN);
            btn64.setClickable(state_next63);
            btn64.setEnabled(state_next63);
        }
        boolean stat64 = sharedPreferences.getBoolean("state64", false);
        boolean state_next64 = sharedPreferences.getBoolean("Next64", false);
        if(stat64) {
            btn64.setEnabled(stat64);
            btn64.setClickable(stat64);
            // btn49.setBackgroundColor(Color.GREEN);
            btn65.setClickable(state_next64);
            btn65.setEnabled(state_next64);
        }
        boolean stat65 = sharedPreferences.getBoolean("state65", false);
        boolean state_next65 = sharedPreferences.getBoolean("Next65", false);
        if(stat65) {
            btn65.setEnabled(stat65);
            btn65.setClickable(stat65);
            // btn49.setBackgroundColor(Color.GREEN);
            btn66.setClickable(state_next65);
            btn66.setEnabled(state_next65);
        }
        boolean stat66 = sharedPreferences.getBoolean("state66", false);
        boolean state_next66 = sharedPreferences.getBoolean("Next66", false);
        if(stat66) {
            btn66.setEnabled(stat66);
            btn66.setClickable(stat66);
            // btn49.setBackgroundColor(Color.GREEN);
            btn67.setClickable(state_next66);
            btn67.setEnabled(state_next66);
        }
        boolean stat67 = sharedPreferences.getBoolean("state67", false);
        boolean state_next67 = sharedPreferences.getBoolean("Next67", false);
        if(stat67) {
            btn67.setEnabled(stat67);
            btn67.setClickable(stat67);
            // btn49.setBackgroundColor(Color.GREEN);
            btn68.setClickable(state_next67);
            btn68.setEnabled(state_next67);
        }
        boolean stat68 = sharedPreferences.getBoolean("state68", false);
        boolean state_next68 = sharedPreferences.getBoolean("Next68", false);
        if(stat68) {
            btn68.setEnabled(stat68);
            btn68.setClickable(stat68);
            // btn49.setBackgroundColor(Color.GREEN);
            btn69.setClickable(state_next68);
            btn69.setEnabled(state_next68);
        }
        boolean stat69 = sharedPreferences.getBoolean("state69", false);
        boolean state_next69 = sharedPreferences.getBoolean("Next69", false);
        if(stat69) {
            btn69.setEnabled(stat69);
            btn69.setClickable(stat69);
            // btn49.setBackgroundColor(Color.GREEN);
            btn70.setClickable(state_next69);
            btn70.setEnabled(state_next69);
        }
        boolean stat70 = sharedPreferences.getBoolean("state70", false);
        boolean state_next70 = sharedPreferences.getBoolean("Next70", false);
        if(stat70) {
            btn70.setEnabled(stat70);
            btn70.setClickable(stat70);
            // btn49.setBackgroundColor(Color.GREEN);
            btn71.setClickable(state_next70);
            btn71.setEnabled(state_next70);
        }
        boolean stat71 = sharedPreferences.getBoolean("state71", false);
        boolean state_next71 = sharedPreferences.getBoolean("Next71", false);
        if(stat71) {
            btn71.setEnabled(stat71);
            btn71.setClickable(stat71);
            // btn49.setBackgroundColor(Color.GREEN);
            btn72.setClickable(state_next71);
            btn72.setEnabled(state_next71);
        }
        boolean stat72 = sharedPreferences.getBoolean("state72", false);
        boolean state_next72 = sharedPreferences.getBoolean("Next72", false);
        if(stat72) {
            btn72.setEnabled(stat72);
            btn72.setClickable(stat72);
            // btn49.setBackgroundColor(Color.GREEN);
            btn73.setClickable(state_next72);
            btn73.setEnabled(state_next72);
        }
        boolean stat73 = sharedPreferences.getBoolean("state73", false);
        boolean state_next73 = sharedPreferences.getBoolean("Next73", false);
        if(stat73) {
            btn73.setEnabled(stat73);
            btn73.setClickable(stat73);
            // btn49.setBackgroundColor(Color.GREEN);
            btn74.setClickable(state_next73);
            btn74.setEnabled(state_next73);
        }
        boolean stat74 = sharedPreferences.getBoolean("state74", false);
        boolean state_next74 = sharedPreferences.getBoolean("Next74", false);
        if(stat74) {
            btn74.setEnabled(stat74);
            btn74.setClickable(stat74);
            // btn49.setBackgroundColor(Color.GREEN);
            btn75.setClickable(state_next74);
            btn75.setEnabled(state_next74);
        }
        boolean stat75 = sharedPreferences.getBoolean("state75", false);
        boolean state_next75 = sharedPreferences.getBoolean("Next75", false);
        if(stat75) {
            btn75.setEnabled(stat75);
            btn75.setClickable(stat75);
            // btn49.setBackgroundColor(Color.GREEN);
            btn76.setClickable(state_next75);
            btn76.setEnabled(state_next75);
        }
        boolean stat76 = sharedPreferences.getBoolean("state76", false);
        boolean state_next76 = sharedPreferences.getBoolean("Next76", false);
        if(stat76) {
            btn76.setEnabled(stat76);
            btn76.setClickable(stat76);
            // btn49.setBackgroundColor(Color.GREEN);
            btn77.setClickable(state_next76);
            btn77.setEnabled(state_next76);
        }
        boolean stat77 = sharedPreferences.getBoolean("state77", false);
        boolean state_next77 = sharedPreferences.getBoolean("Next77", false);
        if(stat77) {
            btn77.setEnabled(stat77);
            btn77.setClickable(stat77);
            // btn49.setBackgroundColor(Color.GREEN);
            btn78.setClickable(state_next77);
            btn78.setEnabled(state_next77);
        }
        boolean stat78 = sharedPreferences.getBoolean("state78", false);
        boolean state_next78 = sharedPreferences.getBoolean("Next78", false);
        if(stat78) {
            btn78.setEnabled(stat78);
            btn78.setClickable(stat78);
            // btn49.setBackgroundColor(Color.GREEN);
            btn79.setClickable(state_next78);
            btn79.setEnabled(state_next78);
        }
        boolean stat79 = sharedPreferences.getBoolean("state79", false);
        boolean state_next79 = sharedPreferences.getBoolean("Next79", false);
        if(stat79) {
            btn79.setEnabled(stat79);
            btn79.setClickable(stat79);
            // btn49.setBackgroundColor(Color.GREEN);
            btn80.setClickable(state_next79);
            btn80.setEnabled(state_next79);
        }
        boolean stat80 = sharedPreferences.getBoolean("state80", false);
        boolean state_next80 = sharedPreferences.getBoolean("Next80", false);
        if(stat80) {
            btn80.setEnabled(stat80);
            btn80.setClickable(stat80);
            // btn49.setBackgroundColor(Color.GREEN);
            btn81.setClickable(state_next80);
            btn81.setEnabled(state_next80);
        }
        boolean stat81 = sharedPreferences.getBoolean("state81", false);
        boolean state_next81 = sharedPreferences.getBoolean("Next81", false);
        if(stat81) {
            btn81.setEnabled(stat81);
            btn81.setClickable(stat81);
            // btn49.setBackgroundColor(Color.GREEN);
            btn82.setClickable(state_next81);
            btn82.setEnabled(state_next81);
        }

        boolean stat82 = sharedPreferences.getBoolean("state82", false);
        boolean state_next82 = sharedPreferences.getBoolean("Next82", false);
        if(stat82) {
            btn82.setEnabled(stat82);
            btn82.setClickable(stat82);
            // btn49.setBackgroundColor(Color.GREEN);
            btn83.setClickable(state_next82);
            btn83.setEnabled(state_next82);
        }

        boolean stat83 = sharedPreferences.getBoolean("state83", false);
        boolean state_next83 = sharedPreferences.getBoolean("Next83", false);
        if(stat83) {
            btn83.setEnabled(stat83);
            btn83.setClickable(stat83);
            // btn49.setBackgroundColor(Color.GREEN);
            btn84.setClickable(state_next83);
            btn84.setEnabled(state_next83);
        }

        boolean stat84 = sharedPreferences.getBoolean("state84", false);
        boolean state_next84 = sharedPreferences.getBoolean("Next84", false);
        if(stat84) {
            btn84.setEnabled(stat84);
            btn84.setClickable(stat84);
            // btn49.setBackgroundColor(Color.GREEN);
            btn85.setClickable(state_next84);
            btn85.setEnabled(state_next84);
        }

        boolean stat85 = sharedPreferences.getBoolean("state85", false);
        boolean state_next85 = sharedPreferences.getBoolean("Next85", false);
        if(stat85) {
            btn85.setEnabled(stat85);
            btn85.setClickable(stat85);
            // btn49.setBackgroundColor(Color.GREEN);
            btn86.setClickable(state_next85);
            btn86.setEnabled(state_next85);
        }

        boolean stat86 = sharedPreferences.getBoolean("state86", false);
        boolean state_next86 = sharedPreferences.getBoolean("Next86", false);
        if(stat86) {
            btn86.setEnabled(stat86);
            btn86.setClickable(stat86);
            // btn49.setBackgroundColor(Color.GREEN);
            btn87.setClickable(state_next86);
            btn87.setEnabled(state_next86);
        }

        boolean stat87 = sharedPreferences.getBoolean("state87", false);
        boolean state_next87 = sharedPreferences.getBoolean("Next87", false);
        if(stat87) {
            btn87.setEnabled(stat87);
            btn87.setClickable(stat87);
            // btn49.setBackgroundColor(Color.GREEN);
            btn88.setClickable(state_next87);
            btn88.setEnabled(state_next87);
        }

        boolean stat88 = sharedPreferences.getBoolean("state88", false);
        boolean state_next88 = sharedPreferences.getBoolean("Next88", false);
        if(stat88) {
            btn88.setEnabled(stat88);
            btn88.setClickable(stat88);
            // btn49.setBackgroundColor(Color.GREEN);
            btn89.setClickable(state_next88);
            btn89.setEnabled(state_next88);
        }

        boolean stat89 = sharedPreferences.getBoolean("state89", false);
        boolean state_next89 = sharedPreferences.getBoolean("Next89", false);
        if(stat89) {
            btn89.setEnabled(stat89);
            btn89.setClickable(stat89);
            // btn49.setBackgroundColor(Color.GREEN);
            btn90.setClickable(state_next89);
            btn90.setEnabled(state_next89);
        }

        boolean stat90 = sharedPreferences.getBoolean("state90", false);
        boolean state_next90 = sharedPreferences.getBoolean("Next90", false);
        if(stat90) {
            btn90.setEnabled(stat90);
            btn90.setClickable(stat90);
            // btn49.setBackgroundColor(Color.GREEN);
            btn91.setClickable(state_next90);
            btn91.setEnabled(state_next90);
        }

        boolean stat91 = sharedPreferences.getBoolean("state91", false);
        boolean state_next91 = sharedPreferences.getBoolean("Next92", false);
        if(stat91) {
            btn91.setEnabled(stat91);
            btn91.setClickable(stat91);
            // btn49.setBackgroundColor(Color.GREEN);
            btn92.setClickable(state_next91);
            btn92.setEnabled(state_next91);
        }

        boolean stat92 = sharedPreferences.getBoolean("state92", false);
        boolean state_next92 = sharedPreferences.getBoolean("Next92", false);
        if(stat92) {
            btn92.setEnabled(stat92);
            btn92.setClickable(stat92);
            // btn49.setBackgroundColor(Color.GREEN);
            btn93.setClickable(state_next92);
            btn93.setEnabled(state_next92);
        }

        boolean stat93 = sharedPreferences.getBoolean("state93", false);
        boolean state_next93 = sharedPreferences.getBoolean("Next93", false);
        if(stat93) {
            btn93.setEnabled(stat93);
            btn93.setClickable(stat93);
            // btn49.setBackgroundColor(Color.GREEN);
            btn94.setClickable(state_next93);
            btn94.setEnabled(state_next93);
        }
        boolean stat94 = sharedPreferences.getBoolean("state94", false);
        boolean state_next94 = sharedPreferences.getBoolean("Next94", false);
        if(stat94) {
            btn94.setEnabled(stat94);
            btn94.setClickable(stat94);
            // btn49.setBackgroundColor(Color.GREEN);
            btn95.setClickable(state_next94);
            btn95.setEnabled(state_next94);
        }
        boolean stat95 = sharedPreferences.getBoolean("state95", false);
        boolean state_next95 = sharedPreferences.getBoolean("Next95", false);
        if(stat95) {
            btn95.setEnabled(stat95);
            btn95.setClickable(stat95);
            // btn49.setBackgroundColor(Color.GREEN);
            btn96.setClickable(state_next95);
            btn96.setEnabled(state_next95);
        }
        boolean stat96 = sharedPreferences.getBoolean("state96", false);
        boolean state_next96 = sharedPreferences.getBoolean("Next96", false);
        if(stat96) {
            btn96.setEnabled(stat96);
            btn96.setClickable(stat96);
            // btn49.setBackgroundColor(Color.GREEN);
            btn97.setClickable(state_next96);
            btn97.setEnabled(state_next96);
        }
        boolean stat97 = sharedPreferences.getBoolean("state97", false);
        boolean state_next97 = sharedPreferences.getBoolean("Next97", false);
        if(stat97) {
            btn97.setEnabled(stat97);
            btn97.setClickable(stat97);
            // btn49.setBackgroundColor(Color.GREEN);
            btn98.setClickable(state_next97);
            btn98.setEnabled(state_next97);
        }
        boolean stat98 = sharedPreferences.getBoolean("state98", false);
        boolean state_next98 = sharedPreferences.getBoolean("Next98", false);
        if(stat98) {
            btn98.setEnabled(stat98);
            btn98.setClickable(stat98);
            // btn49.setBackgroundColor(Color.GREEN);
            btn99.setClickable(state_next98);
            btn99.setEnabled(state_next98);
        }
        boolean stat99 = sharedPreferences.getBoolean("state99", false);
        boolean state_next99 = sharedPreferences.getBoolean("Next99", false);
        if(stat99) {
            btn99.setEnabled(stat99);
            btn99.setClickable(stat99);
            // btn49.setBackgroundColor(Color.GREEN);
            btn100.setClickable(state_next99);
            btn100.setEnabled(state_next99);
        }
        boolean stat100 = sharedPreferences.getBoolean("state100", false);
        boolean state_next100 = sharedPreferences.getBoolean("Next100", false);
        if(stat100) {
            btn100.setEnabled(stat100);
            btn100.setClickable(stat100);
            // btn49.setBackgroundColor(Color.GREEN);
            btn101.setClickable(state_next100);
            btn101.setEnabled(state_next100);
        }
        boolean stat101 = sharedPreferences.getBoolean("state101", false);
        boolean state_next101 = sharedPreferences.getBoolean("Next101", false);
        if(stat101) {
            btn101.setEnabled(stat101);
            btn101.setClickable(stat101);
            // btn49.setBackgroundColor(Color.GREEN);
            btn102.setClickable(state_next101);
            btn102.setEnabled(state_next101);
        }
        boolean stat102 = sharedPreferences.getBoolean("state102", false);
        boolean state_next102 = sharedPreferences.getBoolean("Next102", false);
        if(stat102) {
            btn102.setEnabled(stat102);
            btn102.setClickable(stat102);
            // btn49.setBackgroundColor(Color.GREEN);
            btn103.setClickable(state_next102);
            btn103.setEnabled(state_next102);
        }
        boolean stat103 = sharedPreferences.getBoolean("state103", false);
        boolean state_next103 = sharedPreferences.getBoolean("Next103", false);
        if(stat103) {
            btn103.setEnabled(stat103);
            btn103.setClickable(stat103);
            // btn49.setBackgroundColor(Color.GREEN);
            btn104.setClickable(state_next103);
            btn104.setEnabled(state_next103);
        }
        boolean stat104 = sharedPreferences.getBoolean("state104", false);
        boolean state_next104 = sharedPreferences.getBoolean("Next104", false);
        if(stat104) {
            btn104.setEnabled(stat104);
            btn104.setClickable(stat104);
            // btn49.setBackgroundColor(Color.GREEN);
            btn105.setClickable(state_next104);
            btn105.setEnabled(state_next104);
        }
        boolean stat105 = sharedPreferences.getBoolean("state105", false);
        boolean state_next105 = sharedPreferences.getBoolean("Next105", false);
        if(stat105) {
            btn105.setEnabled(stat105);
            btn105.setClickable(stat105);
            // btn49.setBackgroundColor(Color.GREEN);
            btn106.setClickable(state_next105);
            btn106.setEnabled(state_next105);
        }
        boolean stat106 = sharedPreferences.getBoolean("state106", false);
        boolean state_next106 = sharedPreferences.getBoolean("Next106", false);
        if(stat106) {
            btn106.setEnabled(stat106);
            btn106.setClickable(stat106);
            // btn49.setBackgroundColor(Color.GREEN);
            btn107.setClickable(state_next106);
            btn107.setEnabled(state_next106);
        }
        boolean stat107 = sharedPreferences.getBoolean("state107", false);
        boolean state_next107 = sharedPreferences.getBoolean("Next107", false);
        if(stat107) {
            btn107.setEnabled(stat107);
            btn107.setClickable(stat107);
            // btn49.setBackgroundColor(Color.GREEN);
            btn108.setClickable(state_next107);
            btn108.setEnabled(state_next107);
        }
        boolean stat108 = sharedPreferences.getBoolean("state108", false);
        boolean state_next108 = sharedPreferences.getBoolean("Next108", false);
        if(stat108) {
            btn108.setEnabled(stat108);
            btn108.setClickable(stat108);
            // btn49.setBackgroundColor(Color.GREEN);
            btn109.setClickable(state_next108);
            btn109.setEnabled(state_next108);
        }
        boolean stat109 = sharedPreferences.getBoolean("state109", false);
        boolean state_next109 = sharedPreferences.getBoolean("Next109", false);
        if(stat109) {
            btn109.setEnabled(stat109);
            btn109.setClickable(stat109);
            // btn49.setBackgroundColor(Color.GREEN);
            btn110.setClickable(state_next109);
            btn110.setEnabled(state_next109);
        }
        boolean stat110 = sharedPreferences.getBoolean("state110", false);
        boolean state_next110 = sharedPreferences.getBoolean("Next110", false);
        if(stat110) {
            btn110.setEnabled(stat110);
            btn110.setClickable(stat110);
            // btn49.setBackgroundColor(Color.GREEN);

        }

        sharedPreferences.edit().apply();
    }


    @Override
    public void onBackPressed() {
        Intent i2 = new Intent();
        i2.putExtra("money", money);
        i2.putExtra("progressBar",progress);
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();

    }


    @Override
    protected void onDestroy() {
        SaveMoney();
        super.onDestroy();
    }

    private void nextLevel(){
        if(block.equalsIgnoreCase("1")){
            Intent intent2 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn2 = getResources().getString(R.string.btn2);
            intent2.putExtra("dictionary",btn2);
            intent2.putExtra("answer","0");
            intent2.putExtra("answer1","16");
            intent2.putExtra("size","4x4");
            intent2.putExtra("progress",2);
            intent2.putExtra("lvl",2);
            intent2.putExtra("money_data",money);
            startActivityForResult(intent2,2);
            isClicked = true;
        }else if(block.equalsIgnoreCase("2")){
            Intent intent3 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent3.putExtra("dictionary"," 8 | 10 | 12 | 14 | ? ");
            intent3.putExtra("answer","16");
            intent3.putExtra("progress",3);
            intent3.putExtra("lvl",3);
            intent3.putExtra("money_data",money);
            startActivityForResult(intent3,3);
            isClicked = true;
        }else if(block.equalsIgnoreCase("3")){
            Intent intent4 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn4 = getResources().getString(R.string.btn4);
            intent4.putExtra("dictionary",btn4);
            intent4.putExtra("answer","5");
            intent4.putExtra("size","3x3");
            intent4.putExtra("progress",4);
            intent4.putExtra("lvl",4);
            intent4.putExtra("money_data",money);
            startActivityForResult(intent4,4);
            isClicked = true;
        }else if(block.equalsIgnoreCase("4")){
            Intent intent5 = new Intent(MapLevel.this,PictureCampaignMath.class);
            String btn5 = getResources().getString(R.string.btn4);
            intent5.putExtra("dictionary",btn5);
            intent5.putExtra("answer","1");
            intent5.putExtra("progress",5);
            intent5.putExtra("lvl",5);
            intent5.putExtra("money_data",money);
            startActivityForResult(intent5,5);
            isClicked = true;
        }else if(block.equalsIgnoreCase("5")){
            Intent intent6 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn6 = getResources().getString(R.string.btn6);
            intent6.putExtra("dictionary",btn6);
            intent6.putExtra("answer","11");
            intent6.putExtra("progress",6);
            intent6.putExtra("lvl",6);
            intent6.putExtra("money_data",money);
            startActivityForResult(intent6,6);
            isClicked = true;
        }else if(block.equalsIgnoreCase("6")){
            Intent intent7 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent7.putExtra("dictionary"," 5 | 6 | 8 | 11 | ? ");
            intent7.putExtra("answer","15");
            intent7.putExtra("progress",7);
            intent7.putExtra("lvl",7);
            intent7.putExtra("money_data",money);
            startActivityForResult(intent7,7);
            isClicked = true;
        }else if(block.equalsIgnoreCase("7")){
            Intent intent8 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent8.putExtra("dictionary","A+B = 7\nA+B+C = 9\nC- ?");
            intent8.putExtra("answer","2");
            intent8.putExtra("progress",8);
            intent8.putExtra("lvl",8);
            intent8.putExtra("money_data",money);
            startActivityForResult(intent8,8);
            isClicked = true;
        }else if(block.equalsIgnoreCase("8")){
            Intent intent9 = new Intent(MapLevel.this,PictureCampaignMath.class);
            String btn9 = getResources().getString(R.string.btn4);
            intent9.putExtra("dictionary",btn9);
            intent9.putExtra("answer","6");
            intent9.putExtra("progress",9);
            intent9.putExtra("lvl",9);
            intent9.putExtra("money_data",money);
            startActivityForResult(intent9,9);
        }else if(block.equalsIgnoreCase("9")){
            Intent intent10 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn10 = getResources().getString(R.string.btn10);
            intent10.putExtra("dictionary",btn10);
            intent10.putExtra("answer","8");
            intent10.putExtra("progress",10);
            intent10.putExtra("lvl",10);
            intent10.putExtra("money_data",money);
            startActivityForResult(intent10,10);
        }else if(block.equalsIgnoreCase("10")){
            Intent intent11 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn11 = getResources().getString(R.string.btn11);
            intent11.putExtra("dictionary",btn11);
            intent11.putExtra("answer","2");
            intent11.putExtra("progress",11);
            intent11.putExtra("lvl",11);
            intent11.putExtra("money_data",money);
            startActivityForResult(intent11,11);
        }else if(block.equalsIgnoreCase("11")){
            Intent intent12 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent12.putExtra("dictionary"," 5 | 3 | 6 | 4 | 7 | ? ");
            intent12.putExtra("answer","5");
            intent12.putExtra("progress",12);
            intent12.putExtra("lvl",12);
            intent12.putExtra("money_data",money);
            startActivityForResult(intent12,12);
        }else if(block.equalsIgnoreCase("12")){
            Intent intent13 = new Intent(MapLevel.this,PictureCampaignMath.class);
            String btn13 = getResources().getString(R.string.btn4);
            intent13.putExtra("dictionary",btn13);
            intent13.putExtra("answer","4");
            intent13.putExtra("progress",13);
            intent13.putExtra("lvl",13);
            intent13.putExtra("money_data",money);
            startActivityForResult(intent13,13);
        }else if(block.equalsIgnoreCase("13")){
            Intent intent14 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent14.putExtra("dictionary","1 + 4 = 5 \n 2 + 5 = 12\n 3 + 6 = 21\n 8 + 11 = ?");
            intent14.putExtra("answer","96");
            intent14.putExtra("progress",14);
            intent14.putExtra("lvl",14);
            intent14.putExtra("money_data",money);
            startActivityForResult(intent14,14);
        }else if(block.equalsIgnoreCase("14")){
            Intent intent15 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn15 = getResources().getString(R.string.btn4);
            intent15.putExtra("dictionary",btn15);
            intent15.putExtra("answer","7");
            intent15.putExtra("size","5x5");
            intent15.putExtra("progress",15);
            intent15.putExtra("lvl",15);
            intent15.putExtra("money_data",money);
            startActivityForResult(intent15,15);
        }else if(block.equalsIgnoreCase("15")){
            Intent intent16 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent16.putExtra("dictionary","A + B + C = 20\n A = - C\n B = A + 15\n А - ?\n");
            intent16.putExtra("answer","5");
            intent16.putExtra("progress",16);
            intent16.putExtra("lvl",16);
            intent16.putExtra("money_data",money);
            startActivityForResult(intent16,16);
        }else if(block.equalsIgnoreCase("16")){
            Intent intent17 = new Intent(MapLevel.this,PictureCampaignMath.class);
            String btn17 = getResources().getString(R.string.btn4);
            intent17.putExtra("dictionary",btn17);
            intent17.putExtra("answer","13");
            intent17.putExtra("progress",17);
            intent17.putExtra("lvl",17);
            intent17.putExtra("money_data",money);
            startActivityForResult(intent17,17);
        }else if(block.equalsIgnoreCase("17")){
            Intent intent18 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn18 = getResources().getString(R.string.btn4);
            intent18.putExtra("dictionary",btn18);
            intent18.putExtra("answer","18");
            intent18.putExtra("size","3x3");
            intent18.putExtra("progress",18);
            intent18.putExtra("lvl",18);
            intent18.putExtra("money_data",money);
            startActivityForResult(intent18,18);
        }else if(block.equalsIgnoreCase("18")){
            Intent intent19 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn19 = getResources().getString(R.string.btn19);
            intent19.putExtra("dictionary",btn19);
            intent19.putExtra("answer","2");
            intent19.putExtra("answer1","2");
            intent19.putExtra("progress",19);
            intent19.putExtra("lvl",19);
            intent19.putExtra("money_data",money);
            startActivityForResult(intent19,19);
        }else if(block.equalsIgnoreCase("19")){
            Intent intent20 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn20 = getResources().getString(R.string.btn4);
            intent20.putExtra("dictionary",btn20);
            intent20.putExtra("answer","2");
            intent20.putExtra("progress",20);
            intent20.putExtra("lvl",20);
            intent20.putExtra("money_data",money);
            startActivityForResult(intent20,20);
        }else if(block.equalsIgnoreCase("20")){
            Intent intent21 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent21.putExtra("dictionary"," 7 + 7 / 7 + 7 * 7 - 7 = ? ");
            intent21.putExtra("answer","50");
            intent21.putExtra("progress",21);
            intent21.putExtra("lvl",21);
            intent21.putExtra("money_data",money);
            startActivityForResult(intent21,21);
        }else if(block.equalsIgnoreCase("21")){
            Intent intent22 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent22.putExtra("dictionary","A+B=60\nA-B=40\nA/B=?");
            intent22.putExtra("answer","5");
            intent22.putExtra("progress",22);
            intent22.putExtra("lvl",22);
            intent22.putExtra("money_data",money);
            startActivityForResult(intent22,22);
        }else if(block.equalsIgnoreCase("22")){
            Intent intent23 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent23.putExtra("dictionary","4*4+4*4+4-4*4=?");
            intent23.putExtra("answer","20");
            intent23.putExtra("progress",23);
            intent23.putExtra("lvl",23);
            intent23.putExtra("money_data",money);
            startActivityForResult(intent23,23);
        }else if(block.equalsIgnoreCase("23")){
            Intent intent24 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn24 = getResources().getString(R.string.btn24);
            intent24.putExtra("dictionary",btn24);
            intent24.putExtra("answer","48");
            intent24.putExtra("progress",24);
            intent24.putExtra("lvl",24);
            intent24.putExtra("money_data",money);
            startActivityForResult(intent24,24);
            isClicked = true;
        }else if(block.equalsIgnoreCase("24")){
            Intent intent25 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn25 = getResources().getString(R.string.btn4);
            intent25.putExtra("dictionary",btn25);
            intent25.putExtra("answer","19");
            intent25.putExtra("size","3x3");
            intent25.putExtra("progress",25);
            intent25.putExtra("lvl",25);
            intent25.putExtra("money_data",money);
            startActivityForResult(intent25,25);
        }else if(block.equalsIgnoreCase("25")){
            Intent intent26 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent26.putExtra("dictionary"," 2 = -16 \n 7 = 56 \n 6 = -48 \n 1 = ? ");
            intent26.putExtra("answer","8");
            intent26.putExtra("progress",26);
            intent26.putExtra("lvl",26);
            intent26.putExtra("money_data",money);
            startActivityForResult(intent26,26);
        }else if(block.equalsIgnoreCase("26")){
            Intent intent27 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent27.putExtra("dictionary"," 32 | 45 | 60 | 77 | ? ");
            intent27.putExtra("answer","96");
            intent27.putExtra("progress",27);
            intent27.putExtra("lvl",27);
            intent27.putExtra("money_data",money);
            startActivityForResult(intent27,27);
        }else if(block.equalsIgnoreCase("27")){
            Intent intent28 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn28 = getResources().getString(R.string.btn28);
            intent28.putExtra("dictionary",btn28);
            intent28.putExtra("answer","3");
            intent28.putExtra("progress",28);
            intent28.putExtra("lvl",28);
            intent28.putExtra("money_data",money);
            startActivityForResult(intent28,28);
        }else if(block.equalsIgnoreCase("28")){
            Intent intent29 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn29 = getResources().getString(R.string.btn4);
            intent29.putExtra("dictionary",btn29);
            intent29.putExtra("answer","24");
            intent29.putExtra("size","3x3");
            intent29.putExtra("progress",29);
            intent29.putExtra("lvl",29);
            intent29.putExtra("money_data",money);
            startActivityForResult(intent29,29);
        }else if(block.equalsIgnoreCase("29")){
            Intent intent30 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn30 = getResources().getString(R.string.btn30);
            intent30.putExtra("dictionary",btn30);
            intent30.putExtra("answer","2");
            intent30.putExtra("progress",30);
            intent30.putExtra("lvl",30);
            intent30.putExtra("money_data",money);
            startActivityForResult(intent30,30);
        }else if(block.equalsIgnoreCase("30")){
            Intent intent31 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent31.putExtra("dictionary","A+A+A = 30\nA+B+B = 18\nB-C = 2\nC+A*B=?");
            intent31.putExtra("answer","42");
            intent31.putExtra("progress",31);
            intent31.putExtra("lvl",31);
            intent31.putExtra("money_data",money);
            startActivityForResult(intent31,31);
        }else if(block.equalsIgnoreCase("31")){
            Intent intent32 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent32.putExtra("dictionary","11*11=4\n22*22=16\n33*33=?");
            intent32.putExtra("answer","36");
            intent32.putExtra("progress",32);
            intent32.putExtra("lvl",32);
            intent32.putExtra("money_data",money);
            startActivityForResult(intent32,32);
        }else if(block.equalsIgnoreCase("32")){
            Intent intent33 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent33.putExtra("dictionary"," 4 \n 6  2 \n 8 ? 2 \n 17 5 7 3 ");
            intent33.putExtra("answer","6");
            intent33.putExtra("progress",33);
            intent33.putExtra("lvl",33);
            intent33.putExtra("money_data",money);
            startActivityForResult(intent33,33);
        }else if(block.equalsIgnoreCase("33")){
            Intent intent34 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent34.putExtra("dictionary","8=56\n7=42\n6=30\n5=20\n3=?");
            intent34.putExtra("answer","6");
            intent34.putExtra("progress",34);
            intent34.putExtra("lvl",34);
            intent34.putExtra("money_data",money);
            startActivityForResult(intent34,34);
        }else if(block.equalsIgnoreCase("34")){
            Intent intent35 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent35.putExtra("dictionary"," 15 | 13 | 10 | 8 | ? ");
            intent35.putExtra("answer","5");
            intent35.putExtra("progress",35);
            intent35.putExtra("lvl",35);
            intent35.putExtra("money_data",money);
            startActivityForResult(intent35,35);
        }else if(block.equalsIgnoreCase("35")){
            Intent intent36 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn36 = getResources().getString(R.string.btn36);
            intent36.putExtra("dictionary",btn36);
            intent36.putExtra("answer","5");
            intent36.putExtra("progress",36);
            intent36.putExtra("lvl",36);
            intent36.putExtra("money_data",money);
            startActivityForResult(intent36,36);
        }else if(block.equalsIgnoreCase("36")){
            Intent intent37 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn37 = getResources().getString(R.string.btn4);
            intent37.putExtra("dictionary",btn37);
            intent37.putExtra("answer","26");
            intent37.putExtra("size","3x3");
            intent37.putExtra("progress",37);
            intent37.putExtra("lvl",37);
            intent37.putExtra("money_data",money);
            startActivityForResult(intent37,37);
        }else if(block.equalsIgnoreCase("37")){
            Intent intent38 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn38 = getResources().getString(R.string.btn4);
            intent38.putExtra("dictionary",btn38);
            intent38.putExtra("answer","20");
            intent38.putExtra("size","3x3");
            intent38.putExtra("progress",38);
            intent38.putExtra("lvl",38);
            intent38.putExtra("money_data",money);
            startActivityForResult(intent38,38);
        }else if(block.equalsIgnoreCase("38")){
            Intent intent39 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn39 = getResources().getString(R.string.btn39);
            intent39.putExtra("dictionary",btn39);
            intent39.putExtra("answer","7");
            intent39.putExtra("progress",39);
            intent39.putExtra("lvl",39);
            intent39.putExtra("money_data",money);
            startActivityForResult(intent39,39);
        }else if(block.equalsIgnoreCase("39")){
            Intent intent40 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent40.putExtra("dictionary"," 2 + 7 + 3 = 24 \n 9 + 7 - 4 = 24 \n 4 + 0 + 8 = 24 \n 5 + 5 + 5 = ? ");
            intent40.putExtra("answer","30");
            intent40.putExtra("progress",40);
            intent40.putExtra("lvl",40);
            intent40.putExtra("money_data",money);
            startActivityForResult(intent40,40);
        }else if(block.equalsIgnoreCase("40")){
            Intent intent41 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent41.putExtra("dictionary"," 1 + 5 = 12 \n 2 + 10 = 24 \n 3 + 15 = 36 \n 5 + 25 = ? ");
            intent41.putExtra("answer","60");
            intent41.putExtra("progress",41);
            intent41.putExtra("lvl",41);
            intent41.putExtra("money_data",money);
            startActivityForResult(intent41,41);
        }else if(block.equalsIgnoreCase("41")){
            Intent intent42 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn42 = getResources().getString(R.string.btn42);
            intent42.putExtra("dictionary",btn42);
            intent42.putExtra("answer","90");
            intent42.putExtra("progress",42);
            intent42.putExtra("lvl",42);
            intent42.putExtra("money_data",money);
            startActivityForResult(intent42,42);
        }else if(block.equalsIgnoreCase("42")){
            Intent intent43 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent43.putExtra("dictionary"," 2 | 4 | 8 | 16 | ? ");
            intent43.putExtra("answer","32");
            intent43.putExtra("progress",43);
            intent43.putExtra("lvl",43);
            intent43.putExtra("money_data",money);
            startActivityForResult(intent43,43);
        }else if(block.equalsIgnoreCase("43")){
            Intent intent44 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn44 = getResources().getString(R.string.btn4);
            intent44.putExtra("dictionary",btn44);
            intent44.putExtra("answer","16");
            intent44.putExtra("progress",44);
            intent44.putExtra("lvl",44);
            intent44.putExtra("money_data",money);
            startActivityForResult(intent44,44);
        }else if(block.equalsIgnoreCase("44")){
            Intent intent45 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent45.putExtra("dictionary"," 3  4 \n 8  6 \n 12  16 \n 32  ? ");
            intent45.putExtra("answer","24");
            intent45.putExtra("progress",45);
            intent45.putExtra("lvl",45);
            intent45.putExtra("money_data",money);
            startActivityForResult(intent45,45);
        }else if(block.equalsIgnoreCase("45")){
            Intent intent46 = new Intent(MapLevel.this, SignsCampaign.class);
            String btn46 = getResources().getString(R.string.btn4);
            intent46.putExtra("dictionary",btn46);
            intent46.putExtra("answer","*");
            intent46.putExtra("answer1","+");
            intent46.putExtra("answer2","-");
            intent46.putExtra("answer3","*");
            intent46.putExtra("progress",46);
            intent46.putExtra("lvl",46);
            intent46.putExtra("money_data",money);
            startActivityForResult(intent46,46);
            isClicked = true;
        }else if(block.equalsIgnoreCase("46")){
            Intent intent47 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn47 = getResources().getString(R.string.btn47);
            intent47.putExtra("dictionary",btn47);
            intent47.putExtra("answer","2");
            intent47.putExtra("progress",47);
            intent47.putExtra("lvl",47);
            intent47.putExtra("money_data",money);
            startActivityForResult(intent47,47);
        }else if(block.equalsIgnoreCase("47")){
            Intent intent48 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent48.putExtra("dictionary","A+A = 10\nA*B+B = 12\nA*B-A*C=A\nC - ?");
            intent48.putExtra("answer","1");
            intent48.putExtra("progress",48);
            intent48.putExtra("lvl",48);
            intent48.putExtra("money_data",money);
            startActivityForResult(intent48,48);
        }else if(block.equalsIgnoreCase("48")){
            Intent intent49 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent49.putExtra("dictionary"," 22 + 4 = 24 \n 13 + 6 = 16 \n 80 + 2 = 82 \n 67 + 9 = ? ");
            intent49.putExtra("answer","69");
            intent49.putExtra("progress",49);
            intent49.putExtra("lvl",49);
            intent49.putExtra("money_data",money);
            startActivityForResult(intent49,49);
        }else if(block.equalsIgnoreCase("49")){
            Intent intent50 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn50 = getResources().getString(R.string.btn50);
            String answer50 = getResources().getString(R.string.answer50);
            intent50.putExtra("dictionary",btn50);
            intent50.putExtra("answer",answer50);
            intent50.putExtra("progress",50);
            intent50.putExtra("lvl",50);
            intent50.putExtra("money_data",money);
            startActivityForResult(intent50,50);
        } else if(block.equalsIgnoreCase("50")){
            Intent intent51 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn51 = getResources().getString(R.string.btn4);
            intent51.putExtra("dictionary",btn51);
            intent51.putExtra("answer","3");
            intent51.putExtra("progress",51);
            intent51.putExtra("lvl",51);
            intent51.putExtra("money_data",money);
            startActivityForResult(intent51,51);

        } else if(block.equalsIgnoreCase("51")){
            Intent intent52 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent52.putExtra("dictionary"," 1 | 4 | 9 | 16 | ? ");
            intent52.putExtra("answer","25");
            intent52.putExtra("progress",52);
            intent52.putExtra("lvl",52);
            intent52.putExtra("money_data",money);
            startActivityForResult(intent52,52);

        } else if(block.equalsIgnoreCase("52")){
            Intent intent53 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn53 = getResources().getString(R.string.btn4);
            intent53.putExtra("dictionary",btn53);
            intent53.putExtra("answer","2");
            intent53.putExtra("size","4x4");
            intent53.putExtra("progress",53);
            intent53.putExtra("lvl",53);
            intent53.putExtra("money_data",money);
            startActivityForResult(intent53,53);

        } else if(block.equalsIgnoreCase("53")){
            Intent intent54 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn54 = getResources().getString(R.string.btn54);
            intent54.putExtra("dictionary",btn54);
            intent54.putExtra("answer","0");
            intent54.putExtra("progress",54);
            intent54.putExtra("lvl",54);
            intent54.putExtra("money_data",money);
            startActivityForResult(intent54,54);

        } else if(block.equalsIgnoreCase("54")){
            Intent intent55 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn55 = getResources().getString(R.string.btn4);
            intent55.putExtra("dictionary",btn55);
            intent55.putExtra("answer","7");
            intent55.putExtra("progress",55);
            intent55.putExtra("lvl",55);
            intent55.putExtra("money_data",money);
            startActivityForResult(intent55,55);

        } else if(block.equalsIgnoreCase("55")){
            Intent intent56 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent56.putExtra("dictionary"," 21 = 42 \n 39 = 618 \n 17 = 214 \n 45 = ? ");
            intent56.putExtra("answer","810");
            intent56.putExtra("progress",56);
            intent56.putExtra("lvl",56);
            intent56.putExtra("money_data",money);
            startActivityForResult(intent56,56);

        } else if(block.equalsIgnoreCase("56")){
            Intent intent57 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent57.putExtra("dictionary"," 14   5    9\n 22   4    6 \n 33   5    8\n 46   1    ?  ");
            intent57.putExtra("answer","7");
            intent57.putExtra("progress",57);
            intent57.putExtra("lvl",57);
            intent57.putExtra("money_data",money);
            startActivityForResult(intent57,57);

        } else if(block.equalsIgnoreCase("57")){
            Intent intent58 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn58 = getResources().getString(R.string.btn4);
            intent58.putExtra("dictionary",btn58);
            intent58.putExtra("answer","3");
            intent58.putExtra("progress",58);
            intent58.putExtra("lvl",58);
            intent58.putExtra("money_data",money);
            startActivityForResult(intent58,58);

        } else if(block.equalsIgnoreCase("58")){
            Intent intent59 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn59 = getResources().getString(R.string.btn4);
            intent59.putExtra("dictionary",btn59);
            intent59.putExtra("answer","0");
            intent59.putExtra("progress",59);
            intent59.putExtra("lvl",59);
            intent59.putExtra("money_data",money);
            startActivityForResult(intent59,59);

        } else if(block.equalsIgnoreCase("59")){
            Intent intent60 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent60.putExtra("dictionary","4554 = 9\n9106 = 7\n1457 = 8\n3848 = ?");
            intent60.putExtra("answer","5");
            intent60.putExtra("progress",60);
            intent60.putExtra("lvl",60);
            intent60.putExtra("money_data",money);
            startActivityForResult(intent60,60);

        } else if(block.equalsIgnoreCase("60")){
            Intent intent61 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent61.putExtra("dictionary"," 11 = 12 \n 13 = 16 \n 37 = 44 \n 54 = 58 \n 62 = ? ");
            intent61.putExtra("answer","64");
            intent61.putExtra("progress",61);
            intent61.putExtra("lvl",61);
            intent61.putExtra("money_data",money);
            startActivityForResult(intent61,61);

        } else if(block.equalsIgnoreCase("61")){
            Intent intent62 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn62 = getResources().getString(R.string.btn4);
            intent62.putExtra("dictionary",btn62);
            intent62.putExtra("answer","20");
            intent62.putExtra("progress",62);
            intent62.putExtra("lvl",62);
            intent62.putExtra("money_data",money);
            startActivityForResult(intent62,62);

        } else if(block.equalsIgnoreCase("62")){
            Intent intent63 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn63 = getResources().getString(R.string.btn4);
            intent63.putExtra("dictionary",btn63);
            intent63.putExtra("answer","25");
            intent63.putExtra("progress",63);
            intent63.putExtra("lvl",63);
            intent63.putExtra("money_data",money);
            startActivityForResult(intent63,63);

        } else if(block.equalsIgnoreCase("63")){
            Intent intent64 = new Intent(MapLevel.this, SignsCampaign.class);
            String btn64 = getResources().getString(R.string.btn4);
            intent64.putExtra("dictionary",btn64);
            intent64.putExtra("answer","+");
            intent64.putExtra("answer1","-");
            intent64.putExtra("answer2","+");
            intent64.putExtra("progress",64);
            intent64.putExtra("lvl",64);
            intent64.putExtra("money_data",money);
            startActivityForResult(intent64,64);

        } else if(block.equalsIgnoreCase("64")){
            Intent intent65 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent65.putExtra("dictionary"," 12  4  = 316 \n 2  35 = 48 \n 78  1 = 151 \n 90  6 = ? ");
            intent65.putExtra("answer","936");
            intent65.putExtra("progress",65);
            intent65.putExtra("lvl",65);
            intent65.putExtra("money_data",money);
            startActivityForResult(intent65,65);

        } else if(block.equalsIgnoreCase("65")){
            Intent intent66 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn66 = getResources().getString(R.string.btn66);
            intent66.putExtra("dictionary",btn66);
            intent66.putExtra("answer","100");
            intent66.putExtra("answer2","1000000");
            intent66.putExtra("progress",66);
            intent66.putExtra("lvl",66);
            intent66.putExtra("money_data",money);
            startActivityForResult(intent66,66);

        } else if(block.equalsIgnoreCase("66")){
            Intent intent67 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent67.putExtra("dictionary"," 2 | 8 | 3 | 27 | 4 | ? ");
            intent67.putExtra("answer","64");
            intent67.putExtra("progress",67);
            intent67.putExtra("lvl",67);
            intent67.putExtra("money_data",money);
            startActivityForResult(intent67,67);

        } else if(block.equalsIgnoreCase("67")){
            Intent intent68 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent68.putExtra("dictionary","9+2=711\n14+6=820\n17+11=628\n12+3 = ?");
            intent68.putExtra("answer","915");
            intent68.putExtra("progress",68);
            intent68.putExtra("lvl",68);
            intent68.putExtra("money_data",money);
            startActivityForResult(intent68,68);

        } else if(block.equalsIgnoreCase("68")){
            Intent intent69 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent69.putExtra("dictionary"," 273 = 7 \n 98162 = 1 \n 73472 = 4 \n 691 = ? ");
            intent69.putExtra("answer","9");
            intent69.putExtra("progress",69);
            intent69.putExtra("lvl",69);
            intent69.putExtra("money_data",money);
            startActivityForResult(intent69,69);

        } else if(block.equalsIgnoreCase("69")){
            Intent intent70 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn70 = getResources().getString(R.string.btn4);
            intent70.putExtra("dictionary",btn70);
            intent70.putExtra("answer","48");
            intent70.putExtra("progress",70);
            intent70.putExtra("lvl",70);
            intent70.putExtra("money_data",money);
            startActivityForResult(intent70,70);

        } else if(block.equalsIgnoreCase("70")){
            Intent intent71 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn71 = getResources().getString(R.string.btn4);
            intent71.putExtra("dictionary",btn71);
            intent71.putExtra("answer","9");
            intent71.putExtra("size","3x3");
            intent71.putExtra("progress",71);
            intent71.putExtra("lvl",71);
            intent71.putExtra("money_data",money);
            startActivityForResult(intent71,71);

        } else if(block.equalsIgnoreCase("71")){
            Intent intent72 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent72.putExtra("dictionary","2+3=10\n8+4=96\n7+2=63\n6+5=66\n9+8=?");
            intent72.putExtra("answer","153");
            intent72.putExtra("progress",72);
            intent72.putExtra("lvl",72);
            intent72.putExtra("money_data",money);
            startActivityForResult(intent72,72);

        } else if(block.equalsIgnoreCase("72")){
            Intent intent73 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent73.putExtra("dictionary"," 523 = 19 \n 810 = 8 \n 625 = 37 \n 947 = ? ");
            intent73.putExtra("answer","85");
            intent73.putExtra("progress",73);
            intent73.putExtra("lvl",73);
            intent73.putExtra("money_data",money);
            startActivityForResult(intent73,73);

        } else if(block.equalsIgnoreCase("73")){
            Intent intent74 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent74.putExtra("dictionary"," 1 | 4 | 16 | 64 | ? ");
            intent74.putExtra("answer","256");
            intent74.putExtra("progress",74);
            intent74.putExtra("lvl",74);
            intent74.putExtra("money_data",money);
            startActivityForResult(intent74,74);

        } else if(block.equalsIgnoreCase("74")){
            Intent intent75 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent75.putExtra("dictionary","3=18\n4=32\n5=50\n6=72\n7=98\n10=?");
            intent75.putExtra("answer","200");
            intent75.putExtra("progress",75);
            intent75.putExtra("lvl",75);
            intent75.putExtra("money_data",money);
            startActivityForResult(intent75,75);

        } else if(block.equalsIgnoreCase("75")){
            Intent intent76 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn76 = getResources().getString(R.string.btn4);
            intent76.putExtra("dictionary",btn76);
            intent76.putExtra("answer","2");
            intent76.putExtra("progress",76);
            intent76.putExtra("lvl",76);
            intent76.putExtra("money_data",money);
            startActivityForResult(intent76,76);

        } else if(block.equalsIgnoreCase("76")){
            Intent intent77 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent77.putExtra("dictionary"," 1 4 3 = 31 \n 9 9 7 = 79 \n 3 6 6 = 63 \n 6 0 8 = ?? ");
            intent77.putExtra("answer","86");
            intent77.putExtra("progress",77);
            intent77.putExtra("lvl",77);
            intent77.putExtra("money_data",money);
            startActivityForResult(intent77,77);

        } else if(block.equalsIgnoreCase("77")){
            Intent intent78 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn78 = getResources().getString(R.string.btn4);
            intent78.putExtra("dictionary",btn78);
            intent78.putExtra("answer","5");
            intent78.putExtra("size","3x3");
            intent78.putExtra("progress",78);
            intent78.putExtra("lvl",78);
            intent78.putExtra("money_data",money);
            startActivityForResult(intent78,78);

        } else if(block.equalsIgnoreCase("78")){
            Intent intent79 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent79.putExtra("dictionary","6636 | 3\n8118 | 4\n2242 | 0\n3316 | ?");
            intent79.putExtra("answer","1");
            intent79.putExtra("progress",79);
            intent79.putExtra("lvl",79);
            intent79.putExtra("money_data",money);
            startActivityForResult(intent79,79);

        } else if(block.equalsIgnoreCase("79")){
            Intent intent80 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent80.putExtra("dictionary"," 1 | 2 | 6 | 24 | ? ");
            intent80.putExtra("answer","120");
            intent80.putExtra("progress",80);
            intent80.putExtra("lvl",80);
            intent80.putExtra("money_data",money);
            startActivityForResult(intent80,80);

        } else if(block.equalsIgnoreCase("80")){
            Intent intent81 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn81 = getResources().getString(R.string.btn4);
            intent81.putExtra("dictionary",btn81);
            intent81.putExtra("answer","8");
            intent81.putExtra("progress",81);
            intent81.putExtra("lvl",81);
            intent81.putExtra("money_data",money);
            startActivityForResult(intent81,81);

        } else if(block.equalsIgnoreCase("81")){
            Intent intent82 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn82 = getResources().getString(R.string.btn4);
            intent82.putExtra("dictionary",btn82);
            intent82.putExtra("answer","52");
            intent82.putExtra("progress",82);
            intent82.putExtra("lvl",82);
            intent82.putExtra("money_data",money);
            startActivityForResult(intent82,82);

        } else if(block.equalsIgnoreCase("82")){
            Intent intent83 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn83 = getResources().getString(R.string.btn4);
            intent83.putExtra("dictionary",btn83);
            intent83.putExtra("answer","68");
            intent83.putExtra("progress",83);
            intent83.putExtra("lvl",83);
            intent83.putExtra("money_data",money);
            startActivityForResult(intent83,83);

        } else if(block.equalsIgnoreCase("83")){
            Intent intent84 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn84 = getResources().getString(R.string.btn110);
            intent84.putExtra("dictionary",btn84);
            intent84.putExtra("answer","2");
            intent84.putExtra("answer1","1");
            intent84.putExtra("answer2","3");
            intent84.putExtra("progress",84);
            intent84.putExtra("lvl",84);
            intent84.putExtra("money_data",money);
            startActivityForResult(intent84,84);

        } else if(block.equalsIgnoreCase("84")){
            Intent intent85 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent85.putExtra("dictionary","A+A = 18\nA+A-B = 11\nB*A+C = 80\nC-B-D=A\nD - ?");
            intent85.putExtra("answer","1");
            intent85.putExtra("progress",85);
            intent85.putExtra("lvl",85);
            intent85.putExtra("money_data",money);
            startActivityForResult(intent85,85);

        } else if(block.equalsIgnoreCase("85")){
            Intent intent86 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn86 = getResources().getString(R.string.btn4);
            intent86.putExtra("dictionary",btn86);
            intent86.putExtra("answer","10");
            intent86.putExtra("progress",86);
            intent86.putExtra("lvl",86);
            intent86.putExtra("money_data",money);
            startActivityForResult(intent86,86);

        } else if(block.equalsIgnoreCase("86")){
            Intent intent87 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn87 = getResources().getString(R.string.btn4);
            intent87.putExtra("dictionary",btn87);
            intent87.putExtra("answer","7");
            intent87.putExtra("answer1","9");
            intent87.putExtra("answer2","19");
            intent87.putExtra("answer3","7");
            intent87.putExtra("size","5x5");
            intent87.putExtra("progress",87);
            intent87.putExtra("lvl",87);
            intent87.putExtra("money_data",money);
            startActivityForResult(intent87,87);

        } else if(block.equalsIgnoreCase("87")){
            Intent intent88 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn88 = getResources().getString(R.string.btn88);
            intent88.putExtra("dictionary",btn88);
            intent88.putExtra("answer","10");
            intent88.putExtra("answer2","14");
            intent88.putExtra("progress",88);
            intent88.putExtra("lvl",88);
            intent88.putExtra("money_data",money);
            startActivityForResult(intent88,88);

        } else if(block.equalsIgnoreCase("88")){
            Intent intent89 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent89.putExtra("dictionary","A+B*A = 55\nC+A+D = 12\nD+B-C = 9\nB-D+C=11\nD+C*B - ?");
            intent89.putExtra("answer","43");
            intent89.putExtra("progress",89);
            intent89.putExtra("lvl",89);
            intent89.putExtra("money_data",money);
            startActivityForResult(intent89,89);

        } else if(block.equalsIgnoreCase("89")){
            Intent intent90 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn90 = getResources().getString(R.string.btn4);
            intent90.putExtra("dictionary",btn90);
            intent90.putExtra("answer","11");
            intent90.putExtra("progress",90);
            intent90.putExtra("lvl",90);
            intent90.putExtra("money_data",money);
            startActivityForResult(intent90,90);

        } else if(block.equalsIgnoreCase("90")){
            Intent intent91 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn91 = getResources().getString(R.string.btn4);
            intent91.putExtra("dictionary",btn91);
            intent91.putExtra("answer","14");
            intent91.putExtra("progress",91);
            intent91.putExtra("lvl",91);
            intent91.putExtra("money_data",money);
            startActivityForResult(intent91,91);
        } else if(block.equalsIgnoreCase("91")){
            Intent intent92 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn92 = getResources().getString(R.string.btn92);
            intent92.putExtra("dictionary",btn92);
            intent92.putExtra("answer","23");
            intent92.putExtra("progress",92);
            intent92.putExtra("lvl",92);
            intent92.putExtra("money_data",money);
            startActivityForResult(intent92,92);
        } else if(block.equalsIgnoreCase("92")){
            Intent intent93 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn93 = getResources().getString(R.string.btn4);
            intent93.putExtra("dictionary",btn93);
            intent93.putExtra("answer","6");
            intent93.putExtra("size","3x3");
            intent93.putExtra("progress",93);
            intent93.putExtra("lvl",93);
            intent93.putExtra("money_data",money);
            startActivityForResult(intent93,93);

        } else if(block.equalsIgnoreCase("93")){
            Intent intent94 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent94.putExtra("dictionary"," 4 | 7 | 12 | 21 | 38 | ? ");
            intent94.putExtra("answer","71");
            intent94.putExtra("progress",94);
            intent94.putExtra("lvl",94);
            intent94.putExtra("money_data",money);
            startActivityForResult(intent94,94);

        } else if(block.equalsIgnoreCase("94")){
            Intent intent95 = new Intent(MapLevel.this, TextQuestionsCamplaign.class);
            intent95.putExtra("dictionary"," 2 * A - 3 * B = 8 \n 3 * A - 4 * B = 14 \n A - ? ");
            intent95.putExtra("answer","10");
            intent95.putExtra("progress",95);
            intent95.putExtra("lvl",95);
            intent95.putExtra("money_data",money);
            startActivityForResult(intent95,95);

        } else if(block.equalsIgnoreCase("95")){
            Intent intent96 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn96 = getResources().getString(R.string.btn4);
            intent96.putExtra("dictionary",btn96);
            intent96.putExtra("answer","29");
            intent96.putExtra("progress",96);
            intent96.putExtra("lvl",96);
            intent96.putExtra("money_data",money);
            startActivityForResult(intent96,96);

        } else if(block.equalsIgnoreCase("96")){
            Intent intent97 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent97.putExtra("dictionary","1+1+1+1+1\n1+1+1+1+1\n1+1*0+1 = ?");
            intent97.putExtra("answer","2");
            intent97.putExtra("progress",97);
            intent97.putExtra("lvl",97);
            intent97.putExtra("money_data",money);
            startActivityForResult(intent97,97);

        } else if(block.equalsIgnoreCase("97")){
            Intent intent98 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent98.putExtra("dictionary","7+3=41021\n8+3=51124\n5+4=1920\n9+6=31554\n7+4=31128\n5+2=3710\n13+6=71978\n17+8=?");
            intent98.putExtra("answer","925136");
            intent98.putExtra("progress",98);
            intent98.putExtra("lvl",98);
            intent98.putExtra("money_data",money);
            startActivityForResult(intent98,98);

        } else if(block.equalsIgnoreCase("98")){
            Intent intent99 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn99 = getResources().getString(R.string.btn4);
            intent99.putExtra("dictionary",btn99);
            intent99.putExtra("answer","51");
            intent99.putExtra("size","4x4");
            intent99.putExtra("progress",99);
            intent99.putExtra("lvl",99);
            intent99.putExtra("money_data",money);
            startActivityForResult(intent99,99);

        } else if(block.equalsIgnoreCase("99")){
            Intent intent100 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn100 = getResources().getString(R.string.btn4);
            intent100.putExtra("dictionary",btn100);
            intent100.putExtra("answer","24");
            intent100.putExtra("size","3x3");
            intent100.putExtra("progress",100);
            intent100.putExtra("lvl",100);
            intent100.putExtra("money_data",money);
            startActivityForResult(intent100,100);

        } else if(block.equalsIgnoreCase("100")){
            Intent intent101 = new Intent(MapLevel.this, PictureCampaignMath.class);
            String btn101 = getResources().getString(R.string.btn4);
            intent101.putExtra("dictionary",btn101);
            intent101.putExtra("answer","7");
            intent101.putExtra("progress",101);
            intent101.putExtra("lvl",101);
            intent101.putExtra("money_data",money);
            startActivityForResult(intent101,101);

        } else if(block.equalsIgnoreCase("101")){
            Intent intent102 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn102 = getResources().getString(R.string.btn4);
            intent102.putExtra("dictionary",btn102);
            intent102.putExtra("answer","18");
            intent102.putExtra("size","5x5");
            intent102.putExtra("progress",102);
            intent102.putExtra("lvl",102);
            intent102.putExtra("money_data",money);
            startActivityForResult(intent102,102);

        } else if(block.equalsIgnoreCase("102")){
            Intent intent103 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent103.putExtra("dictionary","8+2=16106\n5+4=2091\n9+6=54153\n7+5=35122\n20+3=602317\n18+4=?");
            intent103.putExtra("answer","722214");
            intent103.putExtra("progress",103);
            intent103.putExtra("lvl",103);
            intent103.putExtra("money_data",money);
            startActivityForResult(intent103,103);

        } else if(block.equalsIgnoreCase("103")){
            Intent intent104 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn104 = getResources().getString(R.string.btn4);
            intent104.putExtra("dictionary",btn104);
            intent104.putExtra("answer","720");
            intent104.putExtra("size","4x4");
            intent104.putExtra("progress",104);
            intent104.putExtra("lvl",104);
            intent104.putExtra("money_data",money);
            startActivityForResult(intent104,104);

        } else if(block.equalsIgnoreCase("104")){
            Intent intent105 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn105 = getResources().getString(R.string.btn105);
            intent105.putExtra("dictionary",btn105);
            intent105.putExtra("answer","51");
            intent105.putExtra("answer1","15");
            intent105.putExtra("progress",105);
            intent105.putExtra("lvl",105);
            intent105.putExtra("money_data",money);
            startActivityForResult(intent105,105);
        } else if(block.equalsIgnoreCase("105")){
            Intent intent106 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn106 = getResources().getString(R.string.btn4);
            intent106.putExtra("dictionary",btn106);
            intent106.putExtra("answer","4");
            intent106.putExtra("size","4x4");
            intent106.putExtra("progress",106);
            intent106.putExtra("lvl",106);
            intent106.putExtra("money_data",money);
            startActivityForResult(intent106,106);

        } else if(block.equalsIgnoreCase("106")){
            Intent intent107 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn107 = getResources().getString(R.string.btn4);
            intent107.putExtra("dictionary",btn107);
            intent107.putExtra("answer","44");
            intent107.putExtra("size","4x4");
            intent107.putExtra("progress",107);
            intent107.putExtra("lvl",107);
            intent107.putExtra("money_data",money);
            startActivityForResult(intent107,107);

        } else if(block.equalsIgnoreCase("107")){
            Intent intent108 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            intent108.putExtra("dictionary"," 6 | 14 | 36 | 98 | ? ");
            intent108.putExtra("answer","276");
            intent108.putExtra("progress",108);
            intent108.putExtra("lvl",108);
            intent108.putExtra("money_data",money);
            startActivityForResult(intent108,108);

        } else if(block.equalsIgnoreCase("108")){
            Intent intent109 = new Intent(MapLevel.this,TextQuestionsCamplaign.class);
            String btn109 = getResources().getString(R.string.btn109);
            intent109.putExtra("dictionary",btn109);
            intent109.putExtra("answer","44");
            intent109.putExtra("progress",109);
            intent109.putExtra("lvl",109);
            intent109.putExtra("money_data",money);
            startActivityForResult(intent109,109);

        } else if(block.equalsIgnoreCase("109")){
            Intent intent110 = new Intent(MapLevel.this, ButtonsCampaign.class);
            String btn110 = getResources().getString(R.string.btn110);
            intent110.putExtra("dictionary",btn110);
            intent110.putExtra("answer","1");
            intent110.putExtra("answer1","8");
            intent110.putExtra("answer2","5");
            intent110.putExtra("size","5x5");
            intent110.putExtra("progress",110);
            intent110.putExtra("lvl",110);
            intent110.putExtra("money_data",money);
            startActivityForResult(intent110,110);

        }
    }


    private void SaveMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        prefEdit = prefs.edit();
        prefEdit.putInt("money", money);
        prefEdit.commit();
    }

    private void loadMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        money = prefs.getInt("money", 0);
    }

    private void SaveProgress(){
        prefs = getSharedPreferences("Progress", MODE_PRIVATE);
        prefEdit = prefs.edit();
        prefEdit.putInt("progress", progress);
        prefEdit.commit();
    }

}
