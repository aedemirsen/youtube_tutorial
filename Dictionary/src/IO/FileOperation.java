package IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {

    public static FileOperation fileOperation = new FileOperation();

    public List<String> readFileToStringList(String txtPath) throws IOException {
          return Files.readAllLines(Path.of(txtPath));

//        List<String> lines = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new FileReader(txtPath));
//        String line = reader.readLine();
//        while(line != null){
//            lines.add(line);
//            line = reader.readLine();
//        }
//        reader.close();
//        return lines;

    }

    public void writeToFile(String txtPath, String newLine) throws IOException {
        FileWriter writer = new FileWriter(txtPath,true);
        writer.write(newLine+"\n");
        writer.close();
    }
}
