package org.example;

import static org.junit.Assert.assertTrue;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Test;

public class useMockedTest {
    @Mocked
    AreaTest2 areaTest2;

    @Test
    public void testCircle() {

        //录制

        new Expectations() {{
            areaTest2.circleArea(1);
            result = 3.14*1;
        }};

        //回放
        System.out.println(areaTest2.circleArea(1));

        //验证
        new Verifications() {{
            areaTest2.circleArea(1);
            times = 1;
        }};
    }
}
