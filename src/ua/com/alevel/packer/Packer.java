package ua.com.alevel.packer;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        packer.repackage(foodBox, cakeBox);
    }

    public <T>void repackage(Box<? super T> to, Box<? extends T> from) {
        to.put(from.get());
    }
    public static class Box<T> {

        private T item;

        public void put(T item) {
            this.item = item;
        }

        public T get() {
            return this.item;
        }
    }

    public class Goods {
    }

    public class Food extends Goods{
    }

    public class Bakery extends Food{
    }

    public class Cake extends Bakery {
    }

    public class Pie extends Bakery {
    }

    public class Tart extends Bakery {
    }
}