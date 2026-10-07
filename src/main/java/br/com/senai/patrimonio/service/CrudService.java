package br.com.senai.patrimonio.service;

import java.util.List;

public interface CrudService <T, I0> {
    T salvar(T entidade);

    T buscarPorId(I0 id);

    List<T> listarTodos();

    T atualizar(I0 id, T entidade);

    void excluir(I0 id);

}
