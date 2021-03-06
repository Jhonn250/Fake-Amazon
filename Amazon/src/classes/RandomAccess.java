/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author jhonn250
 */
public class RandomAccess {
    RandomAccessFile raf = null;
    File file;
    public void addBeginning(User u) throws Exception{
        file = new File("USERS.obj");
        raf = new RandomAccessFile(file,"rw");
        raf.seek(0);
        raf.writeInt(u.getID());
        raf.writeUTF(u.getName());
        raf.writeUTF(u.getLast());
        raf.writeUTF(u.getSLast());
        raf.writeUTF(u.getAddress());
        raf.writeUTF(u.getPhone());
        raf.writeUTF(u.getState());
        raf.writeUTF(u.getCity());
        raf.writeUTF(u.getPassword());
        raf.close();
    }
    
    public void createFile() throws Exception{
        file = new File("USERS.obj");
        raf = new RandomAccessFile(file, "rw");
        if(raf != null)
            raf.close();
        
    }
    public void addEnd(User u) throws Exception{
        file = new File("USERS.obj");
        raf = new RandomAccessFile(file, "rw");
        raf.seek(raf.length());
        raf.writeInt(u.getID());
        raf.writeUTF(u.getName());
        raf.writeUTF(u.getLast());
        raf.writeUTF(u.getSLast());
        raf.writeUTF(u.getAddress());
        raf.writeUTF(u.getPhone());
        raf.writeUTF(u.getState());
        raf.writeUTF(u.getCity());
        raf.writeUTF(u.getPassword());
        raf.close();
    }
    
   public void print() throws Exception{
       User u = new User();
       file = new File("USERS.obj");
       raf = new RandomAccessFile(file, "rw");
       raf.seek(0);
       try{
           while(true){
               u.setName(raf.readUTF());
           }
       }catch(IOException ex){
       }
   }
   
   public void rellena() throws Exception{
       file = new File("USERS.obj");
       raf = new RandomAccessFile(file, "rw");
       raf.seek(0);
       while(true){
                 
       }
   }
       
    public void readFile() throws Exception{
            File fichero = new File("USERS.obj");
            raf = new RandomAccessFile(fichero, "r");
            if(raf != null){
                raf.close();
            }
    } 
      
}