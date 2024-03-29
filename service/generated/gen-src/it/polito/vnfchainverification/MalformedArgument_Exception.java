
package it.polito.vnfchainverification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MalformedArgument", targetNamespace = "http://www.example.org/checkisolation")
public class MalformedArgument_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MalformedArgument faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MalformedArgument_Exception(String message, MalformedArgument faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MalformedArgument_Exception(String message, MalformedArgument faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.vnfchainverification.MalformedArgument
     */
    public MalformedArgument getFaultInfo() {
        return faultInfo;
    }

}
