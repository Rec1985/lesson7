public class Cat {

    private boolean isSatiety;

    //----------------------------------------------------------------------------------------
    public boolean isSatiety() {
        return isSatiety;
    }

    public void  eat(Dish dish){
        isSatiety = dish.decrease(10);
    }



    @Override
    public String toString() {
        return "Cat{" +
                " isSatiety=" + isSatiety +
                '}';
    }
}

//        1. Расширить задачу про котов и тарелки с едой. (см. в методичке)
//        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//        4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.