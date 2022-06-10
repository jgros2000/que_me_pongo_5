public class AgregarPrenda implements Propuesta{

  Prenda prenda;


  public AgregarPrenda(Prenda prenda){
    this.prenda = prenda;
  }

  @Override
  public void aplicarEnGuardarropa(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(this.prenda);
  }

  public void deshacer(Guardarropa guardarropa){
    guardarropa.quitarPrenda(this.prenda);
  }

}
