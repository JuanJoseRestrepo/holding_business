package model;

public class Poll{

private int serviceDoIt;
private int answerTime;
private int relationCostXBenefit;

public Poll(int serviceDoIt,int answerTime,int relationCostXBenefit){
  this.serviceDoIt = serviceDoIt;
  this.answerTime = answerTime;
  this.relationCostXBenefit = relationCostXBenefit;
}

public int getServiceDoIt(){
  return serviceDoIt;
}

public void setServiceDoIt(int serviceDoIt){
  this.serviceDoIt = serviceDoIt;
}

public int getAnswerTime(){
  return answerTime;
}

public void setAnswerTime(int answerTime){
  this.answerTime = answerTime;
}

public int getRelationCostXBenefit(){
  return relationCostXBenefit;
}

public void setRelationCostXBenefit(int relationCostXBenefit){
  this.relationCostXBenefit = relationCostXBenefit;
}

}
