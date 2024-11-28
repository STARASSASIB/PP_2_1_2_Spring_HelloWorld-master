import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanC1 =
                (Cat) applicationContext1.getBean("cat");
        System.out.println(beanC1.getName());

        ApplicationContext applicationContext3 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanC2 =
                (Cat) applicationContext3.getBean("cat");
        System.out.println(beanC2.getName());

        System.out.println(bean.equals(bean1));
        System.out.println(beanC1.equals(beanC2));
    }
}