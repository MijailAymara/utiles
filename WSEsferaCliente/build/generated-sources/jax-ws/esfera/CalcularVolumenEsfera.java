
package esfera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalcularVolumenEsfera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalcularVolumenEsfera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Radio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcularVolumenEsfera", propOrder = {
    "radio"
})
public class CalcularVolumenEsfera {

    @XmlElement(name = "Radio")
    protected double radio;

    /**
     * Obtiene el valor de la propiedad radio.
     * 
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Define el valor de la propiedad radio.
     * 
     */
    public void setRadio(double value) {
        this.radio = value;
    }

}
