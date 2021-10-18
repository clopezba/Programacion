package Tema14;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XmlDom {

	public static void main(String[] args) throws IOException, ClassNotFoundException, TransformerException, ParserConfigurationException {
		
		
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			
			Document documento = implementation.createDocument(null, "departamentos", null);
			documento.setXmlVersion("1.0");
			
			ObjectInputStream datos= null;
			
		try {	
			datos = new ObjectInputStream(new FileInputStream("Ficheros\\departamentos.dat"));
			
			while(true) {
				
				Element departamento = documento.createElement("departamento");
				Departamentos dep = new Departamentos();
				dep = (Departamentos) datos.readObject();
				Element numDep = documento.createElement("numDepartamento");
				Text txtNumDep = documento.createTextNode(Integer.toString(dep.getNumDepartamento()));
				numDep.appendChild(txtNumDep);
				departamento.appendChild(numDep);
				
				Element nombre = documento.createElement("nombre");
				Text txtNombre = documento.createTextNode(dep.getNombre());
				nombre.appendChild(txtNombre);
				departamento.appendChild(nombre);
				
				Element localidad = documento.createElement("localidad");
				Text txtLocalidad = documento.createTextNode(dep.getLocalidad());
				localidad.appendChild(txtLocalidad);
				departamento.appendChild(localidad);
				
				documento.getDocumentElement().appendChild(departamento);
				
			}
		} catch (EOFException eof) {
			 
			return;
		}
		finally {
			datos.close();
			Source source = new DOMSource(documento);
			Result result = new StreamResult(new File("Ficheros\\departamentos.xml"));
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
		}

		
	}

}
