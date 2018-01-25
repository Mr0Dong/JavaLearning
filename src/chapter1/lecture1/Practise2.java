package chapter1.lecture1;
/**
（写文档注释）
编写Java程序比较成员变量和局部变量的区别
 */
public class Practise2 {                    //新建类
    static int age=7;//使用static关键字的原因？                       //定义成员变量age
    public static void main(String[] args){ //主方法
        int name=13;                        //定义局部变量name
        /* 依次将变量age和变量name的比较结果输出 */
        System.out.println("age>name的返回值为:"+(age>name));
        System.out.println("age==name的返回值为:"+(age==name));
        System.out.println("age!=name的返回值为:"+(age!=name));
        System.out.println("age>=name的返回值为:"+(age>=name));
        System.out.println("age<=name的返回值为:"+(age<=name));
        /*
        局部变量和成员变量的区别有什么？
        答：
         */
    }
}

//问题；文档注释、格式
