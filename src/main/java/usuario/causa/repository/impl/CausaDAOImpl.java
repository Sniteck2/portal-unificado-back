package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.CausaDAO;
import usuario.causa.repository.model.Causa;
import usuario.causa.repository.model.Competencia;
import usuario.causa.repository.model.Tribunal;

@Repository
public class CausaDAOImpl implements CausaDAO {

  private static final Log logger = LogFactory.getLog("Causa");
  private final EntityManager em;

  @Autowired
  public CausaDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public Causa buscarId(Long id) {
    return em.find(Causa.class, id);
  }

  @Override
  public Causa buscarCausa(Long rolCausa, String eraCausa, String tipoCausa, Long idTribunal,
      Long idCompetencia) {
    Causa causa = new Causa();
    try {
      TypedQuery<Causa> query = em.createQuery(
          "FROM Causa c WHERE c.rolCausa =:rolCausa AND c.eraCausa =:eraCausa AND c.tipoCausa =:tipoCausa AND c.tribunal =:tribunal AND c.competencia =:competencia",
          Causa.class);
      Tribunal tribunal = new Tribunal();
      tribunal.setId(idTribunal);
      Competencia competencia = new Competencia();
      competencia.setId(idCompetencia);

      query.setParameter("rolCausa", rolCausa);
      query.setParameter("eraCausa", eraCausa);
      query.setParameter("tipoCausa", tipoCausa);
      query.setParameter("tribunal", tribunal);
      query.setParameter("competencia", competencia);

      causa = query.getSingleResult();

    } catch (Exception ex) {
      causa.setId(-1L);
      logger.warn("Error: " + ex.getLocalizedMessage());
    }
    return causa;
  }

  @Override
  public List<Causa> buscarCausaFecha(List<Long> competencias, String fechaInicio, String fechaFinal) {
    StringBuilder str = new StringBuilder();
    str.append("FROM Causa c WHERE c.fechaModificacion BETWEEN :fechaInicio AND :fechaFinal");
    if(competencias != null && !competencias.isEmpty()){
        str.append(" AND c.competencia IN (");
        StringBuilder finalStrBuilder = str;
        competencias.forEach(item -> finalStrBuilder.append(item + ","));
        str = new StringBuilder(StringUtils.chop(str.toString()) + ")");
    }
    TypedQuery<Causa> query = em.createQuery(str.toString(), Causa.class);
    query.setParameter("fechaInicio", fechaInicio);
    query.setParameter("fechaFinal", fechaFinal);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
