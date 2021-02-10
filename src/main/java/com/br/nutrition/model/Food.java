package com.br.nutrition.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double moisture;
    private int energy;
    private String cholesterol;
    private double ashes;
    private double protein;
    private double lipids;
    private double carbohydrate;
    private double dietaryFiber;
    private double calcium;
    private double magnesium;
    private double manganese;
    private double phosphor;
    private double iron;
    private double sodium;
    private double potassium;
    private double copper;
    private double zinc;
    private String retinol;
    private String RE;
    private String RAE;
    private double thiamine;
    private double riboflavin;
    private double pyridoxine;
    private double niacin;
    private double VitaminC;

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

    public double getMoisture() {
        return moisture;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getAshes() {
        return ashes;
    }

    public void setAshes(double ashes) {
        this.ashes = ashes;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getLipids() {
        return lipids;
    }

    public void setLipids(double lipids) {
        this.lipids = lipids;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(double dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(double calcium) {
        this.calcium = calcium;
    }

    public double getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(double magnesium) {
        this.magnesium = magnesium;
    }

    public double getManganese() {
        return manganese;
    }

    public void setManganese(double manganese) {
        this.manganese = manganese;
    }

    public double getPhosphor() {
        return phosphor;
    }

    public void setPhosphor(double phosphor) {
        this.phosphor = phosphor;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getPotassium() {
        return potassium;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    public double getCopper() {
        return copper;
    }

    public void setCopper(double copper) {
        this.copper = copper;
    }

    public double getZinc() {
        return zinc;
    }

    public void setZinc(double zinc) {
        this.zinc = zinc;
    }

    public String getRetinol() {
        return retinol;
    }

    public void setRetinol(String retinol) {
        this.retinol = retinol;
    }

    public String getRE() {
        return RE;
    }

    public void setRE(String RE) {
        this.RE = RE;
    }

    public String getRAE() {
        return RAE;
    }

    public void setRAE(String RAE) {
        this.RAE = RAE;
    }

    public double getThiamine() {
        return thiamine;
    }

    public void setThiamine(double thiamine) {
        this.thiamine = thiamine;
    }

    public double getRiboflavin() {
        return riboflavin;
    }

    public void setRiboflavin(double riboflavin) {
        this.riboflavin = riboflavin;
    }

    public double getPyridoxine() {
        return pyridoxine;
    }

    public void setPyridoxine(double pyridoxine) {
        this.pyridoxine = pyridoxine;
    }

    public double getNiacin() {
        return niacin;
    }

    public void setNiacin(double niacin) {
        this.niacin = niacin;
    }

    public double getVitaminC() {
        return VitaminC;
    }

    public void setVitaminC(double vitaminC) {
        VitaminC = vitaminC;
    }

    @Override
    public String toString() {
        return "FoodModel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", moisture=" + moisture +
                ", energy=" + energy +
                ", cholesterol='" + cholesterol + '\'' +
                ", ashes=" + ashes +
                ", protein=" + protein +
                ", lipids=" + lipids +
                ", carbohydrate=" + carbohydrate +
                ", dietaryFiber=" + dietaryFiber +
                ", calcium=" + calcium +
                ", magnesium=" + magnesium +
                ", manganese=" + manganese +
                ", phosphor=" + phosphor +
                ", iron=" + iron +
                ", sodium=" + sodium +
                ", potassium=" + potassium +
                ", copper=" + copper +
                ", zinc=" + zinc +
                ", retinol='" + retinol + '\'' +
                ", RE='" + RE + '\'' +
                ", RAE='" + RAE + '\'' +
                ", thiamine=" + thiamine +
                ", riboflavin=" + riboflavin +
                ", pyridoxine=" + pyridoxine +
                ", niacin=" + niacin +
                ", VitaminC=" + VitaminC +
                '}';
    }
}
