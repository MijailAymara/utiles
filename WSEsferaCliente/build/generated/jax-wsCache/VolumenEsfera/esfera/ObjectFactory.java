
package esfera;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esfera package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularVolumenEsferaResponse_QNAME = new QName("http://Esfera/", "CalcularVolumenEsferaResponse");
    private final static QName _CalcularVolumenEsfera_QNAME = new QName("http://Esfera/", "CalcularVolumenEsfera");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esfera
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularVolumenEsferaResponse }
     * 
     */
    public CalcularVolumenEsferaResponse createCalcularVolumenEsferaResponse() {
        return new CalcularVolumenEsferaResponse();
    }

    /**
     * Create an instance of {@link CalcularVolumenEsfera }
     * 
     */
    public CalcularVolumenEsfera createCalcularVolumenEsfera() {
        return new CalcularVolumenEsfera();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularVolumenEsferaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Esfera/", name = "CalcularVolumenEsferaResponse")
    public JAXBElement<CalcularVolumenEsferaResponse> createCalcularVolumenEsferaResponse(CalcularVolumenEsferaResponse value) {
        return new JAXBElement<CalcularVolumenEsferaResponse>(_CalcularVolumenEsferaResponse_QNAME, CalcularVolumenEsferaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularVolumenEsfera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Esfera/", name = "CalcularVolumenEsfera")
    public JAXBElement<CalcularVolumenEsfera> createCalcularVolumenEsfera(CalcularVolumenEsfera value) {
        return new JAXBElement<CalcularVolumenEsfera>(_CalcularVolumenEsfera_QNAME, CalcularVolumenEsfera.class, null, value);
    }

}
