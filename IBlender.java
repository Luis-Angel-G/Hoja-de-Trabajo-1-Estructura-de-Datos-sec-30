/**
 * La interfaz IBlender define los métodos necesarios para el funcionamiento de la licuadora, es
 * la interfaz compartida entre los grupos de la clase
* @Project : Hoja de trabajo 1
* @author (Creado en conjunto con los grupos del salón)
* Creacion 17.01.2025
* Ultima modificacion 23.01.2025
* @File Name: IBlender.java
 */

public interface IBlender{

    /**
     * Aumenta la velocidad de la licuadora.
     */
    void SpeedUp();

    /**
     * Verifica si la licuadora tiene ingredientes.
     *
     * @return Un boolean entre verdadero y falso.
     */
    boolean IsFull();

    /**
     * Cambia el valor de IsFull a verdadero ya que se agregó un ingrediente a la licuadora.
     */
    void Fill();

    /**
     * Cambia el valor de IsFull a falso ya que se vació la licuadora.
     */
    void Empty();

    /**
     * Disminuye la velocidad de la licuadora.
     */
    void SpeedDown();

    /**
     * Obtiene la velocidad actual de la licuadora.
     *
     * @return El número de la velocidad de la licuadora.
     */
    int GetSpeed();
}