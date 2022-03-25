package ru.itmo.lessons.lesson10.base;

abstract public class Transport {
    //    цвет (строка)
//    компания производитель (строка)
//    состояние - целое число от 1 до 10
//    метод сменить цвет
    private String color;
    private String manufacturerCompany;
    private int condition;

    public Transport(String color, String manufacturerCompany, int condition) {
        setColor(color);
        setManufacturerCompany(manufacturerCompany);
        setCondition(condition);
    }

    public String getColor() {
        return color;
    }

    public String getManufacturerCompany() {
        return manufacturerCompany;
    }

    public int getCondition() {
        return condition;
    }

    public void setColor(String color) {

        if (color == null || color.length() < 1) {
            throw new IllegalArgumentException("Значение manufacturerCompany and color  должно быть от 1 символов и выше");
        }
        System.out.println(color);
        this.color = color;
    }

    public void setManufacturerCompany(String manufacturerCompany) {
        if (manufacturerCompany == null || manufacturerCompany.length() < 1 ) {
            throw new IllegalArgumentException("Значение manufacturerCompany and color  должно быть от 1 символов и выше");
        }
        this.manufacturerCompany = manufacturerCompany;
    }

    public void setCondition(int condition) {
        if (condition < 1) {
            throw new IllegalArgumentException("Значение condition должно иметь положительное значение");
        }
        this.condition = this.condition + condition;
    }
    public void changeColor(String color){
        setColor(color);
    }
}


