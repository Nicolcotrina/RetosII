package Retos;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        
        int fecha;

        Scanner capturar = new Scanner(System.in);
            System.out.println("Bienvenido al programa para ver su signo zodiacal con sus características\n");

            System.out.println("Por favor ingrese un numero para elegir su signo en base a las fechas: ");
            System.out.println("(1) Aries: del 21 de marzo al 19 de abril.\n(2) Tauro: del 20 de abril al 20 de mayo.\n(3) Géminis: del 21 de mayo al 20 de junio.\n(4) Cáncer: del 21 de junio al 22 de julio.\n(5) Leo: del 23 de julio al 22 de agosto.\n(6) Virgo: del 23 de agosto al 22 de septiembre.\n(7) Libra: del 23 de septiembre al 22 de octubre.\n(8) Escorpio: del 23 de octubre al 21 de noviembre.\n(9) Sagitario: del 22 de noviembre al 21 de diciembre.\n(10) Capricornio: del 22 de diciembre al 19 de enero.\n(11) Acuario: del 20 de enero al 18 de febrero.\n(12) Piscis: del 19 de febrero al 20 de marzo.");
            fecha=capturar.nextInt();

        if(fecha==1){
            System.out.println("El signo es Aries, Como el primer signo del zodiaco, no es de extrañar que Aries siempre esté dispuesto a lanzarse de cabeza a un desafío. Esta actitud positiva significa que ellos no dejan que los contratiempos de la vida los paren durante mucho tiempo. Para ellos siempre hay una nueva montaña que conquistar.");
        }else if(fecha==2){
            System.out.println("El signo es Tauro, Como signo de tierra, el toro de la esfera zodiacal es conocido por mantener los pies muy bien puestos en el suelo, son personas prácticas y responsables. Son una constante en la vida de todos, este sentido de la fiabilidad es lo que ayuda a sus amigos recurran a ellos cuando las cosas se ponen difíciles.");
        }else if(fecha==3){
            System.out.println("El signo es Geminis, Las gemelas del zodiaco tienen una refrescante dualidad que les hace atraer a la gente como un imán. Inquisitivas, pero adaptables, juguetonas, pero sensibles, ¡así eres tú, Géminis! Algunos podrían llamarte indecisa, pero este sentido de la curiosidad por lo que el mundo tiene que ofrecerte significa que las cosas nunca serán aburridas para ti.");
        }else if(fecha==4){
            System.out.println("El signo es Cáncer, Con un mundo emocional dictado por la pasión, la calidez y un espíritu afectuoso, un Cáncer es más leal que nadie. Es el signo más hogareño de la rueda zodiacal, sus seres queridos se sienten realmente en casa cuando están junto a ellos. ");
        }else if(fecha==5){
            System.out.println("El signo es Leo, Extrovertidos, alegres y teatrales, ¡nadie podría acusar a Leo de sufrir por falta de confianza! Ellos saben lo que quieren en la vida y no tienen reparos en conseguirlo. Puede que el mundo piense que les encanta ser el centro de atención, pero es obvio que las cámaras los adoran. ");
        }else if(fecha==6){
            System.out.println("El signo es Virgo, Si quieres que algo se haga, llama a cualquiera. Pero si quieres algo bien hecho, llama a un Virgo. Metódicos, meticulosos y detallistas hasta el extremo. Si el mundo es un caos, está claro que solo los de este signo lo pueden poner en orden.");
        }else if(fecha==7){
            System.out.println("El signo es Libra, La armonía y la paz ocupan un lugar destacado en la carta de presentación de tu signo del zodiaco, y con razón. Simbolizado por la balanza, son conocidos por el sentido de la equidad y la justicia, que los impulsan a establecer el equilibrio en todos los aspectos de su vida.");
        }else if(fecha==8){
            System.out.println("El signo es Escorpio, Entre los signos más incomprendidos del zodíaco. Muchos los ven como agresivos y conflictivos, pero en realidad tienen pasión por defender las causas perdidas. Su naturaleza profundamente apasionada significa que nunca se rendirán sin luchar.");
        }else if(fecha==9){
            System.out.println("El signo es Sagitario, Como signo de fuego, tu búsqueda del conocimiento está destinada a llevarte a grandes lugares. Espíritu errante, tu personalidad inconformista no echa raíces fácilmente, no cuando todavía te queda un mundo por descubrir. ");
        }else if(fecha==10){
            System.out.println("El signo es Capricornio, Metódicos, prácticos y decididos, los Capricornio no se detienen cuando tienen un objetivo en mente. A ellos no les gustan las charlas triviales ni los halagos vanidosos, por lo que su círculo íntimo es pequeño pero muy leal.");
        }else if(fecha==11){
            System.out.println("El signo es Acuario, No se deje engañar por la palabra ‘acuario’. Este signo de aire no es de los que se atan a ideales arbitrarios. A riesgo de ganarse la reputación de distantes y distanciadas, este signo analítico e innovador prefiere situarse al margen de la multitud en lugar de seguir al rebaño.");
        }else if(fecha==12){
            System.out.println("El signo es Piscis, Sí, Piscis tiende a ver el mundo a través de lentes de sol color de rosa, pero su alma romántica se basa en un profundo sentido de la intuición, la sensibilidad y la empatía que le ayudan a conectar con la gente a un nivel más profundo, incluso más allá de lo que el mundo ve.");
        }else{
            System.out.println("El signo no es válido");
        }
        capturar.close();
    }
}
    