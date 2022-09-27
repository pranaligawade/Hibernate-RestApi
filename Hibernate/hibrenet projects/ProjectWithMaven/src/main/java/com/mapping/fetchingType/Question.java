package com.mapping.fetchingType;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Lazzy_eager_Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "que_id")
    private int queId;
    private String Question;
//    @OneToMany(mappedBy = "question",fetch = FetchType.EAGER)//,fetch = FetchType.EAGER - eagar  loading
@OneToMany(mappedBy = "question",fetch = FetchType.LAZY) //,fetch = FetchType.lLAZY - LAZY loading

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

    @Override
    public String toString() {
        return "Question{" +
                "queId=" + queId +
                ", Question='" + Question + '\'' +

                '}';
    }

    public void setQuestion(String question) {
       this.Question  = question;
    }


}
