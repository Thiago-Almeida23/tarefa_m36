package br.com.thiago.dao.service;

import br.com.thiago.dao.domain.Persistente;
import br.com.thiago.dao.exceptions.DAOException;
import br.com.thiago.dao.exceptions.MaisDeUmRegistroException;
import br.com.thiago.dao.exceptions.TableException;
import br.com.thiago.dao.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericJpaService <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}
