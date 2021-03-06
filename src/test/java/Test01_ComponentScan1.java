import com.nrsc.springstudy.c01_componentscan1.study1.config.Config2;
import com.nrsc.springstudy.c01_componentscan1.study1.config.Config3;
import com.nrsc.springstudy.c01_componentscan1.study1.config.Config4;
import com.nrsc.springstudy.c01_componentscan1.study1.config.Config5;
import com.nrsc.springstudy.c01_componentscan1.study1.config2_test.Config1;
import com.nrsc.springstudy.c01_componentscan1.study1.config5_test.Config5_1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test01_ComponentScan1 {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config1.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        //加载Config2配置类
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config2.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config3.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test04() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config4.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }


    @Test
    public void test05_1() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config5_1.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test05() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config5.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
