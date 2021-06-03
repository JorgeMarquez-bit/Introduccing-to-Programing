package co.edu.usta.array.bus.multyclass.logic;

public class Vehicle {
    private String serviceType; //Particular
    private String color;//black
    private String brand;//Mazda
    private float width;//40cm
    private float height;//40cmx
    private int doorsNumber;//0
    private int wheelsNumber;//2
    private String plates;//ncz602
    private char [][] places;//2
    //setter and getter methods
    //set-> Poner, colocar, establecer
    //get-> Obtener

    public void setServiceType(String serviceTypeValue){
    serviceType=serviceTypeValue;
    }
    public String getServiceType(){
        return serviceType;
    }
    public void setColor(String colorsTypeValue){
        color=colorsTypeValue;
    }
    public String getColor(){
        return color;
    }
    public void setBrand(String brandTypeValue){
       brand=brandTypeValue;
    }
    public String getBrand(){
        return brand;
    }
    public void setWidth(float Width1TypeValue){
       width=Width1TypeValue;
    }
    public float getWidth(){
        return width;
    }
    public void setHeight(float Height1TypeValue){
        height=Height1TypeValue;
    }
    public float getHeight(){
        return height;
    }
    public void setDoorsNumber(int DoorsNumberTypeValue){
        doorsNumber=DoorsNumberTypeValue;
    }
    public  int getDoorsNumber(){
        return doorsNumber;
    }
    public void setWheelsNumber(int wheelsNumberTypeValue){
        wheelsNumber=wheelsNumberTypeValue;
    }
    public  int getWheelsNumber(){
        return wheelsNumber;
    }
    public void setPlates(String platesTypeValue){
        plates=platesTypeValue;
    }
    public  String getPlates(){
        return plates;
    }
    public void createPlacesArray(String Rows){
        int rowsInt=Integer.parseInt(Rows);
        places= new char[rowsInt][4];
    }
    public void initializePlacesArray(){
        boolean letters=true;

        for (int i = 0; i < places.length ; i++) {
            for (int j = 0; j <places[0].length ; j++) {
                if (letters==true){
                    places[i][j]='D';
                }else {
                    places[i][j]='X';
                }
            }
            if (letters==true){
                letters=false;
            }else {
                letters=true;
            }
        }
    }
    public String arrayToShow(){
        String ReturnString="";
        for (int i = 0; i < places.length ; i++) {
            for (int j = 0; j < places[0].length ; j++) {
                ReturnString=ReturnString+places[i][j]+" ";

            }
            ReturnString=ReturnString+"\n" ;
        }
        return ReturnString;
    }
    public String fillPLace(String row, String column){
        int rowInt= Integer.parseInt(row);
        int columnInt= Integer.parseInt(column);
        if (places[rowInt][columnInt]=='X'||places[rowInt][columnInt]=='O'){
            return "The place is unaviable unavailable";
        }else {
            places[rowInt][columnInt]='O';
            return "The place is fill successfully";

        }
    }
    public String statusBusPlaces(){
        int filedPlaces=0, emptyPlaces=0;
        //TODO: create a code
            for (int i = 0; i < places.length; i++) {
                for (int j = 0; j <places[0].length ; j++) {
                    if (places[i][j]=='D'){
                        emptyPlaces++;
                    }else if (places[i][j]=='O'){
                        filedPlaces++;
                    }
                }
            }
        return "The amount of filled places is: "+ filedPlaces+" the amount of emply places is: "+emptyPlaces;
    }
}
