package com.example.cocktails.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cocktail {

    @SerializedName("idDrink")
    private int idDrink;

    @SerializedName("strDrink")
    private String strDrink;

    @SerializedName("strAlcoholic")
    private String strAlcoholic;

    @SerializedName("strGlass")
    private String strGlass;

    @SerializedName("strInstructions")
    private String strInstructions;

    @SerializedName("strIngredient1")
    private String strIngredient1;

    @SerializedName("strIngredient2")
    private String strIngredient2;

    @SerializedName("strIngredient3")
    private String strIngredient3;

    @SerializedName("strIngredient4")
    private String strIngredient4;

    @SerializedName("strIngredient5")
    private String strIngredient5;

    @SerializedName("strIngredient6")
    private String strIngredient6;

    @SerializedName("strIngredient7")
    private String strIngredient7;

    @SerializedName("strIngredient8")
    private String strIngredient8;

    @SerializedName("strIngredient9")
    private String strIngredient9;

    @SerializedName("strIngredient10")
    private String strIngredient10;

    @SerializedName("strIngredient11")
    private String strIngredient11;

    @SerializedName("strIngredient12")
    private String strIngredient12;

    @SerializedName("strIngredient13")
    private String strIngredient13;

    @SerializedName("strIngredient14")
    private String strIngredient14;

    @SerializedName("strIngredient15")
    private String strIngredient15;

    @SerializedName("strMeasure1")
    private String strMeasure1;

    @SerializedName("strMeasure2")
    private String strMeasure2;

    @SerializedName("strMeasure3")
    private String strMeasure3;

    @SerializedName("strMeasure4")
    private String strMeasure4;

    @SerializedName("strMeasure5")
    private String strMeasure5;

    @SerializedName("strMeasure6")
    private String strMeasure6;

    @SerializedName("strMeasure7")
    private String strMeasure7;

    @SerializedName("strMeasure8")
    private String strMeasure8;

    @SerializedName("strMeasure9")
    private String strMeasure9;

    @SerializedName("strMeasure10")
    private String strMeasure10;

    @SerializedName("strMeasure11")
    private String strMeasure11;

    @SerializedName("strMeasure12")
    private String strMeasure12;

    @SerializedName("strMeasure13")
    private String strMeasure13;

    @SerializedName("strMeasure14")
    private String strMeasure14;

    @SerializedName("strMeasure15")
    private String strMeasure15;

    public Map<String, String> getIngredients() {
        Map<String, String> ingredients = new HashMap<>();
        ingredients.put(strIngredient1, strMeasure1);
        ingredients.put(strIngredient2, strMeasure2);
        ingredients.put(strIngredient3, strMeasure3);
        ingredients.put(strIngredient4, strMeasure4);
        ingredients.put(strIngredient5, strMeasure5);
        ingredients.put(strIngredient6, strMeasure6);
        ingredients.put(strIngredient7, strMeasure7);
        ingredients.put(strIngredient8, strMeasure8);
        ingredients.put(strIngredient9, strMeasure9);
        ingredients.put(strIngredient10, strMeasure10);
        ingredients.put(strIngredient11, strMeasure11);
        ingredients.put(strIngredient12, strMeasure12);
        ingredients.put(strIngredient13, strMeasure13);
        ingredients.put(strIngredient14, strMeasure14);
        ingredients.put(strIngredient15, strMeasure15);
        if (ingredients.containsKey(null)) ingredients.remove(null);
        return ingredients;
    }


    public int getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(int idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7() {
        return strIngredient7;
    }

    public void setStrIngredient7(String strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8() {
        return strIngredient8;
    }

    public void setStrIngredient8(String strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9() {
        return strIngredient9;
    }

    public void setStrIngredient9(String strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10() {
        return strIngredient10;
    }

    public void setStrIngredient10(String strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11() {
        return strIngredient11;
    }

    public void setStrIngredient11(String strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12() {
        return strIngredient12;
    }

    public void setStrIngredient12(String strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13() {
        return strIngredient13;
    }

    public void setStrIngredient13(String strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14() {
        return strIngredient14;
    }

    public void setStrIngredient14(String strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15() {
        return strIngredient15;
    }

    public void setStrIngredient15(String strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5() {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    public String getStrMeasure6() {
        return strMeasure6;
    }

    public void setStrMeasure6(String strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    public String getStrMeasure7() {
        return strMeasure7;
    }

    public void setStrMeasure7(String strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    public String getStrMeasure8() {
        return strMeasure8;
    }

    public void setStrMeasure8(String strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    public String getStrMeasure9() {
        return strMeasure9;
    }

    public void setStrMeasure9(String strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    public String getStrMeasure10() {
        return strMeasure10;
    }

    public void setStrMeasure10(String strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    public String getStrMeasure11() {
        return strMeasure11;
    }

    public void setStrMeasure11(String strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    public String getStrMeasure12() {
        return strMeasure12;
    }

    public void setStrMeasure12(String strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    public String getStrMeasure13() {
        return strMeasure13;
    }

    public void setStrMeasure13(String strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    public String getStrMeasure14() {
        return strMeasure14;
    }

    public void setStrMeasure14(String strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    public String getStrMeasure15() {
        return strMeasure15;
    }

    public void setStrMeasure15(String strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }
}
