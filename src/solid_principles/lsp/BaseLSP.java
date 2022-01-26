package solid_principles.lsp;

// LSP 替换原则: 子类都能替换母类，而不造成问题
// Liskov Substitution Principle
// 1. If S is subtype of T, then object of type T may be replaced with objects of S
//    without modifying the functionality of the program
// 2. Any object of a type must be substitutable by objects of a derived typed
//    without altering the correctness of the program
public class BaseLSP {

    // LSP 主要解决类型之间不正确的关系
    // 1. "Eliminate incorrect relations between objects"
    // 2. "Use 'Tell, do not ask' principle to eliminate type checking and casting"

    // Apply LSP
    // 1. 使用继承必须符号IS-A的逻辑关系，确定衍生类可以被原始类替换 !!
    // 2. Keep base classes small and focused
    // 3. Keep interfaces lean 接口不能太大
}
