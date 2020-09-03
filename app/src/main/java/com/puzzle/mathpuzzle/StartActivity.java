package com.puzzle.mathpuzzle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.puzzle.mathpuzzle.Campaign.CampaignMath.MapLevel;
import com.puzzle.mathpuzzle.CampaignSuma.MapLevelSuma;

import java.util.Locale;
import java.util.Random;


public class StartActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    SharedPreferences LocateS,prefsFirst;
    SharedPreferences.Editor LocateSEdit,prefEditFirst;

    Random r;

    String LocateSave = "";
    void loadLocate() {
        LocateS = getSharedPreferences("LocaleSave", MODE_PRIVATE);
        LocateSave = LocateS.getString("save", "");
    }


    boolean firstplay = false;
    void firstPlay() {
        prefsFirst = getSharedPreferences("FirstPlay", MODE_PRIVATE);
        firstplay = prefsFirst.getBoolean("firstPlay", false);
    }


    Button mathLvl,sumLvl,languageB,share,playMarket,Exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mathLvl = (Button) findViewById(R.id.mathLvl);
        sumLvl = (Button) findViewById(R.id.sumLvl);
        languageB = (Button) findViewById(R.id.languageB);
        share = (Button) findViewById(R.id.share);
        playMarket = (Button) findViewById(R.id.playMarket);
        Exit = (Button) findViewById(R.id.Exit);

        loadLocate();
        if(!LocateSave.equalsIgnoreCase("")) {
            if (LocateSave.equalsIgnoreCase("ru")) {
                Locale locale = new Locale("ru");
                changeLocale(locale);
            } else if (LocateSave.equalsIgnoreCase("en")) {
                Locale locale = new Locale("en");
                changeLocale(locale);
            } else if (LocateSave.equalsIgnoreCase("uk")) {
                Locale locale = new Locale("uk");
                changeLocale(locale);
            }
            mathLvl.setText(getResources().getText(R.string.math_puzzle_levelsStart));
            sumLvl.setText(getResources().getText(R.string.sum_of_numbers_levelsStart));
            languageB.setText(getResources().getText(R.string.languageStart));
            share.setText(getResources().getText(R.string.share_friendsStart));
            Exit.setText(getResources().getText(R.string.exitStart));
        }

        firstPlay();
        if(!firstplay){
            prefsFirst = getSharedPreferences("FirstPlay", MODE_PRIVATE);
            prefEditFirst = prefsFirst.edit();
            firstplay = true;
            prefEditFirst.putBoolean("firstPlay",firstplay);
            prefEditFirst.apply();
        }
        r = new Random();

    }

    public void StartGame(View view) {
        Intent intent = new Intent(StartActivity.this, MapLevel.class);
        startActivity(intent);
    }


    public void StartGame2(View view) {
        Intent intent = new Intent(StartActivity.this, MapLevelSuma.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        if(backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            String level = getResources().getString(R.string.clickExit);
            backToast = Toast.makeText(this, level, Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();

    }



    public void Setting(View view) {
       //Intent intent = new Intent(StartActivity.this, Setting.class);
       //startActivity(intent);
    }

    public void Share(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.puzzle.mathpuzzle");
        startActivity(intent);
    }


    public void Like(View view) {
        String lan = "";
        String Yes = "";
        String No = "";
        String GoPlayMarket = getResources().getString(R.string.GoPlayMarket);
        String yes1 = getResources().getString(R.string.yes1);
        String no1 = getResources().getString(R.string.no1);
        lan = GoPlayMarket;
        Yes = yes1;
        No = no1;

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(StartActivity.this);
        // Указываем Title
        alertDialog.setTitle(lan);

        // Обработчик на нажатие ДА
        alertDialog.setPositiveButton(Yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.puzzle.mathpuzzle"));
                startActivity(browserIntent);
                dialog.cancel();
            }
        });

        // Обработчик на нажатие НЕТ
        alertDialog.setNegativeButton(No, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Код который выполнится после закрытия окна
                dialog.cancel();
            }
        });

        // показываем Alert
        alertDialog.show();

    }

    public void Language(View view) {
        LocateS = getSharedPreferences("LocaleSave", MODE_PRIVATE);
        LocateSEdit = LocateS.edit();
        String lan = getResources().getString(R.string.language);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(lan);

        String[] words = {"Русский", "English", "Українська"};
        builder.setItems(words, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        LocateSave = "ru";
                        Locale locale = new Locale("ru");
                        changeLocale(locale);
                        String ChangeLang = getResources().getString(R.string.Changelanguage);
                        Toast.makeText(StartActivity.this, ChangeLang, Toast.LENGTH_SHORT).show();

                        mathLvl.setText(getResources().getText(R.string.math_puzzle_levelsStart));
                        sumLvl.setText(getResources().getText(R.string.sum_of_numbers_levelsStart));
                        languageB.setText(getResources().getText(R.string.languageStart));
                        share.setText(getResources().getText(R.string.share_friendsStart));
                        Exit.setText(getResources().getText(R.string.exitStart));

                        LocateSEdit.putString("save",LocateSave);
                        LocateSEdit.apply();
                        break;
                    case 1:
                        LocateSave = "en";
                        Locale locale2 = new Locale("en");
                        changeLocale(locale2);
                        String ChangeLang2 = getResources().getString(R.string.Changelanguage);
                        Toast.makeText(StartActivity.this, ChangeLang2, Toast.LENGTH_SHORT).show();

                        mathLvl.setText(getResources().getText(R.string.math_puzzle_levelsStart));
                        sumLvl.setText(getResources().getText(R.string.sum_of_numbers_levelsStart));
                        languageB.setText(getResources().getText(R.string.languageStart));
                        share.setText(getResources().getText(R.string.share_friendsStart));
                        Exit.setText(getResources().getText(R.string.exitStart));

                        LocateSEdit.putString("save",LocateSave);
                        LocateSEdit.apply();
                        break;
                    case 2:
                        LocateSave = "uk";
                        Locale locale3 = new Locale("uk");
                        changeLocale(locale3);
                        String ChangeLang3 = getResources().getString(R.string.Changelanguage);
                        Toast.makeText(StartActivity.this, ChangeLang3, Toast.LENGTH_SHORT).show();

                        mathLvl.setText(getResources().getText(R.string.math_puzzle_levelsStart));
                        sumLvl.setText(getResources().getText(R.string.sum_of_numbers_levelsStart));
                        languageB.setText(getResources().getText(R.string.languageStart));
                        share.setText(getResources().getText(R.string.share_friendsStart));
                        Exit.setText(getResources().getText(R.string.exitStart));

                        LocateSEdit.putString("save",LocateSave);
                        LocateSEdit.apply();
                        break;
                }

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private void changeLocale(Locale locale){
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        getBaseContext().getResources()
                .updateConfiguration(configuration,
                        getBaseContext()
                                .getResources()
                                .getDisplayMetrics());
    }

    public void Exit(View view) {
        finish();
    }
}
