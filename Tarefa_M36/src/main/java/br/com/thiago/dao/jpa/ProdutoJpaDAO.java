package br.com.thiago.dao.jpa;

import br.com.thiago.dao.domain.ProdutoJpa;
import br.com.thiago.dao.exceptions.DAOException;
import br.com.thiago.dao.exceptions.MaisDeUmRegistroException;
import br.com.thiago.dao.exceptions.TableException;
import br.com.thiago.dao.exceptions.TipoChaveNaoEncontradaException;
import br.com.thiago.dao.generic.GenericJpaDB1DAO;

import java.util.Collection;
import java.util.List;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

    @Override
    public ProdutoJpa cadastrar(ProdutoJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public void excluir(ProdutoJpa entity) throws DAOException {

    }

    @Override
    public ProdutoJpa alterar(ProdutoJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public ProdutoJpa consultar(Long id) throws MaisDeUmRegistroException, TableException, DAOException {
        return null;
    }

    @Override
    public Collection<ProdutoJpa> buscarTodos() throws DAOException {
        return List.of();
    }
}
