package usuario.causa.model;

import java.io.Serializable;
import java.util.Date;
import usuario.causa.repository.model.Causa;
import usuario.causa.repository.model.Competencia;
import usuario.causa.repository.model.Tribunal;

public class CuadernoVO implements Serializable {

  private static final long serialVersionUID = 1502801195289316312L;
  private Long id;
  private Long tipoCuaderno;
  private Date fechaIngreso;
  private char horaIngreso;
  private Long flgVigencia;
  private Causa causa;
  private Tribunal tribunal;
  private Competencia competencia;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getTipoCuaderno() {
    return tipoCuaderno;
  }

  public void setTipoCuaderno(Long tipoCuaderno) {
    this.tipoCuaderno = tipoCuaderno;
  }

  public Date getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  public char getHoraIngreso() {
    return horaIngreso;
  }

  public void setHoraIngreso(char horaIngreso) {
    this.horaIngreso = horaIngreso;
  }

  public Long getFlgVigencia() {
    return flgVigencia;
  }

  public void setFlgVigencia(Long flgVigencia) {
    this.flgVigencia = flgVigencia;
  }

  public Causa getCausa() {
    return causa;
  }

  public void setCausa(Causa causa) {
    this.causa = causa;
  }

  public Tribunal getTribunal() {
    return tribunal;
  }

  public void setTribunal(Tribunal tribunal) {
    this.tribunal = tribunal;
  }

  public Competencia getCompetencia() {
    return competencia;
  }

  public void setCompetencia(Competencia competencia) {
    this.competencia = competencia;
  }

  @Override
  public String toString() {
    return "CuadernoVO{" +
        "id=" + id +
        ", tipoCuaderno=" + tipoCuaderno +
        ", fechaIngreso=" + fechaIngreso +
        ", horaIngreso=" + horaIngreso +
        ", flgVigencia=" + flgVigencia +
        ", causa=" + causa +
        ", tribunal=" + tribunal +
        ", competencia=" + competencia +
        '}';
  }
}
