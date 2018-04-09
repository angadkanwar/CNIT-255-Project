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
public class Professor extends Person
{
    int nClasses;
    String department;
    public void Professor(int nc, String d)
    {
        nClasses = nc;
        department = d;
    }
}
