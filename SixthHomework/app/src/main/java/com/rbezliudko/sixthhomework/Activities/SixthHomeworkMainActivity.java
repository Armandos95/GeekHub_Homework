package com.rbezliudko.sixthhomework.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rbezliudko.sixthhomework.Fragments.SixthHomeworkBFragment;
import com.rbezliudko.sixthhomework.Interfaces.ButtonMethodsInterfaceSix;
import com.rbezliudko.sixthhomework.R;

public class SixthHomeworkMainActivity extends AppCompatActivity implements ButtonMethodsInterfaceSix {

    private SixthHomeworkBFragment fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_homework_main);
        fragmentB  = (SixthHomeworkBFragment) getFragmentManager().findFragmentById(R.id.fragment_6_b);
    }

    public void showZergling() {
        if (fragmentB == null) {
            Intent intent = new Intent(this, SixthHomeworkAdditionalActivity.class);
            intent.putExtra("chosenUnit", "zergling");
            startActivity(intent);
        } else {
            fragmentB.updateContent("zergling");
        }
    }

    public void showMarauder() {
        if (fragmentB == null) {
            Intent intent = new Intent(this, SixthHomeworkAdditionalActivity.class);
            intent.putExtra("chosenUnit", "marauder");
            startActivity(intent);
        } else {
            fragmentB.updateContent("marauder");
        }
    }

    public void showQueen() {
        if (fragmentB == null) {
            Intent intent = new Intent(this, SixthHomeworkAdditionalActivity.class);
            intent.putExtra("chosenUnit", "queen");
            startActivity(intent);
        } else {
            fragmentB.updateContent("queen");
        }
    }

    public void showInfestor() {
        if (fragmentB == null) {
            Intent intent = new Intent(this, SixthHomeworkAdditionalActivity.class);
            intent.putExtra("chosenUnit", "infestor");
            startActivity(intent);
        } else {
            fragmentB.updateContent("infestor");
        }
    }

    public void showZealot() {
        if (fragmentB == null) {
            Intent intent = new Intent(this, SixthHomeworkAdditionalActivity.class);
            intent.putExtra("chosenUnit", "zealot");
            startActivity(intent);
        } else {
            fragmentB.updateContent("zealot");
        }
    }

    public void showStalker() {
        if (fragmentB == null) {
            Intent intent = new Intent(this, SixthHomeworkAdditionalActivity.class);
            intent.putExtra("chosenUnit", "stalker");
            startActivity(intent);
        } else {
            fragmentB.updateContent("stalker");
        }
    }
}