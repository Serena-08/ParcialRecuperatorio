package model.Smartphones;

public class Iphone extends Smartphone {
  private Smartphone smartphone;

  public Iphone(String nroSerie, String modelo, int anio, float costoBase) {
    super(nroSerie, modelo, anio, costoBase);
  }

  @Override
  public String getTipo() {
    return "";
  }

  public Smartphone getSmartphone() {
    return smartphone;
  }

  public void setSmartphone(Smartphone smartphone) {
    this.smartphone = smartphone;
  }
}
