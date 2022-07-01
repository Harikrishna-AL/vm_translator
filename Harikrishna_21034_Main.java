import java.io.IOException;

public class Harikrishna_21034_Main {

    public static void main(String[] args) throws IOException {
        
        Harikrishna_21034_ParserAndCodeWriter translator = new Harikrishna_21034_ParserAndCodeWriter();

        String FileName = "StackTest.vm";

        translator.codeWriter(translator.parser(FileName), FileName);


    }

}