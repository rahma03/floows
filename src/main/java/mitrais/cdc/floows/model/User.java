package mitrais.cdc.floows.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: User.java, v 0.1 2021-07-23 9:54
 */
@Entity
@Table(name = "USERDATA")
public class User {
    @Id
    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User [id=\" + id + \", uname=\" + username + \"]";
    }
}
