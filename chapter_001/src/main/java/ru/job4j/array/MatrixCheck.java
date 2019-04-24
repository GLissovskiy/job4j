package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                //main
                if (i == j) {
                    if (data[i - 1][j - 1] == data[i][j]) {
                        result = true;
                    } else {
                        return false;
                    }
                    //secondary
                } else if (j == data.length - i - 1) {
                    if (data[i - 1][j + 1] == data[i][j]) {
                        result = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return result;
    }
}
