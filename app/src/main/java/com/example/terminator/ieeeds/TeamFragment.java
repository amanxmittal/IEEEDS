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
    private CardView cvteamExe1, cvteamExe2, cvteamExe3, cvteamExe4, cvteamSsn1, cvteamSsn2;



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
        cvteamSsn1 = (CardView) view.findViewById(R.id.cvteamSsn1);
        cvteamSsn2 = (CardView) view.findViewById(R.id.cvteamSsn2);

        buttonExecom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonExecom.setTextColor(Color.parseColor("#000000"));
                buttonSsn.setTextColor(Color.parseColor("#7c7c7c"));

                cvteamExe1.setVisibility(View.VISIBLE);
                cvteamExe2.setVisibility(View.VISIBLE);
                cvteamExe3.setVisibility(View.VISIBLE);
                cvteamExe4.setVisibility(View.VISIBLE);
                cvteamSsn1.setVisibility(View.GONE);
                cvteamSsn2.setVisibility(View.GONE);

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
                cvteamSsn1.setVisibility(View.VISIBLE);
                cvteamSsn2.setVisibility(View.VISIBLE);

            }
        });


        return view;
    }

}
