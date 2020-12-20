package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Controller {
    public TextField nametf;
    public TextField surnametf;
    public Button addbtn;
    public TextField grouptf;
    public TextField yeartf;
    public Button Savebtn;
    public Button Openbtn;
    public TextField savetf;
    public TextField opentf;
    public Label textlbl;
    public Label lbl2;
    public Button clearbtn;


    public void handleButtonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == addbtn) {
            addText();

        }
        else if (actionEvent.getSource() == Savebtn) {
            saveToFile();
        }
        else if (actionEvent.getSource() == Openbtn) {
            readFile();
        }
        else if (actionEvent.getSource() == clearbtn) {
            clear();
        }
    }

    public String addText() {
        String tmp = textlbl.getText();
        textlbl.setText(tmp + getalltext());
        System.out.println("Added text");
        return "Added text";
    }

    public String clear() {
        textlbl.setText("");
        System.out.println("Cleared text");
        return "Cleared text";
    }

    public String readFile() {
        try {

            String location = opentf.getText();
            String all = Files.readString(Path.of(location));
            textlbl.setText(all);
            lbl2.setText("File Opened");
            System.out.println(all);

            return "File read";
        }
        catch (Exception e){
            lbl2.setText("no such file or you forgot .txt");
            return "File not read";
        }

    }

    private String getalltext() {
        String text = nametf.getText() +" " +surnametf.getText() +" " + grouptf.getText() +" " + yeartf.getText()+"\n";
        System.out.println(text);
        return text;
    }

    public String saveToFile() {
        try {
            String name = savetf.getText();
            FileWriter writer = new FileWriter(name);
            writer.write(textlbl.getText());
            writer.close();
            lbl2.setText("Success");
            System.out.println("Success");
            return "Success";
        }

        catch (Exception e){
            System.out.println("gg");
            lbl2.setText("Something went wrong");
            return "Failed";
        }


    }
}
