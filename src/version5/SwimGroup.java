/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author Alex
 */
public interface SwimGroup extends Duck{
    
    public abstract void setSwimStrategy(SwimStrategy ss);
    
    public void performSwim();
}
