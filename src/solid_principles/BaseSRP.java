package solid_principles;

// SRP 单一职责
// Single Responsibility Principles
// Every function, class or module has only one raison to change
public class BaseSRP {

    // Identifying Multiple Reasons to Change: 注意职责和功能的划分, 引起改变的原因
    // 1. If-Statement
    // 2. Switch-Statement
    // 3. Monster Methods
    // 4. God Class
    // 5. People

    // The Danger of Multiple Responsibilities:
    // 1. Harder to Read
    // 2. Poor Quality
    // 3. Unexpected Behaviour
    // 4. High Coupling

    // Application SRP:
    // 提取class, function, module中多个原因改变的集中的地方
    // 抽离到不同的局部中，变得短小，使得改变容易并且减少相互间的依赖
}