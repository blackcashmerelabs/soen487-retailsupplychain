
package org.soen487.supplychain.warehouse;

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
@WebService(name = "Warehouse", targetNamespace = "http://warehouse.supplychain.soen487.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Warehouse {


    /**
     * 
     * @param itemList
     * @param info
     * @return
     *     returns org.soen487.supplychain.warehouse.ItemShippingStatusList
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shipGoods", targetNamespace = "http://warehouse.supplychain.soen487.org/", className = "org.soen487.supplychain.warehouse.ShipGoods")
    @ResponseWrapper(localName = "shipGoodsResponse", targetNamespace = "http://warehouse.supplychain.soen487.org/", className = "org.soen487.supplychain.warehouse.ShipGoodsResponse")
    @Action(input = "http://warehouse.supplychain.soen487.org/Warehouse/shipGoodsRequest", output = "http://warehouse.supplychain.soen487.org/Warehouse/shipGoodsResponse")
    public ItemShippingStatusList shipGoods(
        @WebParam(name = "itemList", targetNamespace = "")
        ItemList itemList,
        @WebParam(name = "info", targetNamespace = "")
        Customer info);

}