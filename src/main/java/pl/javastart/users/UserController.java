package pl.javastart.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

@Controller
public class UserController {

    private UserList userList;
    private UserController userController ;

    public UserController(UserList userList) {
        this.userList = userList;
    }

    @RequestMapping("/users")
    @ResponseBody
    public String users() {
        List<User> users = userList.getUsers();
        String result = "";
        for (User user : users) {
            result += user.toString() + "<br>";
        }
        return result;
    }
    @RequestMapping("/add")
    public String addUser(HttpServletRequest request){
        String firstName = request.getParameter("imie");
        String lastName = request.getParameter("nazwisko");
        String age = request.getParameter("wiek");

        User user = new User(firstName, lastName, Integer.parseInt(age));
        userList.addUser(user);

        return "redirect:/success";
    }

    @RequestMapping("/success")
    public String success(){
        return "sukces.html";
    }
}
