public class Util {

    Util(AnswerResponse answerResponse) {
        this.answerResponse = answerResponse;
    }

    private AnswerResponse answerResponse;

    void checkAnswer(QuestionModel model, int selected) {
        if (model.getAnswer() == selected)
            answerResponse.onCorrect();
        else
            answerResponse.onIncorrect(model.getOptions().get(model.getAnswer()));
    }
}