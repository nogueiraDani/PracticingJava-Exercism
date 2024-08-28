public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold > 0 && productsSold < 20) ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * salaryMultiplier(daysSkipped);
        double finalSalary = salary + bonusForProductsSold(productsSold);

        return (finalSalary <= 2000 ) ? finalSalary : 2000;
    } 
}
