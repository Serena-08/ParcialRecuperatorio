package model.taller;

import model.Smartphones.Smartphone;

import java.util.ArrayList;

public class Taller {
  private float ganancias;
  private int cantidadDeReparaciones;
  ArrayList<Smartphone> smartphones[];

  public Taller() {}

  public Taller(float ganancias, int cantidadDeReparaciones) {
    this.ganancias = ganancias;
    this.cantidadDeReparaciones = cantidadDeReparaciones;
  }

  //Getters.

  public float getGanancias() {
    return ganancias;
  }
  public int getCantidadDeReparaciones() {
    return cantidadDeReparaciones;
  }

  //Setters
  public void setGanancias(float ganancias) {
    this.ganancias = ganancias;
  }
  public void setCantidadDeReparaciones(int cantidadDeReparaciones) {
    this.cantidadDeReparaciones = cantidadDeReparaciones;
  }



}
