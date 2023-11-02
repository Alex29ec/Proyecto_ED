package refactorizacion;

import utils.utilsArrays;

public class refactorizacion {
	
	private static final int MAX_ESTUDIANTES = 20;
	public static void main(String[] args) {
		
			int array[] = new int[10];
			int mayor = MAX_ESTUDIANTES;
					
			utilsArrays.inicializaArray(array, 0, 100);
			utilsArrays.imprimeArray(array);
			ordenacionShellCambiado(array);
			System.out.println();
			utilsArrays.imprimeArray(array);
		}
		
		
		public static void ordenacionShellCambiado(int a[]){
			int aux;
			boolean hayIntercambio = true;
			for(int i = a.length/4; i > 0; i /= 2) {
				
				do {
					hayIntercambio = false;
					int j = 0;
				for (j = 0 ; j < a.length - i; j ++) {
					
					System.out.println("comparo " + a[j] + " con " + a[j +i]);
					if(a[j] > a[j+i]){
						aux = a[j];
						a[j] = a[j+i];
						a[j+i] = aux;
						hayIntercambio = true;
						System.out.println("Intercambio " + a[j] + " con " + a[j + i]);
						utilsArrays.imprimeArray(a);
					}
				}
				} while(hayIntercambio == true);
				System.out.println("Divido el shell entre 2");
			}
		}

}
