package br.com.yanfalcao.boaviagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dashboard_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void onNewTravel(View v){ startActivity(new Intent(this, new_travel_activity.class)); }

    public void onNewExpense(View v){ startActivity(new Intent(this, new_expense_activity.class)); }

    public void onMyTravel(View v){ startActivity(new Intent(this, TravelListActivity.class)); }
}
