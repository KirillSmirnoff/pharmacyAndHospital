package MyMiner;


import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Miner extends Game {
    private GameObject[][] gameField = new GameObject[9][9];
    private int countMinesOnField;
    private boolean isStopped;

    @Override
    public void start(Stage primaryStage) {
        super.start(primaryStage);
        createGame();
    }

    void createGame(){
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                setValueCell(x,y,"");
                setColor(x,y,Color.DARKGRAY);
                if (setRandom() == 5) {
                    gameField[y][x] = new GameObject(true, x, y);
                    countMinesOnField++;
                } else {
                    gameField[y][x] = new GameObject(false, x, y);
//                    setColor(x, y, Color.GREEN);
                }

            }
        }

        countMineNeighbors();
    }

    private void countMineNeighbors() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if (!gameField[y][x].isMine) {
                    List<GameObject> neighbors = getNeighbors(gameField[y][x]);
                    for (GameObject game : neighbors) {
                        if (game.isMine) {
                            gameField[y][x].countMineNeighbors++;
//                            setCellNumber(x, y, gameField[y][x].countMineNeighbors);
                        }

                    }
                }
            }

        }

    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> list = new ArrayList<>();
        int x = gameObject.x;
        int y = gameObject.y;
        for (int v = y - 1; v < y + 2; v++) {
            for (int h = x - 1; h < x + 2; h++) {
                if (!(h < 0 || v < 0 || h > (9 - 1) || v > (9 - 1) || (h == x && v == y)))
                    list.add(gameField[v][h]);
            }
        }
        return list;
    }

    @Override
    void setMouseLeftClick(int x, int y) {
        super.setMouseLeftClick(x, y);
        if (!isStopped)
            openTile(x, y);
        else
            restart();
    }

    private void openTile(int x, int y) {
        if (!isStopped) {
            if (!gameField[y][x].isOpen) {
//                if (!gameField[y][x].isFlag) {
                if (gameField[y][x].isMine) {
                    setValueCell(x, y, "\uD83D\uDCA3");
                    setColor(x, y, Color.RED);
                    gameOver();
                }
                if (!gameField[y][x].isMine && gameField[y][x].countMineNeighbors != 0) {
                    gameField[y][x].isOpen = true;
//                        countClosedTiles--;
//                        score+=5;
//                        setScore(score);
                    setColor(x, y, Color.LIGHTBLUE);
                    setValueNumber(x, y, gameField[y][x].countMineNeighbors);
                }
                if (!gameField[y][x].isMine && gameField[y][x].countMineNeighbors == 0) {
                    gameField[y][x].isOpen = true;
//                        countClosedTiles--;
//                        score+=5;
//                        setScore(score);
                    setValueCell(x, y, "");
                    setColor(x, y, Color.LIGHTBLUE);
                    List<GameObject> list = getNeighbors(gameField[y][x]);
                    for (GameObject g : list) {
                        if (!g.isOpen) {
                            openTile(g.x, g.y);
                        }
                    }
                }
            }
        }
    }

    private void gameOver() {
        isStopped = true;
//        JOptionPane.showMessageDialog(Color.ALICEBLUE,"pizdec",Color.BLACK,48);
        JOptionPane.showMessageDialog(null, "konez", "wse", JOptionPane.ERROR_MESSAGE);
    }

    void restart(){
        isStopped=false;
        countMinesOnField=0;
        createGame();
    }

}
//        if (countClosedTiles==countMinesOnField)
//            win();
//    }
//}
