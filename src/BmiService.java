public class BmiService {
    public int calculate(int weight, double height) {
        double index = weight / (height * height); //формула для расчёта ИМТ
        int indexResult = (int) index; //приводит к целому числу
        return indexResult; //возвращаем рассчитанный ИМТ
    }
}
