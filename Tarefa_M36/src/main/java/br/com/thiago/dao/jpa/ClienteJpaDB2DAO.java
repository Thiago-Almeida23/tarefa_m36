package br.com.thiago.dao.jpa;

import br.com.thiago.dao.domain.ClienteJpa;
import br.com.thiago.dao.generic.GenericJpaDB2DAO;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

}
