import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class JUnitParametrized {

    private int number;
    private int number2;

    public JUnitParametrized(int number, int number2) {
        this.number = number;
        this.number2 = number2;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
        return Arrays.asList(data);
    }

    @Test
    public void pushTest() {
        System.out.println("Parameterized Number is : " + number);
        System.out.println("Parameterized Number 2 is : " + number2);
    }
}
