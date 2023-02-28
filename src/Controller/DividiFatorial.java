package Controller;

public class DividiFatorial{

public DividiFatorial() {

super();
}
//ponto de parada
public int Fat (int num) {

if (num == 1) {
return 1;
}

//função do termo anterior
return num * Fat(num - 1);
}

public double divfat (int num) {
//ponto de parada
if (num == 1) {
return 1;
}
//função do termo anterior
int fatorial = Fat(num);
double divisao = 1 / (double)fatorial;
return divisao + divfat(num - 1 );
}
}