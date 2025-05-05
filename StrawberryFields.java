public class StrawberryFields {

    //Escribe un programa que permita imprimir la canción Strawberry Fields Forever con un bucle.
    // Solo puedes tener 2 funciones, una que imprima los versos y otra que imprima el coro.
    //Busca información sobre bucles anidados.
    //Al final está la letra completa

    public static void main(String[] args) {
    playSong();
    }

    /**
     * Function name: playVersus
     *
     * @param number (int)
     *               <p>
     *               Inside the function:
     *               1. print versus according the position number
     */
    public static int playVersus(int number) {
        switch (number) {
            case 1:
                System.out.println("Living is easy with eyes closed\n" +
                        "Misunderstanding all you see\n" +
                        "It's getting hard to be someone, but it all works out\n" +
                        "It doesn't matter much to me");
                break;
            case 2:
                System.out.println("No one I think is in my tree\n" +
                        "I mean, it must be high or low\n" +
                        "That is, you can't, you know, tune in, but it's alright\n" +
                        "That is, I think it's not too bad");
                break;
            case 3:
                System.out.println("Always, no sometimes, think it's me\n" +
                        "But you know, I know when it's a dream\n" +
                        "I think I know, I mean a yes\n" +
                        "But it's all wrong\n" +
                        "That is, I think I disagree");
                break;
            default:
                System.out.println("Invalid number");
        }
        return number;
    }

    /**
     * Function name: playChorus
     * <p>
     * Inside the function:
     * 1. print chorus
     */
    public static void playChorus() {
        System.out.println("Let me take you down");
        System.out.println("'Cause I'm going to strawberry fields");
        System.out.println("Nothing is real");
        System.out.println("And nothing to get hung about");
        System.out.println("Strawberry fields forever");


    }

    /**
     * Function name: playSong
     * <p>
     * Inside the function:
     * 1. print the song
     */
    public static void playSong() {
        playChorus();
        for (int i = 1; i <= 3; i++) {
            playVersus(i);
            playChorus();
        }

    }
}


/* 
Strawberry Fields Forever
//chorus
Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
//Versus1
Living is easy with eyes closed
Misunderstanding all you see
It's getting hard to be someone, but it all works out
It doesn't matter much to me
//chorus
Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
//versus2
No one I think is in my tree
I mean, it must be high or low
That is, you can't, you know, tune in, but it's alright
That is, I think it's not too bad
//chorus
Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
//versus3
Always, no sometimes, think it's me
But you know, I know when it's a dream
I think I know, I mean a yes
But it's all wrong
That is, I think I disagree
//chorus
Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
*/