package fr.istic.mmmtp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 *
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent display = getIntent();

        // Non Parcelable
        /*TextView lblName = (TextView) findViewById(R.id.lblName);
        lblName.setText(display.getStringExtra("txtName"));
        TextView lblDate = (TextView) findViewById(R.id.lblDate);
        lblDate.setText(display.getStringExtra("txtDate"));
        TextView lblCity = (TextView) findViewById(R.id.lblCity);
        lblCity.setText(display.getStringExtra("txtCity"));*/

        // Parcelable
        ParcelableObj oParceObj = display.getExtras().getParcelable("parce");
        TextView lblName = (TextView) findViewById(R.id.lblName);
        lblName.setText(oParceObj.getLblName());
        TextView lblDate = (TextView) findViewById(R.id.lblDate);
        lblDate.setText(oParceObj.getLblDate());
        TextView lblCity = (TextView) findViewById(R.id.lblCity);
        lblCity.setText(oParceObj.getLblCity());
    }
}
