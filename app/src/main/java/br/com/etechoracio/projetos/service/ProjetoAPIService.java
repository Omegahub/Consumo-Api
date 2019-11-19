package br.com.etechoracio.projetos.service;

import java.util.List;

import br.com.etechoracio.projetos.model.Projeto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProjetoAPIService {
    @GET(".")
    Call<List<Projeto>> getProjetos();
}
