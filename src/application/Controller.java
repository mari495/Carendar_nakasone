
package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
	@FXML private Label yearLabel;
	@FXML private Label monthLabel;

	
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
	@FXML private Label dateLabel36;
	@FXML private Label dateLabel37;
	@FXML private Label dateLabel38;
	@FXML private Label dateLabel39;
	@FXML private Label dateLabel40;
	@FXML private Label dateLabel41;
	@FXML private Label dateLabel42;
	
	//35個のLabelオブジェクトをリストとして保持
		
		private LocalDate currentDate; // 現在表示されている月の最初の日付を保持する変数
		
		
		
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
	    dateLabels.add(dateLabel36);
	    dateLabels.add(dateLabel37);
	    dateLabels.add(dateLabel38);
	    dateLabels.add(dateLabel39);
	    dateLabels.add(dateLabel40);
	    dateLabels.add(dateLabel41);
	    dateLabels.add(dateLabel42);
	    
	    //currentDate = LocalDate.now().withDayOfMonth(1); // 現在の月の最初の日を取得

	    
	 // 現在の西暦を表示
	    int currentYear = LocalDate.now().getYear();//LocalDate.now().getYear()は、現在の日付取得し、その日付の年部分を取得するメソッドLocalDate.now()は現在の日付を表すLocalDateオブジェクトを取得
	    yearLabel.setText(String.valueOf(currentYear));//数値を文字列に変換し、yearLabel.setText()メソッドを使用してyearLabelのテキストとして設定

	 // 現在の月を表示
	    int currentMonth = LocalDate.now().getMonthValue();
	    monthLabel.setText(String.valueOf(currentMonth));
	    

	 // 現在の日付を設定
        currentDate = LocalDate.now().withDayOfMonth(1);
     // ラベルに日付を設定
        setDatesInLabels(currentDate);
	 
	    //月の日数
	    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    if ((currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 == 0) {
	        // 西暦が4で割り切れるかつ100で割り切れない、または400で割り切れる場合
	        // 2月の日付を29日までセットする処理を追加
	        daysInMonth[1] = 29;
	    }
	  
	}
	
	@FXML
    public void handleNextMonthButtonAction() {
		currentDate = currentDate.plusMonths(1); // currentDateに1ヶ月後の日付を設定
        updateYearAndMonthLabels(currentDate);//updateYearAndMonthLabelsメソッドを呼び出し、currentDateの年と月を表示
        setDatesInLabels(currentDate);//setDatesInLabelsメソッドを呼び出し、currentDateを基に日付の表示
    }
		
	@FXML
    public void handlePreviousMonthButtonAction() {
		currentDate = currentDate.minusMonths(1); // currentDateに1ヶ月前の日付を設定
        updateYearAndMonthLabels(currentDate);
        setDatesInLabels(currentDate);
    }
	
	 private void updateYearAndMonthLabels(LocalDate date) {
	        int year = date.getYear();//引数として渡されたdateから年を取得
	        yearLabel.setText(String.valueOf(year));//yearLabelのテキストを、取得した年に更新
	        int month = date.getMonthValue();//引数として渡されたdateから月を取得
	        monthLabel.setText(String.valueOf(month));//monthLabelのテキストを、取得した月に更新
	    }
	 
	 private void setDatesInLabels(LocalDate date) {
		// 全ての日付ラベルを空のテキストに設定
		    for (Label label : dateLabels) {
		        label.setText("");
		    }

		    // ラベルに日付を設定
		    int dayOfMonth = 1;
		    int startDayOfWeek = date.withDayOfMonth(1).getDayOfWeek().getValue();//指定された日付の月初めの曜日を取得getDayOfWeek().getValue()は、曜日を表す数値（1から7、1が月曜日、7が日曜日）を取得するために使用
		    if (startDayOfWeek == 7) {
		        startDayOfWeek = 0; // リストのインデックスと曜日の数値を合わせるためもし月初めの曜日が日曜日（7）だった場合、0に調整
		    }
		    int daysInMonth = date.lengthOfMonth();//lengthOfMonth()メソッドは、指定された日付の月の日数を取得
		    int labelIndex = startDayOfWeek;//日付を表示するラベルのインデックスを初期化します。最初の日付の表示位置を設定するために使用

		    for (int i = 0; i < daysInMonth; i++) {//月の日数の回数だけループします。ループ内では、日付をラベルに表示する処理
		        dateLabels.get(labelIndex).setText(String.valueOf(dayOfMonth));
		        dayOfMonth++;//日付のカウンタをインクリメント
		        labelIndex++;//ラベルのインデックスをインクリメント

		        if (labelIndex == dateLabels.size()) {
		            break; // ラベルの末尾に達したらループを終了
		        
		     
		        }
		    }
		    
		
	    }
	/*MEMO基本的には4年に1度、1年の日数が1日多くなるうるう年。正確には必ず4年に1度ではなく8年に1度の時もある
	 * 

	具体的な条件は下記の2つのどちらかを満たす年がうるう年になる

	1、西暦が4で割り切れる、かつ、100で割り切れない
	2、西暦が400で割り切れる
	1の条件があることによって、100年に1度はうるう年がこない周期が生まれます。直近だと2100年、次は2200年、2300年がうるう年ではなくなり、2400年が2の条件によってうるう年になります。*/






}