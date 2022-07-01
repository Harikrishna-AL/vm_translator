import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Harikrishna_21034_ParserAndCodeWriter {
    
    public ArrayList<String[]> parser(String fileName) throws IOException {

        ArrayList<String[]> fileData = new ArrayList<String[]>();
        String[] arr;
        FileReader fr=  new FileReader(fileName);
        BufferedReader br =new BufferedReader(fr);

        //Reading everyline
        String line;
        while( (line = br.readLine()) != null )  {
            //Ignores empty lines
            if(!(line.isEmpty())){
            //Ignores comments
            if(line.charAt(0)!='/'){
            arr = line.split(" ");
            fileData.add(arr);
            }
        }
        }

        br.close();
        fr.close();
        return fileData;
    }


    public void codeWriter(ArrayList<String[]> fileData, String filename) throws IOException{

        Harikrishna_21034_Translator operation = new Harikrishna_21034_Translator();
        String file = filename.substring(0, filename.indexOf("."));
        FileWriter fw = new FileWriter(file + ".asm");
        

        for (String[] line : fileData) {
            //Handles all operations
            if(line.length==1) fw.append(operation.ch_operation(line));
            //Handles all push and pop command
            if(line.length==3) fw.append(operation.ch_Command(line, filename));           
        }
        fw.close();

    }

}
