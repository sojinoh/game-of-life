package edu.macalester.comp124.life;

/**
 * Created by sojinoh on 9/10/15.
 */
public class HighLife implements RuleSet{
    public String getName() {
        return "HighLife";
    }
    public boolean applyRules(boolean isAlive, int neighborCount) {
        if(isAlive){
            if(neighborCount<2){
                isAlive = false;
                return false;
            }
            if (neighborCount>3){
                isAlive = false;
                return false;
            }
        }
        if((isAlive == false) && (neighborCount==3)){
            isAlive = true;
            return true;
        }
        if((isAlive == false) &&(neighborCount==6)){
            isAlive = true;
            return true;
        }
        return isAlive;
    }
}






















