package org.example;

import static org.junit.Assert.assertTrue;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Test;

public class AppTest {
    @Mocked
    App app;

    @Test
    public void testSay() {

        //录制

        new Expectations() {{
            app.say(anyString);
            result = "Hello World";
        }};

        //回放
        System.out.println(app.say("Jack"));

        //验证
        new Verifications() {{
            app.say(anyString);
            times = 1;
        }};
    }
}
