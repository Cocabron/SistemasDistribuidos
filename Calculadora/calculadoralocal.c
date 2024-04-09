/* Programa random_local.c que incluye unicamente el programa main */
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include "calculadora_local.h"

int main(int argc, char *argv[])
{
double numero1, numero2, op,res;
	if(argc != 4) {
	//DEMASIADOS/INSUFICIENTES ARGUMENTOS
	//printf("Uso: %s semilla iteraciones\n", argv[0]);
	exit(1);
}

//1 suma, 2 resta, 3 multiplicacion, 4 division
	numero1 = (double)atoi(argv[1]);
	numero2 = (double)atoi(argv[2]);
	op = (double)atoi(argv[3]);
	switch(op){
	case 1:
	res=suma(numero1,numero2);
	break;
	case 2:
	res=resta(numero1,numero2);
	break;
	case 3:
	res=multi(numero1,numero2);
	break;
	case 4:
	res=divi(numero1,numero2);
	break;
	default:
	}
printf("\n El resultado de la operación es: %d", res);

}
