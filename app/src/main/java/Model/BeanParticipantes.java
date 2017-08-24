package Model;

import java.io.Serializable;

/**
 * Created by Itheron on 15/08/2017.
 */

public class BeanParticipantes implements Serializable{

    String name;
    String email;
    String telefono;
    String charge;

    public BeanParticipantes(String name, String email, String telefono, String charge) {
        this.name = name;
        this.email = email;
        this.telefono = telefono;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCharge(){
        return charge;
    }

    public void setCharge(String charge){
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "BeanParticipantes{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", charge='" + charge + '\'' +
                '}';
    }
}
