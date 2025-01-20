package com.mycompany.gimnasio;
import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private String[] actividadesBasicas = {"Yoga", "Boxeo", "Funcional"};
    private ArrayList<String> actividades = new ArrayList<>();
    

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        for (int i = 0; i < actividadesBasicas.length; i++){
            actividades.add(actividadesBasicas[i]);
        }
    }    

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String usuario) {
        System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombre + ".");
    }
    
    public void nuevaActividad(String actividad){
        actividades.add(actividad);
    }
    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");
        miGimnasio.nuevaActividad("Baloncesto");
        miGimnasio.mostrarActividades();
    }
}
