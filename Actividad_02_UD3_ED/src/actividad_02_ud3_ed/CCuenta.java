/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 *
 * @author juanma785
 * Esto indica el nombre del crdor del proyecto
 */
public class CCuenta {

    /**
     *Creamos la clase con el nombre que queremos titular
     */
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Creamos los datos privados  con sus String para representar una cadena de caracteres
     * y sus double para guardar números que son decimales o enteros
     */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Nombre de su cuenta
    * @param sal Nombre del salario que tiene en su cuenta
    * @param tipo Nombre del tipo
    * Representamos los datos y luego con los parametros hechos  se usa para indicar cada uno de los parametros
    * que tiene el constructror al que hace alusión.
    */
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Nombre del titular de la cuenta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     *
     * @return
     * En el caso de que el método no sea "void", se indicará lo que devuelve el return
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return
     * En el caso de que el método no sea "void", se indicará lo que devuelve el return
     */
    public double estado ()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     * Se indica el nombre de la excepción y se especifica cuales pueden lanzarse.
     * Comentario sobre las excepciones  que lanza
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     *
     * @return
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

    /**
     *
     * @return
     * En el caso de que el método no sea "void", se indicará lo que devuelve el return
     */
    public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
