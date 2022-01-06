package code_style.style_guide;

public class Guide02SourceFilesStructure {

    // 1. 源文件结构的组成(自动格式化的效果)，每个部分之间只留一个空行
    //   Copyright (c)
    //      如果需要，添加文件所属的版权信息
    //   package ...
    //      不换行，列的字符数目不受100字符限制 !!
    //   import ...
    //      保持引入的顺序性
    //      不换行，列的字符数目不受100字符限制 !!
    //      explicitly listing all imports 避免使用通配符引入 !!
    //      static imports和非静态引入独自在一个单独的模块中，一个空行分开
    //      Static import静态引入不用于静态嵌套类型，static nested classes直接正常引入
    //   One Top-Level class
    //      一个源文件中只有一个顶层class，且仅可能由一个class被标记成public

    // 2. Class declaration类的声明
    //   类的成员需要符合一定的逻辑顺序，不一定是按照时间追加在文件末尾
    //   重载不能分开: 多个构造器/重名方法时，位置保持连续，中间不插入其他代码

    // 3. Class and member modifiers 类和成员修饰符的固定顺序
    //    public protected private abstract default static final transient volatile synchronized native strictfp
}
