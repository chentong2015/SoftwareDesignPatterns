package base.software.extensions;

public interface SqlGenerator {

    int PRIORITY_DEFAULT = 1;
    int PRIORITY_DATABASE = 5;
    
    int getPriority();
}
