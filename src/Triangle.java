import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by jguanz on 6/7/17.
 */
public class Triangle implements InitializingBean, DisposableBean{


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
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean method called for Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy bean method called for Triangle");
    }
}
