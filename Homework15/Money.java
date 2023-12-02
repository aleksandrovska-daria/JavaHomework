package Homework15;

public class Money {

        long grn;
        byte kop;
        int div;

        public Money() {
        }

        public Money(long grn, byte kop) {
            grn = Math.abs(grn);
            kop = (byte) Math.abs(kop);
            if (kop >= 100) {
                grn++;
                kop -= 100;
            }

            this.grn = grn;
            this.kop = kop;
        }

        public void show() {
            System.out.println(grn + "," + kop);
        }

        public void add(long grn, byte kop) {
            int temp = this.kop;
            this.grn += grn;
            temp += kop;
            if (temp >= 100) {
                this.grn += 1;
                temp -= 100;
                this.kop = (byte) temp;
            }
        }

        public void sub(long grn, byte kop) {
            int temp = this.kop;
            this.grn -= grn;
            temp -= kop;
            if (temp < 0) {
                this.grn -= 1;
                temp += 100;
                this.kop = (byte) temp;
            }
            if (this.grn < 0) {
                System.out.println("Від'ємне значення , зніміть меньшу суму");
            }
        }

        public void division(int div) {
            double temp = this.grn;
            double temp1 = (double) this.kop / 100;
            double res = (temp + temp1) / div;
            this.grn = (long) res;
            double a = (res - this.grn) * 100;
            this.kop = (byte) a;
        }
        public void comparison(long grn,byte kop){
            long a = this.grn+this.kop;
            long b = grn+kop;
            if(a==b){
                System.out.println("Суми рівні");
            }else if(a>b){
                System.out.println("Перша сума більше веденної ");
            }else {
                System.out.println("Введенна сума більше першої суми");
            }
        }
    }

