package usuario.causa.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.ResumenTramiteVO;
import usuario.causa.repository.ResumenTramiteDAO;
import usuario.causa.service.ResumenTramiteService;
import usuario.causa.service.builder.ResumenTramiteVOBuilder;
import usuario.causa.service.builder.VOBuilderFactory;

@Service
public class ResumenTramiteServiceImpl implements ResumenTramiteService {

  private final ResumenTramiteDAO resumenTramiteDAO;

  @Autowired
  public ResumenTramiteServiceImpl(ResumenTramiteDAO resumenTramiteDAO) {
    this.resumenTramiteDAO = resumenTramiteDAO;
  }

  @Override
  public List<ResumenTramiteVO> listarTodo() {
    return this.resumenTramiteDAO.listarTodo().stream().map(VOBuilderFactory::getResumenTramiteVOBuilder)
        .map(ResumenTramiteVOBuilder::build).collect(Collectors.toList());
  }
}
