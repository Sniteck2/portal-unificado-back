package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.CompetenciaDAO;
import usuario.causa.repository.model.Competencia;

@Repository
public class CompetenciaDAOImpl implements CompetenciaDAO {

  private final EntityManager em;

  @Autowired
  public CompetenciaDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<Competencia> listarCompetencias() {
    TypedQuery<Competencia> query = em.createQuery("FROM Competencia c WHERE c.flgActivo = 1", Competencia.class);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
