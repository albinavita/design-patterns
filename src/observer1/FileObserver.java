package observer1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print("Погода изменилась. Температура = " + temp + ", Давление = " + presser );
            writer.println();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
