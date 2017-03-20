package com.progiants.bhamashahskilldevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.progiants.bhamashahskilldevelopment.models.HeadOfFamilyResponse;
import com.progiants.bhamashahskilldevelopment.rest.ApiClient;
import com.progiants.bhamashahskilldevelopment.rest.services.EducationalBackgroundService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Vishwajeet (vjs3)
 * on 21/3/17.
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    TextView testView;


    // TODO - Get from user
    private final static String CLIENT_ID = "ad7288a4-7764-436d-a727-783a977f1fe1";
    private final static String BHAMASHAH_ID = "WDYYYGG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (CLIENT_ID.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY from themoviedb.org first!", Toast.LENGTH_LONG).show();
            return;
        }

        testView = (TextView) findViewById(R.id.test_text);

        EducationalBackgroundService apiService =
                ApiClient.getClient().create(EducationalBackgroundService.class);

        Call<HeadOfFamilyResponse> call = apiService.getHofDetails(BHAMASHAH_ID,CLIENT_ID);
        call.enqueue(new Callback<HeadOfFamilyResponse>() {
            @Override
            public void onResponse(Call<HeadOfFamilyResponse> call, Response<HeadOfFamilyResponse> response) {
                int statusCode = response.code();
                String educationStatus = response.body().getHofDetails().getEDUCATIONDESCENG();
                if (educationStatus == "Literate"){

                }
                testView.setText(educationStatus);
            }

            @Override
            public void onFailure(Call<HeadOfFamilyResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}
