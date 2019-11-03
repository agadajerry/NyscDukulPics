package com.jerry.nyscpics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public static ArrayList<Corps> corperList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initialiseData();

      new Handler( ).postDelayed(new Thread(){

          @Override
          public void run(){
              Intent intent = new Intent(MainActivity.this,CorperList.class);
              startActivity(intent);
              finish();
             overridePendingTransition(R.transition.slide_in_right,R.transition.slide_out_left);
          }
      },3000);
    }

    //


    private void   initialiseData(){
        corperList  = new ArrayList<>();
        corperList.add(new Corps("Appreciation", R.drawable.intro, "To God"));
        corperList.add(new Corps(" Mr Maggaji, Principal GDSS", R.drawable.principal_dukul2, "08036652922"));
        corperList.add(new Corps(" Principal And Mr Usman", R.drawable.principal_usman, "08036652922"));
        corperList.add(new Corps("CORPER TIMOTHY", R.drawable.corper_timothy, "08069558827"));
        corperList.add(new Corps("CORPER JERRY", R.drawable.corper_jerry1, "08160332264"));
        corperList.add(new Corps("CORPER SIMEON ", R.drawable.corper_aseer, "07066665217"));
        corperList.add(new Corps("CORPER Ben(CLO) ", R.drawable.clo, "08107326814"));
        corperList.add(new Corps("CORPER GRACE ", R.drawable.corper_grace, "08186504142"));
        corperList.add(new Corps("CORPER MIRACLE ", R.drawable.corper_miracle, "08142346971"));
        corperList.add(new Corps("CORPER EDWARD ", R.drawable.edward, "07062341376"));
        corperList.add(new Corps("CORPER SAMSON ", R.drawable.samson, "08132316223"));
        corperList.add(new Corps("CORPER GEORGE ", R.drawable.george, "08069486005"));
        corperList.add(new Corps("CORPER IBRAHIM ", R.drawable.corper_ib, "08133255093"));
        corperList.add(new Corps("CORPER NANCY ", R.drawable.corper_nancy, "08104692150"));
        corperList.add(new Corps("CORPER JARED ", R.drawable.jared, "08030984598"));
        corperList.add(new Corps("CORPS MEMBER ", R.drawable.group_pix, "08160332264"));
        corperList.add(new Corps("STUDENTS ", R.drawable.some_student, "GDSS"));
        corperList.add(new Corps("STUDENTS ", R.drawable.anas, "GDSS"));
        corperList.add(new Corps("SS3 Students ", R.drawable.anas, "PPA"));
        corperList.add(new Corps("PPA ", R.drawable.us4, "GDSS STAFF"));
        corperList.add(new Corps("Staff And Students ", R.drawable.me_students, "Corps Member"));
        corperList.add(new Corps("Some Students ", R.drawable.student_inclass, "GDSS Students"));
        corperList.add(new Corps("PPA ", R.drawable.new_group, "GDSS STAFF"));
        corperList.add(new Corps("Staff And Students ", R.drawable.student_us, "Corps Member"));
        corperList.add(new Corps("Staff And Students ", R.drawable.me_students, "Corps Member"));
        corperList.add(new Corps("Staff And Students ", R.drawable.mr_prin, "Corps Member"));
        corperList.add(new Corps("Principal And Ex Corpers ", R.drawable.we_principal3, "Principal, GDSS"));
        corperList.add(new Corps("Principal And The Staff ", R.drawable.teachers_dukul_ppa, "Principal GDSS"));
        corperList.add(new Corps("Ex-Corpers And GDSS Students ", R.drawable.students_ppa, "GDSS"));
        corperList.add(new Corps("Ex-Corpers And GDSS Students ", R.drawable.students_gud, "JSS Class Students"));
        corperList.add(new Corps("Ex-Corpers And GDSS Students ", R.drawable.nancy_students, "Nancy And Her Students"));
        corperList.add(new Corps("Principal And Corper Jerry ", R.drawable.prince_and_i2, "Corper Jerry"));
        corperList.add(new Corps("JERRY, CLO, SHEY ", R.drawable.me_uche_feyi, "Corpers"));
        corperList.add(new Corps("JERRY And Some Students", R.drawable.me_some_students, ""));
        corperList.add(new Corps("JERRY And Some Students", R.drawable.me_girl_gud, ""));
        corperList.add(new Corps("Corpers And Some Students", R.drawable.all_students_we, ""));
        corperList.add(new Corps("GDSS Dukul Corpers", R.drawable.all_corpers, ""));
        corperList.add(new Corps("CDS", R.drawable.cds, ""));
        corperList.add(new Corps("ECWA", R.drawable.after_church, ""));
        corperList.add(new Corps("Sanitation", R.drawable.sanitation, ""));








































    }
}
