package com.example.soft_labtest;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class colorTest extends TestCase {
@Test
    public void colort1()
{
    color red= new Red();
    assertEquals("The color is Red\n", red.showColor());
}
@Test
public void colort2()
{
    color green= new Green();
    assertEquals("The color is Green\n",green.showColor());
}
@Test
    public void colorT3()
{
    color blue= new Blue();
    assertEquals("The color is Blue\n", blue.showColor());
}
}