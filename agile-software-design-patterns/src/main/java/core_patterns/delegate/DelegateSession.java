package core_patterns.delegate;

import org.hibernate.Session;
import org.hibernate.query.MutationQuery;

// 对Hibernate Session的委托delegate，对session方法的调回被委托成调用其他方法
public class DelegateSession implements AutoCloseable {

    private final Session delegateSession;

    public DelegateSession(Session delegateSession) {
        this.delegateSession = delegateSession;
    }

    public void save(Object object) {
        delegateSession.persist(object);
    }

    public MutationQuery createQuery(String queryString) {
        return delegateSession.createMutationQuery(queryString);
    }

    // DelegateSession生命周期: 在使用try-with-resources时能够被自动调用
    @Override
    public void close() throws Exception {
        delegateSession.close();
    }
}
