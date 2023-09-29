package pl.zs10.testflagi3ppiatek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer punktacja = 10;
    private int liczbaKliknietychPrzyciskow = 0;
    private TextView textViewPolecenie;
    private TextView textViewPunkty;
    private Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPolecenie = findViewById(R.id.polecenie_txt);
        textViewPunkty = findViewById(R.id.textViewpunkty);

    }

    public void odpowiedzOk(View view) {
        if(punktacja>0)
            punktacja = punktacja -5;
        Toast.makeText(this, "Nie powinieneś tego klikać", Toast.LENGTH_SHORT).show();
    }

    public void odpowiedzNo(View view) {
        liczbaKliknietychPrzyciskow++;
        Toast toast = Toast.makeText(this, "Dobrze wybrano", Toast.LENGTH_SHORT);
        toast.show();
        //TODO znikanie przycisku
        int idPrzycisku = view.getId();
        Button button = findViewById(idPrzycisku);
        button.setVisibility(View.INVISIBLE);
        if(liczbaKliknietychPrzyciskow == 4){
            //Toast.makeText(this, "Koniec gry"+punktacja, Toast.LENGTH_SHORT).show();
            String tekst = punktacja.toString();
            textViewPolecenie.setText(R.string.komunikat);
            textViewPunkty.setText(tekst);
        }
    }
}