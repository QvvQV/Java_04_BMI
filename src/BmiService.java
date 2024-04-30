public class BmiService {
    public double calculate(int weight, double height) {
        double index = weight / (height * height); //формула для расчёта ИМТ
        //int indexResult = (int) index; //приводит к целому числу
        return index; //возвращаем рассчитанный ИМТ
    }
}
