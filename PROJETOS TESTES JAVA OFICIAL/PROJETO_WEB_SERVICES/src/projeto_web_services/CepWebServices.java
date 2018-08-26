package projeto_web_services;

import java.net.URL;
import java.util.Iterator;
import org.jdom.Element;
import org.w3c.dom.Document;

/**
 *
 * @author Gelvazio Camargo
 */
public class CepWebServices {
 
    private String estado = "";
    private String cidade = "";
    private String bairro = "";
    private String tipoLogradouro = "";
    private String logradouro = "";
 
    private int resultado = 0;
 
    @SuppressWarnings("rawtypes")
    public CepWebServices(String cep) {
 
        try {
            URL url = new URL(
                    "http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep
                            + "&formato=xml");
 
            Document document = getDocumento(url);
 
            Element root = document.getRootElement();
 
            for (Iterator i = root.elementIterator(); i.hasNext();) {
                Element element = (Element) i.next();
 
                if (element.getQualifiedName().equals("uf"))
                    setEstado(element.getText());
 
                if (element.getQualifiedName().equals("cidade"))
                    setCidade(element.getText());
 
                if (element.getQualifiedName().equals("bairro"))
                    setBairro(element.getText());
 
                if (element.getQualifiedName().equals("tipo_logradouro"))
                    setTipoLogradouro(element.getText());
 
                if (element.getQualifiedName().equals("logradouro"))
                    setLogradouro(element.getText());
 
                if (element.getQualifiedName().equals("resultado"))
                    setResultado(Integer.parseInt(element.getText()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
    public Document getDocumento(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
 
        return document;
    }
