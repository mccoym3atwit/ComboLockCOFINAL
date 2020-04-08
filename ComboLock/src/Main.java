import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



//1579


public class Main extends Application {
	ArrayList<Integer> Code = new ArrayList<>();
	
	Label current = new Label();
	int trys = 0;
	String wrong = "Wrong. \n One try left";
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane combo = new StackPane();
		
		current.setTranslateX(-60);
		current.setTranslateY(-140);
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six = new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button nine = new Button("9");
		Button zero = new Button("0");

		
		
		combo.getChildren().add(one);
		combo.getChildren().add(two);
		combo.getChildren().add(three);
		combo.getChildren().add(four);
		combo.getChildren().add(five);
		combo.getChildren().add(six);
		combo.getChildren().add(seven);
		combo.getChildren().add(eight);
		combo.getChildren().add(nine);
		combo.getChildren().add(zero);
		combo.getChildren().add(current);
		one.setTranslateX(-100);
		one.setTranslateY(-100);

		two.setTranslateX(-60);
		two.setTranslateY(-100);

		three.setTranslateX(-20);
		three.setTranslateY(-100);

		four.setTranslateX(-100);
		four.setTranslateY(-60);

		five.setTranslateX(-60);
		five.setTranslateY(-60);

		six.setTranslateX(-20);
		six.setTranslateY(-60);

		seven.setTranslateX(-100);
		seven.setTranslateY(-20);

		eight.setTranslateX(-60);
		eight.setTranslateY(-20);

		nine.setTranslateX(-20);
		nine.setTranslateY(-20);

		zero.setTranslateX(-60);
		zero.setTranslateY(20);

		Scene CL = new Scene(combo, 300, 400);

		one.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(1);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "1");
			isComplete(Code);

		});
		two.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(2);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "2");
			isComplete(Code);
		});
		three.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(3);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "3");
			isComplete(Code);
		});
		four.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(4);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "4");
			isComplete(Code);
		});
		five.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(5);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "5");
			isComplete(Code);
		});
		six.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(6);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "6");
			isComplete(Code);
		});
		seven.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(7);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "7");
			isComplete(Code);
		});
		eight.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(8);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "8");
			isComplete(Code);
		});
		nine.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(9);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "9");
			isComplete(Code);

		});
		zero.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			Code.add(0);
			if(current.getText() == wrong) {
				current.setText("");
			}
			current.setText(current.getText() + "0");
			isComplete(Code);
		});

		primaryStage.setScene(CL);
		primaryStage.show();

		CL.setOnKeyPressed(e -> {

			if (e.getCode() == KeyCode.ESCAPE) {
				System.exit(0);

			}
		});
	}

	public boolean isComplete(ArrayList<Integer> Code) {
		
		if (Code.size() == 4) {
			if (Code.toString().replace("[", "").replace("]", "").replace(", ", "").contains("1579")) {
				System.out.print("Door Open");
				System.exit(0);
			
				return true;
			} else {
				current.setText(wrong);
				Code.clear();
				trys++;
				if(trys == 2) {
					System.out.print("Alarm Activated. Door Lock locked until Deactivation");
					System.exit(0);
				}
				return false;

			}

		}
		return false;

	}

}
