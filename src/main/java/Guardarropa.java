import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
  List<Prenda> prendas = new ArrayList<>();
  List<Propuesta> propuestasPrendas = new ArrayList<>();
  List<Propuesta> propuestasAceptadas = new ArrayList<>();


  public void agregarPropuesta(Propuesta propuesta){
    this.propuestasPrendas.add(propuesta);
  }

  public void aceptarPropuesta(Propuesta propuesta){
    this.propuestasPrendas.remove(propuesta);
    propuesta.aplicarEnGuardarropa(this);
  }

  public void rechazarPropuesta(Propuesta propuesta){
    this.propuestasPrendas.remove(propuesta);
  }

  public void deshacerPropuesta(Propuesta propuesta){
    this.propuestasPrendas.add(propuesta);
    propuesta.deshacer(this);
  }

  public void agregarPrenda(Prenda prenda){
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    this.prendas.remove(prenda);
  }

  public List<Propuesta> getPropuestasPrendas() {
    return propuestasPrendas;
  }

  public List<Propuesta> getPropuestasAceptadas() {
    return propuestasPrendas;
  }
}
