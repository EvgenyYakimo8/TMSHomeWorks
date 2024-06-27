package by.tms.lesson6;

public class Task2AtmMachine {
    int banknote20, banknote50, banknote100; // кол-во купюр

    Task2AtmMachine(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    void addBanknote(int banknote) { //принимаем сумму и пополняем купюрами банкомат
        if (banknote % 20 == 0) {
            this.banknote20 += banknote / 20;
        } else if (banknote % 50 == 0) {
            this.banknote50 += banknote / 50;
        } else if (banknote % 100 == 0) {
            this.banknote100 += banknote / 100;
        }else {
            System.out.println("Внесите сумму кратную номиналам: 20 50 или 100");
        }
    }


    boolean withdrawBanknote(int banknote){
        boolean flag;

        if (banknote % 100 == 0 && (banknote100>=banknote/100)) {
            this.banknote100 -= banknote / 100;
            flag = true;
            System.out.println("Сумма: " + banknote + " успешно снята. Кол-во купюр: " + banknote/100 + " номиналом 100.");
        } else if (banknote % 50 == 0 && (banknote50>=banknote/50)) {
            this.banknote50 -= banknote / 50;
            flag = true;
            System.out.println("Сумма: " + banknote + " успешно снята. Кол-во купюр: " + banknote/50 + " номиналом 50.");
        } else if (banknote % 20 == 0 && (banknote20>=banknote/20)) {
            this.banknote20 -= banknote / 20;
            flag = true;
            System.out.println("Сумма: " + banknote + " успешно снята. Кол-во купюр: " + banknote/20 + " номиналом 20.");
        }else {
            System.out.println("Укажите сумму для снятия кратную номиналам: 20 50 или 100");
            flag = false;
        }
        return flag;
    }


}
