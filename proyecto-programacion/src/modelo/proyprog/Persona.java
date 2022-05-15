package modelo.proyprog;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private long telefono;
    private String email;

    public Persona(String nombre, String apellidos, String dni, long telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
}