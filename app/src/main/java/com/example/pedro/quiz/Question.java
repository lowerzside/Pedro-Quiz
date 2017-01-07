package com.example.pedro.quiz;

/**
 * Created by pedro on 03/01/2017.
 */

public class Question {
    static String[] Questions  = {
            "Qual o nome do processo/cerimônia pelo qual os novos papas são esoclhidos?",
            "Qual o nome do sistema de encriptação nazista conhecido pela sua eficiência na segunda guerra mundial?",
            "Qual dos seguintes países não está no hemisfério sul?"
    };
    static String[][] Respostas  ={
            {"Conclave","Votção clericana","Votação clérica","Cardus"},
            {"Enigma","Albus","Puzzle","Reich"},
            {"Egito","Peru","Madagascar","Alaska"},
    };
    private static String[] RespostasCertas={"Conclave","Enigma","Egito"};

    public String[] getQuestions() {
        return Questions;
    }

    public void setQuestions(String[] questions) {
        Questions = questions;
    }

    public String[][] getRespostas() {
        return Respostas;
    }

    public void setRespostas(String[][] respostas) {
        Respostas = respostas;
    }

    public String[] getRespostasCertas() {
        return RespostasCertas;
    }

    public void setRespostasCertas(String[] respostasCertas) {
        RespostasCertas = respostasCertas;
    }

    public static String getQuestion(int a){
        String question=Questions[a];
            return question;
    }

    public static String getChoice1(int a){
        String choice1 = Respostas[a][0];
        return choice1;
    }
    public static String getChoice2(int a){
        String choice2 = Respostas[a][1];
        return choice2;
    }
    public static String getChoice3(int a){
        String choice3 = Respostas[a][2];
        return choice3;
    }
    static String getCorrectAnswer(int a){
        String answer = RespostasCertas[a];
        return answer;
    }


<<<<<<< HEAD
    public static String getChoice4(int a) {
        String choice4 = Respostas[a][0];
        return choice4;
    }
=======
>>>>>>> origin/master
}
