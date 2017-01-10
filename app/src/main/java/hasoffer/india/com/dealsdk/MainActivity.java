package hasoffer.india.com.dealsdk;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.deal.sdk.callback.DataLisener;
import com.deal.sdk.logic.DealController;
import com.deal.sdk.model.Deal;
import com.deal.sdk.model.PageDeal;
import com.deal.sdk.until.Logger;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements DataLisener{


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.tv);
        findViewById(R.id.listBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DealController.getInstance().list(MainActivity.this, 1, MainActivity.this);
            }
        });

        findViewById(R.id.detailBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DealController.getInstance().detial(MainActivity.this,"99059027", MainActivity.this);
            }
        });


    }

    @Override
    public void onDataEnd() {

    }

    @Override
    public void onDataFail(Exception e) {

    }

    @Override
    public void onDataSccess(Serializable serializable) {
        if (serializable instanceof PageDeal){
            textView.setText(serializable.toString());
        }
        if (serializable instanceof Deal){
            textView.setText(serializable.toString());
        }

    }
    @Override
    public void onDataStart() {
        Logger.e("start");
    }

}
