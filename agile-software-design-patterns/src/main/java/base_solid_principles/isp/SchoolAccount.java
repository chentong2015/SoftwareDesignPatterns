package base_solid_principles.isp;

public class SchoolAccount implements IAccount {

    @Override
    public void processLocalTransfer(double amount) {
        // Business logic here
    }

    @Override
    public void processInternationalTransfer(double amount) {
        throw new RuntimeException("Not Implemented");
    }
}
