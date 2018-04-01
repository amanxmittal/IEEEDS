package com.example.terminator.ieeeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    private EditText etName, etMemberId, etEmail, etMessage;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        etName = (EditText) findViewById(R.id.etName);
        etMemberId = (EditText) findViewById(R.id.etMemberID);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etMessage = (EditText) findViewById(R.id.etMessage);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit) ;

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ContactActivity.this,"contact clicked",Toast.LENGTH_SHORT).show();
                etName.setText(null);
                etMemberId.setText(null);
                etEmail.setText(null);
                etMessage.setText(null);

                startActivity(new Intent(ContactActivity.this, MainActivity.class));


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
}
