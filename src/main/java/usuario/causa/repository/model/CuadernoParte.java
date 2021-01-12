package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TREL_CUADERNO_PARTE")
public class CuadernoParte {

  private Long id;
  private Cuaderno cuaderno;
  private Parte parte;
  private Tribunal tribunal;

  public CuadernoParte() {
  }

  public CuadernoParte(Long id, Cuaderno cuaderno, Parte parte,
      Tribunal tribunal) {
    this.id = id;
    this.cuaderno = cuaderno;
    this.parte = parte;
    this.tribunal = tribunal;
  }

  @Id
  @Column(name = "CRR_CUADERNO_PARTE")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @ManyToOne
  @JoinColumn(name = "CRR_CUADERNO")
  public Cuaderno getCuaderno() {
    return cuaderno;
  }

  public void setCuaderno(Cuaderno cuaderno) {
    this.cuaderno = cuaderno;
  }

  @ManyToOne
  @JoinColumn(name = "CRR_PARTE")
  public Parte getParte() {
    return parte;
  }

  public void setParte(Parte parte) {
    this.parte = parte;
  }

  @ManyToOne
  @JoinColumn(name = "COD_TRIBUNAL")
  public Tribunal getTribunal() {
    return tribunal;
  }

  public void setTribunal(Tribunal tribunal) {
    this.tribunal = tribunal;
  }

  @Override
  public String toString() {
    return "CuadernoParte{" +
        "id=" + id +
        ", cuaderno=" + cuaderno +
        ", parte=" + parte +
        ", tribunal=" + tribunal +
        '}';
  }
}
