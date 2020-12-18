package PackageInjector;

import java.util.Date;

/**
 * @author VS
 */
public class ClassFri implements TestInterfaceTwo {
    @Override
    public void test() {
        Date date = new Date();
        System.out.println("Test fri - completed" + '\t' + date.toString());
    }
}
