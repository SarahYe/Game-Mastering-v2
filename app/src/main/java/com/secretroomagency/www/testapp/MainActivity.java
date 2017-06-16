package com.secretroomagency.www.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        final ImageButton salle1 = (ImageButton) findViewById(R.id.salle1);
        final ImageButton salle2 = (ImageButton) findViewById(R.id.salle2);
        final ImageButton salle3 = (ImageButton) findViewById(R.id.salle3);

        ImageButton salles[] = {salle1, salle2, salle3};

        for (int i = 0; i < 3; i++) {
            salles[i].setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                    startActivity(intent);
                }
            });
        }

        //createButtons(1,3);
    }

   /* private void createButtons(int NUM_ROWS, int NUM_COLS) {

        TableLayout table = (TableLayout) findViewById(R.id.tableForButtons);
        int image_salles[] = {R.drawable.salle1, R.drawable.salle2, R.drawable.salle3};
        for (int row=0; row< NUM_ROWS; row++){
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.WRAP_CONTENT,
                    TableLayout.LayoutParams.WRAP_CONTENT,
                    1.0f));
            table.addView(tableRow);
            for (int col=0; col< NUM_COLS; col++){
                Button button = new Button(this);
                button.setLayoutParams(new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT,
                        1.0f));
                button.setBackgroundResource(image_salles[col]);
                final int id_ = button.getId();

                button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        if (id_ == 0) {
                            Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Intent intent = new Intent(MainActivity.this, GameMasterActivity.class);  //Lancer l'interface du GM
                            startActivity(intent);
                        }
                    }
                });

                tableRow.addView(button);
            }
        }
    }*/
}
