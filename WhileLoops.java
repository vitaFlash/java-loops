import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int randomNumber;
        randomNumber = getRandomNumber(10);
        while (randomNumber != 7) {
            System.out.println("Número aleatorio: " + randomNumber);
            randomNumber = getRandomNumber(10);
        }

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        randomNumber = getRandomNumber(100);
        while (randomNumber <= 70) {
            System.out.println("Número aleatorio: " + randomNumber);
            randomNumber = getRandomNumber(100);
        }
        


        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100.
        // El usuario debe adivinar el número aleatorio y el programa debe seguir
        // solicitando intentos hasta que el usuario adivine correctamente.
        // Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado.
        // Has de usar la función getRandomNumber
        randomNumber = getRandomNumber(100);
        int userGuess;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Adivina el número entre 1 y 100: ");
            userGuess = scanner.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("El número es mayor.");
            } else if (userGuess > randomNumber) {
                System.out.println("El número es menor.");
            }
        } while (userGuess != randomNumber);
        System.out.println("¡Felicidades! Adivinaste el número: " + randomNumber);


    
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
