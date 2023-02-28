package view;

import Controller.DividiFatorial;

public class Principal {

public static void main( String[] args){

DividiFatorial FatCont = new DividiFatorial();
int num = 2;

double resultado = FatCont.divfat(num);

System.out.println(resultado);
}
}