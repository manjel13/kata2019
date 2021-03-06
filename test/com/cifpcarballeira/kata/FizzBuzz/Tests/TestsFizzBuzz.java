package com.cifpcarballeira.kata.FizzBuzz.Tests;
import com.cifpcarballeira.kata.FizzBuzz.FizzBuzz;
    import org.junit.Test;
    import static org.junit.Assert.*;



public class TestsFizzBuzz {
    
    public TestsFizzBuzz() {
    }

    @Test
    public void test1devuelve1(){
        FizzBuzz  fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1", result);
    }
    
    @Test
    public void test2devuelve2(){
        FizzBuzz  fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2", result);
    }
    
    @Test
    public void test3devuelve3(){
        FizzBuzz  fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);
        assertEquals("Fizz", result);
    }
    
    
    @Test
    public void test5devuelveBuzz(){
        FizzBuzz  fb = new FizzBuzz();
        String result = fb.getFizzBuzz(5);
        assertEquals("Buzz", result);
    }
    
    
    @Test
    public void test15devuelveFizzBuzz(){
        FizzBuzz  fb = new FizzBuzz();
        String result = fb.getFizzBuzz(15);
        assertEquals("Fizz Buzz", result);
        
        
    }
}
