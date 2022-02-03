package com.company.interface_task_1;

public class Magazine implements Printable{

    private String name;
    private String type;
    private int year;

    @Override
    public void print() {
        System.out.println("метод print класса Magazine");
    }

    public Magazine(String name, String type, int year) {
        this.name = name;
        this.type = type;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                '}';
    }
}
