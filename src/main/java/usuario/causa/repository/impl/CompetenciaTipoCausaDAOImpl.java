package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.CompetenciaTipoCausaDAO;
import usuario.causa.repository.model.Competencia;
import usuario.causa.repository.model.CompetenciaTipoCausa;
import usuario.causa.repository.model.TipoCausa;

@Repository
public class CompetenciaTipoCausaDAOImpl implements CompetenciaTipoCausaDAO {

  private final EntityManager em;

  @Autowired
  public CompetenciaTipoCausaDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<CompetenciaTipoCausa> listarTipoCausaPorCompetencia(Long idCompetencia) {
    TypedQuery<CompetenciaTipoCausa> query = em.createQuery("FROM CompetenciaTipoCausa ctc WHERE ctc.competencia =:competencia", CompetenciaTipoCausa.class);
    Competencia competencia = new Competencia();
    competencia.setId(idCompetencia);
    query.setParameter("competencia", competencia);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
