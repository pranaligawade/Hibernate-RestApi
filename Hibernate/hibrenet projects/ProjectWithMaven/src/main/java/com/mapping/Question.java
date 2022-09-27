package com.mapping;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    @Column(name = "Ques_id")
    private  int id;
    private String question;
    //one to one mapping
    @OneToOne
    // joinans with rename it
    @JoinColumn(name = "Answer_id")

    private  Answer ans;

    public Answer getAns() {
        return ans;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }

    public Question() {
        super();
    }

    public Question(int id, String question, Answer ans) {
        this.id = id;
        this.question = question;
        this.ans = ans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
