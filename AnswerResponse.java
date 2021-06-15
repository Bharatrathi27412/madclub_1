public interface AnswerResponse {
    void onCorrect();

    void onIncorrect(String answer);
}
