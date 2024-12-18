package ie.atu.testpackage;

public class Drinks {
        private int serialNumber;
        private String brand;
        private float price;
        private boolean isSold;

        public Drinks(int serialNumber, String brand, float price, boolean isSold){
                this.serialNumber = serialNumber;
                this.brand = brand;
                this.price = price;
                this.isSold = isSold;
                
        }

        public int getserialNumber(){
                return this.serialNumber;
        }
        public int getBrand(){
                return this.brand;
        }
        public int getPrice(){
                return this.price;
        }
        public int getisSold(){
                return this.isSold;
        }
        public void getbrand(String brand){
                this.brand = brand;
        }
        public void getserialNumber(int serialNumber){
                this.serialNumber = serialNumber;
        }
        public void getprice(float price){
                this.price = price;
        }
        public void getisSold(boolean price){
                this.isSold = isSold;
        }
}
