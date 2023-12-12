package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Сумма: " + bins.sum("110101", "11101010"));
        System.out.println("Произведение: " + bins.mult("100011", "1001"));
        System.out.println("Сумма: " + bins.sum("1102101", "11101010"));
        System.out.println("Произведение: " + bins.mult("100011", "10 01"));
        System.out.println("Сумма: " + bins.sum("", "11101010"));
    }
}