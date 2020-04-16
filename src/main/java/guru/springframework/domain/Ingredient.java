package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    // want to load as soon as ingredient loaded. By default it is eager but we can explicitly declare as eager
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    private String description;
    private BigDecimal amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @ManyToOne
    private Recipe recipe;


}
