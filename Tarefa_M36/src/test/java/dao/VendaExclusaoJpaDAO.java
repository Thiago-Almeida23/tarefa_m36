package dao;

import br.com.thiago.dao.domain.VendaJpa;
import br.com.thiago.dao.exceptions.DAOException;
import br.com.thiago.dao.exceptions.TipoChaveNaoEncontradaException;
import br.com.thiago.dao.generic.GenericJpaDB1DAO;
import br.com.thiago.dao.jpa.IVendaJpaDAO;

public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class);
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}
