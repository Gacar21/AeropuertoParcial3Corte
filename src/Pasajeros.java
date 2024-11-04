public class Pasajeros {
    String nombre;
    String NumPasaporte;
    String AsignarPuesto;
    String Nacionalidad;


    public Pasajeros(String nombre, String numPasaporte, String asignarPuesto, String nacionalidad) {
        this.nombre = nombre;
        NumPasaporte = numPasaporte;
        AsignarPuesto = asignarPuesto;
        Nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumPasaporte() {
        return NumPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        NumPasaporte = numPasaporte;
    }

    public String getAsignarPuesto() {
        return AsignarPuesto;
    }

    public void setAsignarPuesto(String asignarPuesto) {
        AsignarPuesto = asignarPuesto;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
}