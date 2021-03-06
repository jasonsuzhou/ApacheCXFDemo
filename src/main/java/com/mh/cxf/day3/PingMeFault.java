
package com.mh.cxf.day3;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-11-15T19:41:56.101+08:00
 * Generated source version: 3.0.2
 */

@WebFault(name = "faultDetail", targetNamespace = "http://apache.org/hello_world_soap_http/types")
public class PingMeFault extends Exception {
    
    private com.mh.cxf.day3.FaultDetail faultDetail;

    public PingMeFault() {
        super();
    }
    
    public PingMeFault(String message) {
        super(message);
    }
    
    public PingMeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public PingMeFault(String message, com.mh.cxf.day3.FaultDetail faultDetail) {
        super(message);
        this.faultDetail = faultDetail;
    }

    public PingMeFault(String message, com.mh.cxf.day3.FaultDetail faultDetail, Throwable cause) {
        super(message, cause);
        this.faultDetail = faultDetail;
    }

    public com.mh.cxf.day3.FaultDetail getFaultInfo() {
        return this.faultDetail;
    }
}
