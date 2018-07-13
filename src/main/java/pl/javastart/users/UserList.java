package pl.javastart.users;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserList {

    private List<User> users;

    public UserList() {


        users = new ArrayList<>();

        users.add(new User("Adam", "Bufet", 23));
        users.add(new User("Anna", "Ciamciara", 43));
        users.add(new User("Benedykt", "Alfons", 89));
    }

    public List<User> getUsers() {
        return users;
    }
    public void addUser(User user){
        users.add(user);
    }
}

