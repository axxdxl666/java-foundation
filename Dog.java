package java变量;
public class Dog {
int dogAge;
public Dog(String name){
	System.out.println("小狗的名字叫"+name);
}
public void setAge(int age){
	dogAge=age;
}
public int getAge(){
	System.out.println("小狗年龄"+dogAge);
	return dogAge;
}
public static void main(String[]args){
     Dog myDog=new Dog("wangcai");
     myDog.setAge(2);
     myDog.getAge();
     System.out.println("变量值"+myDog.dogAge);

}

}
