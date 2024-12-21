 package ciclofor;
import javax.swing.JOptionPane;
public class Calificacion {
    public static void main(String jav[]) {
        byte x, y;
        byte cal[][] = new byte[6][4];
        String materias[] = {"MateDisc", "CalcDife", "FundInve", "FundProg", "Quimica-", "DesaSust"};
        String encabezado[] = {"Asignatura", "U1", "U2", "U3", "U4"}; 
        for (x=0; x <5;x++) {
            System.out.print(encabezado[x]+"\t");
        }
        System.out.println(); 
        for (x = 0; x < 6; x++) {  
            System.out.print(materias[x] + "\t");
            for (y = 0; y < 4; y++) {               
                cal[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa la calificación de la " + encabezado[y+1]+" de la materia " + materias[x]));
            }
            for (y = 0; y < 4; y++) {
                System.out.print(cal[x][y]+"\t");
            }
            System.out.println();  
        }
    }
}

