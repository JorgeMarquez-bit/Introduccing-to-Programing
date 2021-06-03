package co.edu.usta.array.bus.multyclass.view;

import co.edu.usta.array.bus.multyclass.logic.Vehicle;

import javax.swing.*;

public class FormsView {
    private  static Vehicle myVehicle;
    public static void main(String[] args) {
        myVehicle=new Vehicle();
        String showInfo, row, column;//read the value
        float ShowInfo2;
        int ShowInfo3;
        int valueConfirmDialog;
        String value;


        //1.
        value =JOptionPane.showInputDialog("Please type the number of rows for him vehicle");
        //1.1
        myVehicle.createPlacesArray(value);
        //2.
        myVehicle.initializePlacesArray();
        do {
            //3.
            showInfo = myVehicle.arrayToShow();
            //4.
            JOptionPane.showMessageDialog(null, showInfo);
            //4.
            row = JOptionPane.showInputDialog("Hello, for your place please type the row to fill: ");
            column = JOptionPane.showInputDialog("Hello, for your place please type the column to fill: ");
            //5.
            showInfo = myVehicle.fillPLace(row, column);
            JOptionPane.showMessageDialog(null, showInfo);
            //6.
            valueConfirmDialog = JOptionPane.showInternalConfirmDialog(null, "Do you want to include another passenger(YES), \n" + " or leave away the bus(NO) ");
        }   while (valueConfirmDialog==JOptionPane.YES_OPTION);
        showInfo= myVehicle.statusBusPlaces();
        JOptionPane.showMessageDialog(null,showInfo);

        //valueColums =JOptionPane.showInputDialog("Please type the number of columns for your vehicle");

/*
        value = JOptionPane.showInputDialog("Please type the kind of service to your vehicle");//set the value  in the serviceType  variable
        myVehicle.setServiceType(value);//get  the serviceType value stored in the variabl
        showInfo = myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null," Your kind service for this vehicle is: "+showInfo);

        value = JOptionPane.showInputDialog("Please type the color to your vehicle");
        myVehicle.setColor(value);
        showInfo = myVehicle.getColor();
        JOptionPane.showMessageDialog(null," Your color vehicle is: "+showInfo);

        value = JOptionPane.showInputDialog("Please type the brand to your vehicle");
        myVehicle.setBrand(value);
        showInfo = myVehicle.getBrand();
        JOptionPane.showMessageDialog(null," Your brand of vehicle is: "+showInfo);

        value = JOptionPane.showInputDialog("Please type the width to your vehicle");
        myVehicle.setWidth(Float.parseFloat(value));
        ShowInfo2 = myVehicle.getWidth();
        JOptionPane.showMessageDialog(null," Your width of vehicle is: "+ShowInfo2);

        value = JOptionPane.showInputDialog("Please type the Height to your vehicle");
        myVehicle.setHeight(Float.parseFloat(value));
        ShowInfo2 =myVehicle.getHeight();
        JOptionPane.showMessageDialog(null," Your Height of vehicle is: "+ShowInfo2);

        value = JOptionPane.showInputDialog("Please type the DoorsNumber to your vehicle");
        myVehicle.setDoorsNumber(Integer.parseInt(value));
        ShowInfo3 =myVehicle.getDoorsNumber();
        JOptionPane.showMessageDialog(null," Your DoorsNumber of vehicle is: "+ShowInfo3);

        value = JOptionPane.showInputDialog("Please type the WheelsNumber to your vehicle");
        myVehicle.setWheelsNumber(Integer.parseInt(value));
        ShowInfo3 =myVehicle.getWheelsNumber();
        JOptionPane.showMessageDialog(null," Your WheelsNumber of vehicle is: "+ShowInfo3);

        value = JOptionPane.showInputDialog("Please type the Plates to your vehicle");
        myVehicle.setPlates(value);
        showInfo =myVehicle.getPlates();
        JOptionPane.showMessageDialog(null," Your Plates of vehicle is: "+showInfo);
    */
    }

}
