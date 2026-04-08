package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void equals_same_object_returns_true() {
        Team t = new Team("test");
        assertEquals(true, t.equals(t));
    }

    @Test
    public void equals_different_class_returns_false() {
        Team t = new Team("test");
        assertEquals(false, t.equals("not a team"));
    }

    @Test
    public void equals_same_name_different_members_returns_false() {
        Team t1 = new Team("test");
        t1.addMember("A");

        Team t2 = new Team("test");
        t2.addMember("B");

        assertEquals(false, t1.equals(t2));
    }

    @Test
    public void equals_different_name_same_members_returns_false() {
        Team t1 = new Team("test1");
        t1.addMember("A");

        Team t2 = new Team("test2");
        t2.addMember("A");

        assertEquals(false, t1.equals(t2));
    }

    @Test
    public void equals_same_name_and_members_returns_true() {
        Team t1 = new Team("test");
        t1.addMember("A");

        Team t2 = new Team("test");
        t2.addMember("A");

        assertEquals(true, t1.equals(t2));
    }

    @Test
    public void hashCode_returns_expected_value() {
        Team t = new Team("test");
        int result = t.hashCode();

        int expectedResult = 3556499; 
        assertEquals(expectedResult, result);
    }


}
