package lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadTextFile {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/lab5/wiersze.txt"));
        System.out.println(lines.size());

        for (int i = 0; i < lines.size(); i++) {

            if (i%100==0) {
                System.out.println(i);
            }

        }
        
    }


}
