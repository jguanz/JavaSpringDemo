import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jguanz on 6/7/17.
 */
public class DrawingApp {

        public static void main(String[] args) {
//            Triangle triangle = new Triangle();
//            BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            context.registerShutdownHook();
            Triangle triangle = (Triangle) context.getBean("triangle1");
            triangle.draw();
        }
}
