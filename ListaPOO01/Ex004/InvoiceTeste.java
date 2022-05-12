package ListaPOO01.Ex004;

public class InvoiceTeste {
    public static void main(String[] args) {
        Invoice item1 = new Invoice (1, "Xiaomi 11T pro", 2, 3450);
        Invoice item2 = new Invoice (2, "Película", 34, 15);
        Invoice item3 = new Invoice (3, "Adaptador VGA", 1, 35);
        Invoice item4 = new Invoice (4, "Iphone 13", 1, 13250);
        Invoice item5 = new Invoice (5, "Fone de Ouvido", 3, 150);

        System.out.println("Corrigindo o nome do celular");
        item1.setDescricao("Xiaomi 11T PRO");
        System.out.println(item1.getDescricao());
        System.out.println("Valor da fatura item 1: " + item1.getInvoiceAmount());
        System.out.println("Valor da fatura item 2: " + item2.getInvoiceAmount());
        System.out.println("Valor da fatura item 3: " + item3.getInvoiceAmount());
        System.out.println("Valor da fatura item 4: " + item4.getInvoiceAmount());
        System.out.println("Valor da fatura item 5: " + item5.getInvoiceAmount());
    }
}

