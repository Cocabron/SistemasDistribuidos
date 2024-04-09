/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "calculadora.h"

double *
suma_1_svc(numeros *argp, struct svc_req *rqstp)
{
	static double  result;
	result=argp->a + argp->b;
	/*
	 * insert server code here
	 */

	return &result;
}

double *
resta_1_svc(numeros *argp, struct svc_req *rqstp)
{
	static double  result;
	result=argp->a - argp->b;
	/*
	 * insert server code here
	 */

	return &result;
}

double *
multi_1_svc(numeros *argp, struct svc_req *rqstp)
{
	static double  result;
	printf("\nServer response to client...\n"); 
	result=argp->a * argp->b;
	/*
	 * insert server code here
	 */

	return &result;
}

double *
divi_1_svc(numeros *argp, struct svc_req *rqstp)
{
	static double  result;
	
	printf("\nServer response to client...\n"); 
	result=argp->a / argp->b; //-> porque se trata de un apuntador
	/*
	 * insert server code here
	 */

	return &result;
}