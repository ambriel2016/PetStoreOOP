public class Animal {
    private String name;
    private String type;
    private String description;
    private String price;
    private boolean isInStock;

    public Animal(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice(){
        return this.price;
    }
    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    public boolean getIsInStock(){
        return this.isInStock;
    }

}
