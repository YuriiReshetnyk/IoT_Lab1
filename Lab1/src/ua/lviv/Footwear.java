package ua.lviv;

record Footwear(String nameOfProducer, float price, float size, String color, String material, int yearOfManufacture) {

    public static String NAME_OF_PRODUCER = "Nike";

    Footwear() {
        this(null, 0, 0);
    }

    Footwear(String nameOfProducer, float price, float size) {
        this(nameOfProducer, price, size, null, null, 0);
    }

    @Override
    public String toString() {
        if (nameOfProducer == null)
            return "\n<No available information>";
        else if (color == null)
            return "\nName of producer: " + nameOfProducer +
                    "\nPrice: " + price + "\nSize: " + size;
        else
            return "\nName of producer: " + nameOfProducer + "\nPrice: " + price +
                    "\nSize: " + size + "\nColor: " + color + "\nMaterial" + material +
                    "\nYear of manufacture" + yearOfManufacture;
    }

    public static String getStaticFeild() {
        return NAME_OF_PRODUCER;
    }

}
