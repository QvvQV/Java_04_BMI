//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 89; //вес в кг
        double height = 1.87; //рост в метрах
        double index = service.calculate(weight, height); //считаем ИМТ
        int indexResult = (int) index; //приводи к целому числу
        //String indexResult = String.format("%.0f", index); // или так округлить приводит к целому числу

        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height + " м.");
        System.out.println("Ваш индекс массы тела: " + indexResult);
    }
}
