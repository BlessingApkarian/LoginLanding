package com.example.loginlanding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import androidx.test.core.app.ApplicationProvider;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

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
