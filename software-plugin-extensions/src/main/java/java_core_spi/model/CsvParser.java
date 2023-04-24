package java_core_spi.model;

public class CsvParser implements IDocumentParser {

    @Override
    public void parse() {
        System.out.println("Parse Word");
    }
}
