package core;

// TODO: 核心几大设计模式
// 1. Factory   工厂模式
// 2. Singleton 单列模式
// 3. decorator 装饰模式
// 4. strategy  策略模式   https://www.youtube.com/watch?v=25qf3VkAlis
// 5. template method 模板方法模式
// 6. visitor   访问者模式
public class ArchitectPrinciples {

    // 如何理解面向对象的基本原则 SOLID原则
    // https://towardsdatascience.com/why-solid-principles-are-not-a-solid-solution-for-software-design-fa71b6017ed6
    
    //  ASP 4层分层架构:
    //   1. 表示层: 将数据传递到系统的其他地方
    //            输入模型：输入数据被封装在HTTP请求中，输入数据代表提交给服务器处理的数据
    //            视图模型：控制器选择要使用的HTML模板，将模板和数据传递给试图引擎进行渲染，生成供浏览器使用的标记
    //   2. 应用层: 协调表示层触发的任何任务，执行所以特定于UI的数据转换
    //             按照用户的视角将业务过程抽象出来，并将过程映射到应用程序的后端
    //   3. 领域层: 在表示层中可以任意重复的特定业务的核心逻辑，处理业务规则和任务
    //             领域逻辑提供的代码和工作流是针对业务领域的，而不是针对具体的应用程序功能
    //   4. 基础结构层: 数据持久化(数据访问层)，外部Web服务，日志记录，跟踪，电子邮件，缓存...
}
