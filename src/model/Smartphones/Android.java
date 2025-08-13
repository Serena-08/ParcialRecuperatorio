package model.Smartphones;

public class Android extends Smartphone {
  private Smartphone smartphone;

  public Android() {
  }

  public Android(String nroSerie, String modelo, int anio, float costoBase) {
    super(nroSerie, modelo, anio, costoBase);
  }

  @Override
  public String getTipo (){
    return "Android";
  }

}
