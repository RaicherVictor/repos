package com.example.demo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button iddelen;

    @FXML
    private Button ideight;

    @FXML
    private TextField idfirst;

    @FXML
    private Button idfive;

    @FXML
    private Button idfour;

    @FXML
    private Button idminus;

    @FXML
    private Button idnine;

    @FXML
    private Button idone;

    @FXML
    private Button idplus;

    @FXML
    private Button idpoint;

    @FXML
    private Button idprois;

    @FXML
    private TextField idsecond;

    @FXML
    private Button idseven;

    @FXML
    private Button idsix;

    @FXML
    private Button idthree;

    @FXML
    private Button idtwo;
    @FXML
    private Button idzero;
    @FXML
    private RadioButton idfr;
    @FXML
    private RadioButton idsc;
    @FXML
    private Button idclear;

    @FXML
    void initialize(){
        Boolean i=false;
idfirst.focusedProperty().addListener(new ChangeListener<Boolean>() {
    @Override
    public void changed (ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
        if (t1){
            i =true;
        }
    }
});
        idplus.setOnAction(event ->{
            String frst = idfirst.getText().trim();
            String scnd = idsecond.getText().trim();
            Double a = (Double.valueOf(frst)+Double.valueOf(scnd));
            System.out.println(a);
            idfirst.setText(String.valueOf(a));
            idfirst.setEditable(false);
            idfr.setSelected(false);
            idfr.setVisible(false);
            idsecond.clear();
        });
        idminus.setOnAction(event ->{
            String frst = idfirst.getText().trim();
            String scnd = idsecond.getText().trim();
            Double a = (Double.valueOf(frst)-Double.valueOf(scnd));
            System.out.println(a);
            idfirst.setText(String.valueOf(a));
            idfirst.setEditable(false);
            idfr.setSelected(false);
            idfr.setVisible(false);
            idsecond.clear();
        });
        idprois.setOnAction(event ->{
            String frst = idfirst.getText().trim();
            String scnd = idsecond.getText().trim();
            Double a = (Double.valueOf(frst)*Double.valueOf(scnd));
            System.out.println(a);
             idfirst.setText(String.valueOf(a));
            idfirst.setEditable(false);
            idfr.setSelected(false);
            idfr.setVisible(false);
            idsecond.clear();
        });
        iddelen.setOnAction(event ->{
            String frst = idfirst.getText().trim();
            String scnd = idsecond.getText().trim();
            Double a = (Double.valueOf(frst)/Double.valueOf(scnd));
            System.out.println(a);
            idfirst.setText(String.valueOf(a));
            idfr.setSelected(false);
            idfr.setVisible(false);
            idsecond.clear();
        });
        idone.setOnAction(event ->{
            if (){
                idfirst.setText(idfirst.getText()+"1");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"1");
            }
        });
        idtwo.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"2");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"2");
            }
        });
        idthree.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"3");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"3");
            }
        });
        idfour.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"4");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"4");
            }
        });
        idfive.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"5");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"5");
            }
        });
        idsix.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"6");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"6");
            }
        });
        idseven.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"7");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"7");
            }
        });
        ideight.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"8");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"8");
            }
        });
        idnine.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"9");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"9");
            }
        });
        idzero.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+"0");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+"0");
            }
        });
        idpoint.setOnAction(event ->{
            if (idfr.isSelected()){
                idfirst.setText(idfirst.getText()+".");
            }
            if(idsc.isSelected()){
                idsecond.setText(idsecond.getText()+".");
            }
        });
        idclear.setOnAction(event ->{
            idfirst.clear();
            idsecond.clear();
            idfr.setVisible(true);
        });

    }
}
