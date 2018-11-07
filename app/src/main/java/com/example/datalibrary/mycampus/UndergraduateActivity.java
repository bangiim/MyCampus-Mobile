package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;

public class UndergraduateActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cv_pai, cv_pba, cv_saa, cv_afi, cv_iqt, cv_hes, cv_pm, cv_ti, cv_agro, cv_tip, cv_ilkom, cv_hi, cv_far, cv_giz, cv_k3, cv_ei, cv_mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_undergraduate);

        cv_pai = findViewById(R.id.row_pai);
        cv_pba = findViewById(R.id.row_pba);
        cv_saa = findViewById(R.id.row_saa);
        cv_afi = findViewById(R.id.row_afi);
        cv_iqt = findViewById(R.id.row_iqt);
        cv_hes = findViewById(R.id.row_hes);
        cv_pm = findViewById(R.id.row_pm);
        cv_ti = findViewById(R.id.row_ti);
        cv_agro = findViewById(R.id.row_agro);
        cv_tip = findViewById(R.id.row_tip);
        cv_ilkom = findViewById(R.id.row_ilkom);
        cv_hi = findViewById(R.id.row_hi);
        cv_far = findViewById(R.id.row_far);
        cv_giz = findViewById(R.id.row_giz);
        cv_k3 = findViewById(R.id.row_k3);
        cv_ei = findViewById(R.id.row_ei);
        cv_mb = findViewById(R.id.row_mb);

        cv_pai.setOnClickListener(this);
        cv_pba.setOnClickListener(this);
        cv_saa.setOnClickListener(this);
        cv_afi.setOnClickListener(this);
        cv_iqt.setOnClickListener(this);
        cv_hes.setOnClickListener(this);
        cv_pm.setOnClickListener(this);
        cv_ti.setOnClickListener(this);
        cv_agro.setOnClickListener(this);
        cv_tip.setOnClickListener(this);
        cv_ilkom.setOnClickListener(this);
        cv_hi.setOnClickListener(this);
        cv_far.setOnClickListener(this);
        cv_giz.setOnClickListener(this);
        cv_k3.setOnClickListener(this);
        cv_ei.setOnClickListener(this);
        cv_mb.setOnClickListener(this);


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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.row_pai:
                Intent intentpai = new Intent(this, ShowunderActivity.class);
                intentpai.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://pai.unida.gontor.ac.id/profil/");
                startActivity(intentpai);
                break;

            case R.id.row_pba:
                Intent intentpba = new Intent(this, ShowunderActivity.class);
                intentpba.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://pba.unida.gontor.ac.id/profil/sejarah/");
                startActivity(intentpba);
                break;

            case R.id.row_saa:
                Intent intentsaa = new Intent(this, ShowunderActivity.class);
                intentsaa.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://saa.unida.gontor.ac.id/?page_id=378");
                startActivity(intentsaa);
                break;

            case R.id.row_afi:
                Intent intentafi = new Intent(this, ShowunderActivity.class);
                intentafi.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://afi.unida.gontor.ac.id/?page_id=74");
                startActivity(intentafi);
                break;

            case R.id.row_iqt:
                Intent intentiqt = new Intent(this, ShowunderActivity.class);
                intentiqt.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://iqt.unida.gontor.ac.id/visi-misi/");
                startActivity(intentiqt);
                break;

            case R.id.row_hes:
                Intent intenthes = new Intent(this, ShowunderActivity.class);
                intenthes.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://hes.unida.gontor.ac.id/visi/");
                startActivity(intenthes);
                break;

            case R.id.row_pm:
                Intent intentpm = new Intent(this, ShowunderActivity.class);
                intentpm.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://pm.unida.gontor.ac.id/visi-misi/");
                startActivity(intentpm);
                break;

            case R.id.row_ti:
                Intent intentti = new Intent(this, ShowunderActivity.class);
                intentti.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://informatika.unida.gontor.ac.id/profil/visi-misi/");
                startActivity(intentti);
                break;

            case R.id.row_agro:
                Intent intentagro = new Intent(this, ShowunderActivity.class);
                intentagro.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://agro.unida.gontor.ac.id");
                startActivity(intentagro);
                break;

            case R.id.row_tip:
                Intent intenttip = new Intent(this, ShowunderActivity.class);
                intenttip.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://tip.unida.gontor.ac.id/?page_id=4");
                startActivity(intenttip);
                break;

            case R.id.row_ilkom:
                Intent intentilkom = new Intent(this, ShowunderActivity.class);
                intentilkom.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://ilkom.unida.gontor.ac.id/?page_id=6");
                startActivity(intentilkom);
                break;

            case R.id.row_hi:
                Intent intenthi = new Intent(this, ShowunderActivity.class);
                intenthi.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://hi.unida.gontor.ac.id/history/");
                startActivity(intenthi);
                break;

            case R.id.row_far:
                Intent intentfar = new Intent(this, ShowunderActivity.class);
                intentfar.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://farmasi.unida.gontor.ac.id/visi-misi-dan-tujuan/");
                startActivity(intentfar);
                break;

            case R.id.row_giz:
                Intent intentgiz = new Intent(this, ShowunderActivity.class);
                intentgiz.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://gizi.unida.gontor.ac.id/");
                startActivity(intentgiz);
                break;

            case R.id.row_k3:
                Intent intentk3 = new Intent(this, ShowunderActivity.class);
                intentk3.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://k3.unida.gontor.ac.id/?page_id=79");
                startActivity(intentk3);
                break;

            case R.id.row_ei:
                Intent intentei = new Intent(this, ShowunderActivity.class);
                intentei.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://unida.gontor.ac.id/fakultas-ekonomi-dan-manajemen/prodi-ekonomi-islam/");
                startActivity(intentei);
                break;

            case R.id.row_mb:
                Intent intentmb = new Intent(this, ShowunderActivity.class);
                intentmb.putExtra(ShowunderActivity.EXTRA_URL_WEB, "http://mgt.unida.gontor.ac.id/sejarah/");
                startActivity(intentmb);
                break;
        }
    }
}
