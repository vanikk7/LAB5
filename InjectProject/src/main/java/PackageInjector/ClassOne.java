package PackageInjector;

import java.util.Date;

/**
 * @author VS
 */
public class ClassOne implements TestInterfaceOne {
    @Override
    public void test() {
        Date date = new Date();
        System.out.println("Test one - completed" + '\t' + date.toString());
    }
}
