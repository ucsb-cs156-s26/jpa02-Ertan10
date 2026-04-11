package edu.ucsb.cs156.spring.hello;

public class Developer {

 

    private Developer() {}
    
  

    public static String getName() {
     
       

        return "Mehmet";
    }

 

    public static String getGithubId() {
        return "10";
    }

   
    
    public static Team getTeam() {
        Team team = new Team("s26-04");
        team.addMember("Vanessa");
        team.addMember("Vincent");
        team.addMember("Mehmet");
        team.addMember("Annie");
        team.addMember("Tanvi");
        team.addMember("Erik");
        return team;
    }
}
