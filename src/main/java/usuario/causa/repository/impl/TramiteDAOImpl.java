package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.TramiteDAO;
import usuario.causa.repository.model.Tramite;

@Repository
public class TramiteDAOImpl implements TramiteDAO {

  private final EntityManager em;

  @Autowired
  public TramiteDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<Tramite> listarPorIdCausa(Long idCausa) {
    TypedQuery<Tramite> query = em.createQuery("FROM Tramite t WHERE t.idCausa =:idCausa", Tramite.class);
    query.setParameter("idCausa", idCausa);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
