
package dk.cphsoftdev.app.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankControllerService", targetNamespace = "http://controller.example/", wsdlLocation = "http://localhost:9000/rulebase?wsdl")
public class BankControllerService
    extends Service
{

    private final static URL BANKCONTROLLERSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKCONTROLLERSERVICE_EXCEPTION;
    private final static QName BANKCONTROLLERSERVICE_QNAME = new QName("http://controller.example/", "BankControllerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/rulebase?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKCONTROLLERSERVICE_WSDL_LOCATION = url;
        BANKCONTROLLERSERVICE_EXCEPTION = e;
    }

    public BankControllerService() {
        super(__getWsdlLocation(), BANKCONTROLLERSERVICE_QNAME);
    }

    public BankControllerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKCONTROLLERSERVICE_QNAME, features);
    }

    public BankControllerService(URL wsdlLocation) {
        super(wsdlLocation, BANKCONTROLLERSERVICE_QNAME);
    }

    public BankControllerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKCONTROLLERSERVICE_QNAME, features);
    }

    public BankControllerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankControllerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankController
     */
    @WebEndpoint(name = "BankControllerPort")
    public BankController getBankControllerPort() {
        return super.getPort(new QName("http://controller.example/", "BankControllerPort"), BankController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankController
     */
    @WebEndpoint(name = "BankControllerPort")
    public BankController getBankControllerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://controller.example/", "BankControllerPort"), BankController.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKCONTROLLERSERVICE_EXCEPTION!= null) {
            throw BANKCONTROLLERSERVICE_EXCEPTION;
        }
        return BANKCONTROLLERSERVICE_WSDL_LOCATION;
    }

}