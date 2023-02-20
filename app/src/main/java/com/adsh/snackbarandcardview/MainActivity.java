package com.adsh.snackbarandcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout constraintLayout;
    private Button button;
    private MaterialCardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.parent);
        button = findViewById(R.id.button);
        cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });
    }
    private void showSnackbar(){
        Snackbar.make(constraintLayout, "This is a snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retry clicked", Toast.LENGTH_SHORT).show();
                    }
                })
//                .setActionTextColor(getResources().getColor(R.color.purple_700))
                .setActionTextColor(Color.RED)
                .setTextColor(Color.YELLOW)
                .show();
    }
}