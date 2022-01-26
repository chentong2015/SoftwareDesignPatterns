package solid_principles.isp;

// 该接口是一个大接口，包含两种"方面"的逻辑，会给接口的实现造成问题
// 需要将接口拆分成两个: LocalAccount, InternationalAccount
public interface IAccount {

    void processLocalTransfer(double amount);

    void processInternationalTransfer(double amount);
}
