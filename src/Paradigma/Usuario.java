package Paradigma;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane; 


public class Usuario {
	
	private List<Post> posts = new ArrayList<Post>();
	
	int i;
	String p;
	
	Post p1 = new Post();
	
	
	public Categoria categoria = new Categoria();
	
	
	
	public Usuario(){
		
		this.categoria = new Novato(); 
		
		
		
		
	}
		
	public void Postear(){
	
	 int a = Integer.parseInt(JOptionPane.showInputDialog("Cuantos posts desea ingresar?"));
	 
	 for (int f=1; f<=a; f++){
		 
		 p1 = this.categoria.devolverPost();
		 JOptionPane.showMessageDialog(null, "Ingresar post numero " + f);
		 p = JOptionPane.showInputDialog("Ingresar texto del post");
		 p1.texto = p;
		 posts.add(p1);
		 }
	 
	 for (i = 0; i<posts.size(); i++){
		 System.out.println((posts.get(i)).texto);
	}
	}

}
