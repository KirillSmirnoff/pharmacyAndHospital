package MyMiner;

import javafx.application.Application;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.Random;

public class Game extends Application {

    private GameField[][] matrix = new GameField[9][9];
    private FlowPane rootNode = new FlowPane(1, 1);
    private Random rdm = new Random();

    class GameField extends TextFlow {
        int x, y;

        GameField(int x, int y) {
            this.x = x;
            this.y = y;
            setPrefSize(60, 60);
            addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                        if (event.getButton() == MouseButton.PRIMARY)
                            setMouseLeftClick(x, y);
                        else setMouseRightClick(x, y);
                    }
            );
            setTextAlignment(TextAlignment.CENTER);
        }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MinerTest");
        rootNode.setAlignment(Pos.CENTER);
        primaryStage.setScene(new Scene(rootNode, 550, 550));
        primaryStage.setResizable(false);
        initialize();
        primaryStage.show();
    }

    void setColor(int x, int y, Color color) {
        matrix[y][x].setBackground(new Background(new BackgroundFill(color, null, null)));
    }

    void setValueCell(int x, int y, String s) {
        if (!matrix[y][x].getChildren().isEmpty()) {
            matrix[y][x].getChildren().remove(0);
        }
        Text text1 = new Text(s);
        text1.setFill(Color.BLACK);
        text1.setFont(Font.font("Helvetica", FontPosture.ITALIC, 50));
        matrix[y][x].getChildren().add(text1);
    }

    void setValueNumber(int x, int y, int count) {
        if (!matrix[y][x].getChildren().isEmpty()) {
            matrix[y][x].getChildren().remove(0);
        }
        String s = "" + count;
        Text text1 = new Text(s);
        text1.setFill(Color.RED);
        text1.setFont(Font.font("Helvetica", FontPosture.ITALIC, 40));
        matrix[y][x].getChildren().add(text1);
    }

    int setRandom() {
        return rdm.nextInt(10);
    }

    private void initialize() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                matrix[y][x] = new GameField(x, y);
                rootNode.getChildren().add(matrix[y][x]);
            }
        }
    }

    void setMouseRightClick(int x, int y) {
    }

    void setMouseLeftClick(int x, int y) {
    }
}
