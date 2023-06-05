
package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {
	

	
	@FXML private Label dateLabel1;
	@FXML private Label dateLabel2;

	@FXML private Label dateLabel3;

	@FXML private Label dateLabel4;
	@FXML private Label dateLabel5;
	@FXML private Label dateLabel6;

	@FXML private Label dateLabel7;

	@FXML private Label dateLabel8;

	@FXML private Label dateLabel9;

	@FXML private Label dateLabel10;

	@FXML private Label dateLabel11;

	@FXML private Label dateLabel12;
	@FXML private Label dateLabel13;
	@FXML private Label dateLabel14;
	@FXML private Label dateLabel15;
	@FXML private Label dateLabel16;
	@FXML private Label dateLabel17;
	@FXML private Label dateLabel18;
	@FXML private Label dateLabel19;
	@FXML private Label dateLabel20;
	
	@FXML private Label dateLabel21;
	@FXML private Label dateLabel22;
	@FXML private Label dateLabel23;
	@FXML private Label dateLabel24;
	@FXML private Label dateLabel25;
	@FXML private Label dateLabel26;
	@FXML private Label dateLabel27;
	@FXML private Label dateLabel28;
	@FXML private Label dateLabel29;
	@FXML private Label dateLabel30;

	@FXML private Label dateLabel31;
	@FXML private Label dateLabel32;
	@FXML private Label dateLabel33;
	@FXML private Label dateLabel34;
	@FXML private Label dateLabel35;
	
	//、31個のLabelオブジェクトをリストとして保持
		private List<Label> dateLabels = new ArrayList<>();
		
	@FXML//ラベルをリストに追加
	public void initialize() {
	    dateLabels.add(dateLabel1);
	    dateLabels.add(dateLabel2);
	    dateLabels.add(dateLabel3);
	    dateLabels.add(dateLabel4);
	    dateLabels.add(dateLabel5);
	    dateLabels.add(dateLabel6);
	    dateLabels.add(dateLabel7);
	    dateLabels.add(dateLabel8);
	    dateLabels.add(dateLabel9);
	    dateLabels.add(dateLabel10);
	    
	    dateLabels.add(dateLabel11);
	    dateLabels.add(dateLabel12);
	    dateLabels.add(dateLabel13);
	    dateLabels.add(dateLabel14);
	    dateLabels.add(dateLabel15);
	    dateLabels.add(dateLabel16);
	    dateLabels.add(dateLabel17);
	    dateLabels.add(dateLabel18);
	    dateLabels.add(dateLabel19);
	    dateLabels.add(dateLabel20);
	    
	    dateLabels.add(dateLabel21);
	    dateLabels.add(dateLabel22);
	    dateLabels.add(dateLabel23);
	    dateLabels.add(dateLabel24);
	    dateLabels.add(dateLabel25);
	    dateLabels.add(dateLabel26);
	    dateLabels.add(dateLabel27);
	    dateLabels.add(dateLabel28);
	    dateLabels.add(dateLabel29);
	    dateLabels.add(dateLabel30);
	    
	    dateLabels.add(dateLabel31);
	    dateLabels.add(dateLabel32);
	    dateLabels.add(dateLabel33);
	    dateLabels.add(dateLabel34);
	    dateLabels.add(dateLabel35);
	    //currentDate を現在の日付で初期化withMonth(1).withDayOfMonth(1) の部分で月を1月、日を1日に設定
	    LocalDate currentDate = LocalDate.now().withMonth(1).withDayOfMonth(1);

	    for (int i = 0; i < 31; i++) {
	        int dayOfMonth = currentDate.getDayOfMonth();//currentDate の日付を取得
	        
	        dateLabels.get(i).setText(String.valueOf(dayOfMonth));//対応するラベルに日付を設定

	        currentDate = currentDate.plusDays(1);//currentDate を1日進める
	    }

	    currentDate = currentDate.withMonth(2).withDayOfMonth(1);//currentDate を2月1日に設定

	    for (int i = 31; i < 35; i++) {
	        if (currentDate.getMonthValue() == 2) {//現在の月が2月であるかをチェック
	            int dayOfMonth = currentDate.getDayOfMonth();//currentDate の日付部分の値を取得してdayOfMonthに代入
	            dateLabels.get(i).setText(String.valueOf(dayOfMonth));//dayOfMonth の値を文字列に変換してラベルのテキストとして設定
	        } else {
	            dateLabels.get(i).setText("");//該当するラベルのテキストを空に設定
	        }

	        currentDate = currentDate.plusDays(1);//currentDate を1日進める、これにより、次の日付を設定するための準備
	    }
	}
}