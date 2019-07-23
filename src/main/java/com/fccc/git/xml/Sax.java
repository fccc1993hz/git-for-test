package com.fccc.git.xml;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by fccc on 2019/7/19
 */
public class Sax {
    private static final String FILE_LOCATION = "src\\main\\resources\\books.xml";

    public static void main(String[] args) {
        try {
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            SAXHandler saxHandler = new SAXHandler();
            saxParser.parse(FILE_LOCATION, saxHandler);

            saxHandler.getBooks().forEach(book -> {
                System.out.println("id=" + book.getId());
                System.out.println("name=" + book.getName());
                System.out.println("author=" + book.getAuthor());
                System.out.println("price=" + book.getPrice());
                System.out.println("-----------------------------");
            });
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
