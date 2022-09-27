package com.mapping.m212m;

import javax.persistence.*;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "O_M_Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "que_id")
    private int queId;
    private String Question;
    @OneToMany(mappedBy = "question",cascade =CascadeType.ALL)
    private List<Answer> answer;

    public Question() {
        super();
    }

    public Question(int queId, String question, List<Answer> answer) {
        this.queId = queId;
        Question = question;
        this.answer = answer;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
       this.Question  = question;
    }


}
