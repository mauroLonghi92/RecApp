package com.example.recicladotandil.Entidades;

public class TotalRecycleModel {
    private Double tons;
    private int bottles;
    private int tetrabriks;
    private int glass;
    private int papperBoard;
    private int cans;

    public TotalRecycleModel(Double tons, int bottles, int tetrabriks, int glass, int papperBoard, int cans) {
        this.tons = tons;
        this.bottles = bottles;
        this.tetrabriks = tetrabriks;
        this.glass = glass;
        this.papperBoard = papperBoard;
        this.cans = cans;
    }
    public TotalRecycleModel(){
        this.tons = 0.0;
        this.bottles = 0;
        this.tetrabriks = 0;
        this.glass = 0;
        this.papperBoard = 0;
        this.cans = 0;
    }

    public Double getTons() {
        return tons;
    }

    public void setTons(Double tons) {
        this.tons = tons;
    }

    public int getBottles() {
        return bottles;
    }

    public void setBottles(int bottles) {
        this.bottles = bottles;
    }

    public int getTetrabriks() {
        return tetrabriks;
    }

    public void setTetrabriks(int tetrabriks) {
        this.tetrabriks = tetrabriks;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public int getPapperBoard() {
        return papperBoard;
    }

    public void setPapperBoard(int papperBoard) {
        this.papperBoard = papperBoard;
    }

    public int getCans() {
        return cans;
    }

    public void setCans(int cans) {
        this.cans = cans;
    }
}
