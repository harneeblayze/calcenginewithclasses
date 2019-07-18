/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcenginewithclasses;

/**
 *
 * @author appzone
 */
public class MathEquation {
    double leftVal;
    double rightVal;
    char opcode;
    double result;
    
    public double execute(){
        switch(opcode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal + rightVal;
                break;
            case 'd':
                result = rightVal!=0.0d? leftVal/rightVal: 0.0d;
                break;
            case 'm' :
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("error - invalid opcode");
                result = 0.0d;
                break;
                     
        
        
        }
        return result;
    }
    
}
