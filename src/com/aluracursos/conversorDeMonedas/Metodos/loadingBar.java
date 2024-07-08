package com.aluracursos.conversorDeMonedas.Metodos;

public class loadingBar {

    public void Bar() {

        int tiempoBucle = 2000;


        int numIteraciones = 100;


        long tiempoEspera = tiempoBucle / numIteraciones;

        for (int i = 0; i <= numIteraciones; i++) {

            int progreso = i * 100 / numIteraciones;


            System.out.print("\rProcesando: [");
            for (int j = 0; j < i; j++) {
                System.out.print("$");
            }
            for (int j = i; j < numIteraciones; j++) {
                System.out.print(" ");
            }
            System.out.print("] " + progreso + "%");


            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }
}


