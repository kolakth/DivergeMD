/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

/**
 *
 * @author kolakth
 */
public class Patient {
    
    private int id;
    private String firstName;
    private String lastName;
    private int tel;
    
    
    public Patient(int id,String firstName,String lastName,int tel)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getTel()
    {
        return tel;
    }
}
