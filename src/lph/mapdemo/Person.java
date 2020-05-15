package lph.mapdemo;



/**
 * @author liph
 * @date 2020/5/15 - 0:30
 */
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Person o) {
       //根据id升序
        int num1= this.id-o.id;
        return num1;
    }
}
