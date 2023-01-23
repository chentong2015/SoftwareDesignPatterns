package core_patterns.iterator;

import core_patterns.iterator.model.Iterator;
import core_patterns.iterator.model.NamesRepository;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NamesRepository namesRepository = new NamesRepository();
        Iterator iterator = namesRepository.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
