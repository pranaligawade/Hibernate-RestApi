package com.mapping.m212m;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "O_M_Answer")
public class Answer {
    @Id
    private int ansId;
    private String ans;
    @ManyToOne
    private Question question;

    public Answer(int ansId, String ans) {
        this.ansId = ansId;
        this.ans = ans;

    }

    public Answer() {
        super();
    }



    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
