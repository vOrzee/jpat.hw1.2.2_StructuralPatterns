package ru.netology;

public class BinOps {
    private String checker(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "Операция невозможна. Одно или оба числа не заполнены.";
        }
        if (!a.matches("[01]+") || !b.matches("[01]+")) {
            return "Операция невозможна. Пара чисел не соответствует двоичной системе";
        }
        return "";
    }

    public String sum(String a, String b) {
        String checkerResult = checker(a, b);
        if (!checkerResult.isEmpty()) return checkerResult;
        int integerA = Integer.parseInt(a, 2);
        int integerB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(integerA + integerB);
    }

    public String mult(String a, String b) {
        String checkerResult = checker(a, b);
        if (!checkerResult.isEmpty()) return checkerResult;
        int integerA = Integer.parseInt(a, 2);
        int integerB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(integerA * integerB);
    }
}
