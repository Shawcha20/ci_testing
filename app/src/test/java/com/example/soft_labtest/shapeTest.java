package com.example.soft_labtest;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class shapeTest extends TestCase {
@Test
    public void t1()
{
    shape sh= new Circle(5);
    assertEquals(  (float) (3.1416 * 5 * 5),sh.area(),.001);
}
}