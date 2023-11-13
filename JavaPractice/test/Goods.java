package test;

class Goods implements Comparable {
    private String name;
    private double price;

    public Goods(String s, int i) {
        this.name = s;
        this.price = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //按照价格，比较商品的大小
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods other = (Goods) o;
            if (this.price > other.price) {
                return 1;
            } else if (this.price < other.price) {
                return -1;
            }
            return 0;
        }
        throw new RuntimeException("输入的数据类型不一致");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    //构造器、getter、setter、toString()方法略
}

