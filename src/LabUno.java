import java.util.Scanner;
import java.lang.*;
public class LabUno{
	private final static int CHAINS = 1;
	private final static int NUMBER_REAL= 2;
	private final static int ARRAYS = 3;
	static Scanner in;
	static boolean exit;
	static int option;
	static String chainOne;
	static String chainTwo;
	static String chainTree;
	static double numberA;
	static double numberB;
	static int[] arrayOne;
	static int[] arrayTwo;
	static int[] arrayTree;
	static int[] selectOne;
	static int[] selectTwo;

	public static void initialize(){
     in = new Scanner(System.in);
     exit = false;
     option = 0;
     chainOne = "";
     chainTwo = "";
     chainTree = "";
     numberA = 0;
     numberB = 0;
	}
    
    public static void menuAndOption(){
     System.out.println("\n");
	 System.out.println("*************************");
	 System.out.println("*     menu principal:   *");
	 System.out.println("*************************");
     System.out.println("\n1.cadenas de caracteres." + 
                    	"\n2.Operaciones con numeros enteros mayores a 0." +
                     	"\n3.Arreglos de numeros enteros" +
     	                "\n0. salir");
    	option = in.nextInt();
    	in.nextLine();
    }

     public static void OptionSelection(){
      switch(option){
      	case 0:
      	 System.out.println("Vuelva pronto ;)");
      	 exit = true;
      	 break;

        case CHAINS:
         readChains();
         do{
          menuOptionChains();
          optionOfChains();
         }while(!exit);
         exit = false;
         break;

        case NUMBER_REAL:
         readRealNumbers();
        do{
          menuOptionNumerReal();
          optionNumberReal();
         }while(!exit);
         exit = false;
         break;

        case ARRAYS:
         readArrays();
         do{
          menuArrays();
          optionArrays();
         }while(!exit);
         exit = false;
         break;

        default:
         System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez. ");
         break;
      }

     }
//**************************************OPTION ONE : READ 3 CHAINS and do: length, concatenate, char******************************
     public static void readChains(){
     	System.out.println("Ingresar tres cadenas de caracteres");
        chainOne=in.nextLine();
        chainTwo=in.nextLine();
        chainTree=in.nextLine();
     }

    public static void menuOptionChains(){
     System.out.println("\n"+
     	                "\n1.Ver longitud de cadenas."+ 
     	                "\n2.Concatenar cadenas."+
     	                "\n3.Mostrar el termino n-esimo de las cadenas"+
     	                "\n0. volver");
	 option = in.nextInt();
    }

    public static void optionOfChains(){
    	switch(option){
         case 0:
          exit = true;
          break;
         case 1:
         OptionChainsSeeLength();
          break;
         case 2:
         OptionChainsConcatenate();
          break;
         case 3:
         OptionChainsFindChar();
          break;
          default:
          System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez.");
           break;
    	}  
    	System.out.println(" ");
    }

    public static void OptionChainsSeeLength(){
    	System.out.println("La cadena : *"+chainOne+"* tiene: "+chainOne.length()+" caracteres.");
		System.out.println("La cadena : *"+chainTwo+"* tiene: "+chainTwo.length()+" caracteres.");
		System.out.println("La cadena : *"+chainTree+"* tiene: "+chainTree.length()+" caracteres.");
    }

    public static void OptionChainsConcatenate(){
 		String chains = (chainOne+" "+chainTwo+" "+chainTree);
        System.out.println("Las cadenas concatenadas son: "+chains);
    }

    public static void OptionChainsFindChar(){
 		System.out.println("Ingresar la posicion del caracter a ubicar: ");
		int charPosition=in.nextInt();
        if(chainOne.length() >= charPosition ){
			System.out.println("-El caracter en la poscicion "+charPosition+" de la cadena "+chainOne+" es igual a "+chainOne.charAt(charPosition-1));
		}else{
			System.out.println("-El caracter en la poscicion "+charPosition+" de la cadena "+chainOne+" esta por fuera del tamaño de la cadena");
		}
		if(chainTwo.length() >= charPosition ){
			System.out.println("-El caracter en la poscicion "+charPosition+" de la cadena "+chainTwo+" es igual a "+chainTwo.charAt(charPosition-1));
		}else{
			System.out.println("-El caracter en la poscicion "+charPosition+" de la cadena "+chainTwo+" esta por fuera del tamaño de la cadena");
		}
		if(chainTree.length() >= charPosition ){
			System.out.println("-El caracter en la poscicion "+charPosition+" de la cadena "+chainTree+" es igual a "+chainTree.charAt(charPosition-1));
		}else{
			System.out.println("-El caracter en la poscicion "+charPosition+" de la cadena "+chainTree+" esta por fuera del tamaño de la cadena");
		}

    }

//**********************************OPTION TWO : READ 2 REAL NUMBERS and do: divition, integer part division**********************
    public  static void readRealNumbers(){
     System.out.println("Ingresar dos numeros reales mayores a 0:");
     numberA = in.nextDouble(); in.nextLine();
     numberB = in.nextDouble(); in.nextLine();
    }
    
    public static void menuOptionNumerReal(){
     System.out.println("\n"+
     	                "\n1.Division de ambos numeros."+ 
     	                "\n2.Division y residuo de la parte entera."+
     	                "\n0. volver");
	 option = in.nextInt();
    }

    public static void optionNumberReal(){
    	switch(option){
         case 0:
         exit = true;
          break;

         case 1:
          NumbersDivision();
          break;

         case 2:
          integerPartOfNumbersDivision();
          break;

         default:
         System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez. ");
          break;
    	}
    }	

    public static void NumbersDivision(){
     System.out.println("la division de "+numberA+"/"+numberB+" es igual a: "+numberA/numberB);
	 System.out.println("la division de "+numberB+"/"+numberA+" es igual a: "+numberB/numberA);      
    } 

    public static void integerPartOfNumbersDivision(){
     System.out.println("la division de "+(int)numberA+"/"+(int)numberB+" es igual a: "+(int)(numberA/numberB)+" y tienen un residuo igual a: "+(int)(numberA%numberB));
	 System.out.println("la division de "+(int)numberB+"/"+(int)numberA+" es igual a: "+(int)(numberB/numberA)+" y tienen un residuo igual a: "+(int)(numberB%numberA));
    }

//**************************************OPTION TREE : READ 3 ARRAYS *************************************************************
    public static void readArrays(){
     System.out.println("Ingesar la longitud de los Arreglos");
     int arraysLength = in.nextInt();
     arrayOne = new int[arraysLength];
     arrayTwo = new int[arraysLength];
     arrayTree = new int[arraysLength];
     selectOne = new int[arraysLength];
     selectTwo = new int[arraysLength];
     int i=0;
    	for(i=0; i < arraysLength ; i++ ){
             System.out.println("Ingresar el numero para posicion "+(i+1)+" en el arreglo #1");
             arrayOne[i]= in.nextInt();
    	 }
    	 for(i=0; i < arraysLength ; i++ ){
             System.out.println("Ingresar el numero para posicion "+(i+1)+" en el arreglo #2");
             arrayTwo[i]= in.nextInt();
    	 }
    	 for(i=0; i < arraysLength ; i++ ){
             System.out.println("Ingresar el numero para posicion "+(i+1)+" en el arreglo #3");
             arrayTree[i]= in.nextInt();
    	 }     
    }

    public static void menuArrays(){
     System.out.println("\n"+
     	                "\n1.Ver Arreglos."+ 
     	                "\n2.Promedio de un arreglo."+
     	                "\n3.Valor mayor de un arreglo."+
     	                "\n4.Operar dos arreglos."+ 
     	                "\n5.Unir los arreglos."+ 
     	                "\n6.Girar un arreglo."+ 
     	                "\n7.Ordenar un arreglo."+ 
     	                "\n0. volver");
	 option = in.nextInt();
    }

    public static void optionArrays(){
     switch(option){
         case 0:
          exit = true;
          break;

         case 1:
	         seeArrays();
         	
          break;

         case 2:
	         selectOneArray();
	         averageValue();
	          break;

         case 3:
         	selectOneArray();
         	maxValue();
          	break;

         case 4:
         	selectTwoArrays();
         	selectOperation();
         	OptionOperation();
          	break;

         case 5:
        	showConcatenatedArrays();
         	break;

         case 6:
         	selectOneArray();
         	turnArray();
          	break;

         case 7:
         	selectOneArray();
         	sorting();
          	break;

          default:
          	System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez.");
           	break;
    	} 
    }

    public static void seeArrays(){
      System.out.println("El arreglo numero uno es: ");
     for(int i = 0; i < arrayOne.length ; i++){
      System.out.print("["+arrayOne[i]+"]");
     }
     System.out.println("\nEl arreglo numero dos es: ");
     for(int i = 0; i < arrayOne.length ; i++){
      System.out.print("["+arrayTwo[i]+"]");
     }
     System.out.println("\nEl arreglo numero tres es: ");
     for(int i = 0; i < arrayOne.length ; i++){
      System.out.print("["+arrayTree[i]+"]");
     }

    }

     public static void selectOneArray(){
     	do{
      		System.out.println("Escoger el arreglo a para calcular"+
     	                "\n1.Arreglo uno"+
     	                "\n2.Arreglo dos"+
     	                "\n3.Arreglo tres");
      		option = in.nextInt();
      		if (option <1 || option >3) {
      			System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez.");
      		}else{
      			exit=true;
      		}
     	}while(!exit);

     	exit = false;

     }

    public static void  averageValue(){
     switch(option){
      case 1:
      System.out.println("el promdedio de el arreglo uno es igual a: "+calculateAverage(arrayOne));
       break;

      case 2:
      System.out.println("el promdedio de el arreglo dos es igual a: "+calculateAverage(arrayTwo));
       break;

      case 3:
      System.out.println("el promdedio de el arreglo tres es igual a: "+calculateAverage(arrayTree));
       break;

      default:
      System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez.");
       break;
     }

    }

     public static int calculateAverage(int[]array){
      int average = 0;
       for (int i=0 ; i<array.length ; i++ ) {
       	average += array[i];
       }
      return average;
     }


    public static void maxValue(){
     switch(option){
      case 1:
      System.out.println("el mayor valor de el arreglo uno es igual a: "+calculateMaxValue(arrayOne));
       break;

      case 2:
      System.out.println("el mayor valor de el arreglo dos es igual a: "+calculateMaxValue(arrayTwo));
       break;

      case 3:
      System.out.println("el mayor valor de el arreglo tres es igual a: "+calculateMaxValue(arrayTree));
       break;

      default:
      System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez.");
       break;
     }

    }


    public static int calculateMaxValue(int[]array){
     int max = Integer.MIN_VALUE;
     int cont = 0;
     int maxCont = 0;
     for (int i=0 ; i < array.length ;i++ ) {
     	cont=0;
     	for (int ii = 0; ii < array.length ;ii++ ) {
     		if (array[i]>=array[ii]) {
     		 cont=cont+1;
     		}
     	}
     	if (cont>maxCont) {
     		max = array[i];
     	}
     }
     return max;
    }

    public static void selectOperation(){
	     System.out.println("Escoger la operacion a realizar"+
	     	                "\n1.Suma"+
	     	                "\n2.Resta"+
	     	                "\n3.Multiplicacion");
	      option = in.nextInt();
     }


     public static void OptionOperation(){
     	switch(option){
       	case 1:
        	optionAddition(selectOne,selectTwo);
       		break;
       	case 2:
       		optionSubstraction(selectOne,selectTwo);
       		break;
       	case 3:
       		optionMultiplication(selectOne,selectTwo);
       		break;
       	default:
       		System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez.");
       		break;
       }
      }

      public static void selectTwoArrays(){
      	do{
         System.out.println("Escoger los arreglos a para calcular. (separar cada numero con un enter)"+
     	                    "\n1.Arreglo uno"+
     	                    "\n2.Arreglo dos"+
     	                    "\n3.Arreglo tres");

		for (int i = 0; i < 2 && exit == false ; i++) {
			option=in.nextInt();
			in.nextLine();

			switch(option){
				case 1:
					if(i == 0){
						for (int j = 0; j < selectOne.length; j++) {
							selectOne[j] = arrayOne[j];
						}
					}else{
						for (int k = 0; k < selectOne.length; k++) {
							selectTwo[k] = arrayOne[k];							
						}
					}
					break;
				case 2:
					if(i == 0){
						for (int j = 0; j < selectOne.length; j++) {
							selectOne[j] = arrayTwo[j];							
						}
					}else{
						for (int k = 0; k < selectOne.length; k++) {
							selectTwo[k] = arrayTwo[k];						
						}
					}
					break;
				case 3:
					if(i == 0){
						for (int j = 0; j < selectOne.length; j++) {
							selectOne[j] = arrayTree[j];							
						}
					}else{
						for (int k = 0; k < selectOne.length; k++) {
							selectTwo[k] = arrayTree[k];
						}
					}
					break;
				default:
					System.out.println("Error al seleccionar la opcion, por favor seleccionar otra vez.");
					exit = true;
					break;
			}
		}
		exit = !exit;
     }while(exit==false);

     exit = false;

    }

    public static void optionAddition(int[] selectOne,int[] selectTwo){
    	System.out.println("La suma de los Arreglos es igual a:");
    	System.out.print("[");
    	for (int i = 0; i < selectOne.length; i++) {
    		if (i == selectOne.length-1) {
    			System.out.print((selectOne[i]+selectTwo[i]));
    		}else{
    			System.out.print((selectOne[i]+selectTwo[i])+", ");
    		}
    		
    	}

    	System.out.print("]");
    }

    public static void optionSubstraction(int[] selectOne,int[] selectTwo){
    	System.out.println("La resta de los arreglos de la forma a/b es igual a:");
    	System.out.print("[");
		for (int i = 0; i < selectOne.length; i++) {
    		if (i == selectOne.length-1) {
    			System.out.print((selectOne[i]-selectTwo[i]));
    		}else{
    			System.out.print((selectOne[i]-selectTwo[i])+", ");
    		}

    	}
    	System.out.print("]");

    	System.out.println("\nLa resta de los arreglos de la forma b/a es igual a:");    
    	System.out.print("\n[");
    	for (int i = 0; i < selectOne.length; i++) {
    		if (i == selectOne.length-1) {
    			System.out.print((selectTwo[i]-selectOne[i]));
    		}else{
    			System.out.print((selectTwo[i]-selectOne[i])+", ");
    		}
    		
    	}	
    	System.out.print("]");

    }

    public static void showSubstraction(int[] selectOne,int[] selectTwo) {
    	
    }

    public static void optionMultiplication(int[] selectOne,int[] selectTwo) {
    	System.out.println("La Multiplicacion de los Arreglos es igual a:");
    	System.out.print("[");
    	for (int i = 0; i < selectOne.length; i++) {
    		if (i == selectOne.length-1) {
    			System.out.print((selectOne[i]*selectTwo[i]));
    		}else{
    			System.out.print((selectOne[i]*selectTwo[i])+", ");
    		}
    		
    	}

    	System.out.print("]");

    }

    public static void showConcatenatedArrays() {
    	int [] treeArrays = new int[arrayOne.length*3];
    	concatenateArrays(treeArrays);
    	System.out.println("los Arreglos arreglos unidos en orden arreglo uno + arreglo dos  + arreglo tres es igual a:");
    	System.out.print("\n[");
    	for (int i = 0; i< treeArrays.length; i++) {
    		if (i == treeArrays.length-1) {
    			System.out.print(treeArrays[i]);
    		}else{
    			System.out.print(treeArrays[i]+", ");
    		}
    	}
    	System.out.print("]");
    }

    public static void concatenateArrays(int [] treeArrays) {

    	for (int i =0; i< treeArrays.length ; i++ ) {
    		treeArrays[i] = getValueOfArrays(i);
    	}
    }

    public static int getValueOfArrays(int i) {
    	int value;
    	if (i < arrayOne.length) {
    		value = arrayOne[i];
    	}else if (i >= arrayOne.length && i < arrayOne.length*2) {
    		value = arrayTwo[i-arrayOne.length];
    	}else{
    		value = arrayTree[i-arrayOne.length*2];
    	}

    	return value;
    }

    public static int askForTheNTurn() {
    	System.out.println("Digitar la cantidad de veces que desea girar el arreglo seleccionado:\n"+
    						"(numeros enteros positivos para desplazar el arreglo hacia la derecha)\n"+
    						"(numeros enteros negativos para desplazar el arreglo hacia la izquierda)");
    	int nth = in.nextInt();
    	in.nextLine();
    	 return nth;
    }

    public static void turnArray() {
    	switch (option) {
    		case 1:
    			showArray(operationTurnArrays(arrayOne,askForTheNTurn())); 
    			break;
    		case 2:
    			showArray(operationTurnArrays(arrayTwo,askForTheNTurn()));
    			break;
    		case 3:
    			showArray(operationTurnArrays(arrayTree,askForTheNTurn()));
    			break;
    		
    	}
    }

    public static void showArray(int [] arrayToShow) {
    	System.out.print("[");
    	for ( int i = 0 ; i<arrayToShow.length; i++ ) {
    		if (i == arrayToShow.length-1) {
    			System.out.print(arrayToShow[i]);	
    		}else{
    			System.out.print(arrayToShow[i]+",");
    		}
    		
    	}
    	System.out.println("]");

    }

    public static int[] operationTurnArrays(int [] arrayTurned, int n) {
    	int temp = 0;
    	for (int i = 0; i < Math.abs(n) ; i++ ) {
    		if (n<0) {
    				temp = arrayTurned[0];
    				for (int j = 0; j < arrayTurned.length-1 ; j++ ) {

    					arrayTurned [j] = arrayTurned [j+1];
    				}
    				arrayTurned [arrayTurned.length-1]=temp;
    		}else{
    			temp = arrayTurned[arrayTurned.length-1];
    				for (int j = arrayTurned.length-1 ; j > 0  ; j-- ) {
    					arrayTurned [j] = arrayTurned [j-1];
    				}
    				arrayTurned [0]=temp;
    		}
    	}

    	return arrayTurned;

    }

    public static void sorting() {
    	switch (option) {
    		case 1:
    			showArray(boubleSort(arrayOne));
    			break;
    		case 2:
    			showArray(boubleSort(arrayTwo));
    			break;
    		case 3:
    			showArray(boubleSort(arrayTree));
    			break;
    	}
    }

    public static int[] boubleSort(int[] arrayToSort) {
    	for (int i = arrayToSort.length; i>0 ;i-- ) {
    		for (int j  = 0; j< i-1 ; j++ ) {
    			if (arrayToSort[j]>arrayToSort[j+1]) {
    				int temp = arrayToSort[j];
    				arrayToSort[j]=arrayToSort[j+1];
    				arrayToSort[j+1]=temp;
    			}
    		}
    	}

    	return (arrayToSort);
    }

	public static void main(String args[]){
	     do{
		     initialize();
		     menuAndOption();
		     OptionSelection();
	      }while(!exit);
      
	}

}