package edu.ucsb.cs156.spring.hello;

import java.util.ArrayList;


public class Team {
    public String name;
    public ArrayList<String> members;

    public Team() {
        this.name = "";
        this.members = new ArrayList<String>();
    }

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<String>();
    }
    
    public void addMember(String member) {
        this.members.add(member);
    }
   
    public String getName() {
        return this.name;
    }
  
    public ArrayList<String> getMembers() {
        return this.members;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team other = (Team) obj;
        return this.name.equals(other.name) && this.members.equals(other.members);
    }

 
    @Override
    public String toString() {
        return "Team(name=" + this.name + ", members=" + this.members + ")";
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() | this.members.hashCode();
    }
}
