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
public class Person 
{
    String puid;
    String fName;
    String mName;
    String lName;
    String address1;
    String address2;
    String city;
    String state;
    String zip;
    String country;
    String classification;
    String text;
    String username;
    String password;
    
    public void Person(String p, String fn, String mn, String ln, String a1, String a2, String ci, String st, String z, String co, String cl)
    {
        puid = p;
        fName = fn;
        mName = mn;
        lName = ln;
        address1 = a1;
        address2 = a2;
        city = ci;
        state = st;
        zip = z;
        country = co;
        classification = cl;
    }
    public void getLogin(String u, String p)
    {
        username = u;
        password = p;
    }
    public void getText(String t)
    {
        text = t;
    }
    public String setText(String t)
    {
        return text;
    }
}
