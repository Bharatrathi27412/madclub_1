import java.util.*;
import java.util.ArrayList;

class Proj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Topic> topics = new ArrayList<>();

        topics.add(new Gk());
        topics.add(new Coding());

        class Global {
            int marks = 0;
        }

        Global g1 = new Global();
        AnswerResponse response = new AnswerResponse() {
            @Override
            public void onCorrect() {
                System.out.print("Correct\n");
                g1.marks = g1.marks + 1;
            }

            @Override
            public void onIncorrect(String answer) {
                System.out.print(answer);
            }
        };

        Util util = new Util(response);

        int choice = 0;

        while (choice != 2) {
            System.out.println("Select a topic: ");
            System.out.println("Enter 0 for first topic, 1 for second topic and 2 for exit: ");
            System.out.println("-------------------------------------------------------------------");
            for (Topic topic : topics) {
                System.out.println(topic.getTopic());
            }
            choice = sc.nextInt();
            if (choice != 2) {

                Topic selTopic = topics.get(choice);

                ArrayList<QuestionModel> questionModels = selTopic.getQuestions();
                for (int i = 0; i < questionModels.size(); i++) {
                    QuestionModel question = questionModels.get(i);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.print(question.getQuestion());
                    System.out.println();
                    for (String options : question.getOptions())
                        System.out.print(options);
                    System.out.print("Your ANSWER: ");
                    int selected = sc.nextInt();
                    util.checkAnswer(question, selected);
                }
                System.out.println("You got " + g1.marks + " out of 3");
                System.out.println("-----------------------------------------------------------------------0");
            } else {
                System.out.println("Thankyou");
            }
            g1.marks = 0;
        }

        sc.close();
    }
}