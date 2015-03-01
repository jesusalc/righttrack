package teamtreehouse.com.interactivestory.model;

import teamtreehouse.com.interactivestory.R;

/**
 * Created by benjakuben on 11/2/14.
 */
public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                "En su viaje de regreso desde el estudio de los anillos de Saturno, se oye una señal de socorro que parece venir de la superficie de Marte. Es extraño porque no ha habido una colonia allí en años. Aún más extraño, le está llamando por su nombre: \"Ayúdame, %1$s, eres mi única esperanza.\"",
                new Choice("Detengase e investige", 1),
                new Choice("Continuar a la Tierra", 2));

        mPages[1] = new Page(
                R.drawable.page1,
                "Usted hábilmente aterrizar su nave cerca de donde se originó la señal de socorro. Usted no nota algo extraño en su acercamiento, pero no hay una cueva en frente de usted. Detrás de ti es una Nave abandonada de principios del siglo 21.",
                new Choice("Explore la cueva", 3),
                new Choice("Explorar la Nave", 4));

        mPages[2] = new Page(
                R.drawable.page2,
                "Usted sigue su curso a la Tierra. Dos días más tarde, recibe una transmisión de la Tierra diciendo que han detectado algún tipo de anomalía en la superficie de Marte, cerca de una estación móvil abandonado. Te piden que investigue, pero en última instancia la decisión es suya porque su misión ya se ha ejecutado mucho más tiempo de lo previsto y los suministros están bajos.",
                new Choice("Devolverse de vuelta a Marte para investigar", 4),
                new Choice("Continuar a la Tierra", 6));

        mPages[3] = new Page(
                R.drawable.page3,
                "Su traje astronauta está equipado con un luces, que se utiliza para navegar por la cueva. Después de buscar durante un tiempo sus niveles de oxígeno están empezando a bajar. Usted sabe que debe ir rellenar su tanque, pero hay una luz muy tenue adelante.",
                new Choice("Vuelva a llenarse en su Nave y explorar la Nave abandonada", 4),
                new Choice("Continuar hacia la luz tenue", 5));

        mPages[4] = new Page(
                R.drawable.page4,
                "La Nave abandonada está cubierta de polvo y la mayoría de los paneles solares están rotos. Pero usted es bastante sorprendido de ver el sistema de a bordo prendido y funcionando. De hecho, hay un mensaje en la pantalla: \"%1$s, vienen a 28.543436, -81.369031.\" Esas coordenadas no están muy lejos, pero usted no sabe si su oxígeno durará ida y vuelta.",
                new Choice("Explore hacia coordenadas", 5),
                new Choice("Regresar a la Tierra", 6));

        mPages[5] = new Page(
                R.drawable.page5,
                "Después de un largo paseo un poco cuesta arriba, llegas a la parte superior de un pequeño cráter. Miras a tu alrededor, y está encantado de ver a tu Android favorito,%1$s-S1124. Se había perdido en una misión anterior a Marte! Se toma de nuevo a su nave y volar de vuelta a la Tierra.");

        mPages[6] = new Page(
                R.drawable.page6,
                "Llega a su casa en la Tierra. Mientras que su misión fue un éxito, que siempre se pregunta lo enviaba esa señal. Quizás una futura misión será capaz de investigar ...");
    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}








