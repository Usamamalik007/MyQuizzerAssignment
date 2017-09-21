/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.io.Serializable;

/**
 *
 * @author Talha Zubair
 */
public class TrueFalse implements Serializable {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public String quo;
    public String ans;
    TrueFalse(String a,String b)
    {
        quo=a;
        ans=b;
    }
   
    
}


