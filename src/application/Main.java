package application;//test

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
  public void start(Stage primaryStage) {//startメソッドプライマリーステージのインスタンスを受け取る（プログラムのメインwindow)
    try {
      Parent root = FXMLLoader.load(
        getClass().getResource("calendarmaingamen.fxml")
      );
      Scene scene = new Scene(root);
      primaryStage.setTitle("calendar");
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch (Exception e) {//例外処理として
      e.printStackTrace();//メソッド呼び出し履歴を出力
    }
  }

  public static void main(String[] args) {
    launch(args);//Applicationクラスの中のJavaFXを呼び出すメソッド

  }
}