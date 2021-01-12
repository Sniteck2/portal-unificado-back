package usuario.causa.repository.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TO_CUADERNO")
public class Cuaderno {

  private Long id;
  private Long tipoCuaderno;
  private Date fechaIngreso;
  private char horaIngreso;
  private Long flgVigencia;
  private Causa causa;
  private Tribunal tribunal;
  private Competencia competencia;

  public Cuaderno() {
  }

  public Cuaderno(Long id, Long tipoCuaderno, Date fechaIngreso, char horaIngreso,
      Long flgVigencia, Causa causa, Tribunal tribunal,
      Competencia competencia) {
    this.id = id;
    this.tipoCuaderno = tipoCuaderno;
    this.fechaIngreso = fechaIngreso;
    this.horaIngreso = horaIngreso;
    this.flgVigencia = flgVigencia;
    this.causa = causa;
    this.tribunal = tribunal;
    this.competencia = competencia;
  }

  @Id
  @Column(name = "CRR_CUADERNO")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "COD_TIPO_CUADERNO")
  public Long getTipoCuaderno() {
    return tipoCuaderno;
  }

  public void setTipoCuaderno(Long tipoCuaderno) {
    this.tipoCuaderno = tipoCuaderno;
  }

  @Column(name = "FEC_INGRESO")
  public Date getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  @Column(name = "HOR_INGRESO")
  public char getHoraIngreso() {
    return horaIngreso;
  }

  public void setHoraIngreso(char horaIngreso) {
    this.horaIngreso = horaIngreso;
  }

  @Column(name = "FLG_VIGENCIA")
  public Long getFlgVigencia() {
    return flgVigencia;
  }

  public void setFlgVigencia(Long flgVigencia) {
    this.flgVigencia = flgVigencia;
  }

  @ManyToOne
  @JoinColumn(name = "CRR_CAUSA")
  public Causa getCausa() {
    return causa;
  }

  public void setCausa(Causa causa) {
    this.causa = causa;
  }

  @ManyToOne
  @JoinColumn(name = "COD_TRIBUNAL")
  public Tribunal getTribunal() {
    return tribunal;
  }

  public void setTribunal(Tribunal tribunal) {
    this.tribunal = tribunal;
  }

  @ManyToOne
  @JoinColumn(name = "COD_COMPETENCIA")
  public Competencia getCompetencia() {
    return competencia;
  }

  public void setCompetencia(Competencia competencia) {
    this.competencia = competencia;
  }

  @Override
  public String toString() {
    return "Cuaderno{" +
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
