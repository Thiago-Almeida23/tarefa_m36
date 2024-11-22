package br.com.thiago.dao.jpa;

import br.com.thiago.dao.domain.VendaJpa;
import br.com.thiago.dao.exceptions.DAOException;
import br.com.thiago.dao.exceptions.TipoChaveNaoEncontradaException;
import br.com.thiago.dao.generic.IGenericJpaDAO;

public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}
