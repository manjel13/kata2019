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
}
