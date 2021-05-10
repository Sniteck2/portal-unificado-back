package usuario.causa.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.ResumenParteVO;
import usuario.causa.repository.ResumenParteDAO;
import usuario.causa.service.ResumenParteService;
import usuario.causa.service.builder.ResumenParteVOBuilder;
import usuario.causa.service.builder.VOBuilderFactory;

@Service
public class ResumenParteServiceImpl implements ResumenParteService {

  public final ResumenParteDAO resumenParteDAO;

  @Autowired
  public ResumenParteServiceImpl(ResumenParteDAO resumenParteDAO) {
    this.resumenParteDAO = resumenParteDAO;
  }

  @Override
  public List<ResumenParteVO> listarTodo() {
    return this.resumenParteDAO.listarTodo().stream().map(VOBuilderFactory::getResumenParteVOBuilder)
        .map(ResumenParteVOBuilder::build).collect(Collectors.toList());
  }
}
