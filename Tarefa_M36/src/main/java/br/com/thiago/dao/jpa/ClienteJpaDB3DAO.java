package br.com.thiago.dao.jpa;

import br.com.thiago.dao.domain.ClienteJpa2;
import br.com.thiago.dao.generic.GenericJpaDB3DAO;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

}
