/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema006;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema006 {
/**Realizar un programa capaz de recibir las horas trabajadas de un empleado 
y la paga por hora para calcular el sueldo semanal de un empleado . Cuando la horas de trabajo 
exceden de 40 se consideran horas extra; las primeras 8 se pagan al doble;
si las horas extra exceden de 8 se pagan las primeras 8 al doble de lo que se pagan las horas normales 
y el resto al triple.*/
    /**
     * @param args the command line argumentence
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int h;
        double salario;
        double hora=9.23;
        salario=operaciones();
    }
    public static double operaciones(){
        int h;
        double horaextra;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce las horas que trabajo el empleado:");
        h= entrada.nextInt();
        double hora=9.23;
        if(h==40){
            System.out.println("El salario del empreado es:" + (h*hora) + "pesos");
        }
        else if((h>40)&&(h<=48)){
            System.out.println("El salario del empleado será: $" + ((h*hora) + (hora * 2))+ "pesos");
        }
        else if (h>=49){
            System.out.println("El salario del empleado será: $" + ((h*hora) + hora *3 ));
        
    }
        
            return h;
    }

        
        
    }
    

