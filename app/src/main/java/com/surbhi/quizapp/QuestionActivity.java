package com.surbhi.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.surbhi.quizapp.Model.QuizQuestion;
import com.surbhi.quizapp.databinding.ActivityQuestionBinding;

public class QuestionActivity extends AppCompatActivity {

    private ActivityQuestionBinding binding;
    private String subName;
    private QuizQuestion[] oopsQuestions, cLanguageQuestions, javaQuestions, scienceQuestions, mathQuestions;
    private int i = 0;
    private int correctAnswers = 0, wrongAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadQuestion();

        binding.btnNextQue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rdSelectedBtn = binding.rdGroup.getCheckedRadioButtonId();
                if (rdSelectedBtn == -1) {
                    Toast.makeText(QuestionActivity.this, "Please Select Any Answer!!!", Toast.LENGTH_SHORT).show();
                } else {
                    RadioButton radioButton = (RadioButton) binding.rdGroup.findViewById(rdSelectedBtn);
                    String userAnswer = radioButton.getText().toString();

                    if (subName.equals("Maths") && i != 10) {
                        int ansIndex = mathQuestions[i].getCorrectOptionIndex();
                        String rightAnswer = mathQuestions[i].getOptions()[ansIndex];
                        if (userAnswer.equals(rightAnswer)) {
                            correctAnswers++;
                        } else {
                            wrongAnswers++;
                        }
                        i++;
                        nextQuestion();
                    } else if (subName.equals("Java") && i != 10) {
                        int ansIndex = javaQuestions[i].getCorrectOptionIndex();
                        String rightAnswer = cLanguageQuestions[i].getOptions()[ansIndex];
                        if (userAnswer.equals(rightAnswer)) {
                            correctAnswers++;
                        } else {
                            wrongAnswers++;
                        }
                        i++;
                        nextQuestion();
                    } else if (subName.equals("CLang") && i != 10) {
                        int ansIndex = cLanguageQuestions[i].getCorrectOptionIndex();
                        String rightAnswer = cLanguageQuestions[i].getOptions()[ansIndex];
                        if (userAnswer.equals(rightAnswer)) {
                            correctAnswers++;
                        } else {
                            wrongAnswers++;
                        }
                        i++;
                        nextQuestion();
                    } else if (subName.equals("OOPS") && i != 10) {
                        int ansIndex = oopsQuestions[i].getCorrectOptionIndex();
                        String rightAnswer = oopsQuestions[i].getOptions()[ansIndex];
                        if (userAnswer.equals(rightAnswer)) {
                            correctAnswers++;
                        } else {
                            wrongAnswers++;
                        }
                        i++;
                        nextQuestion();
                    } else if (subName.equals("Science") && i != 10) {
                        int ansIndex = scienceQuestions[i].getCorrectOptionIndex();
                        String rightAnswer = scienceQuestions[i].getOptions()[ansIndex];
                        if (userAnswer.equals(rightAnswer)) {
                            correctAnswers++;
                        } else {
                            wrongAnswers++;
                        }
                        i++;
                        nextQuestion();
                    } else {
                        Toast.makeText(QuestionActivity.this, "i = " + i + "Result Time: " + correctAnswers + "Wrong Answer: " + wrongAnswers, Toast.LENGTH_LONG).show();
                    }
                }


            }
        });
    }

    private void loadQuestion() {

        mathQuestions = new QuizQuestion[]{
                new QuizQuestion("What is the value of π (pi) to two decimal places?",
                        new String[]{"3.14", "3.16", "3.18", "3.12"}, 0),
                new QuizQuestion("What is the result of 5² + 3 x 2?",
                        new String[]{"19", "18", "17", "16"}, 1),
                new QuizQuestion("If a triangle has angles measuring 30°, 60°, and 90°, what type of triangle is it?",
                        new String[]{"Isosceles", "Equilateral", "Scalene", "Right-angled"}, 3),
                new QuizQuestion("What is the square root of 144?",
                        new String[]{"12", "14", "10", "16"}, 0),
                new QuizQuestion("If a circle has a diameter of 10 units, what is its circumference?",
                        new String[]{"31.42 units", "20 units", "15.71 units", "10 units"}, 0),
                new QuizQuestion("What is the result of 25 ÷ 5?",
                        new String[]{"5", "25", "0", "10"}, 0),
                new QuizQuestion("What is the sum of the first 10 natural numbers?",
                        new String[]{"45", "50", "55", "60"}, 0),
                new QuizQuestion("Which number is both a square and a cube?",
                        new String[]{"4", "9", "16", "64"}, 1),
                new QuizQuestion("What is the value of 2 to the power of 3?",
                        new String[]{"6", "8", "12", "16"}, 1),
                new QuizQuestion("If a rectangle's length is 8 units and width is 5 units, what is its area?",
                        new String[]{"13 units²", "35 units²", "40 units²", "42 units²"}, 2),
        };

        scienceQuestions = new QuizQuestion[]{
                new QuizQuestion("What is the chemical symbol for gold?",
                        new String[]{"Go", "Gd", "Au", "Ag"}, 2),
                new QuizQuestion("What is the process by which plants make their own food using sunlight?",
                        new String[]{"Respiration", "Photosynthesis", "Fermentation", "Combustion"}, 1),
                new QuizQuestion("What is the primary function of white blood cells in the human body?",
                        new String[]{"Transport oxygen", "Fight infections", "Digest food", "Pump blood"}, 1),
                new QuizQuestion("Which gas is most abundant in Earth's atmosphere?",
                        new String[]{"Nitrogen", "Oxygen", "Carbon dioxide", "Hydrogen"}, 0),
                new QuizQuestion("What is the smallest unit of matter?",
                        new String[]{"Atom", "Molecule", "Electron", "Proton"}, 0),
                new QuizQuestion("What is the chemical formula for water?",
                        new String[]{"H2O", "CO2", "O2", "N2"}, 0),
                new QuizQuestion("What is the process by which a liquid changes into a gas at the surface?",
                        new String[]{"Evaporation", "Condensation", "Sublimation", "Freezing"}, 0),
                new QuizQuestion("Which organ in the human body is responsible for filtering blood and removing waste?",
                        new String[]{"Liver", "Heart", "Kidney", "Stomach"}, 2),
                new QuizQuestion("What is the basic unit of heredity in living organisms?",
                        new String[]{"Gene", "Cell", "Chromosome", "DNA"}, 0),
                new QuizQuestion("What is the Earth's outermost layer called?",
                        new String[]{"Crust", "Mantle", "Core", "Atmosphere"}, 0),
        };

        javaQuestions = new QuizQuestion[]{
                new QuizQuestion("Which keyword is used to define a class in Java?",
                        new String[]{"class", "struct", "interface", "object"}, 0),
                new QuizQuestion("What is the output of the following code snippet?\nint x = 5;\nx += 3;\nSystem.out.println(x);",
                        new String[]{"5", "8", "3", "53"}, 1),
                new QuizQuestion("What is the purpose of the 'public static void main(String[] args)' method in Java?",
                        new String[]{"It is used to print messages to the console.",
                                "It is the entry point of the Java program.",
                                "It defines the constructor of a class.",
                                "It is used to declare variables."}, 1),
                new QuizQuestion("Which data type is used to store a single character in Java?",
                        new String[]{"char", "string", "character", "single"}, 0),
                new QuizQuestion("What does the 'new' keyword do in Java?",
                        new String[]{"Deletes an object from memory.",
                                "Creates a new instance of a class.",
                                "Closes the current program.",
                                "Initializes a variable."}, 1),
                new QuizQuestion("What is the term for reusing code by creating a new class that is based on an existing class?",
                        new String[]{"Polymorphism", "Abstraction", "Inheritance", "Encapsulation"}, 2),
                new QuizQuestion("Which keyword is used to create an instance of a class in Java?",
                        new String[]{"new", "create", "instance", "implement"}, 0),
                new QuizQuestion("What is the access modifier for a member variable that should be visible only within its own class?",
                        new String[]{"private", "public", "protected", "default"}, 0),
                new QuizQuestion("In Java, a class can inherit from only one superclass. Is this statement true or false?",
                        new String[]{"True", "False"}, 0),
                new QuizQuestion("What is the term for the ability of objects of different classes to be treated as objects of the same class?",
                        new String[]{"Polymorphism", "Abstraction", "Inheritance", "Encapsulation"}, 0),
        };

        cLanguageQuestions = new QuizQuestion[]{
                new QuizQuestion("What does the 'printf' function in C do?",
                        new String[]{"Reads input from the user",
                                "Prints output to the console",
                                "Performs mathematical calculations",
                                "Converts data types"}, 1),
                new QuizQuestion("Which operator is used to access the value at a memory address in C?",
                        new String[]{"*", "@", "#", "&"}, 0),
                new QuizQuestion("What is the result of the expression '5 / 2' in C?",
                        new String[]{"2.5", "2", "2.0", "3"}, 1),
                new QuizQuestion("Which data type is used to store whole numbers in C?",
                        new String[]{"float", "double", "int", "char"}, 2),
                new QuizQuestion("What is the purpose of the 'return 0;' statement at the end of a C program's main function?",
                        new String[]{"It terminates the program.",
                                "It returns an error code.",
                                "It indicates a successful execution.",
                                "It releases memory."}, 2),
                new QuizQuestion("Which header file is needed to use the 'printf' and 'scanf' functions in C?",
                        new String[]{"<stdio.h>", "<math.h>", "<stdlib.h>", "<string.h>"}, 0),
                new QuizQuestion("What is the syntax to declare a variable of type integer in C?",
                        new String[]{"var int;", "int var;", "variable int;", "int = variable;"}, 1),
                new QuizQuestion("What is the 'if' statement used for in C?",
                        new String[]{"Looping", "Function declaration", "Error handling", "Conditional execution"}, 3),
                new QuizQuestion("Which symbol is used to indicate a single-line comment in C?",
                        new String[]{"#", "//", "/*", "%%"}, 1),
                new QuizQuestion("What is the purpose of the 'break' statement in C?",
                        new String[]{"To end a loop prematurely", "To define a function",
                                "To print output to the console", "To declare variables"}, 0),
        };

        oopsQuestions = new QuizQuestion[]{
                new QuizQuestion("What is encapsulation in OOP?",
                        new String[]{"Hiding the internal implementation details of an object.",
                                "Creating instances of a class.",
                                "Inheritance of attributes.",
                                "Combining methods and data together."}, 0),
                new QuizQuestion("Which OOP principle promotes reusability by allowing a new class to inherit properties and behaviors from an existing class?",
                        new String[]{"Encapsulation", "Polymorphism", "Inheritance", "Abstraction"}, 2),
                new QuizQuestion("What is the process of defining a new class based on an existing class called?",
                        new String[]{"Instantiation", "Aggregation", "Inheritance", "Overloading"}, 2),
                new QuizQuestion("In OOP, what does the term 'polymorphism' refer to?",
                        new String[]{"Creating instances of classes.",
                                "Combining methods and data together.",
                                "Hiding internal details of an object.",
                                "Ability of objects of different classes to be treated as objects of the same class."}, 3),
                new QuizQuestion("Which OOP principle allows you to create a blueprint for objects with attributes and methods?",
                        new String[]{"Encapsulation", "Inheritance", "Polymorphism", "Abstraction"}, 3),
                new QuizQuestion("What does the 'super' keyword refer to in Java's context of inheritance?",
                        new String[]{"It refers to the instance of the superclass.",
                                "It is used to define a new class.",
                                "It refers to the instance of the subclass.",
                                "It is used to create new instances of classes."}, 0),
                new QuizQuestion("Which OOP concept refers to the process of creating an object from a class?",
                        new String[]{"Polymorphism", "Inheritance", "Abstraction", "Instantiation"}, 3),
                new QuizQuestion("What is the purpose of constructors in OOP?",
                        new String[]{"To define methods for a class.",
                                "To create objects from a class.",
                                "To encapsulate data within a class.",
                                "To implement polymorphism."}, 1),
                new QuizQuestion("Which OOP principle refers to hiding the complex implementation details of an object?",
                        new String[]{"Polymorphism", "Abstraction", "Encapsulation", "Inheritance"}, 2),
                new QuizQuestion("What is a 'class' in the context of OOP?",
                        new String[]{"A real-world object.",
                                "A blueprint for creating objects.",
                                "A method in an object.",
                                "An instance of an object."}, 1),
        };

        subName = getIntent().getStringExtra("SubjectName");

        if (subName != null) {
            binding.txQuizName.setText(subName + " Quiz");
            nextQuestion();
        }

    }

    private void nextQuestion() {
        binding.rdGroup.clearCheck();
        if (subName.equals("Maths") && i != 10) {
            binding.txQuestion.setText(mathQuestions[i].getQuestion());
            binding.rdBtnA.setText(mathQuestions[i].getOptions()[0]);
            binding.rdBtnB.setText(mathQuestions[i].getOptions()[1]);
            binding.rdBtnC.setText(mathQuestions[i].getOptions()[2]);
            binding.rdBtnD.setText(mathQuestions[i].getOptions()[3]);
        } else if (subName.equals("Java") && i != 10) {
            binding.txQuizName.setText(subName + " Quiz");
            binding.txQuestion.setText(javaQuestions[i].getQuestion());
            binding.rdBtnA.setText(javaQuestions[i].getOptions()[0]);
            binding.rdBtnB.setText(javaQuestions[i].getOptions()[1]);
            binding.rdBtnC.setText(javaQuestions[i].getOptions()[2]);
            binding.rdBtnD.setText(javaQuestions[i].getOptions()[3]);
        } else if (subName.equals("CLang") && i != 10) {
            binding.txQuizName.setText(subName + " Quiz");
            binding.txQuestion.setText(cLanguageQuestions[i].getQuestion());
            binding.rdBtnA.setText(cLanguageQuestions[i].getOptions()[0]);
            binding.rdBtnB.setText(cLanguageQuestions[i].getOptions()[1]);
            binding.rdBtnC.setText(cLanguageQuestions[i].getOptions()[2]);
            binding.rdBtnD.setText(cLanguageQuestions[i].getOptions()[3]);
        } else if (subName.equals("OOPS") && i != 10) {
            binding.txQuizName.setText(subName + " Quiz");
            binding.txQuestion.setText(oopsQuestions[i].getQuestion());
            binding.rdBtnA.setText(oopsQuestions[i].getOptions()[0]);
            binding.rdBtnB.setText(oopsQuestions[i].getOptions()[1]);
            binding.rdBtnC.setText(oopsQuestions[i].getOptions()[2]);
            binding.rdBtnD.setText(oopsQuestions[i].getOptions()[3]);
        } else if (subName.equals("Science") && i != 10) {
            binding.txQuizName.setText(subName + " Quiz");
            binding.txQuestion.setText(scienceQuestions[0].getQuestion());
            binding.rdBtnA.setText(scienceQuestions[i].getOptions()[0]);
            binding.rdBtnB.setText(scienceQuestions[i].getOptions()[1]);
            binding.rdBtnC.setText(scienceQuestions[i].getOptions()[2]);
            binding.rdBtnD.setText(scienceQuestions[i].getOptions()[3]);
        } else {
            Intent intent = new Intent(QuestionActivity.this, ResultActivity.class);
            intent.putExtra("correctAnswer", correctAnswers);
            intent.putExtra("wrongAnswer", wrongAnswers);
            intent.putExtra("subjectName", subName);
            startActivity(intent);
            finish();
        }
    }
}