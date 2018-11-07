package com.example.datalibrary.mycampus.postgraduate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.datalibrary.mycampus.R;

public class PostgraduateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postgraduate);


        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    public void keAFI(View view){
        Intent gotoAFI = new Intent(PostgraduateActivity.this, AFIs2Activity.class);
        startActivity(gotoAFI);
    }

    public void kePBA(View view){
        Intent gotoPBA = new Intent(PostgraduateActivity.this, PBAs2Activity.class);
        startActivity(gotoPBA);
    }

    public void keHES(View view){
        Intent gotoVisiMisi = new Intent(PostgraduateActivity.this, HESs2Activity.class);
        startActivity(gotoVisiMisi);
    }
}
