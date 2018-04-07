/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author angad
 */
public class Admin extends Person
{
    String workPlace;
    String department;
    public void Admin(String wp, String d)
    {
        workPlace = wp;
        department = d;
    }
}
