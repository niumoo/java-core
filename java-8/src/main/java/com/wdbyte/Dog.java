package com.wdbyte;

/**
 * @author niulang
 * @date 2021/07/21
 */
public class Dog {
    private String id;
    private String name;
    private Integer age;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dog{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
