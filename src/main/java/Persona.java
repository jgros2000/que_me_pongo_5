import java.util.ArrayList;
import java.util.List;

public class Persona {

  List<Guardarropa> guardarropas = new ArrayList<>();

  public void nuevoGuardarropa(){
    this.guardarropas.add(new Guardarropa());
  }

  public void nuevoGuardarropa(Guardarropa guardarropa){
    this.guardarropas.add(guardarropa);
  }

  public void proponerAgregarPrenda(Guardarropa guard,Prenda prenda){
    guard.agregarPropuesta(new AgregarPrenda(prenda));
  }

  public void proponerQuitarPrenda(Guardarropa guard,Prenda prenda){
    guard.agregarPropuesta(new QuitarPrenda(prenda));
  }

  public List<Guardarropa> getGuardarropas() {
    return guardarropas;
  }
}
