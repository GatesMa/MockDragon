# MockDragon

MockDragon 可以帮助mock数据，适合在写单测的时候用于mock数据。

### MockDragon Support

* mock基本类型数据
* mock对象类型数据
* 支持list、set范型数据生成
* 支持基本类型、支持包装类
* 支持多层嵌套对象类型数据生成
* 更多高级功能开发中。。。

**![logo](logo.png "mock dragon")**

### MockDragon Example

测试类如下

```java
public class Student {

    private String stuId;
    private Integer age;
    private Long money;
    private short size;
    private double height;
    private float weight;
    private List<String> classes;
    // Getter Setter...
}
```

只需要一行代码即可mock测试类的数据

```java
public class Test {

    public static void main(String[] args) {
        Student instance = MockDragon.createInstance(Student.class);
        System.out.println(JSONObject.toJSONString(instance, true));
    }

}
```

结果：

```
{
	"age":88835,
	"classes":[
		"noE",
		"zk"
	],
	"height":93.70862928006656,
	"money":93789,
	"size":7527,
	"stuId":"Z",
	"weight":25034.79
}
```