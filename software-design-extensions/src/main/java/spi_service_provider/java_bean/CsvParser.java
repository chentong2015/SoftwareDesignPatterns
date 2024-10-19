package spi_service_provider.java_bean;

public class CsvParser implements IDocumentParser {

    @Override
    public void parse() {
        System.out.println("Parse Word");
    }
}
