package PackageInjector;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author VS
 */
public class Main {
    /**
     * @param args - стандартный аргумент
     * @throws IOException            - стандартное исключение
     * @throws IllegalAccessException - стандартное исключение
     * @throws ClassNotFoundException - стандартное исключение
     * @throws InstantiationException - стандартное исключение
     */
    public static void main(String[] args) throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        int count;
        do {
            System.out.println("Test set 1 - 1" + '\t' + "Test set 2 - 2" + '\t' + "Test set 3 - 3" + '\t' + "Test set 4 - 4" +
                    '\t' + "Test set 5 - 5" + '\t' + "Test set 6 - 6");
            System.out.println("Enter the serial number of the test :");
            count = scanner.nextInt();
            Test(count);
            System.out.println("Another option to try?" + '\t' + "Yes - other integer" + '\t' + "No - 0");
            count = scanner.nextInt();

        } while (count != 0);
    }

    /**
     * @param count - Вариант теста
     * @throws IOException            - стандартное исключение
     * @throws InstantiationException - стандартное исключение
     * @throws IllegalAccessException - стандартное исключение
     * @throws ClassNotFoundException - стандартное исключение
     */
    public static void Test(int count) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        addProperties addProperties = new addProperties();
        switch (count) {
            case 1: {
                addProperties.newProperties("interface PackageInjector.TestInterfaceOne", "PackageInjector.ClassOne");
                addProperties.newProperties("interface PackageInjector.TestInterfaceTwo", "PackageInjector.ClassTwo");
                addProperties.saveProperties();
                inject();
                break;
            }
            case 2: {
                addProperties.newProperties("interface PackageInjector.TestInterfaceOne", "PackageInjector.ClassOne");
                addProperties.newProperties("interface PackageInjector.TestInterfaceTwo", "PackageInjector.ClassFri");
                addProperties.saveProperties();
                inject();
                break;
            }
            default: {
                System.out.println("Error, you entered an invalid value");
                break;
            }
        }
    }

    /**
     * @throws ClassNotFoundException - стандартное исключение
     * @throws IOException            - стандартное исключение
     * @throws InstantiationException - стандартное исключение
     * @throws IllegalAccessException - стандартное исключение
     */
    public static void inject() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        Rel rel1 = (new Injector()).inject(new Rel());
        rel1.test();
    }
}
