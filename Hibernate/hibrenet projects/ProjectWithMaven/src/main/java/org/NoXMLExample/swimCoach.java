package org.NoXMLExample;

import org.springframework.beans.factory.annotation.Value;

public class swimCoach  implements Coach{
     private  FortuneService fortuneService;
     @Value("${foo.email}")
     private  String email;
     @Value("${foo.team}")
     private  String  team;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public swimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "swim 100 meters as a worm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
