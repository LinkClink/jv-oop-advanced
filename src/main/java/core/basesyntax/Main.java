package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();

        for (int i = 0; i < figures.length / 2 + 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length - 1; i != figures.length / 2; i--) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
