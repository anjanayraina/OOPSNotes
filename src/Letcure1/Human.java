package Letcure1;

public class Human {
    // Ascess Modifiers
    // private - in this only the class itself can ascess the variable , function ....
    // public - evey class can ascess this
    // protected - every class in the same package can ascess them
    // default - just a more linent version of protected , every class outside the package can also ascess
    private String name ;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    // public is the ascess modifier
    // void is the return statement
    // incrementAge is the name of the function
    public void incrementAge(){
        setAge(getAge() +1);
    }

    private int height;
    private int weight;
    Human(String _name , int _age , int _height , int _weight){
        name = _name;
        age = _age;
        height = _height;
        weight = _weight;
    }
}
