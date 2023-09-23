public class Exercise_2 {
    public static void main(String[] args) {
        
    }
    static class Product{
        private String itemNo;
        private String name;
        private double price;
        private short qty;

        //Property Methods
        public String getItemNo(){
            return itemNo;
        }
        public String getName(){
            return name;
        }
        public double getPrice(){
            return price;
        }
        public short getQty(){
            return qty;
        }

        public void setPrice(double price){
            this.price = price;    
        }
        public void setQty(short qty){
            this.qty = qty;
        }

        // Constructors 
        public Product(String itm, String naam){
            itemNo = itm;
            name = naam;
        }
        public Product(String itm, String naam, double prc, short qty){
            itemNo = itm;
            this.name = naam;
            setPrice(prc);
            setQty(qty);

        }

    }
}
