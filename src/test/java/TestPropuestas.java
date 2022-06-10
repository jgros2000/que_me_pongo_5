import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPropuestas {

  Persona unaPersona;
  Persona otraPersona;
  Prenda pantalon;

  @BeforeEach
  public void Iniciar(){
    Guardarropa guar = new Guardarropa();
    pantalon = new Prenda("pantalon","marron");
    guar.agregarPrenda(pantalon);
    unaPersona = new Persona();
    otraPersona = new Persona();
    unaPersona.nuevoGuardarropa(guar);
  }

  @Test
  public void compartenGuardarropa(){
    Prenda camisa = new Prenda("camisa","blanca");
    otraPersona.nuevoGuardarropa(unaPersona.getGuardarropas().get(0));
    unaPersona.getGuardarropas().get(0).agregarPrenda(camisa);

    Assertions.assertEquals(unaPersona.getGuardarropas().get(0),otraPersona.getGuardarropas().get(0));
  }

  @Test
  public void agregarPropuestaPrenda(){
    Prenda camisa = new Prenda("camisa","blanca");
    otraPersona.proponerAgregarPrenda(unaPersona.getGuardarropas().get(0),camisa);

    Assertions.assertEquals(unaPersona.getGuardarropas().get(0).propuestasPrendas.size(),1);
    Assertions.assertEquals(unaPersona.getGuardarropas().get(0).prendas.size(),1);
  }

  @Test
  public void aceptarPropuestaAgregarPrenda(){
    Guardarropa guardarropa = unaPersona.getGuardarropas().get(0);
    Prenda camisa = new Prenda("camisa","blanca");
    otraPersona.proponerAgregarPrenda(guardarropa,camisa);

    guardarropa.aceptarPropuesta(guardarropa.getPropuestasPrendas().get(0));
    Assertions.assertEquals(unaPersona.getGuardarropas().get(0).propuestasPrendas.size(),0);
    Assertions.assertEquals(unaPersona.getGuardarropas().get(0).prendas.size(),2);
  }

  @Test
  public void aceptarPropuestaQuitarPrenda(){
    Guardarropa guardarropa = unaPersona.getGuardarropas().get(0);
    otraPersona.proponerQuitarPrenda(guardarropa,pantalon);

    guardarropa.aceptarPropuesta(guardarropa.getPropuestasPrendas().get(0));
    Assertions.assertEquals(unaPersona.getGuardarropas().get(0).propuestasPrendas.size(),0);
    Assertions.assertFalse(unaPersona.getGuardarropas().get(0).prendas.contains(pantalon));
  }
}
