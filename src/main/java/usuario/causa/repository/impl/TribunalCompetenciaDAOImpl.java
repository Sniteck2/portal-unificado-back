package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.TribunalCompetenciaDAO;
import usuario.causa.repository.model.Competencia;
import usuario.causa.repository.model.TribunalCompetencia;

@Repository
public class TribunalCompetenciaDAOImpl implements TribunalCompetenciaDAO {

  private final EntityManager em;

  @Autowired
  public TribunalCompetenciaDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<TribunalCompetencia> listarTribunalPorCompetencia(Long idCompetencia) {
    TypedQuery<TribunalCompetencia> query = em.createQuery(
        "FROM TribunalCompetencia tc WHERE tc.competencia =:competencia AND tc.flgActivo = 1",
        TribunalCompetencia.class);
    Competencia competencia = new Competencia();
    competencia.setId(idCompetencia);
    query.setParameter("competencia", competencia);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
