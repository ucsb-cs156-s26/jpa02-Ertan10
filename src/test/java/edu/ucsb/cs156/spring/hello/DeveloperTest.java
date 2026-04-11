package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Mehmet", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("Ertan10", Developer.getGithubId());
    }
    
    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s26-04", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Vanessa"),"Team should contain Vanessa");
        assertTrue(t.getMembers().contains("Vincent"),"Team should contain Vincent");
        assertTrue(t.getMembers().contains("Erik"),"Team should contain Erik");
        assertTrue(t.getMembers().contains("Tanvi"),"Team should contain Tanvi");
        assertTrue(t.getMembers().contains("Annie"),"Team should contain Annie");
        assertTrue(t.getMembers().contains("Mehmet"),"Team should contain Mehmet");
    }


}
