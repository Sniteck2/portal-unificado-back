package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.TribunalDAO;
import usuario.causa.repository.model.Tribunal;

@Repository
public class TribunalDAOImpl implements TribunalDAO {

  private final EntityManager em;

  @Autowired
  public TribunalDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<Tribunal> listarTribunales() {
    TypedQuery<Tribunal> query = em.createQuery("FROM Tribunal t WHERE t.flgActivo = 1", Tribunal.class);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
