import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by jguanz on 6/7/17.
 */
public class Triangle implements ApplicationContextAware, BeanNameAware{


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }



    private List<Point> points;
    private ApplicationContext context = null;

    public void draw() {
        for(Point point : points) {
            System.out.println("Point.x " + point.getX() + " Point.y " + point.getY());
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is: " + beanName);
    }
}
