package com.dyy.springcore;

import com.dyy.springcore.auto.Customer;
import com.dyy.springcore.auto.Customer2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class IoCXmlApplication {
    public static void main(String[] args) {

 //IoC容器的构建（Java类）
        AnnotationConfigApplicationContext  context1 = new AnnotationConfigApplicationContext(IoCJavaConfigApplication.class);
        String hello = context1.getBean(String.class);
        System.out.println(hello);

        ApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");
//通过构造方法实例化Bean
          ExampleBean exampleBean = (ExampleBean) context.getBean("exampleBean");
          System.out.println(exampleBean);
          ExampleBean2 exampleBean2 = (ExampleBean2) context.getBean("exampleBean2");
        System.out.println(exampleBean2);
//通过静态工厂方法实例化
        ClientService clientService = (ClientService) context.getBean("clientService");
        System.out.println(clientService);
//通过实例工厂方法实例化
        DefaultClientServerLocater defaultClientServerLocater = (DefaultClientServerLocater) context.getBean("clientServerLocater");
                 System.out.println(defaultClientServerLocater);

//Bean的依赖装配
// 构造方法参数装配
          //Bean的引用
        Foo foo = (Foo) context.getBean("foo");
        System.out.println(foo);
          //根据参数类型
        Foo foo1 = (Foo) context.getBean("foo2");
        System.out.println(foo1);

        ExampleBean3 exampleBean32 = (ExampleBean3) context.getBean("bean32");
        System.out.println(exampleBean32);
         //根据参数位置
        ExampleBean3 exampleBean3 = (ExampleBean3) context.getBean("bean3");
        System.out.println(exampleBean3);
         //根据参数名称
        ExampleBean3 exampleBean33 = (ExampleBean3) context.getBean("bean33");
        System.out.println(exampleBean33);

//Setter方法的装配
        ComplexShape complexShape = (ComplexShape) context.getBean("complexShape");
        System.out.println(complexShape);
//依赖与配置详解
        //直接赋值（基本类型和String）
        DataSource dataSource = (DataSource) context.getBean("basicDataSource");
        System.out.println(dataSource);
        //idref和ref元素
        IdRefConfig refConfig = (IdRefConfig) context.getBean("config");
        System.out.println(refConfig);
        //内部bean
        Foo foo2 = (Foo) context.getBean("foo3");
        System.out.println(foo2);
        //Collection
        ComplexObject complexObject = (ComplexObject) context.getBean("complexObject");
        System.out.println(complexObject);

        //null和空字符串值
        ExampleBean4 exampleBean4 = (ExampleBean4) context.getBean("bean4");
        System.out.println(exampleBean4);

        LazyExampleBean lazyExampleBean = (LazyExampleBean) context.getBean("lazyExampleBean");
        System.out.println(lazyExampleBean);

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
        Customer2 customer2 = (Customer2) context.getBean("customer2");
        System.out.println(customer2);

        for(int i = 0; i < 3;i++){
            ExampleBean4 exampleBean41 = (ExampleBean4) context.getBean("bean42");
            System.out.println(exampleBean41.hashCode());
        }
        System.out.println();
        for(int i = 0; i < 3;i++){
            ExampleBean4 exampleBean42 = (ExampleBean4) context.getBean("bean43");
            System.out.println(exampleBean42.hashCode());
        }
    }
}
