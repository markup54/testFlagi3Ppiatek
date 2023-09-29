package pl.zs10.testflagi3ppiatek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void odpowiedzOk(View view) {
        Toast.makeText(this, "Nie powinieneś tego klikać", Toast.LENGTH_SHORT).show();
    }

    public void odpowiedzNo(View view) {
        Toast toast = Toast.makeText(this, "Dobrze wybrano", Toast.LENGTH_SHORT);
        toast.show();
        //TODO znikanie przycisku
        int idPrzycisku = view.getId();
        Button button = findViewById(idPrzycisku);
        button.setVisibility(View.INVISIBLE);
    }
}