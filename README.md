Ala-Too International University- Student Data system
==================================================================

<img src="https://user-images.githubusercontent.com/65071516/103064594-90d70900-45de-11eb-9798-0f179078e761.png" width="600">

## Project Description

This GUI is created with JavaFX. A project where there are several buttons for adding and receiving data from text files. There is also a JUnit Test class, a parent class and it's child class. The Student class inherits the Person Class.  

### Jar File

JAR file location:  "out/artifacts/untitled1_jar/untitled1.jar"

***To open the jar file use this command:***

```
java --module-path "%YOUR JAVAFX LIB%" --add-modules javafx.controls,javafx.fxml --add-modules javafx.base,javafx.graphics -jar %JAR LOCATION%
```

***For example in my case:***

```
 Java --module-path "D:\Program Files\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml --add-modules javafx.base,javafx.graphics -jar "out\artifacts\untitled1_jar\untitled1.jar"
```

### Below are some screen shots from the GUI;

***The Add Button*** 

*When clicked, data entered is added to the panel.*

<img src="https://user-images.githubusercontent.com/65071516/103067443-18277b00-45e5-11eb-8324-5f6b9e8f4fd2.png">

***The Update Button*** 

*When clicked, new data is updated to the panel.*

<img src="https://user-images.githubusercontent.com/65071516/103065540-0217bb80-45e1-11eb-819e-3b6b1f9e052a.png" width="500">

***The Delete Button*** 

*When clicked, data entered is deleted from the panel.As in here previously updated data is deleted*

<img src="https://user-images.githubusercontent.com/65071516/103064594-90d70900-45de-11eb-9798-0f179078e761.png" width="500">

### SQL database
We used sql database as an external database source to store the information which we get from the user.

***Database connection***
The code below shows the connection of sql and our app.

<img src="https://user-images.githubusercontent.com/65071516/103068070-8c165300-45e6-11eb-9c32-4163c47b5fea.png" width="500">

***Data retriving***

The code below retrives the data from the database and returns it as an observable list.

<img src="https://user-images.githubusercontent.com/65071516/103068283-0646d780-45e7-11eb-92f1-202be7885993.png" width="500">

***JavaFX and databse***

The code below show the JavaFx table values which are retrieved from the Database.

<img src="https://user-images.githubusercontent.com/65071516/103068317-1a8ad480-45e7-11eb-990a-7cdfa7ccff98.png" width="500">





