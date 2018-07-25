package com.service.activiti7.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestActiviti7 {

        Activiti7Delegate activiti7Delegate = new Activiti7Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = activiti7Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}