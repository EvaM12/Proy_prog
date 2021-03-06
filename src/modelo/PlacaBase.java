package modelo;


public class PlacaBase extends Producto {

    private String socket;
    private String tipo;

    public PlacaBase(String Socket, String Tipo, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.socket = Socket;
        this.tipo = Tipo;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String Socket) {
        this.socket = Socket;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }
    
    @Override
    public float pvp() {
        return super.getPrecio() * 1.15f;
    }
}
