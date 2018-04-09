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
public class Undergraduate extends Person
{
    String major;
    int credits;
    double gpa;
    public void Undergraduate(String m, int c, double g)
    {
        major = m;
        credits = c;
        gpa = g;
    }
}
