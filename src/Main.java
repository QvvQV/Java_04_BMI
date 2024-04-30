//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 48; //вес в кг
        double height = 1.78; //рост в метрах
        int index = (int) service.calculate(weight, height); //считаем ИМТ и отбрасывает дробь
        //int indexResult = (int) index; //приводит к целому числу
        //String indexResult = String.format("%.0f", index); // или так округлить приводит к целому числу

        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height + " м.");
        System.out.println("Ваш индекс массы тела: " + index);
    }
}
