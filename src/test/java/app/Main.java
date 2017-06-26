package app;

import app.processors.BoardProcessor;
import app.processors.SearchBoardProcessor;
import org.neogroup.sparks.Application;
import org.neogroup.sparks.console.ConsoleModule;

public class Main {

    public static final long FIELD_MASK = 0xFF00;
    public static final int FIELD_OFFSET = Long.numberOfTrailingZeros(FIELD_MASK);

    public static void main(String[] args) {
        Application application = new Application();
        application.addModule(new ConsoleModule(application));
        application.registerProcessor(BoardProcessor.class);
        application.start();




        /*long move = 0;

        int square = 12;
        move = (move & ~FIELD_MASK) | ((square << FIELD_OFFSET) & FIELD_MASK);


        int obtainedSquare = (int)(move & FIELD_MASK) >>> FIELD_OFFSET;
        System.out.println (obtainedSquare);


        square = 10;
        move = (move & ~FIELD_MASK) | ((square << FIELD_OFFSET) & FIELD_MASK);

        int obtainedSquare2 = (int)(move & FIELD_MASK) >>> FIELD_OFFSET;
        System.out.println (obtainedSquare2);*/

    }
}
