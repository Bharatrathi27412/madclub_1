import java.util.ArrayList;

public class QuestionModel {
    private String question;
    private ArrayList<String> options;
    private int answer;

    public QuestionModel(String question, ArrayList<String> options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
