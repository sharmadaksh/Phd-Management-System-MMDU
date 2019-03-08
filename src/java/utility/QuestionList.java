/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;
import java.util.*;
/**
 *
 * @author HP PAVILION
 */
public class QuestionList {
    public static List<String> getQuestions(){
		List<String> questions = new ArrayList<>();
		questions.add("What is favorite food name?");
		questions.add("What is your name?");
		questions.add("What is first movie name?");
		questions.add("What is favorite celebrity?");
		questions.add("What is favorite color?");
		questions.add("What is first phone company?");
		Collections.shuffle(questions);
		return questions;
}
}