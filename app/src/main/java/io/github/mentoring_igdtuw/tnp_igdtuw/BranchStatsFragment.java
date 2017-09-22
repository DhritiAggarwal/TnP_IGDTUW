package io.github.mentoring_igdtuw.tnp_igdtuw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BranchStatsFragment extends Fragment {

    private ImageView pieChart, data;

    public BranchStatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_branch_stats, container, false);
        pieChart = (ImageView) view.findViewById(R.id.piechart);
        data = (ImageView) view.findViewById((R.id.data));
        if (getArguments() != null) {
            String branch = getArguments().getString("branch");
            if (branch == "cse") {
                pieChart.setImageResource(R.drawable.cse_pie_chart);
                data.setImageResource(R.drawable.cse_stats);
            } else if (branch == "it") {
                pieChart.setImageResource(R.drawable.it_pie_chart);
                data.setImageResource(R.drawable.it_stats);
            } else if (branch == "ece") {
                pieChart.setImageResource(R.drawable.ece_pie_chart);
                data.setImageResource(R.drawable.ece_stats);
            } else if (branch == "mae") {
                pieChart.setImageResource(R.drawable.mae_pie_chart);
                data.setImageResource(R.drawable.mae_stats);
            }
        }
        return view;
    }

}
