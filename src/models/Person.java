package models;

import java.util.Date;

/**
 * Clase de Persona.
 * @author Gustavo
 */
public class Person {

    private int     id;

    private String  name,
                    surname,
                    direction,
                    email;
    
    private Date    birthday;
    
    private long    phone;
    
    private char    state;

    /**
     * Constructor de la clase Persona.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre de la persona.
     * @param surname Apellido de la persona.
     * @param birthday Día de cumpleaños.
     * @param phone Teléfono de la persona.
     * @param direction Dirección de la persona.
     * @param email Correo electrónico de la persona.
     * @param state Estado (Activo o Inactivo).
     */
    public Person(int id, String name, String surname, Date birthday, long phone, 
            String direction, String email, char state) {

        super();

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.phone = phone;
        this.direction = direction;
        this.email = email;
        this.state = state;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

}
