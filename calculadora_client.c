/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "calculadora.h"


void
rand_prog_1(char *host, double a, double b, int op)
{
	CLIENT *clnt;
	double  *result_1;
	numeros  suma_1_arg;
	double  *result_2;
	numeros  resta_1_arg;
	double  *result_3;
	numeros  multi_1_arg;
	double  *result_4;
	numeros  divi_1_arg;

#ifndef	DEBUG
	clnt = clnt_create (host, RAND_PROG, RAND_VERS, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */
		
printf("%f \n",a);
printf("%f \n",b);
printf("%d \n",op);
	switch(op){
case 1:
	suma_1_arg.a=a;
	suma_1_arg.b=b;
	result_1 = suma_1(&suma_1_arg, clnt);
	if (result_1 == (double *) NULL) {
		clnt_perror (clnt, "call failed");
	}else{
		printf("\nResultado de la suma=%f\n", *result_1);
	}
break;
case 2:
	resta_1_arg.a=a;
	resta_1_arg.b=b;
	result_2 = resta_1(&resta_1_arg, clnt);
	if (result_2 == (double *) NULL) {
		clnt_perror (clnt, "call failed");
	}else{
		printf("\nResultado de la resta=%f\n", *result_2);
	}
break;
case 3:
	multi_1_arg.a=a;
	multi_1_arg.b=b;
	result_3 = multi_1(&multi_1_arg, clnt);
	if (result_3 == (double *) NULL) {
		clnt_perror (clnt, "call failed");
	}else{
		printf("\nResultado de la multiplicacion=%f\n", *result_3);
	}
break;
case 4:
	divi_1_arg.a=a;
	divi_1_arg.b=b;
	result_4 = divi_1(&divi_1_arg, clnt);
	if (result_4 == (double *) NULL) {
		clnt_perror (clnt, "call failed");
	}else{
		printf("\nResultado de la division=%f\n", *result_4);
	}
break;
	}
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}


int
main (int argc, char *argv[])
{
	char *host;
	int a,b,opera;
	if (argc != 5) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	if((a = (double)atoi(argv[2])) == 0 && *argv[2] != '0'){
	fprintf(stderr, "invalid value: %s\n",argv[2]);
	exit(1);

	}
	if((b = (double)atoi(argv[3])) == 0 && *argv[3] != '0'){
	fprintf(stderr, "invalid value: %s\n",argv[3]);
	exit(1);

	}
	if((opera = atoi(argv[4])) == 0 && *argv[4] != '0'){
	fprintf(stderr, "invalid value: %s\n",argv[4]);
	exit(1);

	}
	rand_prog_1 (host,a,b,opera);
exit (0);
}
