package io.github.mentoring_igdtuw.tnp_igdtuw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Admin on 20-09-2017.
 */



public class LoginActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    public Button bt1;

    public void next() {
        bt1 = (Button) findViewById(R.id.button_1);
        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent toy = new Intent(LoginActivity.this,LoginActivity2.class);
                startActivity(toy);
            }
        });
    }


    public void rbClick(View v)
    {
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(radiobuttonid);

        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rg = (RadioGroup)findViewById(R.id.r_group);
        next();
    }
}
