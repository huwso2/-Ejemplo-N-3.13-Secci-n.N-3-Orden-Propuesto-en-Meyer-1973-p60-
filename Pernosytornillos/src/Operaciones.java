
public class Operaciones {
static int grupos;
static int Perrosnegros;
static int Perros;
static int casosTotales;
static int casosNegros;
static int casosnoNegros;
static void casosTotales() {
	if(grupos>(Perros)) {
		casosTotales=0;
		return;
	}
	casosTotales=factorial(Perros)/(factorial(grupos)*factorial((Perros-grupos)));
}
static void casosNegros() {
	if(Perrosnegros-grupos<0) {
		casosNegros=0;
		
		return;
	}
	if(Perrosnegros-grupos==0) {
	casosNegros=1;
	}else {
	casosNegros=factorial(Perrosnegros)/(factorial(grupos)*factorial(Perrosnegros-grupos));
	}
	;
	
}
static void casosnoNegros() {
	if(Perros-Perrosnegros-grupos<0) {
	casosnoNegros=0;
	return;
	}
	if(Perros-Perrosnegros-grupos==0) {
		casosnoNegros=1;
		return;
		}
	casosnoNegros=factorial(Perros-Perrosnegros)/(factorial(grupos)*factorial(Perros-Perrosnegros-grupos));
}

static double probabilidadsolonegros() {
	if(casosTotales==0) {
		return 0;
	}
	
	return (double)casosNegros/(double)casosTotales;
	
}
static double probabilidadsolononegros() {
	if(casosTotales==0) {
		return 0;
	}
	return (double)casosnoNegros/(double)casosTotales;
	
}
static double probabilidadcombinacionarbitraria(int negros,int blancos) {
	 int combinacionnegros=0;
	 int combinacionblancos=0;
	 if(grupos!=(negros+blancos)) {
		 return 0;
	 }
	if(negros==0) {
		combinacionnegros=0;
	}
	if(Perrosnegros-negros==0) {
		combinacionnegros=1;
		System.out.println("executed");
	}
	if(Perrosnegros-negros<0) {
		combinacionnegros=0;
	}
	if(Perrosnegros-negros>0) {
		combinacionnegros=factorial(Perrosnegros)/(factorial(negros)*factorial(Perrosnegros-negros));
		
	}
	if(blancos==0) {
		blancos=0;
	}
	if(Perros-Perrosnegros-blancos==0) {
		combinacionblancos=1;
	}
	if(Perros-Perrosnegros-blancos<0) {
		combinacionblancos=0;
	}
	if(Perros-Perrosnegros-blancos>0) {
		
		combinacionblancos=factorial(Perros-Perrosnegros)/(factorial(blancos)*factorial(Perros-Perrosnegros-blancos));
	}
	 return ((double)combinacionnegros*(double)combinacionblancos)/(double)casosTotales;
	
}
static void calcular1() {
	casosTotales();
	casosNegros();
	casosnoNegros();
	
}
public static int factorial(int a) {
	if(a==0) {
		
		return 1;
	}
	if(a<0) {
		System.out.println("fail" +a);
		return 0;
	}
	if(a==1) {
		return a;
	}else {
		
		return a*factorial(a-1);
	}
}
}
