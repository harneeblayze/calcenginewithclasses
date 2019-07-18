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
public class Calcenginewithclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathEquation[] equate = new MathEquation[4];
        equate[0] = create(10.0d,25.0d,'a');
        equate[1] = create(34.0d, 20.0d, 's');
        equate[2] = create(40.0d, 20.0d, 'd');
        equate[3] = create(35.0d, 12.0d, 'm');
        
        for(MathEquation equations : equate){
            equations.execute();
            System.out.println(equations.result);
        
        }
        
        
        // TODO code application logic here
    }
    
    public static MathEquation create(double leftVal, double rightVal, char opcode){
        
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opcode = opcode;
        
        return equation;
        
    
    }
    
}
