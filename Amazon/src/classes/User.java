/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author jhonn250
 */
public class User {
    
    private String ID = "";
    private String name = "";
    private String last = ""; //first last name
    private String sLast = ""; //second last name
    private String address = "";
    private String phone = "";
    private String email = "";
    private String state = "";
    private String city = "";
    private String password = "";


public void fakeOverload(User u){
        this.setID(u.getID());
        this.setName(u.getName());
        this.setLast(u.getLast());
        this.setSLast(u.getSLast());
        this.setAddress(u.getAddress());
        this.setPhone(u.getPhone());
        this.setEmail(u.getEmail());
        this.setState(u.getState());
        this.setCity(u.getCity());
        this.setPassword(u.getPassword());
    }


    public void setID(String value){
        ID = value;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setName(String value){
        name = value;
    }
    
    public String getName(){
        return name;
    }
    public void setLast(String value){
        last = value;
    }
    
    public String getLast(){
        return last;
    }
    
    public void setSLast(String value){
        sLast = value;
    }
    
    public String getSLast(){
        return sLast;
    }
    
    public void setAddress(String value){
        address = value;
    }
    
    public String getAddress(){
        return address;
    }  
         
    public void setPhone(String value){
        phone = value;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setEmail(String value){
        email = value;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setState(String value){
        state = value;
    }
    
    public String getState(){
        return state;
    }
    
    public void setCity(String value){
        city = value;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setPassword(String value){
        password = value;    
    }
    
    public String getPassword(){
        return password;
    }
    
   
    
}