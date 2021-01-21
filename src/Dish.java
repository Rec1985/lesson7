public class Dish {     // Миска для еды
    private int quantityEat;
    private final int maxEat;

    //----------------------------------------------------------------------------------------
    public Dish() {
        this(25,25);
    }

    public Dish(int maxEat, int quantityEat) {
        this.quantityEat = Math.min(quantityEat, maxEat);
        this.maxEat = maxEat;
    }

    //----------------------------------------------------------------------------------------
    public boolean decrease(int requestEat){    //уменьшает количество еды с проверкой
        if(requestEat > quantityEat){
            return false;
        }
        quantityEat -= requestEat;
        return true;
    }

    public void add(int size){
        if(size <= maxEat){
            int temp = this.quantityEat + size;
            this.quantityEat = Math.min(temp, maxEat);
        }
    }

    @Override
    public String toString() {
        return "Dish{" +
                "quantityEat=" + quantityEat +
                '}';
    }
}

//        1. Расширить задачу про котов и тарелки с едой. (см. в методичке)
//        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//        4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.