import java.util.HashMap;

public class hashmap {
        HashMap<String,Integer> personas=new HashMap();
        private String identificador;
        private int contraseña;

    public void setPersonas(HashMap<String, Integer> personas ,String identificador,int contraseña) {
        this.contraseña=contraseña;
        this.identificador=identificador;
        this.personas = personas;
    }

    public HashMap<String, Integer> getPersonas() {
        return personas;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

}
