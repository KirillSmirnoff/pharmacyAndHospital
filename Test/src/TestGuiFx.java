import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TestGuiFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
        /*переопределить только в том случае, если приложение должно
        выполнить специальные действия для запуска*/
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        /*переопределить только в том случае, если приложение должно
        выполнить специальные действия для закрытия.*/
    }

    @Override
    public void start(Stage primaryStage) { // stage eto pomostki
        primaryStage.setTitle("TestFx");
        //kornevoy uzel
        FlowPane rootNode = new FlowPane(10,10); // panel potochnoy komponovki где элементы располагаются построчно
        // с автоматическим переходом на новую строку, если требуется. Имеется возможность указать и другие
        // свойства компоновки, в том числе промежутки между элементами по горизонтали и по вертикали,
//        а также  выравнивание,
        rootNode.setAlignment(Pos.CENTER);
        // sozdanie scene
//        Scene scene = new Scene(rootNode, 400,600);
        //ustanovit scenu na pomostki
        primaryStage.setScene(new Scene(rootNode,400,600));

//        Image pilt =new Image("polyteh.png");
//        ImageView image = new ImageView(pilt);



        Label label = new Label("what is that?");

//        Button bFirst = new Button("first");
//        Button bSecond = new Button("second");
        ToggleButton bSecond = new ToggleButton("second");

//        bFirst.setOnAction(a-> label.setText("koko"));
        bSecond.setOnAction(a->{
              if (bSecond.isSelected())
                  label.setText("dudu");
              else
                  label.setText("DUDU");}
        );

        rootNode.getChildren().addAll(label,bSecond);
        //pokazat soderzimoe
        primaryStage.show();
    }
}
