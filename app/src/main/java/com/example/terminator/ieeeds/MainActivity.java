package com.example.terminator.ieeeds;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mainNav;
    private FrameLayout mainFrame;

    private HomeFragment homeFragment;
    private ExploreFragment exploreFragment;
    private TeamFragment teamFragment;
    private BookmarkFragment bookmarkFragment;

    private Button buttonExecom, buttonSsn;
    private CardView cvteamExe1, cvteamExe2, cvteamExe3, cvteamExe4, cvteamSsn1, cvteamSsn2;

    RecyclerView exp_recyclerView;
    //societiesAdapter societiesAdapter;

    //List<societies> societiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mainNav = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        homeFragment = new HomeFragment();
        exploreFragment = new ExploreFragment();
        teamFragment = new TeamFragment();
        bookmarkFragment = new BookmarkFragment();


        buttonExecom = (Button) findViewById(R.id.buttonExecom);
        buttonSsn = (Button)    findViewById(R.id.buttonSsn);

        cvteamExe1 = (CardView) findViewById(R.id.cvteamExe1);
        cvteamExe2 = (CardView) findViewById(R.id.cvteamExe2);
        cvteamExe3 = (CardView) findViewById(R.id.cvteamExe3);
        cvteamExe4 = (CardView) findViewById(R.id.cvteamExe4);
        cvteamSsn1 = (CardView) findViewById(R.id.cvteamSsn1);
        cvteamSsn2 = (CardView) findViewById(R.id.cvteamSsn2);

        setFragment(homeFragment);


        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_home:
                        setFragment(homeFragment);
                        Toast.makeText(MainActivity.this,"Action Home Click", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_explore:
                        setFragment(exploreFragment);
                        Toast.makeText(MainActivity.this,"Action Explore Click", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_team:
                        setFragment(teamFragment);
                        Toast.makeText(MainActivity.this,"Action Member Click", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_bookmark:
                        setFragment(bookmarkFragment);
                        Toast.makeText(MainActivity.this,"Action Save Click", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.contact,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id==R.id.action_contact)
        {
            startActivity(new Intent(this, ContactActivity.class));
            Toast.makeText(this,"contact clicked",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    /*
        //getting the recyclerview from xml
        exp_recyclerView = (RecyclerView) findViewById(R.id.exp_recyclerView);
        exp_recyclerView.setHasFixedSize(true);
        exp_recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        societiesList = new ArrayList<>();


        //adding some items to our list
        societiesList.add(
                new societies(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.sample));

        societiesList.add(
                new societies(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.sample));

        societiesList.add(
                new societies(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.sample));

        societiesList.add(
                new societies(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.sample));

        societiesList.add(
                new societies(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.sample));

        societiesList.add(
                new societies(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.sample));



        //creating recyclerview adapter
        societiesAdapter societiesAdapter = new societiesAdapter(this, societiesList);

        //setting adapter to recyclerview
        exp_recyclerView.setAdapter(societiesAdapter); */


     /*   buttonExecom.setOnClickListener(new View.OnClickListener() {
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
        */

    /* public void clickButtonExecom(View v){
        buttonExecom.setTextColor(Color.parseColor("#000000"));
        buttonSsn.setTextColor(Color.parseColor("#7c7c7c"));

        cvteamExe1.setVisibility(View.VISIBLE);
        cvteamExe2.setVisibility(View.VISIBLE);
        cvteamExe3.setVisibility(View.VISIBLE);
        cvteamExe4.setVisibility(View.VISIBLE);
        cvteamSsn1.setVisibility(View.GONE);
        cvteamSsn2.setVisibility(View.GONE);
    }

    public void clickButtonSsn(View v){
        buttonExecom.setTextColor(Color.parseColor("#7c7c7c"));
        buttonSsn.setTextColor(Color.parseColor("#000000"));

        cvteamExe1.setVisibility(View.GONE);
        cvteamExe2.setVisibility(View.GONE);
        cvteamExe3.setVisibility(View.GONE);
        cvteamExe4.setVisibility(View.GONE);
        cvteamSsn1.setVisibility(View.VISIBLE);
        cvteamSsn2.setVisibility(View.VISIBLE);
    }

*/




    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();

    }


}
