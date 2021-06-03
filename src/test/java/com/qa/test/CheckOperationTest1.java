package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOperationTest1 {
    @Test
    public void sum(){
        System.out.println("in add 1");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30, a+b);
    }

    @Test
    public void substract(){
        System.out.println("in substract 1");
        int a = 10;
        int b = 20;
        Assert.assertEquals(10, b-a);
    }

    @Test
    public void divide(){
        System.out.println("in divide 1");
        int a = 10;
        int b = 20;
        Assert.assertEquals(2, b/a);
    }

    @Test
    public void multi(){
        System.out.println("in multi 1");
        int a = 10;
        int b = 20;
        Assert.assertEquals(200, a*b);
    }

    @Test
    public void newmulti(){
        System.out.println("inside new multiplication method");
    }
}
