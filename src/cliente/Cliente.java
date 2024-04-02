package cliente;

import java.util.Objects;

public class Cliente {

    private static int contId=0;
    private int id;
    private final long dni;//hacer esta la clave y verificar que no este cargado ese dni!
    private String nombre;
    private String apellido;
    private String email;

    public Cliente(long dni, String nombre, String apellido, String email) {
        this.dni = dni;
        contId++;
        this.id = contId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public long getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarCliente() {
        System.out.printf("%5d %10d %15s %15s %25s\n",this.getId(),this.getDni(),this.getNombre(),this.getApellido(),this.getEmail());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

//    @Override
//    public String toString() {
//        return "Cliente{" +
//                "id=" + id +
//                ", nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}
