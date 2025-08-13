package model.Smartphones;

public abstract class Smartphone  {
  private String nroSerie;
  private String modelo;
  private int anio;
  private float costoBase;


  public Smartphone (String nroSerie, String modelo, int anio, float costoBase) {
    this.nroSerie = nroSerie;
    this.modelo = modelo;
    this.anio = anio;
    this.costoBase = costoBase;
  }


  //Getters y Seters
  public String getNroSerie() {
    return nroSerie;
  }

  public void setNroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public float getCostoBase() {
    return costoBase;
  }

  public void setCostoBase(float costoBase) {
    this.costoBase = costoBase;
  }

  public abstract String getTipo();
}
