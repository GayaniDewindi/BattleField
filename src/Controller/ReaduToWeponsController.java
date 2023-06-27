package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;
import Class.*;

public class ReaduToWeponsController {


    public CheckBox T_56A;
    public CheckBox TankA;
    public CheckBox PistolA;
    public CheckBox BombA;
    public CheckBox Multi_Burrel;
    public CheckBox T_56B;
    public CheckBox TankB;
    public CheckBox Multi_BurrelB;
    public CheckBox PistolB;
    public CheckBox BombB;

    public void onActionBattleStart(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/WineForm.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void OnActionT_56A(ActionEvent actionEvent) {
        T_56 t_56=new T_56();
        int shoot=A_play.getScore();

        if (T_56A.isSelected()){
            t_56.shoot();
            A_play.setValue(t_56.getScore());
            shoot=A_play.getScore();
        }else {
            A_play.aPlay.remove(A_play.aPlay.indexOf(shoot));
        }
    }

    public void OnActionTankA(ActionEvent actionEvent) {
        Tank tank=new Tank();
        int shoot=A_play.getScore();

        if (TankA.isSelected()){
            tank.shoot();
            A_play.setValue(tank.getScore());
            shoot=A_play.getScore();
        }else {
            A_play.aPlay.remove(A_play.aPlay.indexOf(shoot));
        }
    }

    public void OnActionMulti_BurrelA(ActionEvent actionEvent) {
       Multi_Barrel mb=new Multi_Barrel();
        int shoot=A_play.getScore();

        if (Multi_Burrel.isSelected()){
            mb.shoot();
            A_play.setValue(mb.getScore());
            shoot=A_play.getScore();
        }else {
            A_play.aPlay.remove(A_play.aPlay.indexOf(shoot));
        }
    }

    public void OnActionPistolA(ActionEvent actionEvent) {
        Pistol pistol=new Pistol();

        int shoot=A_play.getScore();

        if (PistolA.isSelected()){
            pistol.shoot();
            A_play.setValue(pistol.getScore());
            shoot=A_play.getScore();
        }else {
            A_play.aPlay.remove(A_play.aPlay.indexOf(shoot));
        }
    }

    public void OnActionBombA(ActionEvent actionEvent) {
        Bomb bomb=new Bomb();
        int shoot=A_play.getScore();

        if (BombA.isSelected()){
            bomb.shoot();
            A_play.setValue(bomb.getScore());
            shoot=A_play.getScore();
        }else {
            A_play.aPlay.remove(A_play.aPlay.indexOf(shoot));
        }
    }

    public void OnActionT_56B(ActionEvent actionEvent) {
        T_56 t56=new T_56();
        int shoot=B_play.getScore();

        if (T_56B.isSelected()){
            t56.shoot();
            B_play.setValue(t56.getScore());
            shoot=B_play.getScore();
        }else {
            B_play.bPlay.remove(B_play.bPlay.indexOf(shoot));
        }
    }

    public void OnActionTankB(ActionEvent actionEvent) {
        Tank tank=new Tank();
        int shoot=B_play.getScore();

        if (TankB.isSelected()){
            tank.shoot();
            B_play.setValue(tank.getScore());
            shoot=B_play.getScore();
        }else {
            B_play.bPlay.remove(B_play.bPlay.indexOf(shoot));
        }

    }

    public void OnActionMulti_BurrelB(ActionEvent actionEvent) {
        Multi_Barrel mb=new Multi_Barrel();
        int shoot=B_play.getScore();

        if (Multi_BurrelB.isSelected()){
            mb.shoot();
            B_play.setValue(mb.getScore());
            shoot=B_play.getScore();
        }else {
            B_play.bPlay.remove(B_play.bPlay.indexOf(shoot));
        }

    }

    public void OnActionPistolB(ActionEvent actionEvent) {
        Pistol pistol=new Pistol();
        int shoot=B_play.getScore();

        if (PistolB.isSelected()){
            pistol.shoot();
            B_play.setValue(pistol.getScore());
            shoot=B_play.getScore();
        }else {
            B_play.bPlay.remove(B_play.bPlay.indexOf(shoot));
        }

    }

    public void OnActionBombB(ActionEvent actionEvent) {
        Bomb bomb=new Bomb();
        int shoot=B_play.getScore();

        if (BombB.isSelected()){
            bomb.shoot();
            B_play.setValue(bomb.getScore());
            shoot=B_play.getScore();
        }else {
            B_play.bPlay.remove(B_play.bPlay.indexOf(shoot));
        }

    }
}

