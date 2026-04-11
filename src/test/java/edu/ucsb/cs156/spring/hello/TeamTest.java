package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    @Test
    public void defaultConstructor() {
        Team t = new Team();
        assertEquals("", t.getName());
        assertEquals(0, t.getMembers().size());
    }
    
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

    @Test
    public void addMember_adds_member_to_list() {
        team.addMember("Mehmet");
        assertTrue(team.getMembers().contains("Mehmet"));
    }

    @Test
    public void setName_changes_name() {
        team.setName("noname");
        assertEquals("noname", team.getName());
    }

    @Test
    public void setMembers_changes_members() {
        java.util.ArrayList<String> members = new java.util.ArrayList<>();
        members.add("Ertan");
        members.add("Erik");

        team.setMembers(members);

        assertEquals(members, team.getMembers());
}
     @Test
     public void hashCodeexptest() {
        Team t = new Team();
        t.setName("foo");
        t.addMember("bar");

        int result = t.hashCode();
        int expectedResult = 0;  
        assertEquals(expectedResult, result);
}       
}

