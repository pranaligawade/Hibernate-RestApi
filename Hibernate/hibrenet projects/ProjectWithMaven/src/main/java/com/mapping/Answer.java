package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    @Column(name = "Ans_id")
    private int Ans_id;
    @OneToOne(mappedBy = "ans")
    //map the mappedby    @OneToOne(mappedBy = "ans")
    private Question question;
    @Column(name = "Answer")
    private String ans;

    public Answer() {
        super();
    }

    public Answer(int ans_id, String ans) {
        Ans_id = ans_id;
        this.ans = ans;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getAns_id() {
        return Ans_id;
    }

    public void setAns_id(int ans_id) {
        Ans_id = ans_id;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
