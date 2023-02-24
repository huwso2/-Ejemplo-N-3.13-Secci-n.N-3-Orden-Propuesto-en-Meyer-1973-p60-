import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainviewListener implements ActionListener {
Mainview ventana;
Textvalidator checker;
public MainviewListener(Mainview Ventana) {
	this.ventana=Ventana;
	checker=new Textvalidator();
	this.ventana.Calcular1.addActionListener(this);
	this.ventana.Calcular2.addActionListener(this);
	this.ventana.creditos.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ventana.Calcular1) {
			if(checker.isanIntnumber(ventana.perrosT.getText())==true && checker.isanIntnumber(ventana.PerrosN.getText())==true && checker.isanIntnumber(ventana.grupos.getText())==true) {
				Operaciones.Perros=Integer.valueOf(ventana.perrosT.getText());
				Operaciones.grupos=Integer.valueOf(ventana.grupos.getText());
				Operaciones.Perrosnegros=Integer.valueOf(ventana.PerrosN.getText());
				Operaciones.calcular1();
				ventana.Resultado1.setText(Operaciones.probabilidadsolonegros()+"");
				ventana.Resultado2.setText(Operaciones.probabilidadsolononegros()+"");
			}
			
		}
		if(e.getSource()==ventana.Calcular2) {
			if(checker.isanIntnumber(ventana.PerrosNN.getText())==true && checker.isanIntnumber(ventana.Perrosnn.getText())==true && checker.isanIntnumber(ventana.grupos.getText() )==true && checker.isanIntnumber(ventana.perrosT.getText())==true && checker.isanIntnumber(ventana.PerrosN.getText())==true && checker.isanIntnumber(ventana.grupos.getText())==true) {
				Operaciones.Perros=Integer.valueOf(ventana.perrosT.getText());
				Operaciones.grupos=Integer.valueOf(ventana.grupos.getText());
				Operaciones.Perrosnegros=Integer.valueOf(ventana.PerrosN.getText());
				Operaciones.calcular1();
				ventana.Resultado2_1.setText(Operaciones.probabilidadcombinacionarbitraria(Integer.valueOf(ventana.PerrosNN.getText()), Integer.valueOf(ventana.Perrosnn.getText()))+"");
			
			}
		}
		if(e.getSource()==ventana.creditos) {
			abrirarchivo("(20211020116)_3.13_I_1.pdf");
		}
	}
	public void abrirarchivo(String archivo){

	     try {

	            File objetofile = new File (archivo);
	            Desktop.getDesktop().open(objetofile);

	     }catch (IOException ex) {

	            System.out.println(ex);

	     }

	}  

}
