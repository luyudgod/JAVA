public class P{
    int age = 23;
    public void getAge(){
        System.out.println("this is xxx");
    }
//public p(int a){
//    this.age = a;
//}
//上面这个是构造方法 可有可无
public static void main(String[] arge){
    P xiaoming = new P();
    //p() 是people类的默认构造函数，它什么也不干
    xiaoming.getAge();
    }
    //用类来实例化一个对象
    //此类中没有构造方法 编译器自动为我们生成了一个缺省的方法
}
