package rafaelarnosti.com.br.sensors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btAcelerometro;
    Button btTTS;
    Button btSTT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAcelerometro = (Button) findViewById(R.id.btAcelerometro);

        btAcelerometro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Acelerometro.class);
                startActivity(intent);
            }
        });

        btTTS = (Button)findViewById(R.id.btTTS);

        btTTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TTS.class);
                startActivity(intent);
            }
        });

        btSTT = (Button) findViewById(R.id.btSTT);

        btSTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),STT.class);
                startActivity(intent);
            }
        });

    }


}
