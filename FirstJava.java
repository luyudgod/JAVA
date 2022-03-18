public class FirstJava{
    int dogAge;
    //公共类的名字 需要与对象构造器的名字一致
    public FirstJava(String name){
        System.out.println("小狗的名字是" + name);
    }
    public void setAge(int age){
        dogAge = age; 
    }
    //如为声明void 返回类型则方法需要返回一个值 值的数据类型根据方法定义的类型来返回 
    public int getAge(){
        System.out.println("小狗的年龄是" + dogAge);
        return dogAge;
    }
    
    //关于dog类的编程
    //主方法的名字不变 main
    public static void main(String[] args){
        FirstJava Obb = new FirstJava("小明");
        Obb.setAge(2);
        Obb.getAge();

    }

}
