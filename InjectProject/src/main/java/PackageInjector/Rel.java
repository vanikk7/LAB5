package PackageInjector;

/**
 * @author VS
 */
public class Rel {
    @AutoInjectable
    TestInterfaceOne oneInterface;
    @AutoInjectable
    TestInterfaceTwo twoInterface;

    public void test() {
        oneInterface.test();
        twoInterface.test();
    }
}
