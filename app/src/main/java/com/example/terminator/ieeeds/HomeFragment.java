package com.example.terminator.ieeeds;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment  {



    private CardView cvEventDetail1, cvEventDetail2, cvEventDetail3, cvEventDetail4;
    private Button buttonEvent1, buttonEvent2, buttonEvent3, buttonEvent4;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        cvEventDetail1 = (CardView) view.findViewById(R.id.cvEventDetail1);
        cvEventDetail2 = (CardView) view.findViewById(R.id.cvEventDetail2);
        cvEventDetail3 = (CardView) view.findViewById(R.id.cvEventDetail3);
        cvEventDetail4 = (CardView) view.findViewById(R.id.cvEventDetail4);

        buttonEvent1 = (Button) view.findViewById(R.id.buttonEventLink1);
        buttonEvent2 = (Button) view.findViewById(R.id.buttonEventLink2);
        buttonEvent3 = (Button) view.findViewById(R.id.buttonEventLink3);
        buttonEvent4 = (Button) view.findViewById(R.id.buttonEventLink4);

        cvEventDetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvEventDetail1.setVisibility(View.GONE);
                cvEventDetail2.setVisibility(View.VISIBLE);
                cvEventDetail3.setVisibility(View.GONE);
                cvEventDetail4.setVisibility(View.GONE);
            }
        });

        cvEventDetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvEventDetail1.setVisibility(View.GONE);
                cvEventDetail2.setVisibility(View.GONE);
                cvEventDetail3.setVisibility(View.VISIBLE);
                cvEventDetail4.setVisibility(View.GONE);
            }
        });

        cvEventDetail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvEventDetail1.setVisibility(View.GONE);
                cvEventDetail2.setVisibility(View.GONE);
                cvEventDetail3.setVisibility(View.GONE);
                cvEventDetail4.setVisibility(View.VISIBLE);
            }
        });

        cvEventDetail4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvEventDetail1.setVisibility(View.VISIBLE);
                cvEventDetail2.setVisibility(View.GONE);
                cvEventDetail3.setVisibility(View.GONE);
                cvEventDetail4.setVisibility(View.GONE);
            }
        });

        buttonEvent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://bit.ly/2EeEb8d"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        buttonEvent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://bit.ly/2q1ehPR"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        buttonEvent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://bit.ly/2JguCcn"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        buttonEvent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.ieeedsc.in"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        //cvEventDetail1.setOnTouchListener(new View.OnSwipe);
        //cvEventDetail1.setVisibility(View.GONE);
        //cvEventDetail2.setVisibility(View.GONE);
        //cvEventDetail3.setVisibility(View.GONE);



        return view;
    }



}
