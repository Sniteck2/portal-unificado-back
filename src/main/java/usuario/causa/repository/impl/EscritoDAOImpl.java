package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.EscritoDAO;
import usuario.causa.repository.model.Escrito;

@Repository
public class EscritoDAOImpl implements EscritoDAO {

  private final EntityManager em;

  @Autowired
  public EscritoDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<Escrito> buscarPorIdCuaderno(Long idCuaderno) {
    TypedQuery<Escrito> query = em.createQuery("FROM Escrito e WHERE e.idCuaderno =:idCuaderno", Escrito.class);
    query.setParameter("idCuaderno", idCuaderno);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
