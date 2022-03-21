
    
public void tarea4(){
        int[] vector = new int[10];
        boolean salir = false;
        do{
            //Llenamos el vector con numeros random
            for (int i=0; i< vector.length;i++){
                int random = (int) (Math.random() *100);
                vector[i] = random;
            }
            //Checamos cual es el mayor
            //primero recorremos el vector y comparamos
            int mayor=vector[0];
            for (int k=0;k< vector.length;k++){
                if (vector[k]>mayor){
                    mayor = vector[k];
                }
            }
            //Mostramos el vector con los numeros
            for (int j=0;j< vector.length;j++){
                System.out.println("No. "+(j+1)+"    "+vector[j]+" Distancia hasta el numero mayor: "+distancia(vector[j],mayor));
            }
            //preguntamos si se desea salir
            System.out.println("Menu Tarea 2\nDesea repetir?\n1.Si\n2.No");
            int op = leer.nextInt();
            if (op == 2){
                salir = true;
            }
        }while(!salir);
    }
    //con este metodo calculamos las distancias de los numeros hasta el numero mayor
    public int distancia(int numero, int mayor){
        int contador = 0;
        for (int i=numero;i<mayor;i++){
            contador++;
        }
        return contador;
    }