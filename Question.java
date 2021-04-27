/*
Final Project
Group #2: Sam Dobrowolski, Jamie Schaffer, Joseph DeSantis, Christopher Sonnhalter
Date: 4/19/21
*/

/**
 * This class prints out the questions
 * @author Sam Dobrowolski, Jamie Schaffer, Joseph DeSantis, Christopher Sonnhalter
 * @version 4/19/2021
*/

class Question {
  public String question;
  public String answer1;
  public String answer2;
  public String answer3;
  public String answer4;
  public int rightAnswer;
  public int pointValue;

  /**
   * This method sets up the constructors
   * @param constructors
  */
  Question(String question, String answer1, String answer2, String answer3, String answer4, int rightAnswer, int pointValue) {
    this.question = question;
    this.answer1 = answer1;
    this.answer2 = answer2;
    this.answer3 = answer3;
    this.answer4 = answer4;
    this.rightAnswer = rightAnswer;
    this.pointValue = pointValue;
  }

  /**
   * This method gets the user's question
   * @return Returns the question to the user
  */
  String getQuestion() {
    return question;
  }

  /**
   * This method gets the user's first answer
   * @return Returns the first answer to the user
  */ 
  String getAnswer1() {
    return answer1;
  }

  /**
   * This method gets the user's second answer
   * @return Returns the second answer to the user
  */
  String getAnswer2() {
    return answer2;
  }
  
  /**
   * This method gets the user's third answer
   * @return Returns the third answer to the user
  */
  String getAnswer3() {
    return answer3;
  }
  
  /**
   * This method gets the user's fourth answer
   * @return Returns the fourth answer to the user
  */
  String getAnswer4() {
    return answer4;
  }
  
  /**
   * This method gets the user's right answer
   * @return Returns the right answer to the user
  */
  int getRightAnswer() {
    return rightAnswer;
  }
  
  /**
   * This method gets the user's point value
   * @return Returns the point value to the user
  */
  int getPointValue() {
    return pointValue;
  }
}