package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import javax.security.auth.Refreshable;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField nametf;
    public TableView<Students> table;
    public TableColumn<Students, Integer> noclm;
    public TableColumn<Students, String> nameclm;
    public TableColumn<Students, String> surnameclm ;
    public TableColumn<Students, String> groupclm ;
    public TableColumn<Students, Integer> yearclm ;
    public TextField surnametf;
    public Button addbtn;
    public TextField grouptf;
    public TextField yeartf;
    public Button update;
    public Button delete;
    public Label lbl2;
    public TextField notf;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        showStudents();
    }

    public void handleButtonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == addbtn){
            insertRecord();
        }
        else if (actionEvent.getSource() == update){
            update();
        }else if (actionEvent.getSource() == delete){
            delete();
        }

    }
    public Connection getConnection(){
        Connection con;
        try{
            con= DriverManager.getConnection("jdbc:mysql://localHost:3306/students","root","O258951s");
            return con;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public ObservableList<Students> getStudentsList(){
        ObservableList<Students> studentList = FXCollections.observableArrayList();
        Connection con = getConnection();
        String query = "SELECT * FROM students";
        Statement statement;
        ResultSet resultSet;

        try{
            statement = con.createStatement();
            resultSet = statement.executeQuery(query);
            Students students;
            while (resultSet.next()){
                students = new Students(resultSet.getInt("no"), resultSet.getString("name"), resultSet.getString("lastname"), resultSet.getString("grup"), resultSet.getInt("year"));
                studentList.add(students);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }
    public void showStudents(){
        ObservableList<Students> list = getStudentsList();

        noclm.setCellValueFactory(new PropertyValueFactory<Students,Integer>("no"));
        nameclm.setCellValueFactory(new PropertyValueFactory<Students,String>("FirstName"));
        surnameclm.setCellValueFactory(new PropertyValueFactory<Students,String>("LastName"));
        groupclm.setCellValueFactory(new PropertyValueFactory<Students,String>("group"));
        yearclm.setCellValueFactory(new PropertyValueFactory<Students,Integer>("BirthYear"));

        table.setItems(list);
    }
    private void insertRecord(){
        String query = "INSERT INTO students VALUES(" + notf.getText() + ",'"+ nametf.getText() + "','" + surnametf.getText() + "','" + grouptf.getText() + "'," + yeartf.getText() + ")";
        executeQuery(query);
        showStudents();
        deleteFields();
    }
    private void deleteFields(){
        notf.clear();
        nametf.clear();
        surnametf.clear();
        yeartf.clear();
        grouptf.clear();
    }
    @FXML
    private void update(){
        String query = "UPDATE students SET name = '" + notf.getText() + ",'"+ nametf.getText() + "','" + surnametf.getText() + "','" + grouptf.getText() + "'," + yeartf.getText() + " WHERE no = " + notf.getText() + ";";
        executeQuery(query);
        showStudents();

    }
    @FXML
    private void delete(){
        System.out.println("DELETE FROM students WHERE no = " + notf.getText() + ";");
        String query = "DELETE FROM students WHERE no = " + notf.getText() + ";";
        executeQuery(query);
        showStudents();
    }

    private void executeQuery(String query){
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void handleMouseAction(MouseEvent event){
        Students students = table.getSelectionModel().getSelectedItem();
        notf.setText("" + students.getNo());
        nametf.setText(students.getFirstName());
        surnametf.setText(students.getLastName());
        grouptf.setText(students.getGroup());
        yeartf.setText("" + students.getBirthYear());
    }
}
