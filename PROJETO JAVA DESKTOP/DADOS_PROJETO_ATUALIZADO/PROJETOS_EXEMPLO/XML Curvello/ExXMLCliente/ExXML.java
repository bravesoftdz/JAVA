import java.util.Iterator;
import java.util.List;

import com.classes.Clientes;
import com.classes.ListClientes;
import com.persistencia.ManipXML;

public class ExXML {
	
	public static void main(String[] args) {

		ListClientes lista = new ListClientes();
		
		Clientes cli = new Clientes();
		cli.setCodigo(123);
		cli.setNome("Rodrigo");
		cli.setEmail("rodrigo@curvello.com");
		cli.setFone("1234-4321");
		
		lista.inserir(cli);
		
		cli = new Clientes();
		cli.setCodigo(321);
		cli.setNome("curvello");
		cli.setEmail("12@curvello.com");
		cli.setFone("9999-4321");
		
		lista.inserir(cli);
	
		ManipXML.gravarXML(lista.getLista());	
	
		List<Clientes> list = ManipXML.lerXMLCOM();
		
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Clientes element = (Clientes) iter.next();
			System.out.println(element.toString() + "\n---");	
		}
		
	}
}