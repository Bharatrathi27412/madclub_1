import java.util.ArrayList;
import java.util.Collections;

public abstract class Topic {

    abstract String getTopic();

    abstract ArrayList<QuestionModel> getQuestions();

    void checkAnswer(int question, int option) {
    }

}

class Gk extends Topic {

    @Override
    String getTopic() {
        return "Gk";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> list = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();

        // options.add("1.Delhi \n 2.Mumbai \n 3.Bihar \n 4.UP\n");
        options.add("0. Delhi\n");
        options.add("1. Mumbai\n");
        options.add("2. Bihar\n");
        options.add("3. Madarchod\n");

        list.add(new QuestionModel("Which is the capital of India\n", options, 0));
        list.add(new QuestionModel("Which is the financial capital of India\n", options, 1));
        list.add(new QuestionModel("What is China\n", options, 3));

        Collections.shuffle(list);

        return list;
    }

}

class Coding extends Topic {

    @Override
    String getTopic() {
        return "Coding";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> list = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();
        options.add("0. C\n");
        options.add("1. Python\n");
        options.add("2. Java\n");
        options.add("3. Prolog\n");

        list.add(new QuestionModel("A language you would not enjoy using: \n", options, 3));
        list.add(new QuestionModel("Language used in Android Development: \n", options, 2));
        list.add(new QuestionModel("A Snake varient: \n", options, 1));

        Collections.shuffle(list);

        return list;
    }

}