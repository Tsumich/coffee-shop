package CoffeShop.JPA;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @OneToMany
    @Getter
    private List<CoffeeEntity> bascket;
    @OneToMany
    @Getter
    private List<CoffeeEntity> favorite;
    @Getter
    private String email;
    @Getter
    private String password;
    @Getter
    private String login;
    @Getter
    private String role;

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBascket(List<CoffeeEntity> bascket) {
        this.bascket = bascket;
    }

    public void setFavorite(List<CoffeeEntity> favorite) {
        this.favorite = favorite;
    }

    public UserEntity() {
    }
}
