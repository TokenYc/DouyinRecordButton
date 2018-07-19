package net.archeryc.douyinrecordbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecordButton recordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recordButton = findViewById(R.id.recordButton);
        recordButton.setOnRecordStateChangedListener(new RecordButton.OnRecordStateChangedListener() {
            @Override
            public void onRecordStart() {
                Toast.makeText(MainActivity.this, "开始录制", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRecordStop() {
                Toast.makeText(MainActivity.this, "结束录制", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onZoom(float percentage) {

            }
        });
    }
}
