package Homework;

//Дана точка на площині задана координатами x та y. Визначіть і
//виведіть в консоль, в якій чверті (у прямокутній (декартовій)
//системі координат) знаходиться точка. Чверті позначені
//римськими цифрами
public class Homework3_4 {
    public static void main(String[] args) {
        int x = -8;
        int y = -3;
        if (x<=0 && y <=0){
            System.out.println("III");
        } else if (x>=0 && y >=0){
            System.out.println("I");
        }
        else if (x>=0 && y<=0) {
            System.out.println("IV");
        } else {
            System.out.println("II");
        }
    }
}

