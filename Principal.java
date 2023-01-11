public class Principal {

	public static void main (String[] args) {	
        //int a [] = {45,17,23,67,21};
        //int a [] = {6,0,3,2,5,7,4,1};
        int a [] = {6,5,3,1,8,7,2,4};

        System.out.println("Arreglo original:");
        MergeSort.imprimirVector(a);

        System.out.println("\nPASOS");
        MergeSort.sort(a);
        
        System.out.println("\nArreglo ordenado:");
        MergeSort.imprimirVector(a);
	}	
}
