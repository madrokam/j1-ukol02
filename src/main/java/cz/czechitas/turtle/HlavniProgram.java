package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {

        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);

    }

    public void nakresliCtverec(double velikostStrany) {
        for (int i = 0; i < 4; i++) {

            zofka.move(velikostStrany);
            zofka.turnRight(90);
        }

    }

    public void nakresliObdelnik(double velikostStranyA, double velikostStranyB) {


        zofka.move(velikostStranyA);
        zofka.turnRight(90);
        zofka.move(velikostStranyB);
        zofka.turnRight(90);
        zofka.move(velikostStranyA);
        zofka.turnRight(90);
        zofka.move(velikostStranyB);
        zofka.turnRight(90);


    }

    public void nakresliKruh(double uhel) {
        for (double i = 0; i < 360 / uhel; i++) {
            zofka.move(1);
            zofka.turnRight(uhel);
        }
    }

    public void nakresliKopecek(double uhel) {
        for (int j = 0; j < 2; j++) {
            if (j == 0) {
                nakresliKruh(uhel);
            } else {
                for (double i = 0; i < 330 / uhel; i++) {
                    zofka.move(1);
                    zofka.turnRight(uhel);
                }
            }
        }
    }


    public void nakresliPravouhlyTrojuhelnik(double stranaA, double stranaB, double stranaC) {
        double pomer = stranaA / stranaC;
        double uhelRad = Math.asin(pomer);
        double uhelStupne = Math.toDegrees(uhelRad);

        zofka.move(stranaA);
        zofka.turnRight(90);
        zofka.move(stranaB);
        zofka.turnRight(180 - uhelStupne);
        zofka.move(stranaC);
    }


    public void start() {

        zofka.setLocation(100.0, 100.0);

        //zmrzlina

        zofka.setLocation(100.0, 100.0);
        nakresliKopecek(1);
        zofka.turnRight(180);
        nakresliRovnostrannyTrojuhelnik(100);
        zofka.turnRight(210);

        zofka.setLocation(500, 100);

        //snehulak

        zofka.turnLeft(90);
        nakresliKruh(3);
        zofka.turnLeft(180);
        nakresliKruh(2);
        for (int i = 0; i < 40; i++) {
            zofka.move(1);
            zofka.turnRight(2);
        }
        zofka.turnLeft(150);
        nakresliKruh(3);
        zofka.turnRight(150);

        for (int i = 0; i < 50; i++) {
            zofka.move(1);
            zofka.turnRight(2);
        }
        zofka.turnRight(180);
        nakresliKruh(1);

        zofka.turnLeft(180);

        for (int i = 0; i < 50; i++) {
            zofka.move(1);
            zofka.turnRight(2);
        }

        zofka.turnRight(160);

        nakresliKruh(3);

        zofka.turnRight(190);

        zofka.setLocation(200, 400);

        //masinka

        nakresliObdelnik(60, 120);
        zofka.move(40);
        zofka.turnRight(180);
        nakresliPravouhlyTrojuhelnik(70, 70, 98.995);
        zofka.turnRight(135);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(30);
        nakresliKruh(3);
        zofka.move(50);
        nakresliKruh(3);
        zofka.move(40);
        zofka.turnLeft(90);
        nakresliObdelnik(120, 75);
        nakresliKruh(1.5);

    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
