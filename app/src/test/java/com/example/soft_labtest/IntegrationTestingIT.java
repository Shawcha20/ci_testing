package com.example.soft_labtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IntegrationTestingIT {
    @Test
    public void test()
    {
        color co =new Red();
        shape sh= new Circle(5);
        assertEquals(  (float) (3.1416 * 5 * 5),sh.area(),.001);
        assertEquals("The color is Red\n",co.showColor());
    }
}
