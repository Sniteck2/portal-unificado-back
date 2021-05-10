package usuario.causa.service.util;

public enum TipoTramiteEnum {

  Audiencia(1L),
  Resolución(2L),
  Actuación(3L),
  Actuación_Receptor(4L),
  Audiencia_Inmediata(5L),
  Sentencia(6L),
  Otro_Tramite(7L),
  Otro_Escrito(8L),
  Oficio(9L),
  Incidentes(10L);

  private Long value;

  TipoTramiteEnum(Long value) {
    this.value = value;
  }

  public Long value() {
    return this.value;
  }

  public static TipoTramiteEnum findByValue(Long value){
    for(TipoTramiteEnum tramite : TipoTramiteEnum.values()){
      if(tramite.value.equals(value)){
        return tramite;
      }
    }
    return null;
  }

}
