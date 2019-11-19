package br.com.etechoracio.projetos.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import br.com.etechoracio.projetos.R;
import br.com.etechoracio.projetos.model.Projeto;

public class NovoProjetoFragment extends Fragment {

    private EditText editNome;
    private EditText editOrientadores;
    private EditText editSala;
    private EditText editTurma;
    private Button btnSalvar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_novo_projeto, container, false);

        editNome = view.findViewById(R.id.editNome);
        editOrientadores = view.findViewById(R.id.editOrientadores);
        editSala = view.findViewById(R.id.editSala);
        editTurma = view.findViewById(R.id.editTurma);
        btnSalvar = view.findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Projeto projeto = new Projeto();
                projeto.setNome(editNome.getText().toString());
                projeto.setOrientadores(editOrientadores.getText().toString());
                projeto.setSala(editSala.getText().toString());
                projeto.setTurma(editTurma.getText().toString());




            }
        });

        return view;
    }
}
