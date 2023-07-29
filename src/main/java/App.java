import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = (Cat)applicationContext.getBean("cat");

        System.out.println("Hello world1 == hello world2 " + (bean == bean2));
        System.out.println("Cat 1 == cat2 " + (cat1 == cat2));

    }
}