import javax.swing.JOptionPane;
public class Hipotenusa {
    public static void main (String[]args){
        
        double alt = 0,base = 0;
        
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base "));
                double hipotenusa = CalculoHipotenusa(alt , base);

        JOptionPane.showMessageDialog(null, " O valor da hipotenusa é  " +hipotenusa);
    }//final do main
    
    static double CalculoHipotenusa(double altura,double ba){
         
         return (Math.pow(altura,2) + Math.pow( ba,2));
    }
}
