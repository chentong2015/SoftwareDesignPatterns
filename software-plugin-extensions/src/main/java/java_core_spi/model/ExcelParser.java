package java_core_spi.model;

public class ExcelParser implements IDocumentParser {

    @Override
    public void parse() {
        System.out.println("Parse excel");
    }
}
