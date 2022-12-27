package com.java.spi.model;

public class ExcelParser implements IDocumentParser {

    @Override
    public void parse() {
        System.out.println("Parse excel");
    }
}
