package io.github.mentoring_igdtuw.tnp_igdtuw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static io.github.mentoring_igdtuw.tnp_igdtuw.R.id.register;

/**
 * Created by Admin on 20-09-2017.
 */

public class RegisterActivity extends AppCompatActivity {
    Button student,recruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
         student = (Button)findViewById(R.id.student);
        student.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(RegisterActivity.this, RegisterActivity_student.class);
                startActivity(i);
            }
        });
         recruit = (Button)findViewById(R.id.recruit);
        recruit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent();
                i1.setClass(RegisterActivity.this, RegisterActivity_recruiter.class);
                startActivity(i1);
            }
        });
    }
}
