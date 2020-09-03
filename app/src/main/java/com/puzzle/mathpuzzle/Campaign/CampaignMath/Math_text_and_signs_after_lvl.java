package com.puzzle.mathpuzzle.Campaign.CampaignMath;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.puzzle.mathpuzzle.Campaign.CampaignMath.Buttons.ButtonsCampaign;
import com.puzzle.mathpuzzle.Campaign.CampaignMath.Signs.SignsCampaign;
import com.puzzle.mathpuzzle.Campaign.CampaignMath.TextQuestions.TextQuestionsCamplaign;
import com.puzzle.mathpuzzle.Campaign.CampaignMath.picture.PictureCampaignMath;
import com.puzzle.mathpuzzle.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Math_text_and_signs_after_lvl extends AppCompatActivity {

    @BindView(R.id.Answer) TextView Answer;
    @BindView(R.id.answer) TextView AnswerTextView;
    @BindView(R.id.nextLvl) TextView nextLvl;
    @BindView(R.id.corect) TextView corect;
    @BindView(R.id.allLvlCompl) TextView allLvlCompl;
    @BindView(R.id.img)
    ImageButton img;
    @BindView(R.id.NextLevel) LinearLayout NextLevel;
    String block="";
    String answer="";
    int money = 0;


    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math_text_and_signs_after_lvl);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        if(intent!=null) {
            money = intent.getIntExtra("money", 0);
            block = intent.getStringExtra("block");
            answer = intent.getStringExtra("Answer");
            Answer.setText(answer);
            SaveMoney();
            if(block.equalsIgnoreCase("110")){
                nextLvl.setText(getResources().getText(R.string.campaign));
                img.setBackgroundResource(R.drawable.home);
                allLvlCompl.setVisibility(View.VISIBLE);
                corect.setText(getResources().getText(R.string.congratulations));
            }
        }else{
            loadMoney();
        }

        NextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent();
                i2.putExtra("Block", block);
                setResult(RESULT_OK, i2);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i2 = new Intent();
        i2.putExtra("Block", "0");
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();
    }

    private void nextLevel(){
        if(block.equalsIgnoreCase("1")){
            Intent intent2 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent2.putExtra("dictionary","Какого числа не хватает?");
            intent2.putExtra("answer","0");
            intent2.putExtra("answer1","16");
            intent2.putExtra("size","4x4");
            intent2.putExtra("progress",2);
            intent2.putExtra("lvl",2);
            intent2.putExtra("money_data",money);
            startActivityForResult(intent2,2);
        }else if(block.equalsIgnoreCase("2")){
            Intent intent3 = new Intent(Math_text_and_signs_after_lvl.this, TextQuestionsCamplaign.class);
            intent3.putExtra("dictionary"," 8 | 10 | 12 | 14 | ? ");
            intent3.putExtra("answer","16");
            intent3.putExtra("progress",3);
            intent3.putExtra("lvl",3);
            intent3.putExtra("money_data",money);
            startActivityForResult(intent3,3);
        }else if(block.equalsIgnoreCase("3")){
            Intent intent4 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent4.putExtra("dictionary","Найдите ?");
            intent4.putExtra("answer","5");
            intent4.putExtra("size","3x3");
            intent4.putExtra("progress",4);
            intent4.putExtra("lvl",4);
            intent4.putExtra("money_data",money);
            startActivityForResult(intent4,4);
        }else if(block.equalsIgnoreCase("4")){
            Intent intent5 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent5.putExtra("dictionary"," Найдите ? ");
            intent5.putExtra("answer","1");
            intent5.putExtra("progress",5);
            intent5.putExtra("lvl",5);
            intent5.putExtra("money_data",money);
            startActivityForResult(intent5,5);
        }else if(block.equalsIgnoreCase("5")){
            Intent intent6 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent6.putExtra("dictionary","Гусь весит 9 кг, а курица — на 7 кг меньше. Сколько весят гусь и курица вместе?");
            intent6.putExtra("answer","11");
            intent6.putExtra("progress",6);
            intent6.putExtra("lvl",6);
            intent6.putExtra("money_data",money);
            startActivityForResult(intent6,6);
        }else if(block.equalsIgnoreCase("6")){
            Intent intent7 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent7.putExtra("dictionary"," 5 | 6 | 8 | 11 | ? ");
            intent7.putExtra("answer","15");
            intent7.putExtra("progress",7);
            intent7.putExtra("lvl",7);
            intent7.putExtra("money_data",money);
            startActivityForResult(intent7,7);
        }else if(block.equalsIgnoreCase("7")){
            Intent intent8 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent8.putExtra("dictionary","A+B = 7\nA+B+C = 9\nC- ?");
            intent8.putExtra("answer","2");
            intent8.putExtra("progress",8);
            intent8.putExtra("lvl",8);
            intent8.putExtra("money_data",money);
            startActivityForResult(intent8,8);
        }else if(block.equalsIgnoreCase("8")){
            Intent intent9 = new Intent(Math_text_and_signs_after_lvl.this,PictureCampaignMath.class);
            intent9.putExtra("dictionary","Найдите ?");
            intent9.putExtra("answer","6");
            intent9.putExtra("progress",9);
            intent9.putExtra("lvl",9);
            intent9.putExtra("money_data",money);
            startActivityForResult(intent9,9);
        }else if(block.equalsIgnoreCase("9")){
            Intent intent10 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent10.putExtra("dictionary","У фермера было 20 овец, и все, кроме восьми, умерли. Сколько овец осталось у фермера?");
            intent10.putExtra("answer","8");
            intent10.putExtra("progress",10);
            intent10.putExtra("lvl",10);
            intent10.putExtra("money_data",money);
            startActivityForResult(intent10,10);
        }else if(block.equalsIgnoreCase("10")){
            Intent intent11 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent11.putExtra("dictionary","Вы опередили лыжника, который находился на второй позиции. Какое месте теперь Вы занимаете?");
            intent11.putExtra("answer","2");
            intent11.putExtra("progress",11);
            intent11.putExtra("lvl",11);
            intent11.putExtra("money_data",money);
            startActivityForResult(intent11,11);
        }else if(block.equalsIgnoreCase("11")){
            Intent intent12 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent12.putExtra("dictionary"," 5 | 3 | 6 | 4 | 7 | ? ");
            intent12.putExtra("answer","5");
            intent12.putExtra("progress",12);
            intent12.putExtra("lvl",12);
            intent12.putExtra("money_data",money);
            startActivityForResult(intent12,12);
        }else if(block.equalsIgnoreCase("12")){
            Intent intent13 = new Intent(Math_text_and_signs_after_lvl.this,PictureCampaignMath.class);
            intent13.putExtra("dictionary"," Найдите ? ");
            intent13.putExtra("answer","4");
            intent13.putExtra("progress",13);
            intent13.putExtra("lvl",13);
            intent13.putExtra("money_data",money);
            startActivityForResult(intent13,13);
        }else if(block.equalsIgnoreCase("13")){
            Intent intent14 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent14.putExtra("dictionary","1 + 4 = 5 \n 2 + 5 = 12\n 3 + 6 = 21\n 8 + 11 = ?");
            intent14.putExtra("answer","96");
            intent14.putExtra("progress",14);
            intent14.putExtra("lvl",14);
            intent14.putExtra("money_data",money);
            startActivityForResult(intent14,14);
        }else if(block.equalsIgnoreCase("14")){
            Intent intent15 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent15.putExtra("dictionary","Найдите ?");
            intent15.putExtra("answer","7");
            intent15.putExtra("size","5x5");
            intent15.putExtra("progress",15);
            intent15.putExtra("lvl",15);
            intent15.putExtra("money_data",money);
            startActivityForResult(intent15,15);
        }else if(block.equalsIgnoreCase("15")){
            Intent intent16 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent16.putExtra("dictionary","A + B + C = 20\n A = - C\n B = A + 15\n А - ?\n");
            intent16.putExtra("answer","5");
            intent16.putExtra("progress",16);
            intent16.putExtra("lvl",16);
            intent16.putExtra("money_data",money);
            startActivityForResult(intent16,16);
        }else if(block.equalsIgnoreCase("16")){
            Intent intent17 = new Intent(Math_text_and_signs_after_lvl.this,PictureCampaignMath.class);
            intent17.putExtra("dictionary"," Найдите ? ");
            intent17.putExtra("answer","13");
            intent17.putExtra("progress",17);
            intent17.putExtra("lvl",17);
            intent17.putExtra("money_data",money);
            startActivityForResult(intent17,17);
        }else if(block.equalsIgnoreCase("17")){
            Intent intent18 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent18.putExtra("dictionary","Найдите ?");
            intent18.putExtra("answer","18");
            intent18.putExtra("size","3x3");
            intent18.putExtra("progress",18);
            intent18.putExtra("lvl",18);
            intent18.putExtra("money_data",money);
            startActivityForResult(intent18,18);
        }else if(block.equalsIgnoreCase("18")){
            Intent intent19 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent19.putExtra("dictionary","Сумма каких двух натуральных чисел равна их произведению?");
            intent19.putExtra("answer","2");
            intent19.putExtra("answer1","2");
            intent19.putExtra("progress",19);
            intent19.putExtra("lvl",19);
            intent19.putExtra("money_data",money);
            startActivityForResult(intent19,19);
        }else if(block.equalsIgnoreCase("19")){
            Intent intent20 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent20.putExtra("dictionary","Найдите ?");
            intent20.putExtra("answer","2");
            intent20.putExtra("progress",20);
            intent20.putExtra("lvl",20);
            intent20.putExtra("money_data",money);
            startActivityForResult(intent20,20);
        }else if(block.equalsIgnoreCase("20")){
            Intent intent21 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent21.putExtra("dictionary"," 7 + 7 / 7 + 7 * 7 - 7 = ? ");
            intent21.putExtra("answer","50");
            intent21.putExtra("progress",21);
            intent21.putExtra("lvl",21);
            intent21.putExtra("money_data",money);
            startActivityForResult(intent21,21);
        }else if(block.equalsIgnoreCase("21")){
            Intent intent22 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent22.putExtra("dictionary","A+B=60\nA-B=40\nA/B=?");
            intent22.putExtra("answer","5");
            intent22.putExtra("progress",22);
            intent22.putExtra("lvl",22);
            intent22.putExtra("money_data",money);
            startActivityForResult(intent22,22);
        }else if(block.equalsIgnoreCase("22")){
            Intent intent23 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent23.putExtra("dictionary","4*4+4*4+4-4*4=?");
            intent23.putExtra("answer","20");
            intent23.putExtra("progress",23);
            intent23.putExtra("lvl",23);
            intent23.putExtra("money_data",money);
            startActivityForResult(intent23,23);
        }else if(block.equalsIgnoreCase("23")){
            Intent intent24 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent24.putExtra("dictionary","Три курицы за три дня несут три яйца. Сколько яиц снесут 12 таких же кур за 12 дней?");
            intent24.putExtra("answer","48");
            intent24.putExtra("progress",24);
            intent24.putExtra("lvl",24);
            intent24.putExtra("money_data",money);
            startActivityForResult(intent24,24);
        }else if(block.equalsIgnoreCase("24")){
            Intent intent25 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent25.putExtra("dictionary","Найдите ?");
            intent25.putExtra("answer","19");
            intent25.putExtra("size","3x3");
            intent25.putExtra("progress",25);
            intent25.putExtra("lvl",25);
            intent25.putExtra("money_data",money);
            startActivityForResult(intent25,25);
        }else if(block.equalsIgnoreCase("25")){
            Intent intent26 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent26.putExtra("dictionary"," 2 = -16 \n 7 = 56 \n 6 = -48 \n 1 = ? ");
            intent26.putExtra("answer","8");
            intent26.putExtra("progress",26);
            intent26.putExtra("lvl",26);
            intent26.putExtra("money_data",money);
            startActivityForResult(intent26,26);
        }else if(block.equalsIgnoreCase("26")){
            Intent intent27 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent27.putExtra("dictionary"," 32 | 45 | 60 | 77 | ? ");
            intent27.putExtra("answer","96");
            intent27.putExtra("progress",27);
            intent27.putExtra("lvl",27);
            intent27.putExtra("money_data",money);
            startActivityForResult(intent27,27);
        }else if(block.equalsIgnoreCase("27")){
            Intent intent28 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent28.putExtra("dictionary","Сколько будет половина от 2 + 2");
            intent28.putExtra("answer","3");
            intent28.putExtra("progress",28);
            intent28.putExtra("lvl",28);
            intent28.putExtra("money_data",money);
            startActivityForResult(intent28,28);
        }else if(block.equalsIgnoreCase("28")){
            Intent intent29 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent29.putExtra("dictionary","Найдите ?");
            intent29.putExtra("answer","24");
            intent29.putExtra("size","3x3");
            intent29.putExtra("progress",29);
            intent29.putExtra("lvl",29);
            intent29.putExtra("money_data",money);
            startActivityForResult(intent29,29);
        }else if(block.equalsIgnoreCase("29")){
            Intent intent30 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent30.putExtra("dictionary","Мальчик заплатил за бутылку с пробкой 20 рублей. Бутылка стоит на 16 рублей больше, чем пробка. Сколько стоит пробка?");
            intent30.putExtra("answer","2");
            intent30.putExtra("progress",30);
            intent30.putExtra("lvl",30);
            intent30.putExtra("money_data",money);
            startActivityForResult(intent30,30);
        }else if(block.equalsIgnoreCase("30")){
            Intent intent31 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent31.putExtra("dictionary","A+A+A = 30\nA+B+B = 18\nB-C = 2\nC+A*B=?");
            intent31.putExtra("answer","42");
            intent31.putExtra("progress",31);
            intent31.putExtra("lvl",31);
            intent31.putExtra("money_data",money);
            startActivityForResult(intent31,31);
        }else if(block.equalsIgnoreCase("31")){
            Intent intent32 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent32.putExtra("dictionary","11*11=4\n22*22=16\n33*33=?");
            intent32.putExtra("answer","36");
            intent32.putExtra("progress",32);
            intent32.putExtra("lvl",32);
            intent32.putExtra("money_data",money);
            startActivityForResult(intent32,32);
        }else if(block.equalsIgnoreCase("32")){
            Intent intent33 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent33.putExtra("dictionary"," 4 \n 6  2 \n 8 ? 2 \n 17 5 7 3 ");
            intent33.putExtra("answer","6");
            intent33.putExtra("progress",33);
            intent33.putExtra("lvl",33);
            intent33.putExtra("money_data",money);
            startActivityForResult(intent33,33);
        }else if(block.equalsIgnoreCase("33")){
            Intent intent34 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent34.putExtra("dictionary","8=56\n7=42\n6=30\n5=20\n3=?");
            intent34.putExtra("answer","6");
            intent34.putExtra("progress",34);
            intent34.putExtra("lvl",34);
            intent34.putExtra("money_data",money);
            startActivityForResult(intent34,34);
        }else if(block.equalsIgnoreCase("34")){
            Intent intent35 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent35.putExtra("dictionary"," 15 | 13 | 10 | 8 | ? ");
            intent35.putExtra("answer","5");
            intent35.putExtra("progress",35);
            intent35.putExtra("lvl",35);
            intent35.putExtra("money_data",money);
            startActivityForResult(intent35,35);
        }else if(block.equalsIgnoreCase("35")){
            Intent intent36 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent36.putExtra("dictionary","Швея имеет кусок сукна 18 м и ежедневно отрезает по 3 м. На какой день она отрежет последний раз?");
            intent36.putExtra("answer","5");
            intent36.putExtra("progress",36);
            intent36.putExtra("lvl",36);
            intent36.putExtra("money_data",money);
            startActivityForResult(intent36,36);
        }else if(block.equalsIgnoreCase("36")){
            Intent intent37 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent37.putExtra("dictionary","Найдите ?");
            intent37.putExtra("answer","26");
            intent37.putExtra("size","3x3");
            intent37.putExtra("progress",37);
            intent37.putExtra("lvl",37);
            intent37.putExtra("money_data",money);
            startActivityForResult(intent37,37);
        }else if(block.equalsIgnoreCase("37")){
            Intent intent38 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent38.putExtra("dictionary","Найдите ?");
            intent38.putExtra("answer","20");
            intent38.putExtra("size","3x3");
            intent38.putExtra("progress",38);
            intent38.putExtra("lvl",38);
            intent38.putExtra("money_data",money);
            startActivityForResult(intent38,38);
        }else if(block.equalsIgnoreCase("38")){
            Intent intent39 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent39.putExtra("dictionary","Сколько здесь треугольников?");
            intent39.putExtra("answer","7");
            intent39.putExtra("progress",39);
            intent39.putExtra("lvl",39);
            intent39.putExtra("money_data",money);
            startActivityForResult(intent39,39);
        }else if(block.equalsIgnoreCase("39")){
            Intent intent40 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent40.putExtra("dictionary"," 2 + 7 + 3 = 24 \n 9 + 7 - 4 = 24 \n 4 + 0 + 8 = 24 \n 5 + 5 + 5 = ? ");
            intent40.putExtra("answer","30");
            intent40.putExtra("progress",40);
            intent40.putExtra("lvl",40);
            intent40.putExtra("money_data",money);
            startActivityForResult(intent40,40);
        }else if(block.equalsIgnoreCase("40")){
            Intent intent41 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent41.putExtra("dictionary"," 1 + 5 = 12 \n 2 + 10 = 24 \n 3 + 15 = 36 \n 5 + 25 = ? ");
            intent41.putExtra("answer","60");
            intent41.putExtra("progress",41);
            intent41.putExtra("lvl",41);
            intent41.putExtra("money_data",money);
            startActivityForResult(intent41,41);
        }else if(block.equalsIgnoreCase("41")){
            Intent intent42 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent42.putExtra("dictionary","Сколько будет 40, разделённое на 1/2, плюс 10?");
            intent42.putExtra("answer","90");
            intent42.putExtra("progress",42);
            intent42.putExtra("lvl",42);
            intent42.putExtra("money_data",money);
            startActivityForResult(intent42,42);
        }else if(block.equalsIgnoreCase("42")){
            Intent intent43 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent43.putExtra("dictionary"," 2 | 4 | 8 | 16 | ? ");
            intent43.putExtra("answer","32");
            intent43.putExtra("progress",43);
            intent43.putExtra("lvl",43);
            intent43.putExtra("money_data",money);
            startActivityForResult(intent43,43);
        }else if(block.equalsIgnoreCase("43")){
            Intent intent44 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent44.putExtra("dictionary","Найдите ?");
            intent44.putExtra("answer","16");
            intent44.putExtra("progress",44);
            intent44.putExtra("lvl",44);
            intent44.putExtra("money_data",money);
            startActivityForResult(intent44,44);
        }else if(block.equalsIgnoreCase("44")){
            Intent intent45 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent45.putExtra("dictionary"," 3  4 \n 8  6 \n 12  16 \n 32  ? ");
            intent45.putExtra("answer","24");
            intent45.putExtra("progress",45);
            intent45.putExtra("lvl",45);
            intent45.putExtra("money_data",money);
            startActivityForResult(intent45,45);
        }else if(block.equalsIgnoreCase("45")){
            Intent intent46 = new Intent(Math_text_and_signs_after_lvl.this, SignsCampaign.class);
            intent46.putExtra("dictionary","Найдите ?");
            intent46.putExtra("answer","*");
            intent46.putExtra("answer1","+");
            intent46.putExtra("answer2","-");
            intent46.putExtra("answer3","*");
            intent46.putExtra("progress",46);
            intent46.putExtra("lvl",46);
            intent46.putExtra("money_data",money);
            startActivityForResult(intent46,46);
        }else if(block.equalsIgnoreCase("46")){
            Intent intent47 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent47.putExtra("dictionary","Кирпич весит килограмм и полкирпича. Сколько весит кирпич?");
            intent47.putExtra("answer","2");
            intent47.putExtra("progress",47);
            intent47.putExtra("lvl",47);
            intent47.putExtra("money_data",money);
            startActivityForResult(intent47,47);
        }else if(block.equalsIgnoreCase("47")){
            Intent intent48 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent48.putExtra("dictionary","A+A = 10\nA*B+B = 12\nA*B-A*C=A\nC - ?");
            intent48.putExtra("answer","1");
            intent48.putExtra("progress",48);
            intent48.putExtra("lvl",48);
            intent48.putExtra("money_data",money);
            startActivityForResult(intent48,48);
        }else if(block.equalsIgnoreCase("48")){
            Intent intent49 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent49.putExtra("dictionary"," 22 + 4 = 24 \n 13 + 6 = 16 \n 80 + 2 = 82 \n 67 + 9 = ? ");
            intent49.putExtra("answer","69");
            intent49.putExtra("progress",49);
            intent49.putExtra("lvl",49);
            intent49.putExtra("money_data",money);
            startActivityForResult(intent49,49);
        }else if(block.equalsIgnoreCase("49")){
            Intent intent50 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent50.putExtra("dictionary","Электричество   -   XIII\nМатематик   -   ?");
            intent50.putExtra("answer","9");
            intent50.putExtra("progress",50);
            intent50.putExtra("lvl",50);
            intent50.putExtra("money_data",money);
            startActivityForResult(intent50,50);
        } else if(block.equalsIgnoreCase("50")){
            Intent intent51 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent51.putExtra("dictionary","Найдите ?");
            intent51.putExtra("answer","3");
            intent51.putExtra("progress",51);
            intent51.putExtra("lvl",51);
            intent51.putExtra("money_data",money);
            startActivityForResult(intent51,51);

        } else if(block.equalsIgnoreCase("51")){
            Intent intent52 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent52.putExtra("dictionary"," 1 | 4 | 9 | 16 | ? ");
            intent52.putExtra("answer","25");
            intent52.putExtra("progress",52);
            intent52.putExtra("lvl",52);
            intent52.putExtra("money_data",money);
            startActivityForResult(intent52,52);

        } else if(block.equalsIgnoreCase("52")){
            Intent intent53 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent53.putExtra("dictionary","Найдите ?");
            intent53.putExtra("answer","2");
            intent53.putExtra("size","4x4");
            intent53.putExtra("progress",53);
            intent53.putExtra("lvl",53);
            intent53.putExtra("money_data",money);
            startActivityForResult(intent53,53);

        } else if(block.equalsIgnoreCase("53")){
            Intent intent54 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent54.putExtra("dictionary","5 быков дают 10 литров молока. Сколько дадут 10 быков?");
            intent54.putExtra("answer","0");
            intent54.putExtra("progress",54);
            intent54.putExtra("lvl",54);
            intent54.putExtra("money_data",money);
            startActivityForResult(intent54,54);

        } else if(block.equalsIgnoreCase("54")){
            Intent intent55 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent55.putExtra("dictionary","Найди ?");
            intent55.putExtra("answer","7");
            intent55.putExtra("progress",55);
            intent55.putExtra("lvl",55);
            intent55.putExtra("money_data",money);
            startActivityForResult(intent55,55);

        } else if(block.equalsIgnoreCase("55")){
            Intent intent56 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent56.putExtra("dictionary"," 21 = 42 \n 39 = 618 \n 17 = 214 \n 45 = ? ");
            intent56.putExtra("answer","810");
            intent56.putExtra("progress",56);
            intent56.putExtra("lvl",56);
            intent56.putExtra("money_data",money);
            startActivityForResult(intent56,56);

        } else if(block.equalsIgnoreCase("56")){
            Intent intent57 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent57.putExtra("dictionary"," 14   5    9\n 22   4    6 \n 33   5    8\n 46   1    ?  ");
            intent57.putExtra("answer","7");
            intent57.putExtra("progress",57);
            intent57.putExtra("lvl",57);
            intent57.putExtra("money_data",money);
            startActivityForResult(intent57,57);

        } else if(block.equalsIgnoreCase("57")){
            Intent intent58 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent58.putExtra("dictionary","Найди ?");
            intent58.putExtra("answer","3");
            intent58.putExtra("progress",58);
            intent58.putExtra("lvl",58);
            intent58.putExtra("money_data",money);
            startActivityForResult(intent58,58);

        } else if(block.equalsIgnoreCase("58")){
            Intent intent59 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent59.putExtra("dictionary","Найди ?");
            intent59.putExtra("answer","0");
            intent59.putExtra("progress",59);
            intent59.putExtra("lvl",59);
            intent59.putExtra("money_data",money);
            startActivityForResult(intent59,59);

        } else if(block.equalsIgnoreCase("59")){
            Intent intent60 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent60.putExtra("dictionary","4554 = 9\n9106 = 7\n1457 = 8\n3848 = ?");
            intent60.putExtra("answer","5");
            intent60.putExtra("progress",60);
            intent60.putExtra("lvl",60);
            intent60.putExtra("money_data",money);
            startActivityForResult(intent60,60);

        } else if(block.equalsIgnoreCase("60")){
            Intent intent61 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent61.putExtra("dictionary"," 11 = 12 \n 13 = 16 \n 37 = 44 \n 54 = 58 \n 62 = ? ");
            intent61.putExtra("answer","64");
            intent61.putExtra("progress",61);
            intent61.putExtra("lvl",61);
            intent61.putExtra("money_data",money);
            startActivityForResult(intent61,61);

        } else if(block.equalsIgnoreCase("61")){
            Intent intent62 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent62.putExtra("dictionary","Найдите ?");
            intent62.putExtra("answer","20");
            intent62.putExtra("progress",62);
            intent62.putExtra("lvl",62);
            intent62.putExtra("money_data",money);
            startActivityForResult(intent62,62);

        } else if(block.equalsIgnoreCase("62")){
            Intent intent63 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent63.putExtra("dictionary","Найдите ?");
            intent63.putExtra("answer","25");
            intent63.putExtra("progress",63);
            intent63.putExtra("lvl",63);
            intent63.putExtra("money_data",money);
            startActivityForResult(intent63,63);

        } else if(block.equalsIgnoreCase("63")){
            Intent intent64 = new Intent(Math_text_and_signs_after_lvl.this, SignsCampaign.class);
            intent64.putExtra("dictionary","Найдите ?");
            intent64.putExtra("answer","+");
            intent64.putExtra("answer1","-");
            intent64.putExtra("answer2","+");
            intent64.putExtra("progress",64);
            intent64.putExtra("lvl",64);
            intent64.putExtra("money_data",money);
            startActivityForResult(intent64,64);

        } else if(block.equalsIgnoreCase("64")){
            Intent intent65 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent65.putExtra("dictionary"," 12  4  = 316 \n 2  35 = 48 \n 78  1 = 151 \n 90  6 = ? ");
            intent65.putExtra("answer","936");
            intent65.putExtra("progress",65);
            intent65.putExtra("lvl",65);
            intent65.putExtra("money_data",money);
            startActivityForResult(intent65,65);

        } else if(block.equalsIgnoreCase("65")){
            Intent intent66 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent66.putExtra("dictionary","Назовите одно из двух чисел, у которых количество цифр равно количеству букв, составляющих название каждого из этих чисел");
            intent66.putExtra("answer","100");
            intent66.putExtra("answer2","1000000");
            intent66.putExtra("progress",66);
            intent66.putExtra("lvl",66);
            intent66.putExtra("money_data",money);
            startActivityForResult(intent66,66);

        } else if(block.equalsIgnoreCase("66")){
            Intent intent67 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent67.putExtra("dictionary"," 2 | 8 | 3 | 27 | 4 | ? ");
            intent67.putExtra("answer","64");
            intent67.putExtra("progress",67);
            intent67.putExtra("lvl",67);
            intent67.putExtra("money_data",money);
            startActivityForResult(intent67,67);

        } else if(block.equalsIgnoreCase("67")){
            Intent intent68 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent68.putExtra("dictionary","9+2=711\n14+6=820\n17+11=628\n12+3 = ?");
            intent68.putExtra("answer","915");
            intent68.putExtra("progress",68);
            intent68.putExtra("lvl",68);
            intent68.putExtra("money_data",money);
            startActivityForResult(intent68,68);

        } else if(block.equalsIgnoreCase("68")){
            Intent intent69 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent69.putExtra("dictionary"," 273 = 7 \n 98162 = 1 \n 73472 = 4 \n 691 = ? ");
            intent69.putExtra("answer","9");
            intent69.putExtra("progress",69);
            intent69.putExtra("lvl",69);
            intent69.putExtra("money_data",money);
            startActivityForResult(intent69,69);

        } else if(block.equalsIgnoreCase("69")){
            Intent intent70 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent70.putExtra("dictionary","Найдите ?");
            intent70.putExtra("answer","48");
            intent70.putExtra("progress",70);
            intent70.putExtra("lvl",70);
            intent70.putExtra("money_data",money);
            startActivityForResult(intent70,70);

        } else if(block.equalsIgnoreCase("70")){
            Intent intent71 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent71.putExtra("dictionary","Найдите ?");
            intent71.putExtra("answer","9");
            intent71.putExtra("size","3x3");
            intent71.putExtra("progress",71);
            intent71.putExtra("lvl",71);
            intent71.putExtra("money_data",money);
            startActivityForResult(intent71,71);

        } else if(block.equalsIgnoreCase("71")){
            Intent intent72 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent72.putExtra("dictionary","2+3=10\n8+4=96\n7+2=63\n6+5=66\n9+8=?");
            intent72.putExtra("answer","153");
            intent72.putExtra("progress",72);
            intent72.putExtra("lvl",72);
            intent72.putExtra("money_data",money);
            startActivityForResult(intent72,72);

        } else if(block.equalsIgnoreCase("72")){
            Intent intent73 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent73.putExtra("dictionary"," 523 = 19 \n 810 = 8 \n 625 = 37 \n 947 = ? ");
            intent73.putExtra("answer","85");
            intent73.putExtra("progress",73);
            intent73.putExtra("lvl",73);
            intent73.putExtra("money_data",money);
            startActivityForResult(intent73,73);

        } else if(block.equalsIgnoreCase("73")){
            Intent intent74 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent74.putExtra("dictionary"," 1 | 4 | 16 | 64 | ? ");
            intent74.putExtra("answer","256");
            intent74.putExtra("progress",74);
            intent74.putExtra("lvl",74);
            intent74.putExtra("money_data",money);
            startActivityForResult(intent74,74);

        } else if(block.equalsIgnoreCase("74")){
            Intent intent75 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent75.putExtra("dictionary","3=18\n4=32\n5=50\n6=72\n7=98\n10=?");
            intent75.putExtra("answer","200");
            intent75.putExtra("progress",75);
            intent75.putExtra("lvl",75);
            intent75.putExtra("money_data",money);
            startActivityForResult(intent75,75);

        } else if(block.equalsIgnoreCase("75")){
            Intent intent76 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent76.putExtra("dictionary","Найди ?");
            intent76.putExtra("answer","2");
            intent76.putExtra("progress",76);
            intent76.putExtra("lvl",76);
            intent76.putExtra("money_data",money);
            startActivityForResult(intent76,76);

        } else if(block.equalsIgnoreCase("76")){
            Intent intent77 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent77.putExtra("dictionary"," 1 4 3 = 31 \n 9 9 7 = 79 \n 3 6 6 = 63 \n 6 0 8 = ?? ");
            intent77.putExtra("answer","86");
            intent77.putExtra("progress",77);
            intent77.putExtra("lvl",77);
            intent77.putExtra("money_data",money);
            startActivityForResult(intent77,77);

        } else if(block.equalsIgnoreCase("77")){
            Intent intent78 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent78.putExtra("dictionary","Найдите ?");
            intent78.putExtra("answer","5");
            intent78.putExtra("size","3x3");
            intent78.putExtra("progress",78);
            intent78.putExtra("lvl",78);
            intent78.putExtra("money_data",money);
            startActivityForResult(intent78,78);

        } else if(block.equalsIgnoreCase("78")){
            Intent intent79 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent79.putExtra("dictionary","6636 | 3\n8118 | 4\n2242 | 0\n3316 | ?");
            intent79.putExtra("answer","1");
            intent79.putExtra("progress",79);
            intent79.putExtra("lvl",79);
            intent79.putExtra("money_data",money);
            startActivityForResult(intent79,79);

        } else if(block.equalsIgnoreCase("79")){
            Intent intent80 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent80.putExtra("dictionary"," 1 | 2 | 6 | 24 | ? ");
            intent80.putExtra("answer","120");
            intent80.putExtra("progress",80);
            intent80.putExtra("lvl",80);
            intent80.putExtra("money_data",money);
            startActivityForResult(intent80,80);

        } else if(block.equalsIgnoreCase("80")){
            Intent intent81 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent81.putExtra("dictionary","Найдите ?");
            intent81.putExtra("answer","8");
            intent81.putExtra("progress",81);
            intent81.putExtra("lvl",81);
            intent81.putExtra("money_data",money);
            startActivityForResult(intent81,81);

        } else if(block.equalsIgnoreCase("81")){
            Intent intent82 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent82.putExtra("dictionary","Найди ?");
            intent82.putExtra("answer","52");
            intent82.putExtra("progress",82);
            intent82.putExtra("lvl",82);
            intent82.putExtra("money_data",money);
            startActivityForResult(intent82,82);

        } else if(block.equalsIgnoreCase("82")){
            Intent intent83 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent83.putExtra("dictionary","Найдите ?");
            intent83.putExtra("answer","68");
            intent83.putExtra("progress",83);
            intent83.putExtra("lvl",83);
            intent83.putExtra("money_data",money);
            startActivityForResult(intent83,83);

        } else if(block.equalsIgnoreCase("83")){
            Intent intent84 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent84.putExtra("dictionary","Найдите x,y,z?");
            intent84.putExtra("answer","2");
            intent84.putExtra("answer1","1");
            intent84.putExtra("answer2","3");
            intent84.putExtra("progress",84);
            intent84.putExtra("lvl",84);
            intent84.putExtra("money_data",money);
            startActivityForResult(intent84,84);

        } else if(block.equalsIgnoreCase("84")){
            Intent intent85 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent85.putExtra("dictionary","A+A = 18\nA+A-B = 11\nB*A+C = 80\nC-B-D=A\nD - ?");
            intent85.putExtra("answer","1");
            intent85.putExtra("progress",85);
            intent85.putExtra("lvl",85);
            intent85.putExtra("money_data",money);
            startActivityForResult(intent85,85);

        } else if(block.equalsIgnoreCase("85")){
            Intent intent86 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent86.putExtra("dictionary","Найди ?");
            intent86.putExtra("answer","10");
            intent86.putExtra("progress",86);
            intent86.putExtra("lvl",86);
            intent86.putExtra("money_data",money);
            startActivityForResult(intent86,86);

        } else if(block.equalsIgnoreCase("86")){
            Intent intent87 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent87.putExtra("dictionary","Найдите ?");
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
            Intent intent88 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent88.putExtra("dictionary","Два человека едят сливы. Если первый отдаст второму 2 сливы, то у них будет поровну. Если второй отдаст первому 2 сливы, то у первого окажется в 2 раза больше слив. Сколько слив у каждого?");
            intent88.putExtra("answer","10");
            intent88.putExtra("answer2","14");
            intent88.putExtra("progress",88);
            intent88.putExtra("lvl",88);
            intent88.putExtra("money_data",money);
            startActivityForResult(intent88,88);

        } else if(block.equalsIgnoreCase("88")){
            Intent intent89 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent89.putExtra("dictionary","A+B*A = 55\nC+A+D = 12\nD+B-C = 9\nB-D+C=11\nD+C*B - ?");
            intent89.putExtra("answer","10");
            intent89.putExtra("progress",89);
            intent89.putExtra("lvl",89);
            intent89.putExtra("money_data",money);
            startActivityForResult(intent89,89);

        } else if(block.equalsIgnoreCase("89")){
            Intent intent90 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent90.putExtra("dictionary","Найди ?");
            intent90.putExtra("answer","11");
            intent90.putExtra("progress",90);
            intent90.putExtra("lvl",90);
            intent90.putExtra("money_data",money);
            startActivityForResult(intent90,90);

        } else if(block.equalsIgnoreCase("90")){
            Intent intent91 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent91.putExtra("dictionary","Найдите ?");
            intent91.putExtra("answer","14");
            intent91.putExtra("progress",91);
            intent91.putExtra("lvl",91);
            intent91.putExtra("money_data",money);
            startActivityForResult(intent91,91);

        } else if(block.equalsIgnoreCase("91")){
            Intent intent92 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent92.putExtra("dictionary","Когда моему отцу был 31 год, мне было 8 лет, а теперь отец старше меня вдвое. Сколько мне лет теперь?");
            intent92.putExtra("answer","23");
            intent92.putExtra("progress",92);
            intent92.putExtra("lvl",92);
            intent92.putExtra("money_data",money);
            startActivityForResult(intent92,92);

        } else if(block.equalsIgnoreCase("92")){
            Intent intent93 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent93.putExtra("dictionary","Найдите ?");
            intent93.putExtra("answer","6");
            intent93.putExtra("size","3x3");
            intent93.putExtra("progress",93);
            intent93.putExtra("lvl",93);
            intent93.putExtra("money_data",money);
            startActivityForResult(intent93,93);

        } else if(block.equalsIgnoreCase("93")){
            Intent intent94 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent94.putExtra("dictionary"," 4 | 7 | 12 | 21 | 38 | ? ");
            intent94.putExtra("answer","71");
            intent94.putExtra("progress",94);
            intent94.putExtra("lvl",94);
            intent94.putExtra("money_data",money);
            startActivityForResult(intent94,94);

        } else if(block.equalsIgnoreCase("94")){
            Intent intent95 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent95.putExtra("dictionary","Сколько кругов вы видите? Подумайте!");
            intent95.putExtra("answer","9");
            intent95.putExtra("progress",95);
            intent95.putExtra("lvl",95);
            intent95.putExtra("money_data",money);
            startActivityForResult(intent95,95);

        } else if(block.equalsIgnoreCase("95")){
            Intent intent96 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent96.putExtra("dictionary","Найди ?");
            intent96.putExtra("answer","29");
            intent96.putExtra("progress",96);
            intent96.putExtra("lvl",96);
            intent96.putExtra("money_data",money);
            startActivityForResult(intent96,96);

        } else if(block.equalsIgnoreCase("96")){
            Intent intent97 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent97.putExtra("dictionary","1+1+1+1+1\n1+1+1+1+1\n1+1*0+1 = ?");
            intent97.putExtra("answer","2");
            intent97.putExtra("progress",97);
            intent97.putExtra("lvl",97);
            intent97.putExtra("money_data",money);
            startActivityForResult(intent97,97);

        } else if(block.equalsIgnoreCase("97")){
            Intent intent98 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent98.putExtra("dictionary","7+3=41021\n8+3=51124\n5+4=1920\n9+6=31554\n7+4=31128\n5+2=3710\n13+6=71978\n17+8=?");
            intent98.putExtra("answer","925136");
            intent98.putExtra("progress",98);
            intent98.putExtra("lvl",98);
            intent98.putExtra("money_data",money);
            startActivityForResult(intent98,98);

        } else if(block.equalsIgnoreCase("98")){
            Intent intent99 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent99.putExtra("dictionary","Найдите ?");
            intent99.putExtra("answer","51");
            intent99.putExtra("size","4x4");
            intent99.putExtra("progress",99);
            intent99.putExtra("lvl",99);
            intent99.putExtra("money_data",money);
            startActivityForResult(intent99,99);

        } else if(block.equalsIgnoreCase("99")){
            Intent intent100 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent100.putExtra("dictionary","Найдите ?");
            intent100.putExtra("answer","24");
            intent100.putExtra("size","3x3");
            intent100.putExtra("progress",100);
            intent100.putExtra("lvl",100);
            intent100.putExtra("money_data",money);
            startActivityForResult(intent100,100);

        } else if(block.equalsIgnoreCase("100")){
            Intent intent101 = new Intent(Math_text_and_signs_after_lvl.this, PictureCampaignMath.class);
            intent101.putExtra("dictionary","Найди ?");
            intent101.putExtra("answer","7");
            intent101.putExtra("progress",101);
            intent101.putExtra("lvl",101);
            intent101.putExtra("money_data",money);
            startActivityForResult(intent101,101);

        } else if(block.equalsIgnoreCase("101")){
            Intent intent102 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent102.putExtra("dictionary","Найдите ?");
            intent102.putExtra("answer","18");
            intent102.putExtra("size","5x5");
            intent102.putExtra("progress",102);
            intent102.putExtra("lvl",102);
            intent102.putExtra("money_data",money);
            startActivityForResult(intent102,102);

        } else if(block.equalsIgnoreCase("102")){
            Intent intent103 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent103.putExtra("dictionary","8+2=16106\n5+4=2091\n9+6=54153\n7+5=35122\n20+3=602317\n18+4=?");
            intent103.putExtra("answer","722214");
            intent103.putExtra("progress",103);
            intent103.putExtra("lvl",103);
            intent103.putExtra("money_data",money);
            startActivityForResult(intent103,103);

        } else if(block.equalsIgnoreCase("103")){
            Intent intent104 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent104.putExtra("dictionary","Найдите ?");
            intent104.putExtra("answer","720");
            intent104.putExtra("size","4x4");
            intent104.putExtra("progress",104);
            intent104.putExtra("lvl",104);
            intent104.putExtra("money_data",money);
            startActivityForResult(intent104,104);

        } else if(block.equalsIgnoreCase("104")){
            Intent intent105 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent105.putExtra("dictionary","Если сложить возраст отца и сына (т.е. количество их лет), то получим число 66. Если цифры числа возраста отца поменять местами, то получится число возраста сына. Возраст сына не менее 7 лет. Возраст отца не более 59 лет. Ответьте, сколько лет отцу и сыну?");
            intent105.putExtra("answer","51");
            intent105.putExtra("answer1","15");
            intent105.putExtra("progress",105);
            intent105.putExtra("lvl",105);
            intent105.putExtra("money_data",money);
            startActivityForResult(intent105,105);

        } else if(block.equalsIgnoreCase("105")){
            Intent intent106 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent106.putExtra("dictionary","Найдите ?");
            intent106.putExtra("answer","4");
            intent106.putExtra("size","4x4");
            intent106.putExtra("progress",106);
            intent106.putExtra("lvl",106);
            intent106.putExtra("money_data",money);
            startActivityForResult(intent106,106);

        } else if(block.equalsIgnoreCase("106")){
            Intent intent107 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent107.putExtra("dictionary","Найдите ?");
            intent107.putExtra("answer","44");
            intent107.putExtra("size","4x4");
            intent107.putExtra("progress",107);
            intent107.putExtra("lvl",107);
            intent107.putExtra("money_data",money);
            startActivityForResult(intent107,107);

        } else if(block.equalsIgnoreCase("107")){
            Intent intent108 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent108.putExtra("dictionary"," 6 | 14 | 36 | 98 | ? ");
            intent108.putExtra("answer","276");
            intent108.putExtra("progress",108);
            intent108.putExtra("lvl",108);
            intent108.putExtra("money_data",money);
            startActivityForResult(intent108,108);

        } else if(block.equalsIgnoreCase("108")){
            Intent intent109 = new Intent(Math_text_and_signs_after_lvl.this,TextQuestionsCamplaign.class);
            intent109.putExtra("dictionary","Сегодня у Карлсона День рождения. А через 6 лет ему будет в 1.25 раз больше, чем 4 года назад.Сколько лет исполнилось Карлсону?");
            intent109.putExtra("answer","44");
            intent109.putExtra("progress",109);
            intent109.putExtra("lvl",109);
            intent109.putExtra("money_data",money);
            startActivityForResult(intent109,109);

        } else if(block.equalsIgnoreCase("109")){
            Intent intent110 = new Intent(Math_text_and_signs_after_lvl.this, ButtonsCampaign.class);
            intent110.putExtra("dictionary","Найдите x,y,z");
            intent110.putExtra("answer","1");
            intent110.putExtra("answer1","8");
            intent110.putExtra("answer2","5");
            intent110.putExtra("size","5x5");
            intent110.putExtra("progress",110);
            intent110.putExtra("lvl",110);
            intent110.putExtra("money_data",money);
            startActivityForResult(intent110,110);

        } else if(block.equalsIgnoreCase("110")){
            finish();
        }
    }
}
