/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;



import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class App {
    public String getGreeting() {
        return "Hello World!";
    }



    public static String linter(Path path) throws IOException {
        int counter = 1;
        String error = "";

        BufferedReader reader = Files.newBufferedReader(path);
        String line = reader.readLine();

        while (line != null) {
            if (!line.contains("if") && !line.contains("else") && !line.endsWith("{") && !line.endsWith("}") && !line.contains("return") && !line.endsWith(";") && !line.isEmpty()) {
                error += ("Line " + counter + ": Missing semicolon.\n");

            }
            counter++;
            line = reader.readLine();
        }
        return error;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(linter(Path.of("C:\\Users\\Bayan\\Desktop\\java_fundamentals\\linter\\app\\src\\main\\resources\\gate.js")));

            }
}
