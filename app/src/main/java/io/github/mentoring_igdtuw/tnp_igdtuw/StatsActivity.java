package io.github.mentoring_igdtuw.tnp_igdtuw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 20-09-2017.
 */

public class StatsActivity extends AppCompatActivity {

    private Button cse, it, ece, mae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        final Bundle bundle = new Bundle();
        final BranchStatsFragment stats = new BranchStatsFragment();

        cse = (Button) findViewById(R.id.cse);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("branch", "cse");
                stats.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.stats_container, stats).addToBackStack(null).commit();
            }
        });

        it = (Button) findViewById(R.id.it);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("branch", "it");
                stats.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.stats_container, stats).addToBackStack(null).commit();
            }
        });

        ece = (Button) findViewById(R.id.ece);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("branch", "ece");
                stats.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.stats_container, stats).addToBackStack(null).commit();
            }
        });

        mae = (Button) findViewById(R.id.mae);
        mae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("branch", "mae");
                stats.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.stats_container, stats).addToBackStack(null).commit();
            }
        });
    }
}
