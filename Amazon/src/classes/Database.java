/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
/**
 *
 * @author jhonn250
 */
public class Database {
    
    ArrayList<User> users;
    ArrayList<User> seller;

    File usersFile, sellerFile;
    RandomAccessFile usersRaf, sellerRaf;

    public Database() throws IOException {

        users = new ArrayList<>();
        seller = new ArrayList<>();

        usersFile = new File("USERS.obj");
        sellerFile = new File("SELLERS.obj");
        usersRaf = null;
        sellerRaf = null;
        loadDB();

    }

    void loadDB() throws FileNotFoundException, IOException {

        User u;
       
        usersRaf = new RandomAccessFile(usersFile, "rw");
        usersRaf.seek(0);
        
        sellerRaf = new RandomAccessFile(sellerFile, "rw");
        sellerRaf.seek(0);
        
        while (usersRaf.getFilePointer() != usersRaf.length()) {
            u = new User();
           
            u.setID(usersRaf.readInt());            
            u.setName(usersRaf.readUTF());
            u.setLast(usersRaf.readUTF());
            u.setSLast(usersRaf.readUTF());
            u.setAddress(usersRaf.readUTF());
            u.setPhone(usersRaf.readUTF());
            u.setEmail(usersRaf.readUTF());
            u.setState(usersRaf.readUTF());
            u.setCity(usersRaf.readUTF());
            u.setPassword(usersRaf.readUTF());

            users.add(u);

        }
        
        
        while (sellerRaf.getFilePointer() != sellerRaf.length()) {
            u = new User();
           
            u.setID(sellerRaf.readInt());            
            u.setName(sellerRaf.readUTF());
            u.setLast(sellerRaf.readUTF());
            u.setSLast(sellerRaf.readUTF());
            u.setAddress(sellerRaf.readUTF());
            u.setPhone(sellerRaf.readUTF());
            u.setEmail(sellerRaf.readUTF());
            u.setState(sellerRaf.readUTF());
            u.setCity(sellerRaf.readUTF());
            u.setPassword(sellerRaf.readUTF());

            seller.add(u);

        }

    }

    void updateUsers() throws FileNotFoundException, IOException {
        
            FileOutputStream clearUsers = new FileOutputStream("USERS.obj");
            usersRaf = new RandomAccessFile(usersFile, "rw");
            usersRaf.seek(0);
            
            for (User u : users) {
                usersRaf.writeInt(u.getID());
                usersRaf.writeUTF(u.getName());
                usersRaf.writeUTF(u.getLast());
                usersRaf.writeUTF(u.getSLast());
                usersRaf.writeUTF(u.getAddress());
                usersRaf.writeUTF(u.getPhone());
                usersRaf.writeUTF(u.getEmail());
                usersRaf.writeUTF(u.getState());
                usersRaf.writeUTF(u.getCity());
                usersRaf.writeUTF(u.getPassword());
            }
            
            usersRaf.close();
    }
    
    void updateSellers() throws FileNotFoundException, IOException {
        
            FileOutputStream clearSellers = new FileOutputStream("SELLERS.obj");
            sellerRaf = new RandomAccessFile(sellerFile, "rw");
            sellerRaf.seek(0);
            
            for (User u : seller) {
                sellerRaf.writeInt(u.getID());
                sellerRaf.writeUTF(u.getName());
                sellerRaf.writeUTF(u.getLast());
                sellerRaf.writeUTF(u.getSLast());
                sellerRaf.writeUTF(u.getAddress());
                sellerRaf.writeUTF(u.getPhone());
                sellerRaf.writeUTF(u.getEmail());
                sellerRaf.writeUTF(u.getState());
                sellerRaf.writeUTF(u.getCity());
                sellerRaf.writeUTF(u.getPassword());
            }
            
            sellerRaf.close();
    }

    public void saveUser(User u) throws IOException {
        users.add(u);
        updateUsers();
    }
    
    public void saveSeller(User u) throws IOException {
        seller.add(u);
        updateSellers();
    }
    
    public User searchUser(String nombre){
        User notFound = new User();
        
        for(User u : users){
            if(nombre.equals(u.getName()+ " " + u.getLast() + " " + u.getSLast())){
                return u;
            }
        }       
        return notFound;
    }
    
    public User searchSeller(String nombre){
        User notFound = new User();
        
        for(User u : seller){
            if(nombre.equals(u.getName()+ " " + u.getLast() + " " + u.getSLast())){
                return u;
            }
        }       
        return notFound;
    }
    
    
    public void modifyUser(User user) throws IOException{
        for(User u : users){
            if(u.getID() == user.getID()){
                u.set(user);
                break;
            }
        }
        updateUsers();
    }
    
    public void modifySeller(User user) throws IOException{
        for(User u : seller){
            if(u.getID() == user.getID()){
                u.set(user);
                break;
            }
        }
        updateSellers();
    }
   
    public void deleteUser(int id) throws IOException{        
        for(int i = 0; i < users.size(); ++i){
            if(users.get(i).getID() == id){
                users.remove(i);
                break;
            }
        }
        updateUsers();
    }
    
    public void deleteSeller(int id) throws IOException{        
        for(int i = 0; i < seller.size(); ++i){
            if(seller.get(i).getID() == id){
                seller.remove(i);
                break;
            }
        }
        updateSellers();
    }
    
    

    public boolean validateUser(String email, String password){
        boolean valid = false;
        
        for(User u: users){
            if(u.getEmail().equals(email)){
                if(u.getPassword().equals(password)){
                    valid = true;
                }
                break;
            }
        }
        return valid;
    }
    
    public boolean validateSeller(String email, String password){
        boolean valid = false;
        
        for(User u: seller){
            if(u.getEmail().equals(email)){
                if(u.getPassword().equals(password)){
                    valid = true;
                }
                break;
            }
        }
        return valid;
    }
   
    
    public int getSizeUsers(){
        if (users.isEmpty()) {
            return 0;
        }
        return users.get(users.size() - 1).getID();
    }
    
    public int getSizeSeller(){
        if (seller.isEmpty()) {
            return 0;
        }
        return seller.get(seller.size() - 1).getID();
    }
    
}
