package usuario.causa.service.util;

public enum EstadoFirmaEnum {

  Sin_firmar(0L),
  Bloqueado(1L),
  Nulo(2L),
  Eliminado(3L),
  Invalidado(4L),
  Pregrabado(5L),
  Relacionado(6L),
  Bloqueado_Res(7L),
  Sin_Efecto(8L),
  Cerrado(10L),
  Reposición(11L),
  Eliminado_Por_Falla_Nulidad(12L);

  private Long value;

  EstadoFirmaEnum(Long value) {
    this.value = value;
  }

  public Long value() {
    return this.value;
  }

  public static EstadoFirmaEnum findByValue(Long value){
    for(EstadoFirmaEnum estado : EstadoFirmaEnum.values()){
      if(estado.value.equals(value)){
        return estado;
      }
    }
    return null;
  }
}
