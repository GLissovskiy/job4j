package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                //main
                if (i == j) {
                    if (data[i + 1][j + 1] == data[i][j]) {
                        result = true;
                    } else {
                        return false;
                    }
                //secondary
                } else if ((j == data.length - i - 1) && (i > 0)) {
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
