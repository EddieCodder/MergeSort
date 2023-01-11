public class MergeSort {
	// MÉTODOS DE CLASE
	
	// Método usado por el usuario
	public static void sort(int a[]) {
		sortRecursivo(a, 0, a.length-1);
	}
	
	private static void sortRecursivo(int a[], int izquierda, int derecha){	
	    if(izquierda < derecha){ // Para buscar el subvector de tamaño 1.
	      //Encuentra el punto medio del vector.
	      int medio = (izquierda + derecha) / 2;
	     
	      System.out.println("Division");
	      imprimirVectorDesde_Hasta(a,izquierda, medio);
	      imprimirVectorDesde_Hasta(a,medio+1, derecha);
	      System.out.println();

	      //Divide la primera y segunda mitad (llamada recursiva).
	      sortRecursivo(a, izquierda, medio);      
	      sortRecursivo(a, medio+1, derecha);
	      
	      System.out.println("Ordenando y Juntando");
	      imprimirVectorDesde_Hasta(a,izquierda, medio);
	      imprimirVectorDesde_Hasta(a,medio+1, derecha);
	      //Une las mitades.
	      merge(a, izquierda, medio, derecha);
	      System.out.println("Al arreglo");
	      imprimirVector(a);
	      System.out.println();
	    }
	}

	private static void merge(int a[], int izquierda, int medio, int derecha) {
		  //Encuentra el tamaño de los sub-vectores para unirlos.
		  int n1 = medio - izquierda + 1;
		  int n2 = derecha - medio;

		  //Vectores temporales.
		  int subVectorIzquierdo[] = new int [n1];
		  int subVectorDerecho[] = new int [n2];

		  //Copia los datos a los arrays temporales.
		  for (int i=0; i < n1; i++) {
			  subVectorIzquierdo[i] = a[izquierda+i];
		  }
		  for (int j=0; j < n2; j++) {
			  subVectorDerecho[j] = a[medio + j + 1];
		  }
		  
		  //Índices inicial del primer y segundo sub-vector
		  int i = 0, j = 0;

		  //Índice inicial del sub-vector a[]
		  int k = izquierda;

		  //Ordenamiento.
		  while (i < n1 && j < n2) {
		    if (subVectorIzquierdo[i] <= subVectorDerecho[j]) {
		      a[k] = subVectorIzquierdo[i];
		      i++;
		    } else {
		       a[k] = subVectorDerecho[j];
		       j++;
		    }
		    k++;
		  }

		  // Si quedan elementos por ordenar
		  //Copiar los elementos restantes de subVectorIzquierdo[].
		  while (i < n1) {
		    a[k] = subVectorIzquierdo[i];
		    i++;
		    k++;
		  }
		  //Copiar los elementos restantes de subVectorDerecho[].
		  while (j < n2) {
		    a[k] = subVectorDerecho[j];
		    j++;
		    k++;
		  }
		}
	
	// Imprime un vector
	public static void imprimirVector(int a[]) {
        int n = a.length;
        for (int i=0; i<n; i++) {
        	System.out.print("[" + a[i] + "] ");
        }
        System.out.println();
    }
	
	public static void imprimirVectorDesde_Hasta(int a[], int inicio, int fin) {
        for (; inicio<=fin; inicio++) {
        	System.out.print("[" + a[inicio] + "] ");
        }
        System.out.println();
    }
}
