
package dk.cphsoftdev.app.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.cphsoftdev.app.webservice package. 
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

    private final static QName _GetBanks_QNAME = new QName("http://controller.example/", "getBanks");
    private final static QName _GetFilteredBanks_QNAME = new QName("http://controller.example/", "getFilteredBanks");
    private final static QName _GetFilteredBanksResponse_QNAME = new QName("http://controller.example/", "getFilteredBanksResponse");
    private final static QName _GetBanksResponse_QNAME = new QName("http://controller.example/", "getBanksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.cphsoftdev.app.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBanks }
     * 
     */
    public GetBanks createGetBanks() {
        return new GetBanks();
    }

    /**
     * Create an instance of {@link GetFilteredBanks }
     * 
     */
    public GetFilteredBanks createGetFilteredBanks() {
        return new GetFilteredBanks();
    }

    /**
     * Create an instance of {@link GetBanksResponse }
     * 
     */
    public GetBanksResponse createGetBanksResponse() {
        return new GetBanksResponse();
    }

    /**
     * Create an instance of {@link GetFilteredBanksResponse }
     * 
     */
    public GetFilteredBanksResponse createGetFilteredBanksResponse() {
        return new GetFilteredBanksResponse();
    }

    /**
     * Create an instance of {@link Bank }
     * 
     */
    public Bank createBank() {
        return new Bank();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.example/", name = "getBanks")
    public JAXBElement<GetBanks> createGetBanks(GetBanks value) {
        return new JAXBElement<GetBanks>(_GetBanks_QNAME, GetBanks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredBanks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.example/", name = "getFilteredBanks")
    public JAXBElement<GetFilteredBanks> createGetFilteredBanks(GetFilteredBanks value) {
        return new JAXBElement<GetFilteredBanks>(_GetFilteredBanks_QNAME, GetFilteredBanks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilteredBanksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.example/", name = "getFilteredBanksResponse")
    public JAXBElement<GetFilteredBanksResponse> createGetFilteredBanksResponse(GetFilteredBanksResponse value) {
        return new JAXBElement<GetFilteredBanksResponse>(_GetFilteredBanksResponse_QNAME, GetFilteredBanksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.example/", name = "getBanksResponse")
    public JAXBElement<GetBanksResponse> createGetBanksResponse(GetBanksResponse value) {
        return new JAXBElement<GetBanksResponse>(_GetBanksResponse_QNAME, GetBanksResponse.class, null, value);
    }

}
