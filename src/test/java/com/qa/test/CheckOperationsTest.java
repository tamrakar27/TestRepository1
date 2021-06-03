package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOperationsTest {

    @Test
    public void sum(){
        System.out.println("in add");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30, a+b);
    }

    @Test
    public void substract(){
        System.out.println("in substract");
        int a = 10;
        int b = 20;
        Assert.assertEquals(10, b-a);
    }

    @Test
    public void divide(){
        System.out.println("in divide");
        int a = 10;
        int b = 20;
        Assert.assertEquals(2, b/a);
    }

    @Test
    public void multi(){
        System.out.println("in multi");
        int a = 10;
        int b = 20;
        Assert.assertEquals(200, a*b);
    }

}
