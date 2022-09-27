package com.mapping.fetchingType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "Lazzy_eager_Answer")
public class Answer {
    @Id
    private int ansId;
    private String ans;
    @ManyToOne
    private Question question;

    public Answer(int ansId, String ans, Question question) {
        this.ansId = ansId;
        this.ans = ans;
        this.question = question;
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

    @Override
    public String toString() {
        return "Answer{" +
                "ansId=" + ansId +
                ", ans='" + ans + '\'' +
                '}';
    }
}
