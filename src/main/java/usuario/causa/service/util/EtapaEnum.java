package usuario.causa.service.util;

public enum EtapaEnum {

  Ingreso(10L),
  Notificación_demanda(15L),
  Contestación(20L),
  Réplica(30L),
  Dúplica(40L),
  Término_Probatorio(50L),
  Sentencia(60L),
  Impugnación_de_Sentencia(70L),
  Apelación_o_Conciliación_de_2da_Inst(90L),
  Terminada(120L),
  Excepciones(130L),
  Contestación_Excepciones(140L),
  Mandamiento(160L),
  Apremio(170L),
  Tramitación(180L),
  Impugnación(190L),
  Preparacion_via_ejecutiva(220L),
  Preparación_acción_desposeimiento(240L),
  Exhorto(280L),
  Oposición(340L),
  Inicio_de_la_Tramitacion(350L),
  Ingreso_Denuncia(360L),
  Conciliación(370L),
  Unica(400L),
  Contestación_y_Conciliación(410L),
  Ingreso_de_Solicitud(440L),
  Audiencia_de_Prueba(500L),
  Presentación_de_la_Medida_Prejudicial(520L),
  Tramitación_General(530L),
  Tramitación_Precautoria(540L),
  Determinación_De_Credito(550L),
  Verificacion_De_Créditos(620L),
  Mensura(690L),
  Aud_Contes_Concil_Recib_prueba(720L),
  Cumplimiento_Corte(730L),
  Notificación(740L),
  Contestación_Conciliación_Prueba(760L),
  Inicio_tramitación(770L),
  Notificación_de_cumplimiento(790L),
  Recursos_o_ejecución(810L),
  Junta_de_Acreedores(830L),
  Junta_Objeciones_y_Período_Extraor(840L),
  Notificación_demandas(850L),
  Discusión(870L),
  Contestación_y_prueba(880L),
  Aud_contest_y_conciliación(910L),
  Audiencia_art_9(930L),
  Requerimiento(940L),
  Audiencia_Contestación(950L),
  Ejecución(960L),
  Notificación_por_aviso(970L),
  Notificación_Reclamación(980L),
  Aud_Descargos_y_Prueba(990L),
  Audiencia_Art_189_C_Aguas(991L),
  Audiencia_Art_270_C_Aguas(992L);

  private Long value;

  EtapaEnum(Long value) {
    this.value = value;
  }

  public Long value() {
    return this.value;
  }

  public static EtapaEnum findByValue(Long value){
    for(EtapaEnum etapa : EtapaEnum.values()){
      if(etapa.value.equals(value)){
        return etapa;
      }
    }
    return null;
  }


  }
