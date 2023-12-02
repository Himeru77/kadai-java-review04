package animal;

public class Human extends Animal {
    //フィールド
    private String hobby;

    //引数なしのコンストラクタ
    public Human() {
    }

    //引数ありのコンストラクタ
    public Human(String name,int age,String hobby){
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

public void setHobby(String hobby) {
        this.hobby = hobby;
    }
@Override
public void say() {
    System.out.println(super.getName() +"です。" + super.getAge() +"歳です。");
    }
@Override
public void think() {
    System.out.println("私は"+ hobby +"について考えています。");

}}
