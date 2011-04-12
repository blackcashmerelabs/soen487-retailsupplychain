
package org.soen487.supplychain.manufacturer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-hudson-28-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Manufacturer1", targetNamespace = "http://manufacturer.supplychain.soen487.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Manufacturer1 {


    /**
     * 
     * @param aProductName
     * @return
     *     returns org.soen487.supplychain.manufacturer.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductInfo", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.GetProductInfo")
    @ResponseWrapper(localName = "getProductInfoResponse", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.GetProductInfoResponse")
    @Action(input = "http://manufacturer.supplychain.soen487.org/Manufacturer1/getProductInfoRequest", output = "http://manufacturer.supplychain.soen487.org/Manufacturer1/getProductInfoResponse")
    public Product getProductInfo(
        @WebParam(name = "aProductName", targetNamespace = "")
        String aProductName);

    /**
     * 
     * @param aProductName
     * @return
     *     returns org.soen487.supplychain.manufacturer.ProductQuantity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductQuantity", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.GetProductQuantity")
    @ResponseWrapper(localName = "getProductQuantityResponse", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.GetProductQuantityResponse")
    @Action(input = "http://manufacturer.supplychain.soen487.org/Manufacturer1/getProductQuantityRequest", output = "http://manufacturer.supplychain.soen487.org/Manufacturer1/getProductQuantityResponse")
    public ProductQuantity getProductQuantity(
        @WebParam(name = "aProductName", targetNamespace = "")
        String aProductName);

    /**
     * 
     * @param orderNum
     * @param totalPrice
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "receivePayment", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.ReceivePayment")
    @ResponseWrapper(localName = "receivePaymentResponse", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.ReceivePaymentResponse")
    @Action(input = "http://manufacturer.supplychain.soen487.org/Manufacturer1/receivePaymentRequest", output = "http://manufacturer.supplychain.soen487.org/Manufacturer1/receivePaymentResponse")
    public boolean receivePayment(
        @WebParam(name = "orderNum", targetNamespace = "")
        String orderNum,
        @WebParam(name = "totalPrice", targetNamespace = "")
        float totalPrice);

    /**
     * 
     * @param aPO
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "processPurchaseOrder", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.ProcessPurchaseOrder")
    @ResponseWrapper(localName = "processPurchaseOrderResponse", targetNamespace = "http://manufacturer.supplychain.soen487.org/", className = "org.soen487.supplychain.manufacturer.ProcessPurchaseOrderResponse")
    @Action(input = "http://manufacturer.supplychain.soen487.org/Manufacturer1/processPurchaseOrderRequest", output = "http://manufacturer.supplychain.soen487.org/Manufacturer1/processPurchaseOrderResponse")
    public boolean processPurchaseOrder(
        @WebParam(name = "aPO", targetNamespace = "")
        PurchaseOrder aPO);

}
