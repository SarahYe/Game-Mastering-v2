package com.secretroomagency.www.testapp;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Sarah on 15/06/2017.
 */

public class CommunicationMySQL extends AppCompatActivity {

    private final OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String json = null;
        String json2 = null;

        try {

            //Lecture de données
            json = get("http://2.0.0.2/Communication/LectureMySQL.php");
            Log.d("Resultat PHP: ", json);
            Toast.makeText(getApplicationContext(), json , Toast.LENGTH_LONG).show();
            //TextView info = (TextView)findViewById(R.id.textView);
            //info.setText(json);
            /*List<Person> Person_list = new Gson().fromJson(json, new TypeToken<List<Person>>() {}.getType());
            Log.d("Liste personne:", Person_list.toString());
*/
            //Ecriture de données
            json2 = get("http://2.0.0.2/Communication/InsertionMySQL.php");
            Log.d("Ecriture PHP: ", "OK");
            setContentView(R.layout.test_communication_sql);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String url) throws IOException {
        // Prepare the request.
        Request request = new Request.Builder().url(url).build();
        // Execute the request.
        Response response = client.newCall(request).execute();
        // Get the result.
        return response.body().string();
    }
}
