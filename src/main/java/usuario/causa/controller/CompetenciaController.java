package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.CompetenciaVO;
import usuario.causa.service.CompetenciaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("competencia")
public class CompetenciaController {

  private final CompetenciaService competenciaService;

  @Autowired
  public CompetenciaController(CompetenciaService competenciaService) {
    this.competenciaService = competenciaService;
  }

  @GetMapping(value = "/listar-competencia/")
  List<CompetenciaVO> listarCompetencia(){
    return this.competenciaService.listarCompetencias();
  }
}
