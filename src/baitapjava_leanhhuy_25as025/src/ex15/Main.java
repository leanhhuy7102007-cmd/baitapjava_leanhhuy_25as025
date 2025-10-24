package ex15;

public class Main {
    public static void main(String[]args){
        InvoiceItem inv = new InvoiceItem("Thienlong", "Bút Bi", 888, 0.08);
        System.out.println(inv);

        inv.setQty(999);
        inv.setUnitPrice(2.1);
        System.out.println(inv);
        System.out.println("id is: " + inv.getID());
        System.out.println("desc is: " + inv.getDesc());
        System.out.println("qty is: " + inv.getQty());
        System.out.println("unitPrice is: " + inv.getUnitPrice());
        System.out.println("The total is: " + inv.getTotal());
    }
}
