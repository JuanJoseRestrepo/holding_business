package model;

public class Poll{

private int serviceDoIt;
private int answerTime;
private int relationCostXBenefit;

/**Description: Este constructor inicializa las variables
*@param serviceDoIt int el servicio hecho
*@param answerTime int el tiempo de respuesta
*@param relationCostXBenefit int el costo de relacion
*/
public Poll(int serviceDoIt,int answerTime,int relationCostXBenefit){
  this.serviceDoIt = serviceDoIt;
  this.answerTime = answerTime;
  this.relationCostXBenefit = relationCostXBenefit;
}

/**Description: Este metodo obtiene el servicio
*@return int el servicio hecho
*/
public int getServiceDoIt(){
  return serviceDoIt;
}

/**Description: Este metodo modifica el servicio
*@param serviceDoIt int el servicio hecho
*/
public void setServiceDoIt(int serviceDoIt){
  this.serviceDoIt = serviceDoIt;
}

/** Description: este metodo obtiene el tiempo de respuesta
*@return int el tiempo de respuesta
*/
public int getAnswerTime(){
  return answerTime;
}

/**Description: este metodo modifica el tiempo de respuesta
*@param answerTime int el tiempo de respuesta
*/
public void setAnswerTime(int answerTime){
  this.answerTime = answerTime;
}

/** Description: este metodo obtiene la relacion costo por beneficio
*@return int la relacion costo por servicio
*/
public int getRelationCostXBenefit(){
  return relationCostXBenefit;
}

/**Description: este metodo modifica el costo por relacion
*@param relationCostXBenefit int el costo por relacion
*/
public void setRelationCostXBenefit(int relationCostXBenefit){
  this.relationCostXBenefit = relationCostXBenefit;
}

/** Description:Este metodo obtiene la informacion de las encuestas
*@return String la informacion de las encuestas  
*/
public String toString1(){

String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio hecho es :" + serviceDoIt + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tiempo de respuesta es:" + answerTime + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El costo de relacion por beneficio es:" + relationCostXBenefit + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;

}

}
