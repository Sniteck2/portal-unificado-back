package usuario.causa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import usuario.causa.model.ResumenCuadernoVO;
import usuario.causa.service.ResumenCuadernoService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("resumen-cuaderno")
public class ResumenCuadernoController {

    private final ResumenCuadernoService resumenCuadernoService;

    @Autowired
    public ResumenCuadernoController(ResumenCuadernoService resumenCuadernoService) {
        this.resumenCuadernoService = resumenCuadernoService;
    }

    @GetMapping(value = "/listar-todo/")
    List<ResumenCuadernoVO> listarTodo(){
        return this.resumenCuadernoService.listarTodo();
    }
}
