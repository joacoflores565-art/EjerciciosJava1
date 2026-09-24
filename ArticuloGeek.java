
public class ArticuloGeek {
    private String nombre;
    private double precio;

    public ArticuloGeek(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

class ColeccionLote {
    private String descripcion;
    private ArticuloGeek articuloPrincipal;
    private ArticuloGeek articuloSecundario;

    public ColeccionLote(String descripcion, ArticuloGeek articuloPrincipal, ArticuloGeek articuloSecundario) {
        this.descripcion = descripcion;
        this.articuloPrincipal = articuloPrincipal;
        this.articuloSecundario = articuloSecundario;
    }

    public double calcularValorLote() {
        return articuloPrincipal.getPrecio() + articuloSecundario.getPrecio();
    }

    public void mostrarDetalleLote() {
        System.out.println("Lote: " + descripcion);
        System.out.println("- " + articuloPrincipal.getNombre() + ": $" + articuloPrincipal.getPrecio());
        System.out.println("- " + articuloSecundario.getNombre() + ": $" + articuloSecundario.getPrecio());
        System.out.println("Valor total del lote: $" + calcularValorLote());
    }

    public static void main(String[] args) {
        ArticuloGeek a1 = new ArticuloGeek("Teclado Mecánico", 15000);
        ArticuloGeek a2 = new ArticuloGeek("Mouse Gamer", 7000);

        ColeccionLote lote = new ColeccionLote("Combo Gamer", a1, a2);
        lote.mostrarDetalleLote();
    }
}