package design_patterns.delegate;

// 委托模式：将该类型下面的方法委托给"routing路由"相应的方法，统一路由，抽象统一的执行逻辑
public class JavaDelegate {

    // MyBatis源码设计模式
    // public class RoutingStatementHandler implements StatementHandler {
    //
    //  private final StatementHandler delegate;
    //
    //  public RoutingStatementHandler(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) {
    //    switch (ms.getStatementType()) {
    //      case STATEMENT:
    //        delegate = new SimpleStatementHandler(executor, ms, parameter, rowBounds, resultHandler, boundSql);
    //        break;
    //      case PREPARED:
    //        delegate = new PreparedStatementHandler(executor, ms, parameter, rowBounds, resultHandler, boundSql);
    //        break;
    //      case CALLABLE:
    //        delegate = new CallableStatementHandler(executor, ms, parameter, rowBounds, resultHandler, boundSql);
    //        break;
    //      default:
    //        throw new ExecutorException("Unknown statement type: " + ms.getStatementType());
    //    }
    //  }
    //
    //  @Override
    //  public Statement prepare(Connection connection, Integer transactionTimeout) throws SQLException {
    //    return delegate.prepare(connection, transactionTimeout);
    //  }
    //
    //  @Override
    //  public void parameterize(Statement statement) throws SQLException {
    //    delegate.parameterize(statement);
    //  }
    //
    //  @Override
    //  public void batch(Statement statement) throws SQLException {
    //    delegate.batch(statement);
    //  }
    //  ...
}
