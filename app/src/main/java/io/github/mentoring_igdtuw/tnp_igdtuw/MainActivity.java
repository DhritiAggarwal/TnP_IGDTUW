package io.github.mentoring_igdtuw.tnp_igdtuw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    Button about,login,register,contact,stats,whyrec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about = (Button)findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });
        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
        whyrec = (Button)findViewById(R.id.whyrec);
        whyrec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, WhyrecruitActivity.class);
                startActivity(i);
            }
        });
        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
        stats = (Button)findViewById(R.id.stats);
        stats.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, StatsActivity.class);
                startActivity(i);
            }
        });
         contact= (Button)findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, ContactActivity.class);
                startActivity(i);
            }
        });



    }
}
