/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author HJ
 */

class admin extends createStud
{
    public admin(){}
}

class createStud
{
    String studId;
    String studName;
    public createStud(){}
    
    public void storeStud(String id,String name)
    {
        studId = id;
        studName = name;
    }
    
    public String dispStud()
    {
        System.out.println("Student ID: " + studId);
        System.out.println("Student Name: " + studName);
        return studId;
    }
    
}

public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createStud cs = new createStud();
        cs.storeStud("TP041622", "Han Juin");
        cs.dispStud();
        
    }
    
}
