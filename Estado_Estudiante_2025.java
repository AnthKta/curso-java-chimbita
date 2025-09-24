void main() {
    Scanner scanner = new Scanner(System.in);

    int edad = 0;
    boolean edadvalida = false;

    while (!edadvalida) {
        System.out.print("Por favor, ingrese un número del 1 al 100 para saber tu edad: ");
        try {
            edad = scanner.nextInt();
            edadvalida = true;
            /*int entradavalida =
            if (entradavalida > 5 )*/
        } catch (InputMismatchException e) {
            System.out.println("⚠4️ Error: Ingrese un número válido, no texto. Intente de nuevo.");
            scanner.next(); // Esto limpia el buffer para evitar el bucle infinito
        }
    }
    if (edad < 0) {
        System.out.println("Aun no has nacido");
    } else if (edad < 13) {
        System.out.println("Eres un Niño de " + edad + " años");
    } else if (edad <= 17) {
        System.out.println("Eres un Adolecente de " + edad + " años");
    } else if (edad <= 100) {
        System.out.println("Eres un Adulto de " + edad + " años");
    } else {
        System.out.println("Edad Guiness Record");
    }


    int calificacion = 0;
    boolean calificacionValida = false;

    while (!calificacionValida) {
        System.out.print("Por favor, ingrese un número del 1 al 5 para saber tu calificacion: ");
        try {
            calificacion = scanner.nextInt();
            calificacionValida = true;
            /*int entradavalida =
            if (entradavalida > 5 )*/
        } catch (InputMismatchException e) {
            System.out.println("⚠4️ Error: Ingrese un número válido, no texto. Intente de nuevo.");
            scanner.next(); // Limpiamos el buffer para evitar el bucle infinito
        }
    }

    switch (calificacion) {
        case 0:
            System.out.println("Repite el año");
            break;
        case 1:
            System.out.println("Tu calificacion es Deficiente");
            break;
        case 2:
            System.out.println("Tu calificacion es Insuficiente");
            break;
        case 3:
            System.out.println("Tu calificacion es Aceptable");
            break;
        case 4:
            System.out.println("Tu calificacion es Sobresaliente");
            break;
        case 5:
            System.out.println("Tu calificacion es Chimbita");
            break;
        default:
            System.out.println("Calificación Invalida");

    }



    }
