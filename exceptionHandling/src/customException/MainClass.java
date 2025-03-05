package customException;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        UserFnctionality userFnctionality = new UserFnctionality();
        userFnctionality.addUser();
        List<User> allUsers = userFnctionality.getAllUsers();
        System.out.println(allUsers);

        try{
            User userById = userFnctionality.getUserByEmailId("chandan@gmmail.com");
            System.out.println(userById);
            String msg = userFnctionality.UpdateUserByEmailId("ranjana@gmail.com","Ranjana");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }


    }

}
