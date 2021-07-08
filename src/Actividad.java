class Alumno {

    public String nombre;
    int[] calificaciones = new int[]{100, 90, 80, 100, 70};

    public Alumno(String nombres){
        this.nombre=nombres;
    }

    public int getPromedio() {
        int suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        int promedio;
        promedio = (suma / calificaciones.length);
        return promedio;
    }

    public String getcalificacion() {
        String resultado;
        int calificacion = getPromedio();
        if (calificacion > 90) {
            resultado = "A";
        } else if (calificacion > 80) {
            resultado = "B";
        }else if (calificacion > 70) {
            resultado = "C";
        }else if (calificacion > 60) {
            resultado = "D";
        }else if (calificacion > 50) {
            resultado = "E";
        }else {
            resultado = "F";
        }
        return resultado;
    }

    public String getResultados() {
        String resultados;
        resultados="Nombre del estudiante: " + nombre + "\n" +
                "Calificación 1: "+calificaciones [0] +"\n" +
                "Calificación 2: "+calificaciones [1] +"\n" +
                "Calificación 3: "+calificaciones [2] +"\n" +
                "Calificación 4: "+calificaciones [3] +"\n" +
                "Calificación 5: "+calificaciones [4] +"\n" +
                "Promedio: "+getPromedio()+"\n" +
                "Calificación: " + getcalificacion();
        return resultados;
    }
}
public class Actividad {
    public static void main(String[] args) {
        Alumno alumno_1 = new Alumno("Juan");
        System.out.println(alumno_1.getResultados());
    }
}
