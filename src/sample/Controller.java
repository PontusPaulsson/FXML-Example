package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML private TreeView treeView;

    public void loginButtonClicked(){
        System.out.println("Login button clicked.");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        createTree("Item1", "Item2");
    }

    public void createTree(String... rootItems) { //... Means that the method takes as many Strings as we want.
        //create root
        TreeItem<String> root = new TreeItem<>("Root");
        //root.setExpanded(true);
        //create child
        TreeItem<String> itemChild = new TreeItem<>("Child");
        itemChild.setExpanded(false);
        //root is the parent of itemChild
        root.getChildren().add(itemChild);
        //Loop thru all of the rootItems and create a new TreeItem for each one.
        for(String s : rootItems){
            TreeItem<String> st = new TreeItem<>(s);
            root.getChildren().add(st);
        }

        treeView.setRoot(root);
    }
}
