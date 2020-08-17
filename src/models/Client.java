
package models;

import java.util.Date;

/**
 * Clase de Cliente.
 * @author Gustavo
 */
public class Client extends Person{
    
    /**
     * Constructor de la clase Cliente.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre del cliente.
     * @param surname Apellido del cliente.
     * @param birthday Cumpleaños del cliente.
     * @param phone Teléfono del cliente.
     * @param direction Dirección del cliente.
     * @param email Correo electrónico del cliente.
     * @param state Estado (Activo o Inactivo).
     */
    public Client(int id, String name, String surname, Date birthday, long phone, 
            String direction, String email, char state) {
        
        super(id, name, surname, birthday, phone, direction, email, state);
    
    }
    
}
