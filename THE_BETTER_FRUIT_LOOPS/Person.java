package THE_BETTER_FRUIT_LOOPS;
public class Person {
    private String name;
    private int age;
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  
    public void setName(String newName) {
      name = newName;
    }
  
    public void introduce() {
      System.out.println("My name is " + name + " and I am " + age + " years old");
    }
  }
  
  