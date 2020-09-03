package com.puzzle.mathpuzzle.CampaignSuma;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.puzzle.mathpuzzle.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CampaignTestSuma7x7 extends AppCompatActivity {

    @BindView(R.id.num11) Button num11;
    @BindView(R.id.num12) Button num12;
    @BindView(R.id.num13) Button num13;
    @BindView(R.id.num14) Button num14;
    @BindView(R.id.num15) Button num15;
    @BindView(R.id.num16) Button num16;
    @BindView(R.id.num17) Button num17;
    @BindView(R.id.num21) Button num21;
    @BindView(R.id.num22) Button num22;
    @BindView(R.id.num23) Button num23;
    @BindView(R.id.num24) Button num24;
    @BindView(R.id.num25) Button num25;
    @BindView(R.id.num26) Button num26;
    @BindView(R.id.num27) Button num27;
    @BindView(R.id.num31) Button num31;
    @BindView(R.id.num32) Button num32;
    @BindView(R.id.num33) Button num33;
    @BindView(R.id.num34) Button num34;
    @BindView(R.id.num35) Button num35;
    @BindView(R.id.num36) Button num36;
    @BindView(R.id.num37) Button num37;
    @BindView(R.id.num41) Button num41;
    @BindView(R.id.num42) Button num42;
    @BindView(R.id.num43) Button num43;
    @BindView(R.id.num44) Button num44;
    @BindView(R.id.num45) Button num45;
    @BindView(R.id.num46) Button num46;
    @BindView(R.id.num47) Button num47;
    @BindView(R.id.num51) Button num51;
    @BindView(R.id.num52) Button num52;
    @BindView(R.id.num53) Button num53;
    @BindView(R.id.num54) Button num54;
    @BindView(R.id.num55) Button num55;
    @BindView(R.id.num56) Button num56;
    @BindView(R.id.num57) Button num57;
    @BindView(R.id.num61) Button num61;
    @BindView(R.id.num62) Button num62;
    @BindView(R.id.num63) Button num63;
    @BindView(R.id.num64) Button num64;
    @BindView(R.id.num65) Button num65;
    @BindView(R.id.num66) Button num66;
    @BindView(R.id.num67) Button num67;

    @BindView(R.id.num71) Button num71;
    @BindView(R.id.num72) Button num72;
    @BindView(R.id.num73) Button num73;
    @BindView(R.id.num74) Button num74;
    @BindView(R.id.num75) Button num75;
    @BindView(R.id.num76) Button num76;
    @BindView(R.id.num77) Button num77;


    @BindView(R.id.answer1) Button answer1;
    @BindView(R.id.answer2) Button answer2;
    @BindView(R.id.answer3) Button answer3;
    @BindView(R.id.answer4) Button answer4;
    @BindView(R.id.answer5) Button answer5;
    @BindView(R.id.answer6) Button answer6;
    @BindView(R.id.answer7) Button answer7;
    @BindView(R.id.answer8) Button answer8;
    @BindView(R.id.answer9) Button answer9;
    @BindView(R.id.answer10) Button answer10;
    @BindView(R.id.answer11) Button answer11;
    @BindView(R.id.answer12) Button answer12;
    @BindView(R.id.answer13) Button answer13;
    @BindView(R.id.answer14) Button answer14;
    @BindView(R.id.answer15) Button answer15;
    @BindView(R.id.answer16) Button answer16;
    @BindView(R.id.answer17) Button answer17;
    @BindView(R.id.answer18) Button answer18;
    @BindView(R.id.answer19) Button answer19;
    @BindView(R.id.answer21) Button answer21;
    @BindView(R.id.answer22) Button answer22;
    @BindView(R.id.answer23) Button answer23;
    @BindView(R.id.answer24) Button answer24;
    @BindView(R.id.answer20) Button answer20;
    @BindView(R.id.answer25) Button answer25;
    @BindView(R.id.answer26) Button answer26;
    @BindView(R.id.answer27) Button answer27;
    @BindView(R.id.answer28) Button answer28;

    @BindView(R.id.check1) Button check1;
    @BindView(R.id.check2) Button check2;
    @BindView(R.id.check3) Button check3;
    @BindView(R.id.check4) Button check4;
    @BindView(R.id.check5) Button check5;
    @BindView(R.id.check6) Button check6;
    @BindView(R.id.check7) Button check7;
    @BindView(R.id.check8) Button check8;
    @BindView(R.id.check9) Button check9;
    @BindView(R.id.check10) Button check10;
    @BindView(R.id.check11) Button check11;
    @BindView(R.id.check12) Button check12;
    @BindView(R.id.check13) Button check13;
    @BindView(R.id.check14) Button check14;
    @BindView(R.id.check15) Button check15;
    @BindView(R.id.check16) Button check16;
    @BindView(R.id.check17) Button check17;
    @BindView(R.id.check18) Button check18;
    @BindView(R.id.check19) Button check19;
    @BindView(R.id.check20) Button check20;
    @BindView(R.id.check21) Button check21;
    @BindView(R.id.check22) Button check22;
    @BindView(R.id.check23) Button check23;
    @BindView(R.id.check24) Button check24;
    @BindView(R.id.check25) Button check25;
    @BindView(R.id.check26) Button check26;
    @BindView(R.id.check27) Button check27;
    @BindView(R.id.check28) Button check28;


    @BindView(R.id.level)
    TextView level;

    boolean number11 = false;
    boolean number12 = false;
    boolean number13 = false;
    boolean number14 = false;
    boolean number15 = false;
    boolean number16 = false;
    boolean number17 = false;

    boolean number21 = false;
    boolean number22 = false;
    boolean number23 = false;
    boolean number24 = false;
    boolean number25 = false;
    boolean number26 = false;
    boolean number27 = false;

    boolean number31 = false;
    boolean number32 = false;
    boolean number33 = false;
    boolean number34 = false;
    boolean number35 = false;
    boolean number36 = false;
    boolean number37 = false;

    boolean number41 = false;
    boolean number42 = false;
    boolean number43 = false;
    boolean number44 = false;
    boolean number45 = false;
    boolean number46 = false;
    boolean number47 = false;

    boolean number51 = false;
    boolean number52 = false;
    boolean number53 = false;
    boolean number54 = false;
    boolean number55 = false;
    boolean number56 = false;
    boolean number57 = false;

    boolean number61 = false;
    boolean number62 = false;
    boolean number63 = false;
    boolean number64 = false;
    boolean number65 = false;
    boolean number66 = false;
    boolean number67 = false;

    boolean number71 = false;
    boolean number72 = false;
    boolean number73 = false;
    boolean number74 = false;
    boolean number75 = false;
    boolean number76 = false;
    boolean number77 = false;

    boolean Answer1 = false;
    boolean Answer2 = false;
    boolean Answer3 = false;
    boolean Answer4= false;
    boolean Answer5= false;
    boolean Answer6= false;
    boolean Answer7= false;
    boolean Answer8= false;
    boolean Answer9= false;
    boolean Answer10= false;
    boolean Answer11 = false;
    boolean Answer12= false;
    boolean Answer13= false;
    boolean Answer14= false;
    boolean Answer15= false;
    boolean Answer16= false;
    boolean Answer17= false;
    boolean Answer18= false;
    boolean Answer19= false;
    boolean Answer20= false;
    boolean Answer21= false;
    boolean Answer22= false;
    boolean Answer23= false;
    boolean Answer24= false;
    boolean Answer25= false;
    boolean Answer26= false;
    boolean Answer27= false;
    boolean Answer28= false;
    int lvl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign_test_suma7x7);
        ButterKnife.bind(this);

        newGame();

        Check(number11,number21,number31,number41,number51,number61,number71,answer1,answer22,num11,num21,num31,num41,num51,num61,num71,Answer1,Answer22);
        Check(number12,number22,number32,number42,number52,number62,number72,answer2,answer23,num12,num22,num32,num42, num52,num62,num72,Answer2,Answer23);
        Check(number13,number23,number33,number43,number53,number63,number73,answer3,answer24,num13,num23,num33,num43,num53,num63,num73,Answer3,Answer24);
        Check(number14,number24,number34,number44,number54,number64,number74,answer4,answer25,num14,num24,num34,num44,num54,num64,num74,Answer4,Answer25);
        Check(number15,number25,number35,number45,number55,number65,number75,answer5,answer26,num15,num25,num35,num45,num55,num65,num75,Answer5,Answer26);
        Check(number16,number26,number36,number46,number56,number66,number76,answer6,answer27,num16,num26,num36,num46,num56,num66,num76,Answer6,Answer27);
        Check(number17,number27,number37,number47,number57,number67,number77,answer7,answer28,num17,num27,num37,num47,num57,num67,num77,Answer7,Answer28);

        Check(number11,number12,number13,number14,number15,number16,number17,answer8,answer15,num11,num12,num13,num14,num15,num16,num17,Answer8,Answer15);
        Check(number21,number22,number23,number24,number25,number26,number27,answer9,answer16,num21,num22,num23,num24,num25,num26,num27,Answer9,Answer16);
        Check(number31,number32,number33,number34,number35,number36,number37,answer10,answer17,num31,num32,num33,num34,num35,num36,num37,Answer10,Answer17);
        Check(number41,number42,number43,number44,number45,number46,number47,answer11,answer18,num41,num42,num43,num44,num45,num46,num47,Answer11,Answer18);
        Check(number51,number52,number53,number54,number55,number56,number57,answer12,answer19,num51,num52,num53,num54,num55,num56,num57,Answer12,Answer19);
        Check(number61,number62,number63,number64,number65,number66,number67,answer13,answer20,num61,num62,num63,num64,num65,num66,num67,Answer13,Answer20);
        Check(number71,number72,number73,number74,number75,number76,number77,answer14,answer21,num71,num72,num73,num74,num75,num76,num77,Answer14,Answer21);

        CheckTwo(number11,number21,number31,number41,number51,number61,number71,check1,check22,num11,num21,num31,num41,num51,num61,num71);
        CheckTwo(number12,number22,number32,number42,number52,number62,number72,check2,check23,num12,num22,num32,num42,num52,num62,num72);
        CheckTwo(number13,number23,number33,number43,number53,number63,number73,check3,check24,num13,num23,num33,num43,num53,num63,num73);
        CheckTwo(number14,number24,number34,number44,number54,number64,number74,check4,check25,num14,num24,num34,num44,num54,num64,num74);
        CheckTwo(number15,number25,number35,number45, number55,number65,number75,check5,check26,num15,num25,num35,num45,num55,num65,num75);
        CheckTwo(number16,number26,number36,number46, number56,number66,number76,check6,check27,num16,num26,num36,num46,num56,num66,num76);
        CheckTwo(number17,number27,number37,number47, number57,number67,number77,check7,check28,num17,num27,num37,num47,num57,num67,num77);

        CheckTwo(number11,number12,number13,number14,number15,number16,number17,check8,check15,num11,num12,num13,num14,num15,num16,num17);
        CheckTwo(number21,number22,number23,number24, number25,number26,number27,check9,check16,num21,num22,num23,num24,num25,num26,num27);
        CheckTwo(number31,number32,number33,number34,number35,number36,number37,check10,check17,num31,num32,num33,num34,num35,num36,num37);
        CheckTwo(number41,number42,number43,number44, number45,number46,number47,check11,check18,num41,num42,num43,num44,num45,num46,num47);
        CheckTwo(number51,number52,number53,number54,number55,number56,number57,check12,check19,num51,num52,num53,num54,num55,num56,num57);
        CheckTwo(number61,number62,number63,number64,number65,number66,number67,check13,check20,num61,num62,num63,num64,num65,num66,num67);
        CheckTwo(number71,number72,number73,number74,number75,number76,number77,check14,check21,num71,num72,num73,num74,num75,num76,num77);
    }

    private void insertDate(String one1, String one2,String one3,String one4, String one5, String one6,String one7, String two1,String two2,String two3,String two4
            , String two5 , String two6, String two7,String three1,String three2,String three3,String three4, String three5,String three6 ,String three7 ,String four1,String four2,String four3,String four4, String four5,
                            String four6 , String four7 , String five1,String five2,String five3,String five4,String five5, String five6 , String five7 ,String six1 ,String six2, String six3, String six4,
                            String six5, String six6, String six7 , String seven1 , String seven2, String seven3 , String seven4, String seven5, String seven6, String seven7,
                            String answ1,  String answ2,  String answ3,  String answ4, String answ5, String answ6, String answ7, String answ8, String answ9,String answ10, String answ11, String answ12 , String answ13 , String answ14){
        num11.setText(one1);
        num12.setText(one2);
        num13.setText(one3);
        num14.setText(one4);
        num15.setText(one5);
        num16.setText(one6);
        num17.setText(one7);
        num21.setText(two1);
        num22.setText(two2);
        num23.setText(two3);
        num24.setText(two4);
        num25.setText(two5);
        num26.setText(two6);
        num27.setText(two7);
        num31.setText(three1);
        num32.setText(three2);
        num33.setText(three3);
        num34.setText(three4);
        num35.setText(three5);
        num36.setText(three6);
        num37.setText(three7);
        num41.setText(four1);
        num42.setText(four2);
        num43.setText(four3);
        num44.setText(four4);
        num45.setText(four5);
        num46.setText(four6);
        num47.setText(four7);

        num51.setText(five1);
        num52.setText(five2);
        num53.setText(five3);
        num54.setText(five4);
        num55.setText(five5);
        num56.setText(five6);
        num57.setText(five7);

        num61.setText(six1);
        num62.setText(six2);
        num63.setText(six3);
        num64.setText(six4);
        num65.setText(six5);
        num66.setText(six6);
        num67.setText(six7);

        num71.setText(seven1);
        num72.setText(seven2);
        num73.setText(seven3);
        num74.setText(seven4);
        num75.setText(seven5);
        num76.setText(seven6);
        num77.setText(seven7);

        answer1.setText(answ1);
        answer2.setText(answ2);
        answer3.setText(answ3);
        answer4.setText(answ4);
        answer5.setText(answ5);
        answer6.setText(answ6);
        answer7.setText(answ7);
        answer8.setText(answ8);
        answer9.setText(answ9);
        answer10.setText(answ10);
        answer11.setText(answ11);
        answer12.setText(answ12);
        answer13.setText(answ13);
        answer14.setText(answ14);
        answer15.setText(answ8);
        answer16.setText(answ9);
        answer17.setText(answ10);
        answer18.setText(answ11);
        answer19.setText(answ12);
        answer20.setText(answ13);
        answer21.setText(answ14);
        answer22.setText(answ1);
        answer23.setText(answ2);
        answer24.setText(answ3);
        answer25.setText(answ4);
        answer26.setText(answ5);
        answer27.setText(answ6);
        answer28.setText(answ7);
    }

    private void newGame(){
        Intent intent = getIntent();
        lvl =intent.getIntExtra("lvl",0);
        String levels = getResources().getString(R.string.levelButtonCamp);
        level.setText(levels + ":  " + lvl);

         if(lvl == 26) {
             insertDate("19","18","10","16","21","8","4","11","16","24","20","8","12","16","7","7","9","7","16","13","10","14","9","15","9","11","14","8","17","9","6","21","13","24","15","9","10","16","6","20","7","5","7","12","11","14","9","18","20","50","47","51","50","52","47","50","47","52","46","49","51","52","50");
        }else if(lvl == 27) {
             insertDate("14","7","18","9","38","15","15","17","21","21","17","20","29","13","18","15","25","15","23","30","13","10","11","27","14","3","29","24","22","28","19","31","19","20","36","8","36","23","9","14","17","13","17","19","18","15","9","33","32","67","70","66","70","73","75","68","70","67","71","69","67","70","75");
        }else if(lvl == 28) {
             insertDate("50","24","44","47","34","53","16","19","52","63","49","23","15","35","24","27","19","31","13","15","20","23","52","37","20","8","31","24","51","28","23","12","2","41","20","17", "33","17","37" , "29","14" ,"45", "25", "13", "3", "48", "26", "62", "34", "99", "101", "103", "96", "101", "102", "98", "97", "101", "99", "100", "103", "99", "101");
        } else if(lvl == 29) {
             insertDate("54","26","41","70","21","40","69","47","10","19","34","29","28","15","32","1","27","14","22","42","81","45","34","65","36","47","37","46","45","50","45","61","39","11","34","16","47","39","18","83","28","50","60","52","37","49","65","33","25","152","144","150","149","151","147","150","150","148","151","152","145","148","149");
        } else if(lvl == 30) {
             insertDate("37","52","70","49","61","81","55","71","65","67","48","53","74","34","82","14","35","44","65","17","68","53","27","49","43","44","29","59","60","70","53","48","71","91","50","24","55","104","41","36","45","22","109","56","84","71","40","36","74","203","214","220","206","202","218","222","205","214","208","207","221","209","221");
        }
    }

    public void ClickNumber(View view) {
        switch (view.getId()){
            case R.id.num11:
                if(!number11) {
                    num11.setBackgroundResource(R.drawable.roundebutton2);
                    number11 = true;
                } else {
                    num11.setBackgroundResource(R.drawable.roundebutton);
                    number11 = false;
                }
                break;
            case R.id.num12:
                if(!number12) {
                    num12.setBackgroundResource(R.drawable.roundebutton2);
                    number12 = true;
                } else {
                    num12.setBackgroundResource(R.drawable.roundebutton);
                    number12 = false;
                }
                break;
            case R.id.num13:
                if(!number13) {
                    num13.setBackgroundResource(R.drawable.roundebutton2);
                    number13 = true;
                } else {
                    num13.setBackgroundResource(R.drawable.roundebutton);
                    number13 = false;
                }
                break;
            case R.id.num14:
                if(!number14) {
                    num14.setBackgroundResource(R.drawable.roundebutton2);
                    number14 = true;
                } else {
                    num14.setBackgroundResource(R.drawable.roundebutton);
                    number14 = false;
                }
                break;
            case R.id.num15:
                if(!number15) {
                    num15.setBackgroundResource(R.drawable.roundebutton2);
                    number15 = true;
                } else {
                    num15.setBackgroundResource(R.drawable.roundebutton);
                    number15 = false;
                }
                break;
            case R.id.num16:
                if(!number16) {
                    num16.setBackgroundResource(R.drawable.roundebutton2);
                    number16 = true;
                } else {
                    num16.setBackgroundResource(R.drawable.roundebutton);
                    number16 = false;
                }
                break;
            case R.id.num17:
                if(!number17) {
                    num17.setBackgroundResource(R.drawable.roundebutton2);
                    number17 = true;
                } else {
                    num17.setBackgroundResource(R.drawable.roundebutton);
                    number17 = false;
                }
                break;
            case R.id.num21:
                if(!number21) {
                    num21.setBackgroundResource(R.drawable.roundebutton2);
                    number21 = true;
                } else {
                    num21.setBackgroundResource(R.drawable.roundebutton);
                    number21 = false;
                }
                break;
            case R.id.num22:
                if(!number22) {
                    num22.setBackgroundResource(R.drawable.roundebutton2);
                    number22 = true;
                } else {
                    num22.setBackgroundResource(R.drawable.roundebutton);
                    number22 = false;
                }
                break;
            case R.id.num23:
                if(!number23) {
                    num23.setBackgroundResource(R.drawable.roundebutton2);
                    number23 = true;
                } else {
                    num23.setBackgroundResource(R.drawable.roundebutton);
                    number23 = false;
                }
                break;
            case R.id.num24:
                if(!number24) {
                    num24.setBackgroundResource(R.drawable.roundebutton2);
                    number24 = true;
                } else {
                    num24.setBackgroundResource(R.drawable.roundebutton);
                    number24 = false;
                }
                break;
            case R.id.num25:
                if(!number25) {
                    num25.setBackgroundResource(R.drawable.roundebutton2);
                    number25 = true;
                } else {
                    num25.setBackgroundResource(R.drawable.roundebutton);
                    number25 = false;
                }
                break;
            case R.id.num26:
                if(!number26) {
                    num26.setBackgroundResource(R.drawable.roundebutton2);
                    number26 = true;
                } else {
                    num26.setBackgroundResource(R.drawable.roundebutton);
                    number26 = false;
                }
                break;
            case R.id.num27:
                if(!number27) {
                    num27.setBackgroundResource(R.drawable.roundebutton2);
                    number27 = true;
                } else {
                    num27.setBackgroundResource(R.drawable.roundebutton);
                    number27 = false;
                }
                break;
            case R.id.num31:
                if(!number31) {
                    num31.setBackgroundResource(R.drawable.roundebutton2);
                    number31 = true;
                } else {
                    num31.setBackgroundResource(R.drawable.roundebutton);
                    number31 = false;
                }
                break;
            case R.id.num32:
                if(!number32) {
                    num32.setBackgroundResource(R.drawable.roundebutton2);
                    number32 = true;
                } else {
                    num32.setBackgroundResource(R.drawable.roundebutton);
                    number32 = false;
                }
                break;
            case R.id.num33:
                if(!number33) {
                    num33.setBackgroundResource(R.drawable.roundebutton2);
                    number33 = true;
                } else {
                    num33.setBackgroundResource(R.drawable.roundebutton);
                    number33 = false;
                }
                break;
            case R.id.num34:
                if(!number34) {
                    num34.setBackgroundResource(R.drawable.roundebutton2);
                    number34 = true;
                } else {
                    num34.setBackgroundResource(R.drawable.roundebutton);
                    number34 = false;
                }
                break;
            case R.id.num35:
                if(!number35) {
                    num35.setBackgroundResource(R.drawable.roundebutton2);
                    number35 = true;
                } else {
                    num35.setBackgroundResource(R.drawable.roundebutton);
                    number35 = false;
                }
                break;
            case R.id.num36:
                if(!number36) {
                    num36.setBackgroundResource(R.drawable.roundebutton2);
                    number36 = true;
                } else {
                    num36.setBackgroundResource(R.drawable.roundebutton);
                    number36 = false;
                }
                break;
            case R.id.num37:
                if(!number37) {
                    num37.setBackgroundResource(R.drawable.roundebutton2);
                    number37 = true;
                } else {
                    num37.setBackgroundResource(R.drawable.roundebutton);
                    number37 = false;
                }
                break;
            case R.id.num41:
                if(!number41) {
                    num41.setBackgroundResource(R.drawable.roundebutton2);
                    number41 = true;
                } else {
                    num41.setBackgroundResource(R.drawable.roundebutton);
                    number41 = false;
                }
                break;
            case R.id.num42:
                if(!number42) {
                    num42.setBackgroundResource(R.drawable.roundebutton2);
                    number42 = true;
                } else {
                    num42.setBackgroundResource(R.drawable.roundebutton);
                    number42 = false;
                }
                break;
            case R.id.num43:
                if(!number43) {
                    num43.setBackgroundResource(R.drawable.roundebutton2);
                    number43 = true;
                } else {
                    num43.setBackgroundResource(R.drawable.roundebutton);
                    number43 = false;
                }
                break;
            case R.id.num44:
                if(!number44) {
                    num44.setBackgroundResource(R.drawable.roundebutton2);
                    number44 = true;
                } else {
                    num44.setBackgroundResource(R.drawable.roundebutton);
                    number44 = false;
                }
                break;
            case R.id.num45:
                if(!number45) {
                    num45.setBackgroundResource(R.drawable.roundebutton2);
                    number45 = true;
                } else {
                    num45.setBackgroundResource(R.drawable.roundebutton);
                    number45 = false;
                }
                break;
            case R.id.num46:
                if(!number46) {
                    num46.setBackgroundResource(R.drawable.roundebutton2);
                    number46 = true;
                } else {
                    num46.setBackgroundResource(R.drawable.roundebutton);
                    number46 = false;
                }
                break;
            case R.id.num47:
                if(!number47) {
                    num47.setBackgroundResource(R.drawable.roundebutton2);
                    number47 = true;
                } else {
                    num47.setBackgroundResource(R.drawable.roundebutton);
                    number47 = false;
                }
                break;
            case R.id.num51:
                if(!number51) {
                    num51.setBackgroundResource(R.drawable.roundebutton2);
                    number51 = true;
                } else {
                    num51.setBackgroundResource(R.drawable.roundebutton);
                    number51 = false;
                }
                break;
            case R.id.num52:
                if(!number52) {
                    num52.setBackgroundResource(R.drawable.roundebutton2);
                    number52 = true;
                } else {
                    num52.setBackgroundResource(R.drawable.roundebutton);
                    number52 = false;
                }
                break;
            case R.id.num53:
                if(!number53) {
                    num53.setBackgroundResource(R.drawable.roundebutton2);
                    number53 = true;
                } else {
                    num53.setBackgroundResource(R.drawable.roundebutton);
                    number53 = false;
                }
                break;
            case R.id.num54:
                if(!number54) {
                    num54.setBackgroundResource(R.drawable.roundebutton2);
                    number54 = true;
                } else {
                    num54.setBackgroundResource(R.drawable.roundebutton);
                    number54 = false;
                }
                break;
            case R.id.num55:
                if(!number55) {
                    num55.setBackgroundResource(R.drawable.roundebutton2);
                    number55 = true;
                } else {
                    num55.setBackgroundResource(R.drawable.roundebutton);
                    number55 = false;
                }
                break;
            case R.id.num56:
                if(!number56) {
                    num56.setBackgroundResource(R.drawable.roundebutton2);
                    number56 = true;
                } else {
                    num56.setBackgroundResource(R.drawable.roundebutton);
                    number56 = false;
                }
                break;
            case R.id.num57:
                if(!number57) {
                    num57.setBackgroundResource(R.drawable.roundebutton2);
                    number57 = true;
                } else {
                    num57.setBackgroundResource(R.drawable.roundebutton);
                    number57 = false;
                }
                break;
            case R.id.num61:
                if(!number61) {
                    num61.setBackgroundResource(R.drawable.roundebutton2);
                    number61 = true;
                } else {
                    num61.setBackgroundResource(R.drawable.roundebutton);
                    number61 = false;
                }
                break;
            case R.id.num62:
                if(!number62) {
                    num62.setBackgroundResource(R.drawable.roundebutton2);
                    number62 = true;
                } else {
                    num62.setBackgroundResource(R.drawable.roundebutton);
                    number62 = false;
                }
                break;
            case R.id.num63:
                if(!number63) {
                    num63.setBackgroundResource(R.drawable.roundebutton2);
                    number63 = true;
                } else {
                    num63.setBackgroundResource(R.drawable.roundebutton);
                    number63 = false;
                }
                break;
            case R.id.num64:
                if(!number64) {
                    num64.setBackgroundResource(R.drawable.roundebutton2);
                    number64 = true;
                } else {
                    num64.setBackgroundResource(R.drawable.roundebutton);
                    number64 = false;
                }
                break;
            case R.id.num65:
                if(!number65) {
                    num65.setBackgroundResource(R.drawable.roundebutton2);
                    number65 = true;
                } else {
                    num65.setBackgroundResource(R.drawable.roundebutton);
                    number65 = false;
                }
                break;
            case R.id.num66:
                if(!number66) {
                    num66.setBackgroundResource(R.drawable.roundebutton2);
                    number66 = true;
                } else {
                    num66.setBackgroundResource(R.drawable.roundebutton);
                    number66 = false;
                }
                break;
            case R.id.num67:
                if(!number67) {
                    num67.setBackgroundResource(R.drawable.roundebutton2);
                    number67 = true;
                } else {
                    num67.setBackgroundResource(R.drawable.roundebutton);
                    number67 = false;
                }
                break;
            case R.id.num71:
                if(!number71) {
                    num71.setBackgroundResource(R.drawable.roundebutton2);
                    number71 = true;
                } else {
                    num71.setBackgroundResource(R.drawable.roundebutton);
                    number71 = false;
                }
                break;
            case R.id.num72:
                if(!number72) {
                    num72.setBackgroundResource(R.drawable.roundebutton2);
                    number72 = true;
                } else {
                    num72.setBackgroundResource(R.drawable.roundebutton);
                    number72 = false;
                }
                break;
            case R.id.num73:
                if(!number73) {
                    num73.setBackgroundResource(R.drawable.roundebutton2);
                    number73 = true;
                } else {
                    num73.setBackgroundResource(R.drawable.roundebutton);
                    number73 = false;
                }
                break;
            case R.id.num74:
                if(!number74) {
                    num74.setBackgroundResource(R.drawable.roundebutton2);
                    number74 = true;
                } else {
                    num74.setBackgroundResource(R.drawable.roundebutton);
                    number74 = false;
                }
                break;
            case R.id.num75:
                if(!number75) {
                    num75.setBackgroundResource(R.drawable.roundebutton2);
                    number75 = true;
                } else {
                    num75.setBackgroundResource(R.drawable.roundebutton);
                    number75 = false;
                }
                break;
            case R.id.num76:
                if(!number76) {
                    num76.setBackgroundResource(R.drawable.roundebutton2);
                    number76 = true;
                } else {
                    num76.setBackgroundResource(R.drawable.roundebutton);
                    number76 = false;
                }
                break;
            case R.id.num77:
                if(!number77) {
                    num77.setBackgroundResource(R.drawable.roundebutton2);
                    number77 = true;
                } else {
                    num77.setBackgroundResource(R.drawable.roundebutton);
                    number77 = false;
                }
                break;
        }

        Check(number11,number21,number31,number41,number51,number61,number71,answer1,answer22,num11,num21,num31,num41,num51,num61,num71,Answer1,Answer22);
        Check(number12,number22,number32,number42,number52,number62,number72,answer2,answer23,num12,num22,num32,num42, num52,num62,num72,Answer2,Answer23);
        Check(number13,number23,number33,number43,number53,number63,number73,answer3,answer24,num13,num23,num33,num43,num53,num63,num73,Answer3,Answer24);
        Check(number14,number24,number34,number44,number54,number64,number74,answer4,answer25,num14,num24,num34,num44,num54,num64,num74,Answer4,Answer25);
        Check(number15,number25,number35,number45,number55,number65,number75,answer5,answer26,num15,num25,num35,num45,num55,num65,num75,Answer5,Answer26);
        Check(number16,number26,number36,number46,number56,number66,number76,answer6,answer27,num16,num26,num36,num46,num56,num66,num76,Answer6,Answer27);
        Check(number17,number27,number37,number47,number57,number67,number77,answer7,answer28,num17,num27,num37,num47,num57,num67,num77,Answer7,Answer28);

        Check(number11,number12,number13,number14,number15,number16,number17,answer8,answer15,num11,num12,num13,num14,num15,num16,num17,Answer8,Answer15);
        Check(number21,number22,number23,number24,number25,number26,number27,answer9,answer16,num21,num22,num23,num24,num25,num26,num27,Answer9,Answer16);
        Check(number31,number32,number33,number34,number35,number36,number37,answer10,answer17,num31,num32,num33,num34,num35,num36,num37,Answer10,Answer17);
        Check(number41,number42,number43,number44,number45,number46,number47,answer11,answer18,num41,num42,num43,num44,num45,num46,num47,Answer11,Answer18);
        Check(number51,number52,number53,number54,number55,number56,number57,answer12,answer19,num51,num52,num53,num54,num55,num56,num57,Answer12,Answer19);
        Check(number61,number62,number63,number64,number65,number66,number67,answer13,answer20,num61,num62,num63,num64,num65,num66,num67,Answer13,Answer20);
        Check(number71,number72,number73,number74,number75,number76,number77,answer14,answer21,num71,num72,num73,num74,num75,num76,num77,Answer14,Answer21);

        CheckTwo(number11,number21,number31,number41,number51,number61,number71,check1,check22,num11,num21,num31,num41,num51,num61,num71);
        CheckTwo(number12,number22,number32,number42,number52,number62,number72,check2,check23,num12,num22,num32,num42,num52,num62,num72);
        CheckTwo(number13,number23,number33,number43,number53,number63,number73,check3,check24,num13,num23,num33,num43,num53,num63,num73);
        CheckTwo(number14,number24,number34,number44,number54,number64,number74,check4,check25,num14,num24,num34,num44,num54,num64,num74);
        CheckTwo(number15,number25,number35,number45, number55,number65,number75,check5,check26,num15,num25,num35,num45,num55,num65,num75);
        CheckTwo(number16,number26,number36,number46, number56,number66,number76,check6,check27,num16,num26,num36,num46,num56,num66,num76);
        CheckTwo(number17,number27,number37,number47, number57,number67,number77,check7,check28,num17,num27,num37,num47,num57,num67,num77);

        CheckTwo(number11,number12,number13,number14,number15,number16,number17,check8,check15,num11,num12,num13,num14,num15,num16,num17);
        CheckTwo(number21,number22,number23,number24, number25,number26,number27,check9,check16,num21,num22,num23,num24,num25,num26,num27);
        CheckTwo(number31,number32,number33,number34,number35,number36,number37,check10,check17,num31,num32,num33,num34,num35,num36,num37);
        CheckTwo(number41,number42,number43,number44, number45,number46,number47,check11,check18,num41,num42,num43,num44,num45,num46,num47);
        CheckTwo(number51,number52,number53,number54,number55,number56,number57,check12,check19,num51,num52,num53,num54,num55,num56,num57);
        CheckTwo(number61,number62,number63,number64,number65,number66,number67,check13,check20,num61,num62,num63,num64,num65,num66,num67);
        CheckTwo(number71,number72,number73,number74,number75,number76,number77,check14,check21,num71,num72,num73,num74,num75,num76,num77);

        CheckAnswer();
    }

    private void Check(boolean number11,boolean number12, boolean number13, boolean number14, boolean number15 , boolean number16,boolean number17 ,Button answer1, Button answer13
            ,Button num11, Button num21, Button num31,Button num41, Button num51, Button num61,Button num71 , boolean Answer1,boolean Answer13){


        if (number11 && number12 && number13 && number14 && number15 && number16 && number17) {
            answer1.setBackgroundResource(R.drawable.sumabutton);
            answer13.setBackgroundResource(R.drawable.sumabutton);
            } else if (!number11 && number12 && number13 && number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num11.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if (number11 && !number12 && number13 && number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num21.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if (number11 && number12 && !number13 && number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            }  else if (number11 && number12 && number13 && !number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && number13 && number14 && !number15 && number16 && number17) {
            if((Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && number13 && number14 && number15 && !number16 && number17) {
            if((Integer.parseInt(num61.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && number13 && number14 && number15 && number16 && !number17) {
            if((Integer.parseInt(num71.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (!number11 && !number12 && number13 && number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (!number11 && number12 && !number13 && number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if (!number11 && number12 && number13 && !number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if (!number11 && number12 && number13 && number14 && !number15 && number16 && number17) {
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if (!number11 && number12 && number13 && number14 && number15 && !number16 && number17) {
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if (!number11 && number12 && number13 && number14 && number15 && number16 && !number17) {
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && !number12 && !number13 && number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && !number12 && number13 && !number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
         } else if (number11 && !number12 && number13 && number14 && !number15 && number16 && number17) {
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if (number11 && !number12 && number13 && number14 && number15 && !number16 && number17) {
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && !number12 && number13 && number14 && number15 && number16 && !number17) {
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
         } else if (number11 && number12 && !number13 && !number14 && number15 && number16 && number17) {
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && !number13 && number14 && !number15 && number16 && number17) {
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && !number13 && number14 && number15 && !number16 && number17) {
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && !number13 && number14 && number15 && number16 && !number17) {
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if (number11 && number12 && number13 && !number14 && !number15 && number16 && number17) {
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 &&number13 && !number14 && number15 && !number16 && number17) {
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if (number11 && number12 && number13 && !number14 && number15 && number16 && !number17) {
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && number13 && number14 && !number15 && !number16 && number17) {
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if (number11 && number12 && number13 && number14 && !number15 && number16 && !number17) {
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if (number11 && number12 && number13 && number14 && number15 && !number16 && !number17) {
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
         }

        else if(!number11 && !number12 && !number13 && number14 && number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && !number12 && number13 && !number14 && number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && !number12 && number13 && number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
         } else if(!number11 && !number12 && number13 && number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && number12 && !number13 && !number14 && number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && number12 && !number13 && number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && number12 && !number13 && number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && number12 && !number13 && number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if(!number11 && number12 && number13 && !number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && number12 && number13 && !number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && number12 && number13 && number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && number12 && number13 && number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && number15 && number16 && number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && !number12 && !number13 && number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(number11 && !number12 && !number13 && number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && !number12 && number13 && !number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && !number12 && number13 && !number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(number11 && !number12 && number13 && !number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && !number12 && number13 && number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && !number12 && number13 && number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && number12 && !number13 && !number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && number12 && !number13 && !number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && number12 && !number13 && !number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
         } else if(number11 && number12 && !number13 && number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(number11 && number12 && !number13 && number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(number11 && number12 && !number13 && number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          }else if(number11 && number12 && number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(number11 && number12 && number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(number11 && number12 && number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            }else if(number11 && number12 && number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
             }

        else if(!number11 && !number12 && !number13 && !number14 && number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           }  else if(!number11 && !number12 && !number13 && number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && !number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && !number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && !number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }


        else if(!number11 && !number12 && !number13 && !number14 && !number15 && number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && !number14 && number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && !number12 && !number13 && !number14 && number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && !number12 && !number13 && number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && !number12 && !number13 && number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && !number12 && !number13 && number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && !number12 && number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && !number12 && number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if(!number11 && !number12 && number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            }
        else if(!number11 && !number12 && number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && number12 && !number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if(!number11 && number12 && !number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
             } else if(!number11 && number12 && !number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
             } else if(!number11 && number12 && number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if(number11 && !number12 && !number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if(number11 && !number12 && !number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            } else if(number11 && number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
            }

        else if(!number11 && !number12 && !number13 && !number14 && !number15 && !number16 && number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
           } else if(!number11 && !number12 && !number13 && !number14 && !number15 && number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
         } else if(!number11 && !number12 && !number13 && !number14 && number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && !number12 && !number13 && number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
         } else if(!number11 && !number12 && number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          } else if(!number11 && number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num71.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
             } else if(number11 && !number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num71.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
          }
        else if(!number11 && !number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num71.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }

    }

    private void CheckTwo(boolean number11,boolean number12, boolean number13, boolean number14, boolean number15, boolean number16, boolean number17, Button check1, Button check13
            ,Button num11, Button num21, Button num31,Button num41, Button num51,Button num61,Button num71) {


        if (number11 && number12 && number13 && number14 && number15 && number16 && number17) {
            check1.setText("0");
            check13.setText("0");
        } else if (!number11 && number12 && number13 && number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num11.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString())));
        } else if (number11 && !number12 && number13 && number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num21.getText().toString())));
        } else if (number11 && number12 && !number13 && number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString())));
        }  else if (number11 && number12 && number13 && !number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString())));
        } else if (number11 && number12 && number13 && number14 && !number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString())));
        } else if (number11 && number12 && number13 && number14 && number15 && !number16 && number17) {
            check1.setText("" + (Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString())));
        } else if (number11 && number12 && number13 && number14 && number15 && number16 && !number17) {
            check1.setText("" + (Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num71.getText().toString())));
        } else if (!number11 && !number12 && number13 && number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString())));
        } else if (!number11 && number12 && !number13 && number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num31.getText().toString())));
        } else if (!number11 && number12 && number13 && !number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString())));
        } else if (!number11 && number12 && number13 && number14 && !number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString())));
        } else if (!number11 && number12 && number13 && number14 && number15 && !number16 && number17) {
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if (!number11 && number12 && number13 && number14 && number15 && number16 && !number17) {
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if (number11 && !number12 && !number13 && number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num21.getText().toString())));
        } else if (number11 && !number12 && number13 && !number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString())));
        } else if (number11 && !number12 && number13 && number14 && !number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString())));
        } else if (number11 && !number12 && number13 && number14 && number15 && !number16 && number17) {
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString())));
        } else if (number11 && !number12 && number13 && number14 && number15 && number16 && !number17) {
            check1.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString())));
        } else if (number11 && number12 && !number13 && !number14 && number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
        } else if (number11 && number12 && !number13 && number14 && !number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString())));
        } else if (number11 && number12 && !number13 && number14 && number15 && !number16 && number17) {
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if (number11 && number12 && !number13 && number14 && number15 && number16 && !number17) {
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if (number11 && number12 && number13 && !number14 && !number15 && number16 && number17) {
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num41.getText().toString())));
        } else if (number11 && number12 &&number13 && !number14 && number15 && !number16 && number17) {
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));
        } else if (number11 && number12 && number13 && !number14 && number15 && number16 && !number17) {
            check1.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
        } else if (number11 && number12 && number13 && number14 && !number15 && !number16 && number17) {
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if (number11 && number12 && number13 && number14 && !number15 && number16 && !number17) {
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if (number11 && number12 && number13 && number14 && number15 && !number16 && !number17) {
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        }

        else if(!number11 && !number12 && !number13 && number14 && number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(!number11 && !number12 && number13 && !number14 && number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num41.getText().toString())));
        } else if(!number11 && !number12 && number13 && number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num51.getText().toString())));
        } else if(!number11 && !number12 && number13 && number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && !number12 && number13 && number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && number12 && !number13 && !number14 && number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(!number11 && number12 && !number13 && number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(!number11 && number12 && !number13 && number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(!number11 && number12 && !number13 && number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(!number11 && number12 && number13 && !number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) +  Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())));
        } else if(!number11 && number12 && number13 && !number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && number12 && number13 && !number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && number12 && number13 && number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && number12 && number13 && number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && number12 && number13 && number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
        } else if(number11 && !number12 && !number13 && !number14 && number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(number11 && !number12 && !number13 && number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(number11 && !number12 && !number13 && number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(number11 && !number12 && !number13 && number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(number11 && !number12 && number13 && !number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num51.getText().toString())));
        } else if(number11 && !number12 && number13 && !number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
        } else if(number11 && !number12 && number13 && !number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num41.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num41.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
        } else if(number11 && !number12 && number13 && number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num61.getText().toString())));
        } else if(number11 && !number12 && number13 && number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(number11 && !number12 && number13 && number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) +  Integer.parseInt(num71.getText().toString())));
        } else if(number11 && number12 && !number13 && !number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && !number13 && !number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && !number13 && !number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && !number13 && number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) +  Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && !number13 && number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && !number13 && number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString())));
        }else if(number11 && number12 && number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(number11 && number12 && number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(number11 && number12 && number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        }else if(number11 && number12 && number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        }

        else if(!number11 && !number12 && !number13 && !number14 && number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
        }  else if(!number11 && !number12 && !number13 && number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString())));

        } else if(!number11 && !number12 && !number13 && number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));

        } else if(!number11 && !number12 && !number13 && number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(!number11 && !number12 && number13 && !number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && !number12 && number13 && !number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && !number12 && number13 && !number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && !number12 && number13 && number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));

        } else if(!number11 && !number12 && number13 && number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(!number11 && !number12 && number13 && number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(!number11 && number12 && !number13 && !number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && number12 && !number13 && !number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && number12 && !number13 && !number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && number12 && !number13 && number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));

        } else if(!number11 && number12 && !number13 && number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(!number11 && number12 && !number13 && number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(!number11 && number12 && number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && number12 && number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && number12 && number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(!number11 && number12 && number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(number11 && !number12 && !number13 && !number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && !number12 && !number13 && !number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && !number12 && !number13 && !number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && !number12 && !number13 && number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString())));

        } else if(number11 && !number12 && !number13 && number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(number11 && !number12 && !number13 && number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(number11 && !number12 && number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && !number12 && number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && !number12 && number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && !number12 && number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(number11 && number12 && !number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && number12 && !number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && number12 && !number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        } else if(number11 && number12 && !number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString())));

        } else if(number11 && number12 && number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString())));

        }


        else if(!number11 && !number12 && !number13 && !number14 && !number15 && number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())));

        } else if(!number11 && !number12 && !number13 && !number14 && number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && !number12 && !number13 && !number14 && number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && !number12 && !number13 && number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && !number12 && !number13 && number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && !number12 && !number13 && number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && !number12 && number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())));
        } else if(!number11 && !number12 && number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && !number12 && number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && !number12 && number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && number12 && !number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && number12 && !number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && number12 && number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(number11 && !number12 && !number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())));
        } else if(number11 && !number12 && !number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(number11 && !number12 && !number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(number11 && !number12 && !number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(number11 && !number12 && number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(number11 && number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        }

        else if(!number11 && !number12 && !number13 && !number14 && !number15 && !number16 && number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && !number12 && !number13 && !number14 && !number15 && number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        } else if(!number11 && !number12 && !number13 && !number14 && number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && !number12 && !number13 && number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && !number12 && number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        } else if(number11 && !number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num71.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString())));
        }
        else if(!number11 && !number12 && !number13 && !number14 && !number15 && !number16 && !number17){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num61.getText().toString()) + Integer.parseInt(num71.getText().toString())));
        }

    }




    private void CheckAnswer(){
        if(Integer.parseInt(answer1.getText().toString()) == Integer.parseInt(check1.getText().toString()) && Integer.parseInt(answer2.getText().toString()) == Integer.parseInt(check2.getText().toString()) && Integer.parseInt(answer3.getText().toString()) == Integer.parseInt(check3.getText().toString()) &&Integer.parseInt(answer4.getText().toString()) == Integer.parseInt(check4.getText().toString())
                && Integer.parseInt(answer5.getText().toString()) == Integer.parseInt(check5.getText().toString()) && Integer.parseInt(answer6.getText().toString()) == Integer.parseInt(check6.getText().toString()) && Integer.parseInt(answer7.getText().toString()) == Integer.parseInt(check7.getText().toString()) && Integer.parseInt(answer8.getText().toString()) == Integer.parseInt(check8.getText().toString())
                && Integer.parseInt(answer9.getText().toString()) == Integer.parseInt(check9.getText().toString()) && Integer.parseInt(answer10.getText().toString()) == Integer.parseInt(check10.getText().toString()) && Integer.parseInt(answer11.getText().toString()) == Integer.parseInt(check11.getText().toString()) && Integer.parseInt(answer12.getText().toString()) == Integer.parseInt(check12.getText().toString())
                &&Integer.parseInt(answer13.getText().toString()) == Integer.parseInt(check13.getText().toString()) && Integer.parseInt(answer14.getText().toString()) == Integer.parseInt(check14.getText().toString()) && Integer.parseInt(answer15.getText().toString()) == Integer.parseInt(check15.getText().toString()) && Integer.parseInt(answer16.getText().toString()) == Integer.parseInt(check16.getText().toString())
                && Integer.parseInt(answer17.getText().toString()) == Integer.parseInt(check17.getText().toString()) && Integer.parseInt(answer18.getText().toString()) == Integer.parseInt(check18.getText().toString()) && Integer.parseInt(answer19.getText().toString()) == Integer.parseInt(check19.getText().toString()) && Integer.parseInt(answer20.getText().toString()) == Integer.parseInt(check20.getText().toString())
                && Integer.parseInt(answer21.getText().toString()) == Integer.parseInt(check21.getText().toString()) && Integer.parseInt(answer22.getText().toString()) == Integer.parseInt(check22.getText().toString()) && Integer.parseInt(answer23.getText().toString()) == Integer.parseInt(check23.getText().toString()) && Integer.parseInt(answer24.getText().toString()) == Integer.parseInt(check24.getText().toString())
        && Integer.parseInt(answer25.getText().toString()) == Integer.parseInt(check25.getText().toString()) && Integer.parseInt(answer26.getText().toString()) == Integer.parseInt(check26.getText().toString()) && Integer.parseInt(answer27.getText().toString()) == Integer.parseInt(check27.getText().toString()) && Integer.parseInt(answer28.getText().toString()) == Integer.parseInt(check28.getText().toString()) ){
            check1.setEnabled(false);
            check2.setEnabled(false);
            check3.setEnabled(false);
            check4.setEnabled(false);
            check5.setEnabled(false);
            check6.setEnabled(false);
            check7.setEnabled(false);
            check8.setEnabled(false);
            check9.setEnabled(false);
            check10.setEnabled(false);
            check11.setEnabled(false);
            check12.setEnabled(false);
            check13.setEnabled(false);
            check14.setEnabled(false);
            check15.setEnabled(false);
            check16.setEnabled(false);
            check17.setEnabled(false);
            check18.setEnabled(false);
            check19.setEnabled(false);
            check20.setEnabled(false);
            check21.setEnabled(false);
            check22.setEnabled(false);
            check23.setEnabled(false);
            check24.setEnabled(false);
            check25.setEnabled(false);
            check26.setEnabled(false);
            check27.setEnabled(false);
            check28.setEnabled(false);

            answer1.setEnabled(false);
            answer2.setEnabled(false);
            answer3.setEnabled(false);
            answer4.setEnabled(false);
            answer5.setEnabled(false);
            answer6.setEnabled(false);
            answer7.setEnabled(false);
            answer8.setEnabled(false);
            answer9.setEnabled(false);
            answer10.setEnabled(false);
            answer11.setEnabled(false);
            answer12.setEnabled(false);
            answer13.setEnabled(false);
            answer14.setEnabled(false);
            answer15.setEnabled(false);
            answer16.setEnabled(false);
            answer17.setEnabled(false);
            answer18.setEnabled(false);
            answer19.setEnabled(false);
            answer20.setEnabled(false);
            answer21.setEnabled(false);
            answer22.setEnabled(false);
            answer23.setEnabled(false);
            answer24.setEnabled(false);
            answer25.setEnabled(false);
            answer26.setEnabled(false);
            answer27.setEnabled(false);
            answer28.setEnabled(false);

            num11.setEnabled(false);
            num12.setEnabled(false);
            num13.setEnabled(false);
            num14.setEnabled(false);
            num15.setEnabled(false);
            num16.setEnabled(false);
            num17.setEnabled(false);
            num21.setEnabled(false);
            num22.setEnabled(false);
            num23.setEnabled(false);
            num24.setEnabled(false);
            num25.setEnabled(false);
            num26.setEnabled(false);
            num27.setEnabled(false);
            num31.setEnabled(false);
            num32.setEnabled(false);
            num33.setEnabled(false);
            num34.setEnabled(false);
            num35.setEnabled(false);
            num36.setEnabled(false);
            num37.setEnabled(false);
            num41.setEnabled(false);
            num42.setEnabled(false);
            num43.setEnabled(false);
            num44.setEnabled(false);
            num45.setEnabled(false);
            num46.setEnabled(false);
            num47.setEnabled(false);
            num51.setEnabled(false);
            num52.setEnabled(false);
            num53.setEnabled(false);
            num54.setEnabled(false);
            num55.setEnabled(false);
            num56.setEnabled(false);
            num57.setEnabled(false);
            num61.setEnabled(false);
            num62.setEnabled(false);
            num63.setEnabled(false);
            num64.setEnabled(false);
            num65.setEnabled(false);
            num66.setEnabled(false);
            num67.setEnabled(false);
            num71.setEnabled(false);
            num72.setEnabled(false);
            num73.setEnabled(false);
            num74.setEnabled(false);
            num75.setEnabled(false);
            num76.setEnabled(false);
            num77.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    Intent intent_1 = new Intent();
                    intent_1.putExtra("money_result", 20);
                    intent_1.putExtra("block", lvl);
                    setResult(RESULT_OK, intent_1);
                    finish();
                }
            }, 1500);

        }
    }

    @Override
    public void onBackPressed() {
        Intent intent_1 = new Intent();
        intent_1.putExtra("money_result", 0);
        intent_1.putExtra("block", 0);
        setResult(RESULT_OK, intent_1);
        finish();
        super.onBackPressed();
    }

    public void Back(View view) {
        Intent intent_1 = new Intent();
        intent_1.putExtra("money_result", 0);
        intent_1.putExtra("block", 0);
        setResult(RESULT_OK, intent_1);
        finish();
    }


}

