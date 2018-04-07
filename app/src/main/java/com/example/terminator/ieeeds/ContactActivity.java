package com.example.terminator.ieeeds;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ContactActivity extends AppCompatActivity {

    private EditText etName, etMemberId, etEmail, etMessage;
    private Button buttonSubmit, buttonContactBack;

    private FirebaseDatabase database;
    private DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();

        //myRef.setValue("Hello, World!");


        etName = (EditText) findViewById(R.id.etName);
        etMemberId = (EditText) findViewById(R.id.etMemberID);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etMessage = (EditText) findViewById(R.id.etMessage);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit) ;
        buttonContactBack = (Button) findViewById(R.id.buttonContactBack) ;

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etName.getText().toString().trim();
                String memberID = etMemberId.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String message = etMessage.getText().toString().trim();

                HashMap<String, String> datamap = new HashMap<String, String>();

                datamap.put("Name",name);
                datamap.put("Member ID",memberID);
                datamap.put("Email",email);
                datamap.put("Message",message);

                myRef.push().setValue(datamap);


               // myRef.child(name).child("Name").setValue(name);
                //myRef.child(name).child("Email").setValue(email);
                //myRef.child(name).child("MemberID").setValue(memberID);
                //myRef.child(name).child("Message").setValue(message);


                //setFieldNull();

                Toast.makeText(ContactActivity.this,"Feedback Received",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ContactActivity.this, MainActivity.class));


            }
        });

        buttonContactBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFieldNull();

                onBackPressed();

                //startActivity(new Intent(ContactActivity.this, MainActivity.class));

            }
        });


    }



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
            //startActivity(new Intent(this, ContactActivity.class));
            Toast.makeText(this,"already on contact",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setFieldNull(){
        etName.setText(null);
        etMemberId.setText(null);
        etEmail.setText(null);
        etMessage.setText(null);
    }
}
