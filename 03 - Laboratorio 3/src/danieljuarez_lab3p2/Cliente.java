package danieljuarez_lab3p2;

import java.util.ArrayList;

public class Cliente {
    
    public String nombre;
    public int edad;
    public int id;
    public String usuario;
    public String contraseña;
    public ArrayList<Apartamento> ApartamentosBought = new ArrayList<>();
    public ArrayList<Edificio> EdificiosBought = new ArrayList<>();
    public ArrayList<Casa> CasasBought = new ArrayList<>();

    public Cliente(String nombre, int edad, int id, String usuario, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Apartamento> getApartamentosBought() {
        return ApartamentosBought;
    }

    public void setApartamentosBought(ArrayList<Apartamento> ApartamentosBought) {
        this.ApartamentosBought = ApartamentosBought;
    }

    public ArrayList<Casa> getCasasBought() {
        return CasasBought;
    }

    public void setCasasBought(ArrayList<Casa> CasasBought) {
        this.CasasBought = CasasBought;
    }

    public ArrayList<Edificio> getEdificiosBought() {
        return EdificiosBought;
    }

    public void setEdificiosBought(ArrayList<Edificio> EdificiosBought) {
        this.EdificiosBought = EdificiosBought;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", ApartamentosBought=" + ApartamentosBought + ", EdificiosBought=" + EdificiosBought + ", CasasBought=" + CasasBought + '}';
    }
    
    
    
}
