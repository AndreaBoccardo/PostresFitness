package cl.desafiolatm.postresfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatm.postresfitness.adapter.PostreAdaptador;
import cl.desafiolatm.postresfitness.databinding.ActivityMainBinding;
import cl.desafiolatm.postresfitness.modelo.Item;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;
    private List<Item> postre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        initData();
        PostreAdaptador adapter = new PostreAdaptador(postre);
        adapter.setListener(postre -> {
            Toast.makeText(getApplicationContext(),postre.getMensaje(),Toast.LENGTH_LONG).show();
        });
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        b.rvLista.setLayoutManager(layoutManager);
        b.rvLista.setAdapter(adapter);

    }

    private void initData(){
        postre = new ArrayList<>();
        postre.add(new Item(R.drawable.brownie_banana, "Brownie de banana"));
        postre.add(new Item(R.drawable.galletas_rapidas_de_auyama_y_banano,
                "Galletas rápidas de auyama y banano"));
        postre.add(new Item(R.drawable.mandocas_hormenadas, "Mandocas hormenadas"));
        postre.add(new Item(R.drawable.muffins_de_pan_con_zanohoria,
                "Muffins de pan con zanahoria"));
        postre.add(new Item(R.drawable.muffins_integrales, "Muffins integrales"));
        postre.add(new Item(R.drawable.palmeritas_de_banana, "Palmeritas de banana"));
        postre.add(new Item(R.drawable.pan_de_calabacin_750x300, "Pan de calabacín"));
        postre.add(new Item(R.drawable.panquecas_de_cacao_con_topping_de_banana,
                "Panquecas de cacao con topping de banana"));
    }
}