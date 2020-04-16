package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;

/*
Created by risachde8
 */
//@Entity is used to define the table in Pojos
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private Difficulty difficulty;

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    //    @JoinTable(name="recipe_category", joinColumns = @JoinColumn(name="recipe_id"),
    //            inverseJoinColumns =@JoinColumn(name="category_id"))

    @ManyToMany
    private Set<Category> categories;

    @Enumerated(value=EnumType.STRING)
    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Set<Ingredient> getIngredientset() {
        return ingredientset;
    }

    public void setIngredientset(Set<Ingredient> ingredientset) {
        this.ingredientset = ingredientset;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredientset;

    private String source;
    private String url;
    private String directions;
    //private Difficulty difficulty;
    //Lob is define as large byte of objects
    @Lob
    private Byte[] image;
    //If we delete the recipe that is going to delete the notes as well because of cascade functionality
    @OneToOne(cascade= CascadeType.ALL)
    private Notes notes;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }



}
