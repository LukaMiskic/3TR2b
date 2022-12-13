package hr.zovkodomagoj.kocka;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) { //oncreate metoda, izvršava se pri stvaranju aplikacije
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button); // deklaracija buttona
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView t1 = (TextView)findViewById(R.id.textview1); // deklaracija textviewa
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View view = findViewById(R.id.layout); // deklaracija layouta

        // postavljanje onClickListenera
        button.setOnClickListener(v -> { //metoda koja određuje što se događa na klik buttona
            t1.setText((new Random().nextInt(6) + 1) + "   " + (new Random().nextInt(6) + 1));
            //postavljanje teksta u textviewu na dva nasumična broja u rasponu od 1 - 6 sa razmakom između
            view.setBackgroundColor(Color.rgb(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256)));
            //postavljanje pozadinske boje u nasumično generiranu
        });
    }
}