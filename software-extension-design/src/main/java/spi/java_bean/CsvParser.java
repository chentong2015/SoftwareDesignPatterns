package spi.java_bean;

public class CsvParser implements IDocumentParser {

    @Override
    public void parse() {
        System.out.println("Parse Word");
    }
}
