package com.github.leandrogodoycwb.listadetarefas.acitivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.github.leandrogodoycwb.listadetarefas.R;

public class AdicionarTarefaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_tarefa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_adicionar_tarefa, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch ( item.getItemId()){
            case R.id.itemSalvar :
                //executa acao do item salvar
                Toast.makeText(AdicionarTarefaActivity.this,"Botão salvar pressionado",
                        Toast.LENGTH_LONG).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
