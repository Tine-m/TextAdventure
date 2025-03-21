package observers;

import game.Observer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


// Observer that logs updates to a file
public class Log implements Observer {
    private String logFileName;

    public Log(String logFileName) {
        this.logFileName = logFileName;
    }

    @Override
    public void update(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFileName, true))) {
            writer.println(message);
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}