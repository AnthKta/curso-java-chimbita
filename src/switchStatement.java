public class switchStatement {
    public static void main(String[] args) {
        int diaDeLaSemana = 3;
        switch (diaDeLaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Dia Invalido");
        }
    }
}
//Crear un programa que pida la edad y la calificacion de un estudiante
//Si la edad es menor que 13 imprimir Nino
//Si la edad esta entre 13 y 17 imprimir Adolecente
//Si la edad es mayor o igual a 18 imprimir Adulto
//Luego la calificacion puede ser de 1 - 5 1->Deficiente 2->Insuficiente 3->Aceptable 4->Sobresaliente 5->CHIMBITA!!!
//Si intento entrar algo diferente a algun numero que imprima un mensaje de error diferente
//Como un PR Abierto en el repositorio
