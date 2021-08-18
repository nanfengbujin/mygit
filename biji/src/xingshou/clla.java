package xingshou;

//什么叫反射
public class clla {

    

}
//实体类：pojo entity
class user{
    private int age;
    private int ageip;
    private String name;

    public user() {
    }

    public user(int age, int ageip, String name) {
        this.age = age;
        this.ageip = ageip;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeip() {
        return ageip;
    }

    public void setAgeip(int ageip) {
        this.ageip = ageip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "age=" + age +
                ", ageip=" + ageip +
                ", name='" + name + '\'' +
                '}';
    }
}
