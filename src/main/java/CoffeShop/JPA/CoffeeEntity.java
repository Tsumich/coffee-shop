package CoffeShop.JPA;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Table(name = "coffee")
public class CoffeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    private String name;

    @Getter
    private String description;

    @Getter
    private Double price;


    @Getter
    private String brand;

    @Getter
    private Double weight;

    @Getter
    private String category;

    @Getter
    private String imgPath;

    @Getter
    private boolean isSale=false;

    @Getter
    private Double newPrice;

    public CoffeeEntity(String name, String brand, Double price,
                        String description, Double weight,String category,
                        boolean isSale, String imgPath, Double newPrice) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.weight = weight;
        this.category = category;
        this.isSale = isSale;
        this.imgPath = imgPath;
        this.newPrice = newPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }


    public void setSale(boolean sale) {
        isSale = sale;
    }

    public boolean isSale() {
        return isSale;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }
}