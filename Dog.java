package java����;
public class Dog {
int dogAge;
public Dog(String name){
	System.out.println("С�������ֽ�"+name);
}
public void setAge(int age){
	dogAge=age;
}
public int getAge(){
	System.out.println("С������"+dogAge);
	return dogAge;
}
public static void main(String[]args){
     Dog myDog=new Dog("wangcai");
     myDog.setAge(2);
     myDog.getAge();
     System.out.println("����ֵ"+myDog.dogAge);

}

}
