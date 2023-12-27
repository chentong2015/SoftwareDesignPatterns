package immutable;

import java.util.Date;

// 将以下的类型设计成不可变类型，类型的实例在被创建后不可变化
// 1. init 在初始化对象属性值时创建另一个对象
// 2. getter 返回具有相同属性值的另一个对象
public class MyImmutableClassDemo {

    // TODO. 注意String是否会给不可变性造成影响
    private String name;
    private Date dateTime;

    public MyImmutableClassDemo(String name, Date dateTime) {
        this.name = name;
        this.dateTime = dateTime;
        // this.dateTime = new Date(dateTime.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getDateTime() {
        return dateTime;
        // return new Date(dateTime.getTime());
    }

    public static void main(String[] args) {
        MyImmutableClassDemo demo = new MyImmutableClassDemo("name", new Date());

        // TODO. 通过外部的String对象修改不了demo对象的属性值
        //  String作为不可变类型，每次赋值时都会重新创建新的对象，并将对象的引用赋值给遍历
        String name = demo.getName();
        name = "new name";

        // TODO. 修改取出的属性对象，才能造成对象本身被修改
        Date date = demo.getDateTime();
        date.setTime(100l);

        System.out.println(demo.getName());
        System.out.println(demo.getDateTime().getTime());
    }
}
