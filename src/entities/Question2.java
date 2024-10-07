package entities;

public class Question2 {

    //Polimorfismo é um princípio da programação orientada a objetos que permite que uma classe tenha várias formas
    // ou comportamentos diferentes. Logo, uma única interface (ou método) pode ser usada para diferentes tipos de objetos.

    /*
    public abstract class Taxpayer {

        private double annualGrossIncome; //renda bruta anual
        private String name;

        public Taxpayer(double annualGrossIncome, String name){
            this.annualGrossIncome = annualGrossIncome;
            this.name = name;
        }


        public double getAnnualGrossIncome() {
            return annualGrossIncome;
        }

        public String getName() {
            return name;
        }

        public void setAnnualGrossIncome(double annualGrossIncome) {
            this.annualGrossIncome = annualGrossIncome;
        }

        public void setName(String name) {
            this.name = name;
        }

        public abstract double provideTax();
    }

    package entities;

    public class Physic extends Taxpayer{
        private int numberDep;
        private String cpf;
        private double healthExpenses; //gastos saude
        private double educationExpenses; // gastos educação

        public Physic(double annualGrossIncome, String name, int numberDep, String cpf, double healthExpenses, double educationExpenses){
            super (annualGrossIncome, name);
            this.numberDep = numberDep;
            this.cpf = cpf;
            this.healthExpenses = healthExpenses;
            this.educationExpenses = educationExpenses;
        }

        public int getNumberDep() {
            return numberDep;
        }

        public String getCpf() {
            return cpf;
        }

        public double getHealthExpenses() {
            return healthExpenses;
        }

        public double getEducationExpenses() {
            return educationExpenses;
        }

        public void setNumberDep(int numberDep) {
            this.numberDep = numberDep;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setHealthExpenses(double healthExpenses) {
            this.healthExpenses = healthExpenses;
        }

        public void setEducationExpenses(double educationExpenses) {
            this.educationExpenses = educationExpenses;
        }


        @Override
        public double provideTax(){
            double value = getAnnualGrossIncome();

            if (value <= 10000.00){
                return 0.0;
            }else if (value > 10000.00 && value <= 20000.00 ){
                return value * 0.1;
            } else {
                return value * 0.25;
            }
        }

    }

    package entities;

    public class Legal extends Taxpayer{
        private String cnpj;
        private double personalExpenses;
        private double equiExpenses;

        public Legal(double annualGrossIncome, String name, String cnpj, double personalExpenses, double equiExpenses){
            super(annualGrossIncome, name);

        }

        public double getEquiExpenses() {
            return equiExpenses;
        }

        public double getPersonalExpenses() {
            return personalExpenses;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public void setEquiExpenses(double equiExpenses) {
            this.equiExpenses = equiExpenses;
        }

        public void setPersonalExpenses(double personalExpenses) {
            this.personalExpenses = personalExpenses;
        }

        @Override
        public double provideTax(){
            double value = getAnnualGrossIncome();

            if (value <= 100000.00){
                return value * 0.05;
            }else if (value > 100000.00 && value <= 200000.00 ){
                return value * 0.1;
            } else {
                return value * 0.25;
            }
        }
    }
    */
}
