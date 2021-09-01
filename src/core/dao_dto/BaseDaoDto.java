package core.dao_dto;

// 项目基本结构设计模式
// 0. View UI层
// 1. Controller 控制层
// 2. Service 业务层
// 3. Dao layer 持久层
// 4. ORM层 / JDBC
// 5. 数据库系统
public class BaseDaoDto {

    // DAO(Data Access Object)层，数据持久层
    // 将应用持久层的细节(details persistence)抽象出来

    // DTO(Data transfer object) 数据库传送对象
    // 1. Data Model 一种数据结构
    // 2. Object used to encapsulate data, and send it from one sub system of config to anther
    //    数据封装的对象，用于在应用和系统之间进行传递：特别是数据库通信, 解析套接字传递的信息等场景

    // Active Record: 一种特殊的DTO形式
    // 1. 具有公共变量的数据结构和(对象才应该具有的)行为方法
}
