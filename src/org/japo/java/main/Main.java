/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final String NAME = "Marta";
        final String ARTICULO = "Pulsera hippy";
        final double ABUELA_PAGA = 1.0;
        final double PULSERA_PRC = 0.7;

        //Variables
        double sobras = ABUELA_PAGA - PULSERA_PRC;

        //Salidas
        //  Cabecera
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");

        //  Info niña
        System.out.printf("Nombre de la niña ...: %s%n",
                NAME);
        System.out.printf(Locale.ENGLISH,
                "Dinero inicial ......: %.2f €%n",
                ABUELA_PAGA);

        //  Separador_1
        System.out.println("---");

        //  Info compra
        System.out.printf("Artículo a comprar ..: %s%n",
                ARTICULO);
        System.out.printf(Locale.ENGLISH,
                "Precio artículo .....: %.2f €%n",
                PULSERA_PRC);

        //  Separador_2
        System.out.println("---");

        //  Info sobras
        System.out.printf(Locale.ENGLISH,
                "Dinero restante .....: %.2f €%n",
                sobras);
    }
}
