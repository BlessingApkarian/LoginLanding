package com.example.loginlanding;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testUsernameTrue(){
        Login login = new Login();
        assertTrue(login.validateUsername("admin") && login.validateUsername("Thanos"));
    }

    @Test
    public void testUsernameFalse(){
        Login login = new Login();
        assertFalse(login.validateUsername("Jake") && login.validateUsername("Blessing"));
    }

    @Test
    public void testPasswordTrue(){
        Login login = new Login();
        assertTrue(login.validatePassword("order66") && login.validatePassword("snap"));
    }

    @Test
    public void testPasswordFalse(){
        Login login = new Login();
        assertFalse(login.validatePassword("pumpkin") && login.validatePassword("pie"));
    }

}
