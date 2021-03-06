
import java.util.ArrayList;
//import org.soen487.supplychain.manufacturer.*;
import org.soen487.supplychain.warehouse.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author st_youn
 */
public class Main {

    public static void main(String[] args) {

//        test_warehouse();
//        test_manufacturer();
        test_retail();
    }

    private static void test_retail() {

        Customer c = new Customer();
        c.setName("Stephen");
        c.setState("Montreal");
        c.setCountry("Canada");
        c.setStreet1("1234");
        c.setStreet2("FakeStreet");
        c.setCustomerReferenceNumber(12345);

        ItemList items = new ItemList();
        ArrayList<Item> list = (ArrayList<Item>) items.getItems();

        // Create a dummy item
        Item first = new Item();
        first.setProductName("Brand1TV");
        first.setManufacturerName("Brand1");
        first.setProductType("TV");
        first.setUnitPrice(1500);
        first.setQuantity(5);

        list.add(first);

        // Create a dummy item
        Item second = new Item();
        second.setProductName("Brand3DVD");
        second.setManufacturerName("Brand3");
        second.setProductType("TV");
        second.setUnitPrice(1500);
        second.setQuantity(50);

        list.add(second);

//System.out.println("type " + shipGoods(items,c));

        ItemShippingStatusList shipResults = submitOrder(items, c); // Test Retail

        ArrayList<ItemStatus> itemResults = (ArrayList<ItemStatus>) shipResults.getItems();

        for (int i = 0; i < itemResults.size(); i++) {
            System.out.println("Item: " + itemResults.get(i).getItem().getProductName());
            System.out.println("quantity: " + itemResults.get(i).getItem().getQuantity());
            System.out.println("quantity shipped: " + itemResults.get(i).getShipped());
            System.out.println("quantity not shipped: " + itemResults.get(i).getNotShipped());
        }

    }

    private static void test_warehouse() {
//
//        Customer c = new Customer();
//        c.setName("Stephen");
//        c.setState("Montreal");
//        c.setCountry("Canada");
//        c.setStreet1("1234");
//        c.setStreet2("FakeStreet");
//        c.setCustomerReferenceNumber(12345);
//
//        ItemList items = new ItemList();
//        ArrayList<Item> list = (ArrayList<Item>) items.getItems();
//
//        // Create a dummy item
//        Item first = new Item();
//        first.setProductName("Brand1TV");
//        first.setManufacturerName("Brand1");
//        first.setProductType("TV");
//        first.setUnitPrice(1500);
//        first.setQuantity(5);
//
//        list.add(first);
//
//        // Create a dummy item
//        Item second = new Item();
//        second.setProductName("Brand2TV");
//        second.setManufacturerName("Brand2");
//        second.setProductType("TV");
//        second.setUnitPrice(1500);
//        second.setQuantity(50);
//
//        list.add(second);
//
////System.out.println("type " + shipGoods(items,c));
//        ItemShippingStatusList shipResults = shipGoods(items, c); // Test Warehouse
//        ArrayList<ItemStatus> itemResults = (ArrayList<ItemStatus>) shipResults.getItems();
//
//        for (int i = 0; i < itemResults.size(); i++) {
//            System.out.println("Item: " + itemResults.get(i).getItem().getProductName());
//            System.out.println("quantity: " + itemResults.get(i).getItem().getQuantity());
//            System.out.println("quantity shipped: " + itemResults.get(i).getShipped());
//            System.out.println("quantity not shipped: " + itemResults.get(i).getNotShipped());
//        }

    }

    private static void test_manufacturer() {
//        org.soen487.supplychain.manufacturer.Product p = getProductInfo("Brand1TV");
//        if (p != null) {
//            System.out.println(p.getManufacturerName());
//            System.out.println(p.getUnitPrice());
//            // Generate a new dummy order
//            PurchaseOrder order = new PurchaseOrder();
//            order.setOrderNum("777777");
//            order.setCustomerRef("JLS");
//            order.setProduct(p);
//            order.setQuantity(90);
//            order.setUnitPrice(5000);
//            // Attempt to process
//            if (processPurchaseOrder(order)) {
//                System.out.println("Order processed successfully.");
//                receivePayment("777777", (float) 450000);
//            }
//        }else{
//            System.out.println("no product found");
//        }
    }

//    private static org.soen487.supplychain.manufacturer.Product getProductInfo(java.lang.String aProductName) {
//        org.soen487.supplychain.manufacturer.Manufacturer1Service service = new org.soen487.supplychain.manufacturer.Manufacturer1Service();
//        org.soen487.supplychain.manufacturer.Manufacturer1 port = service.getManufacturer1Port();
//        return port.getProductInfo(aProductName);
//    }
//
//    private static boolean receivePayment(java.lang.String orderNum, float totalPrice) {
//        org.soen487.supplychain.manufacturer.Manufacturer1Service service = new org.soen487.supplychain.manufacturer.Manufacturer1Service();
//        org.soen487.supplychain.manufacturer.Manufacturer1 port = service.getManufacturer1Port();
//        return port.receivePayment(orderNum, totalPrice);
//    }
//
//    private static boolean processPurchaseOrder(org.soen487.supplychain.manufacturer.PurchaseOrder aPO) {
//        org.soen487.supplychain.manufacturer.Manufacturer1Service service = new org.soen487.supplychain.manufacturer.Manufacturer1Service();
//        org.soen487.supplychain.manufacturer.Manufacturer1 port = service.getManufacturer1Port();
//        return port.processPurchaseOrder(aPO);
//    }
//
//    private static ItemShippingStatusList shipGoods(org.soen487.supplychain.warehouse.ItemList itemList, org.soen487.supplychain.warehouse.Customer info) {
//        org.soen487.supplychain.warehouse.WarehouseService service = new org.soen487.supplychain.warehouse.WarehouseService();
//        org.soen487.supplychain.warehouse.Warehouse port = service.getWarehousePort();
//        return port.shipGoods(itemList, info);
//    }

    private static ItemShippingStatusList submitOrder(org.soen487.supplychain.warehouse.ItemList itemList, org.soen487.supplychain.warehouse.Customer custInfo) {
        org.soen487.supplychain.retail.RetailService service = new org.soen487.supplychain.retail.RetailService();
        org.soen487.supplychain.retail.Retail port = service.getRetailPort();
        return port.submitOrder(itemList, custInfo);
    }
}
