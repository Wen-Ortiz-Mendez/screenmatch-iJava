import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la inmersion de Alura!");
        System.out.println("Pelicula : Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario =0;

        //System.out.println(nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Mejor evaluación:"+ evaluacion);
        System.out.println("Se incluye en el plan básico?: "+incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3 )/3;
        System.out.println("Media de la evaluacion de Matrix:" + mediaEvaluacion);

        if (fechaDeLanzamiento >+ 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3 ; i++) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a matrix:");
            double notaMatrix =  teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;

            
        }
        System.out.println("La media de la pelicula" + "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario/3);
    }
}