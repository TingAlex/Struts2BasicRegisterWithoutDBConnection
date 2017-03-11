package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.User;

/**
 * Created by Administrator on 2017/3/10.
 */

public class LoginAction extends ActionSupport implements ModelDriven
<User>{
    private User user=new User();
    public User getModel(){
        return user;
    }
    public String login() {
        if (user.getUsername().equals("admin") && user.getPassword().equals("123")) {
            ActionContext context=ActionContext.getContext();
            context.getSession().put("username",user.getUsername());
            context.getSession().put("password",user.getPassword());
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    public String register(){
        return "register";
    }

}
/*这部分是域对象字段驱动方式*/
/*public class LoginAction extends ActionSupport{
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        if (user.getUsername().equals("admin") && user.getPassword().equals("123")) {
            ActionContext context=ActionContext.getContext();
            context.getSession().put("username",user.getUsername());
            context.getSession().put("password",user.getPassword());
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    public String register(){
        return "register";
    }

}*/
