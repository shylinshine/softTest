package org.example;

import org.junit.*;

import static junit.framework.Assert.assertEquals;


public class drugAreaTest {


    @BeforeClass
    public static void beforeClass() {
        System.out.println("----------beforeClass------------");

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("----------afterClass------------");

    }

    @Before
    public void setup() throws Exception {
        System.out.println("-----------------before Method--------------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("-----------------after Method--------------");
    }

    @Test
    public void circle() throws Exception {


        assertEquals((Double)3.14*10*10,DrugArea.circleArea(10));
    }

    @Test
    public void rectangleArea() throws Exception {

        assertEquals(15.0,DrugArea.rectangleArea(5,3));
    }

    @Test
    public void sumArea() throws Exception {

        assertEquals(3.14*10*10+15,DrugArea.sumArea(DrugArea.circleArea(10),DrugArea.rectangleArea(5,3)));
    }


}