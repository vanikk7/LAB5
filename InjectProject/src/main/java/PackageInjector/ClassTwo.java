package PackageInjector;

import java.util.Date;

/**
 * @author VS
 */
public class ClassTwo implements TestInterfaceTwo {
    @Override
    public void test() {
        Date date = new Date();
        System.out.println("Test two - completed" + '\t' + date.toString());
    }
}
