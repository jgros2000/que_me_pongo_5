public class QuitarPrenda implements Propuesta{

  Prenda prenda;


  public QuitarPrenda(Prenda prenda){
    this.prenda = prenda;
  }

  @Override
  public void aplicarEnGuardarropa(Guardarropa guardarropa) {
    guardarropa.quitarPrenda(this.prenda);
  }

  public void deshacer(Guardarropa guardarropa){
    guardarropa.agregarPrenda(this.prenda);
  }
}
