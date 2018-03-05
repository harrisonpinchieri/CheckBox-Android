package checkbox2.cursoandroid.com.checkbox2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxCao;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;


    private Button botaoMostrar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCao = findViewById(R.id.checkBoxCao);
        checkBoxGato  = findViewById(R.id.checkBoxGato);
        checkBoxPapagaio = findViewById(R.id.checkBoxPapagaio);

        textoExibicao = findViewById(R.id.textoExibicaoId);
        botaoMostrar = findViewById(R.id.botaoMostrarId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionados = "";

            // Checa na tela se o item foi selecinado ou não.
            itensSelecionados += "Item:  "+checkBoxCao.getText()+ "Status: "+ checkBoxCao.isChecked() + "\n";
            itensSelecionados += "Item:  "+checkBoxGato.getText()+ "Status: "+ checkBoxGato.isChecked() + "\n";
            itensSelecionados += "Item:  "+checkBoxPapagaio.getText()+ "Status: "+ checkBoxPapagaio.isChecked() + "\n";

                textoExibicao.setText(itensSelecionados);

            }
        });

    }
}
