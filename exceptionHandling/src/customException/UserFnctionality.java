package customException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UserFnctionality {

    List<User> allUsers;
    public UserFnctionality(){
        allUsers = new ArrayList<>();
    }
    public void addUser(){

        allUsers.add(new User(2, "Chandra","chandra@gmmail.com"));
        allUsers.add(new User(3, "Chandan","chandan@gmmail.com"));
        allUsers.add(new User(1, "Arti","arti@gmmail.com"));
        allUsers.add(new User(5, "vandana","vandana@gmmail.com"));
    }

    public User getUserByEmailId(String email) throws InvalidEmailException{
        User user = null;
        for(User u: allUsers){
            if(u.email.equals(email)){
                user = u;
                break;
            }
        }
        if(user == null){
            throw new InvalidEmailException("Invalid email Exception");
        }
        return user;
    }

    public void fileNotFoundExceptionDemo(){
        try{
            File f = new File("/readme.txt");
        }catch(Exception e){
            e.getMessage();
        }


    }
    public String UpdateUserByEmailId(String email, String name) throws InvalidEmailException{
        User user = null;
        for(User u: allUsers){
            if(u.email.equals(email)){
                user = u;
                break;
            }
        }
        if(user == null){
            throw new InvalidEmailException("User Does Not exist");
        }
        user.name = name;
        return "User data updated successfully";
    }
    public List<User> getAllUsers(){

        return allUsers;
    }
}
