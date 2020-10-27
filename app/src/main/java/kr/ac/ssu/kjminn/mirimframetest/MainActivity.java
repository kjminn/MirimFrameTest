package kr.ac.ssu.kjminn.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearPark, linearSon, linearAhn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearPark = findViewById(R.id.linear_park);
        linearSon = findViewById(R.id.linear_son);
        linearAhn = findViewById(R.id.linear_ahn);

        Button btnPark = findViewById(R.id.btn_park);
        Button btnSon = findViewById(R.id.btn_son);
        Button btnAhn = findViewById(R.id.btn_ahn);

        btnPark.setOnClickListener(btnListener);
        btnSon.setOnClickListener(btnListener);
        btnAhn.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearPark.setVisibility(View.INVISIBLE);
            linearSon.setVisibility(View.INVISIBLE);
            linearAhn.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn_park:
                    linearPark.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_son:
                    linearSon.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_ahn:
                    linearAhn.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };

}