public class BmiService {
    public double calculate(int weight, double height) {
        double index = weight / (height * height); //формула для расчёта ИМТ
        return index; //возвращаем рассчитанный ИМТ
    }
}
