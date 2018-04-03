package com.example.terminator.ieeeds;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeamFragment extends Fragment {

    private Button buttonExecom, buttonSsn;
    private CardView cvteamExe1, cvteamExe2, cvteamExe3, cvteamExe4, cvteamExe5, cvteamExe6, cvteamExe7;
    private CardView cvteamSsn1, cvteamSsn2, cvteamSsn3, cvteamSsn4, cvteamSsn5, cvteamSsn6, cvteamSsn7, cvteamSsn8, cvteamSsn9, cvteamSsn10;
    private CardView cvteamSsn11, cvteamSsn12, cvteamSsn13, cvteamSsn14, cvteamSsn15, cvteamSsn16, cvteamSsn17, cvteamSsn18, cvteamSsn19;



    public TeamFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_team, container, false);

        buttonExecom = (Button) view.findViewById(R.id.buttonExecom);
        buttonSsn = (Button)    view.findViewById(R.id.buttonSsn);

        cvteamExe1 = (CardView) view.findViewById(R.id.cvteamExe1);
        cvteamExe2 = (CardView) view.findViewById(R.id.cvteamExe2);
        cvteamExe3 = (CardView) view.findViewById(R.id.cvteamExe3);
        cvteamExe4 = (CardView) view.findViewById(R.id.cvteamExe4);
        cvteamExe5 = (CardView) view.findViewById(R.id.cvteamExe5);
        cvteamExe6 = (CardView) view.findViewById(R.id.cvteamExe6);
        cvteamExe7 = (CardView) view.findViewById(R.id.cvteamExe7);

        cvteamSsn1 = (CardView) view.findViewById(R.id.cvteamSsn1);
        cvteamSsn2 = (CardView) view.findViewById(R.id.cvteamSsn2);
        cvteamSsn3 = (CardView) view.findViewById(R.id.cvteamSsn3);
        cvteamSsn4 = (CardView) view.findViewById(R.id.cvteamSsn4);
        cvteamSsn5 = (CardView) view.findViewById(R.id.cvteamSsn5);
        cvteamSsn6 = (CardView) view.findViewById(R.id.cvteamSsn6);
        cvteamSsn7 = (CardView) view.findViewById(R.id.cvteamSsn7);
        cvteamSsn8 = (CardView) view.findViewById(R.id.cvteamSsn8);
        cvteamSsn9 = (CardView) view.findViewById(R.id.cvteamSsn9);
        cvteamSsn10= (CardView) view.findViewById(R.id.cvteamSsn10);
        cvteamSsn11= (CardView) view.findViewById(R.id.cvteamSsn11);
        cvteamSsn12= (CardView) view.findViewById(R.id.cvteamSsn12);
        cvteamSsn13= (CardView) view.findViewById(R.id.cvteamSsn13);
        cvteamSsn14= (CardView) view.findViewById(R.id.cvteamSsn14);
        cvteamSsn15= (CardView) view.findViewById(R.id.cvteamSsn15);
        cvteamSsn16= (CardView) view.findViewById(R.id.cvteamSsn16);
        cvteamSsn17= (CardView) view.findViewById(R.id.cvteamSsn17);
        cvteamSsn18= (CardView) view.findViewById(R.id.cvteamSsn18);
        cvteamSsn19= (CardView) view.findViewById(R.id.cvteamSsn19);


        buttonExecom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonExecom.setTextColor(Color.parseColor("#000000"));
                buttonSsn.setTextColor(Color.parseColor("#7c7c7c"));

                cvteamExe1.setVisibility(View.VISIBLE);
                cvteamExe2.setVisibility(View.VISIBLE);
                cvteamExe3.setVisibility(View.VISIBLE);
                cvteamExe4.setVisibility(View.VISIBLE);
                cvteamExe5.setVisibility(View.VISIBLE);
                cvteamExe6.setVisibility(View.VISIBLE);
                cvteamExe7.setVisibility(View.VISIBLE);

                cvteamSsn1.setVisibility(View.GONE);
                cvteamSsn2.setVisibility(View.GONE);
                cvteamSsn3.setVisibility(View.GONE);
                cvteamSsn4.setVisibility(View.GONE);
                cvteamSsn5.setVisibility(View.GONE);
                cvteamSsn6.setVisibility(View.GONE);
                cvteamSsn7.setVisibility(View.GONE);
                cvteamSsn8.setVisibility(View.GONE);
                cvteamSsn9.setVisibility(View.GONE);
                cvteamSsn10.setVisibility(View.GONE);
                cvteamSsn11.setVisibility(View.GONE);
                cvteamSsn12.setVisibility(View.GONE);
                cvteamSsn13.setVisibility(View.GONE);
                cvteamSsn14.setVisibility(View.GONE);
                cvteamSsn15.setVisibility(View.GONE);
                cvteamSsn16.setVisibility(View.GONE);
                cvteamSsn17.setVisibility(View.GONE);
                cvteamSsn18.setVisibility(View.GONE);
                cvteamSsn19.setVisibility(View.GONE);

            }
        });

        buttonSsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonExecom.setTextColor(Color.parseColor("#7c7c7c"));
                buttonSsn.setTextColor(Color.parseColor("#000000"));

                cvteamExe1.setVisibility(View.GONE);
                cvteamExe2.setVisibility(View.GONE);
                cvteamExe3.setVisibility(View.GONE);
                cvteamExe4.setVisibility(View.GONE);
                cvteamExe5.setVisibility(View.GONE);
                cvteamExe6.setVisibility(View.GONE);
                cvteamExe7.setVisibility(View.GONE);

                cvteamSsn1.setVisibility(View.VISIBLE);
                cvteamSsn2.setVisibility(View.VISIBLE);
                cvteamSsn3.setVisibility(View.VISIBLE);
                cvteamSsn4.setVisibility(View.VISIBLE);
                cvteamSsn5.setVisibility(View.VISIBLE);
                cvteamSsn6.setVisibility(View.VISIBLE);
                cvteamSsn7.setVisibility(View.VISIBLE);
                cvteamSsn8.setVisibility(View.VISIBLE);
                cvteamSsn9.setVisibility(View.VISIBLE);
                cvteamSsn10.setVisibility(View.VISIBLE);
                cvteamSsn11.setVisibility(View.VISIBLE);
                cvteamSsn12.setVisibility(View.VISIBLE);
                cvteamSsn13.setVisibility(View.VISIBLE);
                cvteamSsn14.setVisibility(View.VISIBLE);
                cvteamSsn15.setVisibility(View.VISIBLE);
                cvteamSsn16.setVisibility(View.VISIBLE);
                cvteamSsn17.setVisibility(View.VISIBLE);
                cvteamSsn18.setVisibility(View.VISIBLE);
                cvteamSsn19.setVisibility(View.VISIBLE);

            }
        });


        return view;
    }

}
