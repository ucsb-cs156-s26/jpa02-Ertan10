package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
    assertEquals("test-team", team.getName());
    }


    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void hashCode_test(){
    Team t1 = new Team();
    t1.setName("foo");
    t1.addMember("bar");
    Team t2 = new Team();
    t2.setName("foo");
    t2.addMember("bar");
    assertEquals(t1.hashCode(), t2.hashCode());
    }
    
    @Test
    public void sameobject() {
        assertTrue(team.equals(team));
    }

    @Test
    public void nonTeamobject() {
        assertFalse(team.equals("uhuhuh"));
    }

    @Test
    public void Differentname() {
        Team other = new Team("uhuhuh");
        assertFalse(team.equals(other));
    }

    @Test
    public void Differentmembers() {
        Team other = new Team("test-team");
        other.addMember("Mehmet");
        assertFalse(team.equals(other));
    }

    @Test
    public void allsame() {
        Team other = new Team("test-team");
        assertTrue(team.equals(other));
    }
}

