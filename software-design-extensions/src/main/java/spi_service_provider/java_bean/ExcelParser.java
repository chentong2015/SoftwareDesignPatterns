package spi_service_provider.java_bean;

public class ExcelParser implements IDocumentParser {

    @Override
    public void parse() {
        System.out.println("Parse excel");
    }
}
