package cn.gatesma.mockdragon.example.model;

import java.util.List;

/**
 * Student
 *
 * @author by gatesma.
 */
public class Student {

    private String stuId;

    private Integer age;

    private Long money;

    private short size;

    private double height;

    private float weight;

    private List<String> classes;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public short getSize() {
        return size;
    }

    public void setSize(short size) {
        this.size = size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", size=" + size +
                ", height=" + height +
                ", weight=" + weight +
                ", classes=" + classes +
                '}';
    }
}
